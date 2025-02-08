package form;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Insets;
import java.sql.SQLException;
import java.util.EventObject;
import java.util.List;
import javax.swing.BoxLayout;
import javax.swing.DefaultCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import model.Clothing;
import service.impl.ClothingServiceImpl;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jPanel10 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1010, 625));
        setPreferredSize(new java.awt.Dimension(1010, 625));
        setResizable(false);
        setSize(new java.awt.Dimension(1010, 625));

        jPanel1.setMinimumSize(new java.awt.Dimension(1000, 625));
        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 625));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(54, 70, 78));
        jPanel2.setMinimumSize(new java.awt.Dimension(210, 57));
        jPanel2.setPreferredSize(new java.awt.Dimension(210, 60));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(54, 70, 78));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu.png"))); // NOI18N
        jLabel2.setOpaque(true);
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 40, 47));

        jPanel5.setBackground(new java.awt.Color(54, 70, 78));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setBackground(new java.awt.Color(54, 70, 78));
        jLabel4.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Dashboard");
        jPanel5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 6, 146, 45));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 6, 40, 45));

        jPanel2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 210, 50));

        jPanel6.setBackground(new java.awt.Color(54, 70, 78));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setBackground(new java.awt.Color(54, 70, 78));
        jLabel7.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Dashboard");
        jPanel6.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 6, 146, 45));

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png"))); // NOI18N
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 6, 40, 45));

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 210, 50));

        jPanel7.setBackground(new java.awt.Color(54, 70, 78));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel7MouseExited(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setBackground(new java.awt.Color(54, 70, 78));
        jLabel9.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Collections");
        jPanel7.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 6, 146, 45));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/produk-catalog.png"))); // NOI18N
        jPanel7.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 6, 40, 45));

        jPanel2.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 210, 50));

        jPanel8.setBackground(new java.awt.Color(54, 70, 78));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel8MouseExited(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setBackground(new java.awt.Color(54, 70, 78));
        jLabel11.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Members");
        jPanel8.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 6, 146, 45));

        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/id-card.png"))); // NOI18N
        jPanel8.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 6, 40, 45));

        jPanel2.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 210, 50));

        jPanel9.setBackground(new java.awt.Color(54, 70, 78));
        jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel9MouseExited(evt);
            }
        });
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setBackground(new java.awt.Color(54, 70, 78));
        jLabel13.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Revenue");
        jPanel9.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 6, 146, 45));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/report.png"))); // NOI18N
        jPanel9.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 45));

        jPanel2.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, 210, 50));

        jPanel10.setBackground(new java.awt.Color(54, 70, 78));
        jPanel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel10MouseExited(evt);
            }
        });
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setBackground(new java.awt.Color(54, 70, 78));
        jLabel15.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Logout");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 6, 146, 45));

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/collections-bookmark.png"))); // NOI18N
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 40, 45));

        jPanel2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 210, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 650));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 800, 580));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/menu.png"))); // NOI18N
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 12, 40, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/about.png"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 30, 230, 620));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(245, 245, 245));
        jLabel5.setText("Wellcome To ");

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(245, 245, 245));
        jLabel17.setText("All Far I See Merch");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel5))
                .addContainerGap(558, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 800, 70));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1011, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 650, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    int x = 210;
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        // TODO add your handling code here:
        if (x == 210) {
            jPanel2.setSize(210, 625);
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 210; i >= 0; i--) {
                            Thread.sleep(1);
                            jPanel2.setSize(i, 625);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };
            th.start();
            x = 0;
        }
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:
        if (x == 0) {
            jPanel2.show();
            jPanel2.setSize(x, 625);
            Thread th = new Thread() {
                @Override
                public void run() {
                    try {
                        for (int i = 0; i <= 210; i++) {
                            Thread.sleep(1);
                            jPanel2.setSize(i, 625);
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, e);
                    }
                }
            };
            th.start();
            x = 210;
        }
    }//GEN-LAST:event_jLabel3MouseClicked

    private void panelColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(53, 162, 107));
    }

    private void resetPanelColor(JPanel panel) {
        panel.setBackground(new java.awt.Color(54, 70, 78));
    }

    private void labelColor(JLabel label) {
        label.setBackground(new java.awt.Color(53, 162, 107));
    }

    private void resetLabelColor(JLabel label) {
        label.setBackground(new java.awt.Color(54, 70, 78));
    }

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        labelColor(jLabel2);
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        resetLabelColor(jLabel2);
    }//GEN-LAST:event_jLabel2MouseExited

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
        panelColor(jPanel5);
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        resetPanelColor(jPanel5);
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
        panelColor(jPanel6);
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
        resetPanelColor(jPanel6);
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseEntered
        panelColor(jPanel7);
    }//GEN-LAST:event_jPanel7MouseEntered

    private void jPanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseExited
        resetPanelColor(jPanel7);
    }//GEN-LAST:event_jPanel7MouseExited

    private void jPanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseEntered
        panelColor(jPanel8);
    }//GEN-LAST:event_jPanel8MouseEntered

    private void jPanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseExited
        resetPanelColor(jPanel8);
    }//GEN-LAST:event_jPanel8MouseExited

    private void jPanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseEntered
        panelColor(jPanel9);
    }//GEN-LAST:event_jPanel9MouseEntered

    private void jPanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseExited
        resetPanelColor(jPanel9);
    }//GEN-LAST:event_jPanel9MouseExited

    private void jPanel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseEntered
        panelColor(jPanel10);
    }//GEN-LAST:event_jPanel10MouseEntered

    private void jPanel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseExited
        resetPanelColor(jPanel10);
    }//GEN-LAST:event_jPanel10MouseExited

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        labelColor(jLabel3);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        resetLabelColor(jLabel3);
    }//GEN-LAST:event_jLabel3MouseExited

    private void jPanel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel10MouseClicked
        int choice = JOptionPane.showConfirmDialog(MainFrame.this,
                "Anda yakin ingin logout?",
                "Logout Confirmation",
                JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_OPTION) {
            MainFrame.this.dispose();

            LoginFrame loginPage = new LoginFrame();
            loginPage.setLocationRelativeTo(null); // Centers the frame on the screen
            loginPage.setVisible(true);
        }
    }//GEN-LAST:event_jPanel10MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    // End of variables declaration//GEN-END:variables
