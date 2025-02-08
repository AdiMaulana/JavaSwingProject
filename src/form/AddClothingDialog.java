package form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.sql.SQLException;
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
import service.impl.ClothingServiceImpl;

class AddClothingDialog extends JDialog {
    
    private JTextField namaBajuField;
    private JTextField hargaField;
    private JTextField stokField;
    private DefaultTableModel tableModel;

    public AddClothingDialog(MainFrame parent, String title, boolean modal, DefaultTableModel tableModel) {
        super(parent, title, modal);
        this.tableModel = tableModel;
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(400, 300));
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS)); // Use BoxLayout for vertical arrangement
        contentPanel.setBorder(new EmptyBorder(10, 10, 10, 10));
        namaBajuField = new JTextField(20);
        hargaField = new JTextField(20);
        stokField = new JTextField(20);
        // set document filter for stock and price
        hargaField.setDocument(new NumberOnlyDocument());
        stokField.setDocument(new NumberOnlyDocument());
        contentPanel.add(createFieldPanel("Nama Merchandise:", namaBajuField));
        contentPanel.add(createFieldPanel("Harga:", hargaField));
        contentPanel.add(createFieldPanel("Stok:", stokField));
        add(new JScrollPane(contentPanel), BorderLayout.CENTER);
        // Button Panel (Simpan and Batal)
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        JButton simpanButton = new JButton("Simpan");
        JButton batalButton = new JButton("Batal");
        simpanButton.setBackground(new Color(0, 102, 102));
        simpanButton.setForeground(Color.WHITE);
        batalButton.setBackground(new Color(220, 53, 69));
        batalButton.setForeground(Color.WHITE);
        buttonPanel.add(simpanButton);
        buttonPanel.add(batalButton);
        add(buttonPanel, BorderLayout.SOUTH);
        ClothingServiceImpl clothingService = new ClothingServiceImpl();
        // Action Listeners
        simpanButton.addActionListener(e -> {
            try {
                String namaBaju = namaBajuField.getText();
                int harga = Integer.parseInt(hargaField.getText());
                int stok = Integer.parseInt(stokField.getText());
                if (namaBaju.isEmpty()) {
                    JOptionPane.showMessageDialog(AddClothingDialog.this, "Nama merchandise tidak boleh kosong.");
                    return;
                }
                // Save to database
                clothingService.addClothing(namaBaju, harga, stok);
                int newNumber = tableModel.getRowCount() + 1;
                Object[] newRowData = {newNumber, namaBaju, harga, stok};
                tableModel.addRow(newRowData);
                tableModel.setValueAt(new JButton("Detail"), tableModel.getRowCount() - 1, tableModel.getColumnCount() - 1);
                JOptionPane.showMessageDialog(AddClothingDialog.this, "Data berhasil ditambahkan.");
                dispose();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(AddClothingDialog.this, "Stok dan Harga harus berupa angka.");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(AddClothingDialog.this, "Error menyimpan data: " + ex.getMessage());
            }
        });
        batalButton.addActionListener(e -> {
            dispose(); // Close the dialog
        });
        pack();
        setLocationRelativeTo(getParent());
    }

    private JPanel createFieldPanel(String labelText, JTextField textField) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel label = new JLabel(labelText);
        label.setPreferredSize(new Dimension(120, 25)); // Adjust width as needed
        textField.setPreferredSize(new Dimension(130, 25));
        panel.add(label);
        panel.add(textField);
        return panel;
    }
    
}
