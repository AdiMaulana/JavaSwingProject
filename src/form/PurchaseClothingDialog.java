package form;

import constant.SessionManager;
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
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import service.impl.RevenueServiceImpl;

public class PurchaseClothingDialog extends JDialog {

    private JTextField namaBajuField;
    private JTextField hargaField;
    private JTextField jumlahBeliField;
    private JTextField totalBayarField;

    private int clothingId; // Store the ID of the clothing item
    private String namaBaju;
    private double harga;

    public PurchaseClothingDialog(MainFrame parent, String title, boolean modal, int clothingId, String namaBaju, double harga) {
        super(parent, title, modal);
        this.clothingId = clothingId;
        this.namaBaju = namaBaju;
        this.harga = harga;
        initComponents();
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(510, 300));

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new BoxLayout(contentPanel, BoxLayout.Y_AXIS));
        contentPanel.setBorder(new EmptyBorder(10, 10, 10, 10));

        namaBajuField = new JTextField(30);
        namaBajuField.setText(namaBaju);
        namaBajuField.setEditable(false);

        hargaField = new JTextField(30);
        hargaField.setText(String.format("%.0f", harga));
        hargaField.setEditable(false);

        jumlahBeliField = new JTextField(30);
        jumlahBeliField.setDocument(new NumberOnlyDocument());
        jumlahBeliField.addActionListener(e -> calculateTotal());
        jumlahBeliField.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                calculateTotal();
            }

            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                calculateTotal();
            }

            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                calculateTotal();
            }
        });

        totalBayarField = new JTextField(30);
        totalBayarField.setEditable(false);

        contentPanel.add(createFieldPanel("Nama Merch:", namaBajuField));
        contentPanel.add(createFieldPanel("Harga:", hargaField));
        contentPanel.add(createFieldPanel("Jumlah Beli:", jumlahBeliField));
        contentPanel.add(createFieldPanel("Total Bayar:", totalBayarField));

        add(new JScrollPane(contentPanel), BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 120, 10));

        JButton beliButton = new JButton("Beli");
        JButton batalButton = new JButton("Batal");

        beliButton.setBackground(new Color(0, 102, 102));
        beliButton.setPreferredSize(new Dimension(120, 25)); // Set preferred width and height
        beliButton.setForeground(Color.WHITE);
        batalButton.setBackground(new Color(220, 53, 69));
        batalButton.setPreferredSize(new Dimension(120, 25)); // Set preferred width and height
        batalButton.setForeground(Color.WHITE);

        buttonPanel.add(beliButton);
        buttonPanel.add(batalButton);

        add(buttonPanel, BorderLayout.SOUTH);

        beliButton.addActionListener(e -> {
            try {
                int jumlahBeli = Integer.parseInt(jumlahBeliField.getText());
                double totalBayar = Double.parseDouble(totalBayarField.getText());

                //Save data to database
                boolean success = saveToRevenueTable(clothingId, jumlahBeli, harga, totalBayar);
                if (success) {
                    JOptionPane.showMessageDialog(PurchaseClothingDialog.this, "Pembelian merchandise berhasil!");
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Stok Habis", "Insufficient Stock", JOptionPane.ERROR_MESSAGE);
                }

            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(PurchaseClothingDialog.this, "Jumlah Beli harus berupa angka.");
            }
        });

        batalButton.addActionListener(e -> {
            dispose();
        });

        setIconImage(null);

        pack();
        setLocationRelativeTo(getParent());
    }

    private JPanel createFieldPanel(String labelText, JTextField textField) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEADING));
        JLabel label = new JLabel(labelText);
        label.setPreferredSize(new Dimension(100, 25));
        textField.setPreferredSize(new Dimension(200, 25));
        panel.add(label);
        panel.add(textField);
        return panel;
    }

    private void calculateTotal() {
        try {
            int jumlahBeli = Integer.parseInt(jumlahBeliField.getText());
            double totalBayar = harga * jumlahBeli;
            totalBayarField.setText(String.format("%.0f", totalBayar));
        } catch (NumberFormatException ex) {
            totalBayarField.setText(""); // Clear the total if input is invalid
        }
    }

    private boolean saveToRevenueTable(int clothingId, int quantity, double pricePerItem, double totalAmount) {

        boolean result = false;
        
        RevenueServiceImpl revenueService = new RevenueServiceImpl();
        try {
             result = revenueService.addRevenue(SessionManager.getUserId(), clothingId, quantity, pricePerItem, totalAmount);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(PurchaseClothingDialog.this, "Error menyimpan revenue data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }

        return result;
    }

    //Custom Document for number only input
    static class NumberOnlyDocument extends PlainDocument {

        @Override
        public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
            if (str == null) {
                return;
            }

            try {
                Integer.parseInt(str);
            } catch (NumberFormatException e) {
                return; // Ignore non-numeric input
            }

            super.insertString(offs, str, a);
        }
    }
}