//
//    public void setClothingData(Object[][] data, String[] columnNames) {
//        jPanel3.removeAll();
//        jPanel3.setLayout(new BorderLayout());
//
//        // Create a panel to hold the title and button
//        JPanel titlePanel = new JPanel(new BorderLayout());
//        titlePanel.setBorder(new EmptyBorder(10, 25, 10, 25)); // Same border as title label
//
//        JLabel titleLabel = new JLabel("Daftar Clothing Stock", SwingConstants.LEFT);
//        Font labelFont = new Font("Arial", Font.BOLD, 18);
//        titleLabel.setFont(labelFont);
//
//        Color labelColor = new Color(0x36464E);
//        titleLabel.setForeground(labelColor);
//
//        titlePanel.add(titleLabel, BorderLayout.WEST);
//
//        // Create TableModel FIRST, including the "Action" column.
//        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames) {
//            @Override
//            public boolean isCellEditable(int row, int column) {
//                return column == getColumnCount() - 1; // Only the last column (Action) is editable
//            }
//
//            @Override
//            public Class<?> getColumnClass(int columnIndex) {
//                if (columnIndex == getColumnCount() - 1) {
//                    return JButton.class; // Specify the class for the Action column
//                }
//                return Object.class;
//            }
//        };
//
//        MainFrame mainFrame = MainFrame.this;
//
//        JButton addButton = new JButton("Tambah Stock");
//        addButton.setBackground(new Color(0, 102, 102)); // #006666 or your preferred color
//        addButton.setForeground(Color.WHITE);
//        addButton.setFocusPainted(false);
//        addButton.setPreferredSize(new Dimension(150, 30)); // Adjust size as needed
//
//        addButton.addActionListener(e -> {
//            AddClothingDialog dialog = new AddClothingDialog(mainFrame, "Tambah Data Clothing", true, tableModel);
//            dialog.setVisible(true);
//        });
//
//        titlePanel.add(addButton, BorderLayout.EAST);
//
//        jPanel3.add(titlePanel, BorderLayout.NORTH);
//
//        // ADD the "Action" column to the TableModel.  This is CRUCIAL.
//        tableModel.addColumn("Action");
//
//        // Create the JTable
//        JTable table = new JTable(tableModel);
//
//        // Set renderer and editor for the "Action" column
//        ButtonRenderer buttonRenderer = new ButtonRenderer();
//        ButtonEditor buttonEditor = new ButtonEditor(new JCheckBox(), mainFrame);
//        TableColumn actionColumn = table.getColumnModel().getColumn(columnNames.length);
//        actionColumn.setCellRenderer(buttonRenderer);
//        actionColumn.setCellEditor(buttonEditor);
//
//        // *Populate* the "Action" column with buttons.  Also CRUCIAL.
//        for (int i = 0; i < table.getRowCount(); i++) {
//            tableModel.setValueAt(new JButton("Detail"), i, columnNames.length); // Add button to each row.
//        }
//
//        TableColumnAdjuster tca = new TableColumnAdjuster(table);
//        tca.adjustColumns();
//
//        JScrollPane scrollPane = new JScrollPane(table);
//        scrollPane.setBorder(new EmptyBorder(10, 10, 10, 20));
//
//        jPanel3.add(scrollPane, BorderLayout.CENTER);
//
//        jPanel3.revalidate();
//        jPanel3.repaint();
//    }

    public void setClothingData(Object[][] data, String[] columnNames) {
        jPanel3.removeAll();
        jPanel3.setLayout(new BorderLayout());

        // Dashboard Theme Colors
        Color backgroundColor = new Color(245, 245, 245); // Light gray/off-white
        Color textColor = new Color(51, 51, 51); // Dark gray
        Color accentColor = new Color(0, 128, 128); // Teal

        jPanel3.setBackground(backgroundColor);

        // Title Panel
        JPanel titlePanel = new JPanel(new BorderLayout());
        titlePanel.setBackground(backgroundColor);
        titlePanel.setBorder(new EmptyBorder(20, 30, 10, 30));

        JLabel titleLabel = new JLabel("Clothing Stock Dashboard", SwingConstants.LEFT);
        Font labelFont = new Font("Arial", Font.BOLD, 18);
        titleLabel.setFont(labelFont);

        Color labelColor = new Color(0x36464E);
        titleLabel.setForeground(labelColor);
        titlePanel.add(titleLabel, BorderLayout.WEST);

        JButton addButton = new JButton("Add Clothing");
        addButton.setBackground(accentColor);
        addButton.setForeground(Color.WHITE);
        addButton.setFocusPainted(false);
        addButton.setPreferredSize(new Dimension(140, 35));
        
        titlePanel.add(addButton, BorderLayout.EAST);

        jPanel3.add(titlePanel, BorderLayout.NORTH);

        // Table Model
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return column == getColumnCount() - 1;
            }

            @Override
            public Class<?> getColumnClass(int columnIndex) {
                if (columnIndex == getColumnCount() - 1) {
                    return JButton.class;
                }
                return Object.class;
            }
        };
        
        MainFrame mainFrame = MainFrame.this;
        
        addButton.addActionListener(e -> {
            AddClothingDialog dialog = new AddClothingDialog(mainFrame, "Tambah Data Clothing", true, tableModel);
            dialog.setVisible(true);
        });
        
        // Action Column
        tableModel.addColumn("Action");

        // Table
        JTable table = new JTable(tableModel);
        table.setBackground(backgroundColor);
        table.setForeground(textColor);
        table.setFont(new Font("SansSerif", Font.PLAIN, 14));
        table.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));
        table.getTableHeader().setBackground(accentColor);
        table.getTableHeader().setForeground(Color.WHITE);

        // Set column width
        table.getColumnModel().getColumn(0).setPreferredWidth(50); // Nomor
        table.getColumnModel().getColumn(1).setPreferredWidth(200); // Nama Baju
        table.getColumnModel().getColumn(2).setPreferredWidth(80);  // Stok
        table.getColumnModel().getColumn(3).setPreferredWidth(80);  // Harga
        table.getColumnModel().getColumn(4).setPreferredWidth(100); // Action

        // Cell Renderer
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        table.setDefaultRenderer(Object.class, cellRenderer);

        // Add detail button
        for (int i = 0; i < table.getRowCount(); i++) {
            tableModel.setValueAt(new JButton("Detail"), i, columnNames.length); // Add button to each row.
        }

        // Set renderer and editor for the "Action" column
        ButtonRenderer buttonRenderer = new ButtonRenderer();
        ButtonEditor buttonEditor = new ButtonEditor(new JCheckBox(), MainFrame.this);
        TableColumn actionColumn = table.getColumnModel().getColumn(columnNames.length);
        actionColumn.setCellRenderer(buttonRenderer);
        actionColumn.setCellEditor(buttonEditor);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(new EmptyBorder(10, 30, 30, 30));
        scrollPane.getViewport().setBackground(backgroundColor);

        jPanel3.add(scrollPane, BorderLayout.CENTER);

        // Stats Panel (Example - adapt to your needs)
        JPanel statsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 30, 0));
        statsPanel.setBackground(backgroundColor);
        statsPanel.setBorder(new EmptyBorder(0, 30, 20, 30));

        JLabel totalStockLabel = new JLabel("Total Stock: 500");
        totalStockLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        totalStockLabel.setForeground(textColor);

        JLabel totalRevenueLabel = new JLabel("Total Revenue: $10,000");
        totalRevenueLabel.setFont(new Font("SansSerif", Font.BOLD, 16));
        totalRevenueLabel.setForeground(textColor);

        statsPanel.add(totalStockLabel);
        statsPanel.add(totalRevenueLabel);

        jPanel3.add(statsPanel, BorderLayout.SOUTH);

        // Revalidate and Repaint
        jPanel3.revalidate();
        jPanel3.repaint();
    }

    static class ButtonRenderer extends DefaultTableCellRenderer {

        @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
            JButton button = (JButton) value;
            if (button != null) {
                button.setMargin(new Insets(5, 5, 5, 5)); // Top, Left, Bottom, Right (5px padding)
                button.setPreferredSize(new Dimension(80, 25)); //set size for button detail
                button.setFocusPainted(false);
            }
            return button;
        }
    }

    static class ButtonEditor extends DefaultCellEditor {

        protected JButton button;
        private int row;
        private JTable table;
        private MainFrame mainFrame;

        public ButtonEditor(JCheckBox checkBox, MainFrame mainFrame) {
            super(checkBox);
            this.mainFrame = mainFrame;
            button = new JButton();
            button.setOpaque(true);
            button.setText("Detail"); // Set button text here
            button.setFocusPainted(false);
            button.setMargin(new Insets(5, 5, 5, 5)); // 5px padding
            button.setPreferredSize(new Dimension(80, 25)); //set size for button detail

            button.addActionListener(e -> {
                int modelRow = table.convertRowIndexToModel(row);
                DefaultTableModel model = (DefaultTableModel) table.getModel();

                // Create and show the custom dialog
                ClothingDetailDialog dialog = new ClothingDetailDialog(mainFrame, "Clothing Details", true, model, modelRow);
                dialog.setVisible(true);

//                fireEditingStopped();
            });
        }

        @Override
        public Component getTableCellEditorComponent(JTable table, Object value, boolean isSelected, int row, int column) {
            this.table = table;
            this.row = row;
            return button;
        }

        @Override
        public Object getCellEditorValue() {
            return "Detail"; // Return the button text
        }

        @Override
        public boolean isCellEditable(EventObject e) {
            return true;
        }
    }

    static class AddClothingDialog extends JDialog {

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

            contentPanel.add(createFieldPanel("Nama Baju:", namaBajuField));
            contentPanel.add(createFieldPanel("Harga:", hargaField));
            contentPanel.add(createFieldPanel("Stock:", stokField));

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
                        JOptionPane.showMessageDialog(AddClothingDialog.this, "Nama Baju tidak boleh kosong.");
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
            label.setPreferredSize(new Dimension(70, 25)); // Adjust width as needed
            textField.setPreferredSize(new Dimension(150, 25));
            panel.add(label);
            panel.add(textField);
            return panel;
        }
    }

    static class ClothingDetailDialog extends JDialog {

        private DefaultTableModel model;
        private int modelRow;

        private JTextField nomorField;
        private JTextField namaBajuField;
        private JTextField stokField;
        private JTextField hargaField;

        public ClothingDetailDialog(MainFrame parent, String title, boolean modal, DefaultTableModel model, int modelRow) {
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
            namaBajuField = createTextField(model, "Nama Baju", 1);
            hargaField = createTextField(model, "Harga", 2);
            stokField = createTextField(model, "Stock", 3);

            //Make number non editable
            nomorField.setEditable(false);

            //Add document filter for stock and price field
            stokField.setDocument(new NumberOnlyDocument());
            hargaField.setDocument(new NumberOnlyDocument());

            contentPanel.add(createFieldPanel("Nomor:", nomorField));
            contentPanel.add(createFieldPanel("Nama Baju:", namaBajuField));
            contentPanel.add(createFieldPanel("Harga:", hargaField));
            contentPanel.add(createFieldPanel("Stock:", stokField));

            add(new JScrollPane(contentPanel), BorderLayout.CENTER);

            JPanel buttonPanel = new JPanel();
            buttonPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

            JButton updateButton = new JButton("Update");
            JButton deleteButton = new JButton("Delete");

            // Set button color
            updateButton.setBackground(new Color(0, 102, 102)); // #006666
            updateButton.setForeground(Color.WHITE);
            deleteButton.setBackground(new Color(220, 53, 69));   // Not too bright red
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
                        JOptionPane.showMessageDialog(ClothingDetailDialog.this, "Nama Baju tidak boleh kosong.");
                        return;
                    }

                    // Update to database
                    clothingService.updateClothing(id, namaBaju, harga, stok);

                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(ClothingDetailDialog.this, "Stok and Harga field must be a number.");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(ClothingDetailDialog.this, "Error menyimpan data: " + ex.getMessage());
                }

                model.setValueAt(nomorField.getText(), modelRow, 0);
                model.setValueAt(namaBajuField.getText(), modelRow, 1);
                model.setValueAt(hargaField.getText(), modelRow, 2);
                model.setValueAt(stokField.getText(), modelRow, 3);

                JOptionPane.showMessageDialog(ClothingDetailDialog.this, "Data updated successfully.");
                dispose();
            });

            deleteButton.addActionListener(e -> {
                //Get and delete data from table
                int dialogResult = JOptionPane.showConfirmDialog(ClothingDetailDialog.this, "Are you sure want to delete this data?", "Delete confirmation", JOptionPane.YES_NO_OPTION);
                if (dialogResult == JOptionPane.YES_OPTION) {
                    try {
                        int id = Integer.parseInt(nomorField.getText());
                        // Delete data from database by id
                        clothingService.deleteClothing(id);

                    } catch (NumberFormatException ex) {
                        JOptionPane.showMessageDialog(ClothingDetailDialog.this, "Stock and Harga field must be a number.");
                    } catch (SQLException ex) {
                        JOptionPane.showMessageDialog(ClothingDetailDialog.this, "Error menyimpan data: " + ex.getMessage());
                    }

                    // Get the clothing data
                    List<Clothing> clotheList = clothingService.getAllClothes();

                    // Convert the data to the format required by JTable
                    String[] columnNames = {"Nomor", "Nama Baju", "Harga", "Stock"};
                    Object[][] data = convertClothesListToArray(clotheList);

                    JOptionPane.showMessageDialog(ClothingDetailDialog.this, "Data deleted successfully.");
                    dispose();
                }
            });

            pack();
            setLocationRelativeTo(getParent());
        }

        public Object[][] convertClothesListToArray(List<Clothing> clotheList) {
            Object[][] data = new Object[clotheList.size()][4];
            for (int i = 0; i < clotheList.size(); i++) {
                Clothing clothes = clotheList.get(i);
                data[i][0] = clothes.getId();
                data[i][1] = clothes.getName();
                data[i][2] = clothes.getPrice();
                data[i][3] = clothes.getStock();
            }
            return data;
        }

        private JPanel createFieldPanel(String labelText, JTextField textField) {
            JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEADING));
            JLabel label = new JLabel(labelText);
            label.setPreferredSize(new Dimension(70, 25)); // Adjust width as needed
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
