package form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import model.Clothing;
import service.impl.ClothingServiceImpl;

class DetailClothingDialog extends JDialog {
    
    private DefaultTableModel model;
    private int modelRow;
    private JTextField nomorField;
    private JTextField namaBajuField;
    private JTextField stokField;
    private JTextField hargaField;

    public DetailClothingDialog(MainFrame parent, String title, boolean modal, DefaultTableModel model, int modelRow) {
        super(parent, title, modal);
        this.model = model;
        this.modelRow = modelRow;
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(400, 300));
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS)); // Use BoxLayout for vertical arrangement
        contentPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        // Create text fields
        nomorField = createTextField(model, "Nomor", 0);
        namaBajuField = createTextField(model, "Nama Merchandise", 1);
        hargaField = createTextField(model, "Harga", 2);
        stokField = createTextField(model, "Stok", 3);
        //Make number non editable
        nomorField.setEditable(false);
        //Add document filter for stock and price field
        hargaField.setDocument(new NumberOnlyDocument());
        stokField.setDocument(new NumberOnlyDocument());
        contentPanel.add(createFieldPanel("Nomor:", nomorField));
        contentPanel.add(createFieldPanel("Nama Merchandise:", namaBajuField));
        contentPanel.add(createFieldPanel("Harga:", hargaField));
        contentPanel.add(createFieldPanel("Stock:", stokField));
        add(new JScrollPane(contentPanel), BorderLayout.CENTER);
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton updateButton = new JButton("Perbarui");
        JButton deleteButton = new JButton("Hapus");
        // Set button color
        updateButton.setBackground(new Color(0, 102, 102)); // #006666
        updateButton.setForeground(Color.WHITE);
        deleteButton.setBackground(new Color(220, 53, 69)); // Not too bright red
        deleteButton.setForeground(Color.WHITE);
        buttonPanel.add(updateButton);
        buttonPanel.add(deleteButton);
        add(buttonPanel, BorderLayout.SOUTH);
        ClothingServiceImpl clothingService = new ClothingServiceImpl();
        updateButton.addActionListener(e -> {
            try {
                int id = Integer.parseInt(nomorField.getText());
                String namaBaju = namaBajuField.getText();
                int harga = Integer.parseInt(hargaField.getText());
                int stok = Integer.parseInt(stokField.getText());
                if (namaBaju.isEmpty()) {
                    JOptionPane.showMessageDialog(DetailClothingDialog.this, "Nama Merchandise tidak boleh kosong.");
                    return;
                }
                // Update to database
                clothingService.updateClothing(id, namaBaju, harga, stok);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(DetailClothingDialog.this, "Stok dan Harga harus berupa numerik.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(DetailClothingDialog.this, "Error menyimpan data: " + ex.getMessage());
            }
            model.setValueAt(nomorField.getText(), modelRow, 0);
            model.setValueAt(namaBajuField.getText(), modelRow, 1);
            model.setValueAt(hargaField.getText(), modelRow, 2);
            model.setValueAt(stokField.getText(), modelRow, 3);
            JOptionPane.showMessageDialog(DetailClothingDialog.this, "Data stok merchandise berhasil diperbarui.");
            dispose();
        });
        deleteButton.addActionListener(e -> {
            //Get and delete data from table
            int dialogResult = JOptionPane.showConfirmDialog(DetailClothingDialog.this, "Apakah Anda yakin akan menghapus data merchandise ini?", "Konfirmasi Hapus Data", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                try {
                    int id = Integer.parseInt(nomorField.getText());
                    // Delete data from database by id
                    clothingService.deleteClothing(id);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(DetailClothingDialog.this, "Stok dan Harga harus berupa numerik.");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(DetailClothingDialog.this, "Error menyimpan data merchandise: " + ex.getMessage());
                }
                try {
                    List<Clothing> clotheList = clothingService.getAllClothes();
                    String[] columnNames = {"Nomor", "Nama Merchandise", "Harga", "Stok"};
                    Object[][] data = convertClothesListToArray(clotheList);
                } catch (SQLException ex) {
                    Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(DetailClothingDialog.this, "Data merchandise berhasil dihapus.");
                dispose();
            }
        });
        pack();
        setLocationRelativeTo(getParent());
    }

    public Object[][] convertClothesListToArray(List<Clothing> clotheList) {
        Locale localeID = new Locale("in", "ID");
        NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeID);
        currencyFormatter.setMaximumFractionDigits(0); // Remove decimal places
        Object[][] data = new Object[clotheList.size()][4];
        for (int i = 0; i < clotheList.size(); i++) {
            Clothing clothes = clotheList.get(i);
            data[i][0] = clothes.getId();
            data[i][1] = clothes.getName();
            data[i][2] = currencyFormatter.format(clothes.getPrice());
            data[i][3] = clothes.getStock();
        }
        return data;
    }

    private JPanel createFieldPanel(String labelText, JTextField textField) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel label = new JLabel(labelText);
        label.setPreferredSize(new Dimension(120, 25)); // Adjust width as needed
        textField.setPreferredSize(new Dimension(150, 25));
        panel.add(label);
        panel.add(textField);
        return panel;
    }

    private JTextField createTextField(DefaultTableModel model, String columnName, int columnIndex) {
        JTextField textField = new JTextField((model.getValueAt(modelRow, columnIndex) != null) ? model.getValueAt(modelRow, columnIndex).toString() : "", 20);
        textField.setEditable(true); // Make it editable
        return textField;
    }
}
