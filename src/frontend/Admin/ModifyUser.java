package src.frontend.Admin;

import src.backend.users.UserDAO;
import src.backend.users.Users;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Font;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class ModifyUser extends javax.swing.JFrame {
    int xx, xy;

    public ModifyUser() {
        this.setUndecorated(true);
        FlatLightLaf.setup();
        UIManager.put("TextComponent.arc", 999);
        UIManager.put("Button.arc", 999);
        System.setProperty("flatlaf.menuBarEmbbedded", "false");
        initComponents();
        init();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tenDangNhap = new javax.swing.JTextField();
        tenNguoiDung = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        gtNam = new javax.swing.JRadioButton();
        gtNu = new javax.swing.JRadioButton();
        sdt = new javax.swing.JTextField();
        quanLy = new javax.swing.JRadioButton();
        baoVe = new javax.swing.JRadioButton();
        ngay = new javax.swing.JRadioButton();
        dem = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(582, 477));
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanel1MousePressed(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("TÊN ĐĂNG NHẬP");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("TÊN NGƯỜI DÙNG");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("MẬT KHẨU");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("GIỚI TÍNH");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("SỐ ĐIỆN THOẠI");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("CHỨC VỤ");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("CA LÀM VIỆC");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        tenDangNhap.setPreferredSize(new java.awt.Dimension(65, 30));
        jPanel1.add(tenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 340, -1));

        tenNguoiDung.setPreferredSize(new java.awt.Dimension(65, 30));
        jPanel1.add(tenNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 340, -1));

        jPasswordField1.setPreferredSize(new java.awt.Dimension(127, 30));
        jPanel1.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 340, -1));

        buttonGroup1.add(gtNam);
        gtNam.setText("Nam");
        jPanel1.add(gtNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, -1));

        buttonGroup1.add(gtNu);
        gtNu.setText("Nữ");
        jPanel1.add(gtNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, -1, -1));

        sdt.setPreferredSize(new java.awt.Dimension(65, 30));
        jPanel1.add(sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 240, 340, -1));

        buttonGroup2.add(quanLy);
        quanLy.setText("Quản lý");
        jPanel1.add(quanLy, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, -1, -1));

        buttonGroup2.add(baoVe);
        baoVe.setText("Bảo vệ");
        jPanel1.add(baoVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        buttonGroup3.add(ngay);
        ngay.setText("Ngày");
        jPanel1.add(ngay, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, -1, -1));

        buttonGroup3.add(dem);
        dem.setText("Đêm");
        jPanel1.add(dem, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 330, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/password_hide.jpg"))); // NOI18N
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 175, -1, -1));

        jButton1.setBackground(new java.awt.Color(255, 153, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Lưu");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (HeadlessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 90, 30));

        jButton2.setBackground(new java.awt.Color(255, 153, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Xóa");
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, 90, 30));

        jLabel11.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText(" X");
        jLabel11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel11MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 22, -1));

        jPanel2.setBackground(new java.awt.Color(255, 102, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SỬA THÔNG TIN NGƯỜI DÙNG");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel12.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText(" X");
        jLabel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 0, 22, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel5.setText("X");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 580, 60));

        jButton3.setBackground(new java.awt.Color(255, 153, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Hủy");
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 90, 30));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/password_show.jpg"))); // NOI18N
        jLabel13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 175, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 581,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 447, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel11MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel11MouseClicked
        System.exit(0);
    }// GEN-LAST:event_jLabel11MouseClicked

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel1MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }// GEN-LAST:event_jPanel1MouseDragged

    private void jPanel1MousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel1MousePressed
        xx = evt.getX();
        xy = evt.getY();
    }// GEN-LAST:event_jPanel1MousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
        for (double i = 0; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(ModifyUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }// GEN-LAST:event_formWindowOpened

    private void formMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }// GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }// GEN-LAST:event_formMouseDragged

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel12MouseClicked
        System.exit(0);
    }// GEN-LAST:event_jLabel12MouseClicked

    private void init() {
        gtNam.setSelected(true);
        dem.setSelected(true);
        baoVe.setSelected(true);
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        tenDangNhap.setText("");
        tenNguoiDung.setText("");
        sdt.setText("");
        jPasswordField1.setText("");
        init();
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        ;
    }// GEN-LAST:event_jButton3ActionPerformed

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel13MouseClicked
        jPasswordField1.setFont(new Font("Segoe UI", Font.BOLD, 12));
        jPasswordField1.setEchoChar('*');
        jLabel10.setVisible(true);
        jLabel13.setVisible(false);
    }// GEN-LAST:event_jLabel13MouseClicked

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel10MouseClicked
        jPasswordField1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        jPasswordField1.setEchoChar((char) 0);
        jLabel10.setVisible(false);
        jLabel13.setVisible(true);
    }// GEN-LAST:event_jLabel10MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt)
            throws HeadlessException, ClassNotFoundException, SQLException {// GEN-FIRST:event_jButton1ActionPerformed
        String username = tenDangNhap.getText();
        String fullName = tenNguoiDung.getText();
        String password = jPasswordField1.getPassword().toString();
        String phone = sdt.getText();
        String gt = "";
        if (gtNam.isSelected())
            gt = "Male";
        else
            gt = "Female";
        int workShift = 1;
        if (dem.isSelected())
            workShift = 2;
        int role = 1;
        if (baoVe.isSelected())
            role = 2;
        if (username.isEmpty() || fullName.isEmpty() || password.isEmpty() || phone.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng điền đầy đủ dữ liệu", "Thông báo", 2);
        } else if (UserDAO.isPhoneExist(phone, 0)) {
            JOptionPane.showMessageDialog(this, "Số điện thoại này đã được đăng ký", "Thông báo", 2);
        } else if (UserDAO.isUsernameExist(username)) {
            JOptionPane.showMessageDialog(this, "Tên người dùng đã tồn tại", "Thông báo", 2);
        } else {
            try {
                int id = UserDAO.getUserId(username);
                Users user = new Users(username, password, fullName, gt, phone, workShift, role);
                try {
                    UserDAO.removeSecurityGuard(id);
                    UserDAO.addSecurityGuard(user);
                    JOptionPane.showMessageDialog(this, "Cập nhật thành công", "Thông báo", 2);
                    this.dispose();
                } catch (SQLException ex) {
                    Logger.getLogger(AddUser.class.getName()).log(Level.SEVERE, null, ex);
                }
            } catch (SQLException ex) {
                Logger.getLogger(ModifyUser.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(ModifyUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }// GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModifyUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton baoVe;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JRadioButton dem;
    private javax.swing.JRadioButton gtNam;
    private javax.swing.JRadioButton gtNu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton ngay;
    private javax.swing.JRadioButton quanLy;
    private javax.swing.JTextField sdt;
    private javax.swing.JTextField tenDangNhap;
    private javax.swing.JTextField tenNguoiDung;
    // End of variables declaration//GEN-END:variables
}
