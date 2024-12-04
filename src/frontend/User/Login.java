package src.frontend.User;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import src.frontend.Admin.AdminDashBoard;
import src.backend.databaseConnector.databaseConnector;
import src.backend.users.UserDAO;
import src.frontend.User.UserDashboard;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JCheckBox;

public class Login extends javax.swing.JFrame {
    int xx, xy;
    UserDAO user = new UserDAO();

    public Login() {
        FlatLightLaf.setup();
        UIManager.put("TextComponent.arc", 999);
        UIManager.put("Button.arc", 999);
        UIManager.put("Component.arc", 999);
        System.setProperty("flatlaf.menuBarEmbbedded", "false");
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(null);
        try (BufferedReader reader = new BufferedReader(new FileReader("login.txt"))) {
            String username = reader.readLine();
            String password = reader.readLine();

            if (username != null && password != null) {
                jTextField1.setText(username);
                jPasswordField1.setText(password);
                save.setSelected(true);
            }
        } catch (IOException ex) {
            System.out.print("");
        }
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPasswordField1 = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        save = new javax.swing.JCheckBox();

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
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/backgroundlog.jpg"))); // NOI18N
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 370));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(410, 370));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 255));
        jLabel6.setText(" X");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 0, 22, -1));

        jLabel7.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 51));
        jLabel7.setText("ĐĂNG NHẬP QUẢN LÝ BÃI ĐỖ XE");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, -1, 40));

        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jPanel2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 290, 27));

        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }

            public void focusLost(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusLost(evt);
            }
        });
        jPanel2.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 290, 28));

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
        jButton1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ĐĂNG NHẬP");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton1ActionPerformed(evt);
                } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 290, 160, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/password_hide.jpg"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 195, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/password_show.jpg"))); // NOI18N
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 195, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Tên đăng nhập");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Mật khẩu");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Quên mật khẩu?");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.setPreferredSize(new java.awt.Dimension(93, 25));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, -1, -1));

        save.setBackground(new java.awt.Color(255, 255, 255));
        save.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        save.setText("Lưu mật khẩu");
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean isEmpty() {
        if (jTextField1.getText().equals("Nhập tên người dùng...")) {
            JOptionPane.showMessageDialog(this, "Hãy nhập tên đăng nhập", "Thông báo", 2);
            return false;
        }
        if (String.valueOf(jPasswordField1.getPassword()).toString().equals("Nhập mật khẩu...")) {
            JOptionPane.showMessageDialog(this, "Hãy nhập mật khẩu", "Thông báo", 2);
            return false;
        }
        return true;
    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
        for (double i = 0; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
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

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel1MouseClicked
        JOptionPane.showMessageDialog(this, "Vui lòng liên hệ với Admin để được cấp lại mật khẩu", "Quên mật khẩu", 2);
    }// GEN-LAST:event_jLabel1MouseClicked

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel3MouseClicked
        jPasswordField1.setFont(new Font("Segoe UI", Font.BOLD, 12));
        jPasswordField1.setEchoChar('*');
        jLabel2.setVisible(true);
        jLabel3.setVisible(false);
    }// GEN-LAST:event_jLabel3MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel2MouseClicked
        jPasswordField1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        jPasswordField1.setEchoChar((char) 0);
        jLabel2.setVisible(false);
        jLabel3.setVisible(true);
    }// GEN-LAST:event_jLabel2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException {// GEN-FIRST:event_jButton1ActionPerformed
        if (isEmpty()) {
            String username = jTextField1.getText();
            String password = String.valueOf(jPasswordField1.getPassword());
            try {
                user.login(username, password);
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                Connection con = databaseConnector.getConnection();
                PreparedStatement ps;
                ps = con.prepareStatement("select roleId from users where username = ? and password = ?");
                ps.setString(1, username);
                ps.setString(2, password);
                ResultSet rs = ps.executeQuery();
                if (rs.next()) {
                    int role = rs.getInt(1);
                    if (role == 1) {
                        AdminDashBoard n = new AdminDashBoard();
                        try {
                            n.ten.setText(UserDAO.getFullName(username));
                            n.name.setText(UserDAO.getFullName(username));
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        n.setVisible(true);
                        n.Paneltask2.setVisible(true);
                    } else {
                        UserDashboard n = new UserDashboard();
                        try {
                            n.ten.setText(UserDAO.getFullName(username));
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        try {
                            n.name.setText(UserDAO.getFullName(username));
                        } catch (ClassNotFoundException ex) {
                            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        n.setVisible(true);
                        n.Paneltask2.setVisible(true);
                    }
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Mật khẩu hoặc tên đăng nhập không chính xác",
                            "Đăng nhập thất bại", 2);
                }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
            if (save.isSelected()) {
                try (FileWriter writer = new FileWriter("login.txt")) {
                    writer.write(username + "\n");
                    writer.write(password + "\n");
                } catch (IOException ex) {
                    System.out.print("");
                }
            } else {
                try (FileWriter writer = new FileWriter("login.txt")) {
                } catch (IOException ex) {
                    System.out.print("");
                }
            }
        }
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jPasswordField1FocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jPasswordField1FocusLost
        if (String.valueOf(jPasswordField1.getPassword()).isEmpty()) {
            jPasswordField1.setText("Nhập mật khẩu...");
            jPasswordField1.setForeground(Color.GRAY);
            jPasswordField1.setFont(new Font("Segoe UI", Font.PLAIN, 12));
            jPasswordField1.setEchoChar((char) 0);
        }
    }// GEN-LAST:event_jPasswordField1FocusLost

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jPasswordField1FocusGained
        if (String.valueOf(jPasswordField1.getPassword()).equals("Nhập mật khẩu...")) {
            jPasswordField1.setText("");
            jPasswordField1.setForeground(Color.BLACK);
            jPasswordField1.setFont(new Font("Segoe UI", Font.BOLD, 12));
            jPasswordField1.setEchoChar('•');
        }
    }// GEN-LAST:event_jPasswordField1FocusGained

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField1FocusLost
        if (jTextField1.getText().isEmpty()) {
            jTextField1.setText("Nhập tên người dùng...");
            jTextField1.setForeground(java.awt.Color.GRAY);
        }
    }// GEN-LAST:event_jTextField1FocusLost

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_jTextField1FocusGained
        if (jTextField1.getText().equals("Nhập tên người dùng...")) {
            jTextField1.setText("");
            jTextField1.setForeground(java.awt.Color.BLACK);
        }
    }// GEN-LAST:event_jTextField1FocusGained

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel6MouseClicked
        System.exit(0);
    }// GEN-LAST:event_jLabel6MouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FlatLightLaf.setup();
                UIManager.put("TextComponent.arc", 999);
                UIManager.put("Button.arc", 999);
                System.setProperty("flatlaf.menuBarEmbbedded", "false");
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JCheckBox save;
    // End of variables declaration//GEN-END:variables
}
