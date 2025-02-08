package form;

import constant.SessionManager;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.Locale;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import model.Clothing;
import model.Revenue;
import model.User;
import service.impl.ClothingServiceImpl;
import service.impl.RevenueServiceImpl;
import service.impl.UserServiceImpl;

public class MainFrame extends javax.swing.JFrame {

    public MainFrame() {
        initComponents();
        addHeaderComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
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
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        labelUsername = new javax.swing.JLabel();
        labelCustomerName = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1010, 700));
        setPreferredSize(new java.awt.Dimension(1010, 625));
        setResizable(false);
        setSize(new java.awt.Dimension(1010, 700));

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
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

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/home.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 6, 40, 45));

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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
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
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel9MouseClicked(evt);
            }
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
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
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

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(245, 245, 245));
        jLabel5.setText("Wellcome To ");

        jLabel17.setFont(new java.awt.Font("Calibri", 1, 28)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(245, 245, 245));
        jLabel17.setText("All Far I See Merch");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/profile.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        labelUsername.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        labelUsername.setForeground(new java.awt.Color(245, 245, 245));
        labelUsername.setText("Username");

        labelCustomerName.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        labelCustomerName.setForeground(new java.awt.Color(245, 245, 245));
        labelCustomerName.setText("Customer Name");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 345, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelUsername, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(labelCustomerName, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(labelCustomerName))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
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
            // clear session login
            final int CLEAR_SESSION = 0;
            final String CLEAR_SESSION_USER = "";
            SessionManager.setUserId(CLEAR_SESSION);
            SessionManager.setRoleId(CLEAR_SESSION);
            SessionManager.setName(CLEAR_SESSION_USER);
            SessionManager.setUserName(CLEAR_SESSION_USER);
            // redirect to login page
            LoginFrame loginPage = new LoginFrame();
            loginPage.setLocationRelativeTo(null); 
            loginPage.setVisible(true);
        }
    }//GEN-LAST:event_jPanel10MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked

        UserServiceImpl userService = new UserServiceImpl();
        try {
            List<User> members = userService.getAllMembers();
            String[] columnNames = {"ID", "Role", "Nama Member", "Email", "Username"};
            Object[][] data = new Object[members.size()][5];

            for (int i = 0; i < members.size(); i++) {
                User member = members.get(i);
                data[i] = new Object[]{member.getId(), member.getRoleName(), member.getFullName(), member.getEmail(), member.getUsername()};
            }

            setMemberData(data, columnNames);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error fetching member data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jPanel8MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked

        ClothingServiceImpl clothingService = new ClothingServiceImpl();
        try {
            Locale localeID = new Locale("in", "ID");
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeID);
            currencyFormatter.setMaximumFractionDigits(0); // Remove decimal places

            List<Clothing> clotheList = clothingService.getAllClothes();
            String[] columnNames = {"No", "Nama Merchandise", "Harga", "Stok"};
            Object[][] data = new Object[clotheList.size()][4];

            for (int i = 0; i < clotheList.size(); i++) {
                Clothing clothes = clotheList.get(i);
                data[i][0] = clothes.getId();
                data[i][1] = clothes.getName();
                data[i][2] = currencyFormatter.format(clothes.getPrice());
                data[i][3] = clothes.getStock();
            }
            setClothingDataCollection(data, columnNames);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error fetching merchandise data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked

        ClothingServiceImpl clothingService = new ClothingServiceImpl();
        try {
            Locale localeID = new Locale("in", "ID");
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeID);
            currencyFormatter.setMaximumFractionDigits(0); // Remove decimal places

            List<Clothing> clotheList = clothingService.getAllClothes();
            String[] columnNames = {"ID", "Nama Baju", "Harga", "Stock"};
            Object[][] data = new Object[clotheList.size()][4];
            for (int i = 0; i < clotheList.size(); i++) {
                Clothing clothes = clotheList.get(i);
                data[i][0] = clothes.getId();
                data[i][1] = clothes.getName();
                data[i][2] = currencyFormatter.format(clothes.getPrice());
                data[i][3] = clothes.getStock();
            }
            setClothingData(data, columnNames);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error fetching clothing data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel9MouseClicked

        RevenueServiceImpl revenueService = new RevenueServiceImpl();
        try {
            Locale localeID = new Locale("in", "ID");
            NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(localeID);
            currencyFormatter.setMaximumFractionDigits(0); // Remove decimal places

            List<Revenue> revenues = revenueService.getAllRevenues();
            String[] columnNames = {"Merchandise", "Sale Date", "Nama Pembeli", "Quantity", "Harga Item", "Total"};
            Object[][] data = new Object[revenues.size()][6];
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy");
            for (int i = 0; i < revenues.size(); i++) {
                Revenue revenue = revenues.get(i);
                String saleDate = dateFormat.format(revenue.getSaleDate());
                data[i] = new Object[]{
                    revenue.getClothingName(),
                    saleDate,
                    revenue.getCustomerName() != null ? revenue.getCustomerName() : "Guest",
                    revenue.getQuantity(),
                    currencyFormatter.format(revenue.getPricePerItem()),
                    currencyFormatter.format(revenue.getTotalAmount()),};
            }
            setRevenueData(data, columnNames);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error fetching revenue data: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }//GEN-LAST:event_jPanel9MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

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
    private javax.swing.JLabel labelCustomerName;
    private javax.swing.JLabel labelUsername;
    // End of variables declaration//GEN-END:variables

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

        JLabel titleLabel = new JLabel("Daftar Stok Merchandise :", SwingConstants.LEFT);
        Font labelFont = new Font("Arial", Font.BOLD, 18);
        titleLabel.setFont(labelFont);

        Color labelColor = new Color(0x36464E);
        titleLabel.setForeground(labelColor);
        titlePanel.add(titleLabel, BorderLayout.WEST);
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
        table.getColumnModel().getColumn(0).setPreferredWidth(30); // Nomor
        table.getColumnModel().getColumn(1).setPreferredWidth(220); // Nama Baju
        table.getColumnModel().getColumn(2).setPreferredWidth(80);  // Stok
        table.getColumnModel().getColumn(3).setPreferredWidth(80);  // Harga
        table.getColumnModel().getColumn(4).setPreferredWidth(100); // Action
        // Cell Renderer
        DefaultTableCellRenderer cellRenderer = new DefaultTableCellRenderer();
        cellRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        table.setDefaultRenderer(Object.class, cellRenderer);
        // Add detail button
        for (int i = 0; i < table.getRowCount(); i++) {
            tableModel.setValueAt(new JButton("Purchase"), i, columnNames.length); // Add button to each row.
        }
        // Set renderer and editor for the "Action" column
        ButtonRenderer buttonRenderer = new ButtonRenderer();
        ButtonEditorPurchase buttonEditorPurchase = new ButtonEditorPurchase(new JCheckBox(), MainFrame.this);
        TableColumn actionColumn = table.getColumnModel().getColumn(columnNames.length);
        actionColumn.setCellRenderer(buttonRenderer);
        actionColumn.setCellEditor(buttonEditorPurchase);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(new EmptyBorder(10, 30, 30, 30));
        scrollPane.getViewport().setBackground(backgroundColor);
        jPanel3.add(scrollPane, BorderLayout.CENTER);

        // Stats Panel (Example - adapt to your needs)
        JPanel statsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 30, 0));
        statsPanel.setBackground(backgroundColor);
        statsPanel.setBorder(new EmptyBorder(0, 30, 20, 30));
        jPanel3.add(statsPanel, BorderLayout.SOUTH);
        // Revalidate and Repaint
        jPanel3.revalidate();
        jPanel3.repaint();
    }

    public void setClothingDataCollection(Object[][] data, String[] columnNames) {
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

        JLabel titleLabel = new JLabel("Data Koleksi Merchandise :", SwingConstants.LEFT);
        Font labelFont = new Font("Arial", Font.BOLD, 18);
        titleLabel.setFont(labelFont);

        Color labelColor = new Color(0x36464E);
        titleLabel.setForeground(labelColor);
        titlePanel.add(titleLabel, BorderLayout.WEST);

        JButton addButton = new JButton("Tambah Merch");
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
            AddClothingDialog dialog = new AddClothingDialog(mainFrame, "Tambah Data Merchandise", true, tableModel);
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
        table.getColumnModel().getColumn(0).setPreferredWidth(20); // Nomor
        table.getColumnModel().getColumn(1).setPreferredWidth(230); // Nama Baju
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
        // Revalidate and Repaint
        jPanel3.revalidate();
        jPanel3.repaint();
    }

    public void setMemberData(Object[][] data, String[] columnNames) {
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

        JLabel titleLabel = new JLabel("Data Member : ", SwingConstants.LEFT);
        Font labelFont = new Font("Arial", Font.BOLD, 18);
        titleLabel.setFont(labelFont);

        Color labelColor = new Color(0x36464E);
        titleLabel.setForeground(labelColor);
        titlePanel.add(titleLabel, BorderLayout.WEST);
        jPanel3.add(titlePanel, BorderLayout.NORTH);
        // Table Model
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false; // Make cells non-editable
            }
        };
        // Table
        JTable table = new JTable(tableModel);
        table.setBackground(backgroundColor);
        table.setForeground(textColor);
        table.setFont(new Font("SansSerif", Font.PLAIN, 14));
        table.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));
        table.getTableHeader().setBackground(accentColor);
        table.getTableHeader().setForeground(Color.WHITE);
        // Set column widths
        table.getColumnModel().getColumn(0).setPreferredWidth(50);   // ID
        table.getColumnModel().getColumn(1).setPreferredWidth(120);  // Nama Role
        table.getColumnModel().getColumn(2).setPreferredWidth(200);  // Nama Lengkap
        table.getColumnModel().getColumn(3).setPreferredWidth(200);  // Email
        table.getColumnModel().getColumn(4).setPreferredWidth(150);  // Username
        // Left-align all columns
        DefaultTableCellRenderer leftRenderer = new DefaultTableCellRenderer();
        leftRenderer.setHorizontalAlignment(SwingConstants.LEFT);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(leftRenderer);
        }
        
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(new EmptyBorder(10, 30, 30, 30));
        scrollPane.getViewport().setBackground(backgroundColor);
        jPanel3.add(scrollPane, BorderLayout.CENTER);
        // Revalidate and Repaint
        jPanel3.revalidate();
        jPanel3.repaint();
    }

    public void setRevenueData(Object[][] data, String[] columnNames) {
        jPanel3.removeAll();
        jPanel3.setLayout(new BorderLayout());
        
        Color backgroundColor = new Color(245, 245, 245);
        Color textColor = new Color(51, 51, 51);
        Color accentColor = new Color(0, 128, 128);
        jPanel3.setBackground(backgroundColor);

        double totalRevenue = 0;
        int totalItemsSold = 0;
        for (Object[] row : data) {
            String revenueStr = (String) row[5]; 
            revenueStr = revenueStr.replace("Rp", "");
            try {
                totalRevenue += Double.parseDouble(revenueStr.replace(".", "")); 
            } catch (NumberFormatException e) {
                System.err.println("Error parsing total revenue: " + revenueStr);
                e.printStackTrace();
            }
            totalItemsSold += (int) row[3];
        }
        // Create header panel for labels
        JPanel headerPanel = new JPanel(new BorderLayout());
        headerPanel.setBackground(backgroundColor);
        headerPanel.setBorder(new EmptyBorder(10, 30, 10, 30));

        JLabel titleLabel = new JLabel("Data Revenue : ", SwingConstants.LEFT);
        Font labelFont = new Font("Arial", Font.BOLD, 18);
        titleLabel.setFont(labelFont);

        Color labelColor = new Color(0x36464E);
        titleLabel.setForeground(labelColor);
        // Create panel for totals labels (right side)
        JPanel totalsPanel = new JPanel();
        totalsPanel.setLayout(new BoxLayout(totalsPanel, BoxLayout.Y_AXIS));
        totalsPanel.setBackground(backgroundColor);

        JLabel totalItemsSoldLabel = new JLabel("Total Items Sold: " + totalItemsSold, SwingConstants.RIGHT);
        totalItemsSoldLabel.setFont(labelFont.deriveFont(Font.BOLD, 14));
        totalItemsSoldLabel.setForeground(labelColor);
        totalsPanel.add(totalItemsSoldLabel);
        
        JLabel totalRevenueLabel = new JLabel("Total Revenue: " + String.format("Rp %,.2f", totalRevenue), SwingConstants.RIGHT);
        totalRevenueLabel.setFont(labelFont.deriveFont(Font.BOLD, 14));
        totalRevenueLabel.setForeground(labelColor);
        totalsPanel.add(totalRevenueLabel);

        headerPanel.add(titleLabel, BorderLayout.WEST);
        headerPanel.add(totalsPanel, BorderLayout.EAST);
        jPanel3.add(headerPanel, BorderLayout.NORTH);
        DefaultTableModel tableModel = new DefaultTableModel(data, columnNames) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        JTable table = new JTable(tableModel);
        table.setBackground(backgroundColor);
        table.setForeground(textColor);
        table.setFont(new Font("SansSerif", Font.PLAIN, 14));
        table.getTableHeader().setFont(new Font("SansSerif", Font.BOLD, 14));
        table.getTableHeader().setBackground(accentColor);
        table.getTableHeader().setForeground(Color.WHITE);

        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < table.getColumnCount(); i++) {
            table.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBorder(new EmptyBorder(10, 30, 30, 30));
        scrollPane.getViewport().setBackground(backgroundColor);
        scrollPane.setPreferredSize(new Dimension(700, 500));
        jPanel3.add(scrollPane, BorderLayout.CENTER);
        jPanel3.revalidate();
        jPanel3.repaint();
    }
    
    private void addHeaderComponents() {
        labelUsername.setText(SessionManager.getUserName());
        labelCustomerName.setText(SessionManager.getName());
    }
}
