package src.frontend.User;

import src.frontend.Admin.AdminDashBoard;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class UserDashboard extends javax.swing.JFrame {
    Color notSelect = new Color(240, 240, 240);
    Color select = new Color(255, 255, 255);
    Color barNotSelect = new Color(225, 225, 225);
    Color barSelect = new Color(51, 153, 255);
    Color downSelect = new Color(204, 255, 255);
    Color notSelectText = new Color(153, 153, 153);
    int xx, xy;
    Font font1 = new Font("Segoe UI", Font.PLAIN, 18);
    Font font2 = new Font("Segoe UI", Font.BOLD, 18);
    public String role;

    public UserDashboard() {
        this.setUndecorated(true);
        initComponents();
        init();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelWindow = new javax.swing.JPanel();
        jPanelBar = new javax.swing.JPanel();
        jPanelTask = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Panel2text = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Panel3text = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Panel4text = new javax.swing.JLabel();
        JPanel5 = new javax.swing.JPanel();
        Panel5text = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Panel6text = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Panel9text = new javax.swing.JLabel();
        jPanel1s = new javax.swing.JPanel();
        jPanel2s = new javax.swing.JPanel();
        jPanel3s = new javax.swing.JPanel();
        jPanel4s = new javax.swing.JPanel();
        jPanel5s = new javax.swing.JPanel();
        jPanel6s = new javax.swing.JPanel();
        jPanel8s = new javax.swing.JPanel();
        jPanel2u = new javax.swing.JPanel();
        jPanel3u = new javax.swing.JPanel();
        jPanel4u = new javax.swing.JPanel();
        jPanel5u = new javax.swing.JPanel();
        jPanel6u = new javax.swing.JPanel();
        jPanel8u = new javax.swing.JPanel();
        jPanel1d = new javax.swing.JPanel();
        jPanel2d = new javax.swing.JPanel();
        jPanel3d = new javax.swing.JPanel();
        jPanel4d = new javax.swing.JPanel();
        jPanel5d = new javax.swing.JPanel();
        jPanel6d = new javax.swing.JPanel();
        jPanel8d = new javax.swing.JPanel();
        jPanel9d = new javax.swing.JPanel();
        Paneltask2 = new javax.swing.JPanel();
        jPanel24 = new javax.swing.JPanel();
        jPanel34 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel35 = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        thongBaoLanVao = new javax.swing.JTextField();
        thongBaoLanRa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        gioVaoLanVao = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        loaiXeLanVao = new javax.swing.JComboBox<>();
        bienSoLanRa = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        ngayVaoLanVao = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        bienSoLanVao = new javax.swing.JTextField();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        ngayRa = new javax.swing.JTextField();
        jLabel29 = new javax.swing.JLabel();
        loaiXeLanRa = new javax.swing.JComboBox<>();
        ngayVaoLanRa = new javax.swing.JTextField();
        jLabel30 = new javax.swing.JLabel();
        clearLanVao = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        luuLanVao = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        clearLanRa = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        tinhTien = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        gioVaoLanRa = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        gioRa = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        Paneltask3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        Tieude3 = new javax.swing.JLabel();
        Search3 = new javax.swing.JLabel();
        search3text = new javax.swing.JTextField();
        chucNangPanel3 = new javax.swing.JPanel();
        giaHanVeThang = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        xoaVeThang = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        suaVeThang = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        dangKyVeThang = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel20 = new javax.swing.JPanel();
        jPanel21 = new javax.swing.JPanel();
        jPanel22 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        bangVeThang = new javax.swing.JTable();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        Paneltask4 = new javax.swing.JPanel();
        jPanel23 = new javax.swing.JPanel();
        Tieude4 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTable5 = new javax.swing.JTable();
        Search4 = new javax.swing.JLabel();
        search3text1 = new javax.swing.JTextField();
        jPanel50 = new javax.swing.JPanel();
        jPanel68 = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jPanel69 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jPanel71 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jPanel75 = new javax.swing.JPanel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        Paneltask5 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel66 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        bienSoLanRa1 = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        loaiXeLanRa1 = new javax.swing.JComboBox<>();
        jLabel86 = new javax.swing.JLabel();
        loaiXeLanRa2 = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jDateChooser3 = new com.toedter.calendar.JDateChooser();
        jDateChooser4 = new com.toedter.calendar.JDateChooser();
        loaiXeLanRa3 = new javax.swing.JComboBox<>();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        loaiXeLanRa4 = new javax.swing.JComboBox<>();
        jPanel7 = new javax.swing.JPanel();
        Paneltask6 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
        jLabel45 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        Paneltask8 = new javax.swing.JPanel();
        chucNang8 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jPanel27 = new javax.swing.JPanel();
        jPanel28 = new javax.swing.JPanel();
        task8_thongTin = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        task8_doiMatKhau = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        thongTin = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        capNhatNguoiDung = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        clearNguoiDung = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        tenDangNhap = new javax.swing.JTextField();
        jLabel81 = new javax.swing.JLabel();
        tenNguoiDung = new javax.swing.JTextField();
        sdt = new javax.swing.JTextField();
        jLabel82 = new javax.swing.JLabel();
        caLam = new javax.swing.JTextField();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        chucVu = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        doiMatKhau = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        matKhauCu = new javax.swing.JPasswordField();
        matKhauMoi = new javax.swing.JPasswordField();
        xacNhanMatKhau = new javax.swing.JPasswordField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        capNhatMatKhau = new javax.swing.JPanel();
        jLabel50 = new javax.swing.JLabel();
        xoaMatKhau = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();

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

        jPanelWindow.setBackground(new java.awt.Color(255, 255, 255));
        jPanelWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBar.setBackground(new java.awt.Color(255, 153, 51));

        javax.swing.GroupLayout jPanelBarLayout = new javax.swing.GroupLayout(jPanelBar);
        jPanelBar.setLayout(jPanelBarLayout);
        jPanelBarLayout.setHorizontalGroup(
                jPanelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1111, Short.MAX_VALUE));
        jPanelBarLayout.setVerticalGroup(
                jPanelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 50, Short.MAX_VALUE));

        jPanelWindow.add(jPanelBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1111, 50));

        jPanelTask.setBackground(new java.awt.Color(225, 225, 225));
        jPanelTask.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(80, 77));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 80, Short.MAX_VALUE));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 77, Short.MAX_VALUE));

        jPanelTask.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 10, -1, -1));

        jPanel9.setPreferredSize(new java.awt.Dimension(382, 77));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 382, Short.MAX_VALUE));
        jPanel9Layout.setVerticalGroup(
                jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 77, Short.MAX_VALUE));

        jPanelTask.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 10, -1, -1));

        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel2.setPreferredSize(new java.awt.Dimension(90, 77));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel2text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Panel2text.setForeground(new java.awt.Color(153, 153, 153));
        Panel2text.setText("VÀO RA");
        jPanel2.add(Panel2text, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 40, -1, -1));

        jPanelTask.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 10, -1, -1));

        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.setPreferredSize(new java.awt.Dimension(100, 77));
        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel3text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Panel3text.setForeground(new java.awt.Color(153, 153, 153));
        Panel3text.setText("VÉ THÁNG");
        jPanel3.add(Panel3text, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 40, -1, -1));

        jPanelTask.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 10, -1, -1));

        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.setPreferredSize(new java.awt.Dimension(90, 77));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
        });
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel4text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Panel4text.setForeground(new java.awt.Color(153, 153, 153));
        Panel4text.setText("VÉ LƯỢT");
        jPanel4.add(Panel4text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, -1, -1));

        jPanelTask.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 10, -1, -1));

        JPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JPanel5.setPreferredSize(new java.awt.Dimension(120, 77));
        JPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JPanel5MouseClicked(evt);
            }
        });
        JPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel5text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Panel5text.setForeground(new java.awt.Color(153, 153, 153));
        Panel5text.setText("TÌM KIẾM XE");
        JPanel5.add(Panel5text, new org.netbeans.lib.awtextra.AbsoluteConstraints(9, 40, -1, -1));

        jPanelTask.add(JPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, -1, -1));

        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.setPreferredSize(new java.awt.Dimension(100, 77));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
        });
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel6text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Panel6text.setForeground(new java.awt.Color(153, 153, 153));
        Panel6text.setText("THỐNG KÊ");
        jPanel6.add(Panel6text, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, -1, -1));

        jPanelTask.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 10, -1, -1));

        jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel8.setPreferredSize(new java.awt.Dimension(130, 77));
        jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel8MouseClicked(evt);
            }
        });
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel9text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Panel9text.setForeground(new java.awt.Color(153, 153, 153));
        Panel9text.setText("NGƯỜI DÙNG");
        jPanel8.add(Panel9text, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 40, -1, -1));

        jPanelTask.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 10, -1, -1));

        jPanel1s.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1s.setPreferredSize(new java.awt.Dimension(2, 77));

        javax.swing.GroupLayout jPanel1sLayout = new javax.swing.GroupLayout(jPanel1s);
        jPanel1s.setLayout(jPanel1sLayout);
        jPanel1sLayout.setHorizontalGroup(
                jPanel1sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));
        jPanel1sLayout.setVerticalGroup(
                jPanel1sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 77, Short.MAX_VALUE));

        jPanelTask.add(jPanel1s, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 10, -1, -1));

        jPanel2s.setBackground(new java.awt.Color(225, 225, 225));
        jPanel2s.setPreferredSize(new java.awt.Dimension(2, 77));

        javax.swing.GroupLayout jPanel2sLayout = new javax.swing.GroupLayout(jPanel2s);
        jPanel2s.setLayout(jPanel2sLayout);
        jPanel2sLayout.setHorizontalGroup(
                jPanel2sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));
        jPanel2sLayout.setVerticalGroup(
                jPanel2sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 77, Short.MAX_VALUE));

        jPanelTask.add(jPanel2s, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 10, -1, -1));

        jPanel3s.setBackground(new java.awt.Color(225, 225, 225));
        jPanel3s.setPreferredSize(new java.awt.Dimension(2, 77));

        javax.swing.GroupLayout jPanel3sLayout = new javax.swing.GroupLayout(jPanel3s);
        jPanel3s.setLayout(jPanel3sLayout);
        jPanel3sLayout.setHorizontalGroup(
                jPanel3sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));
        jPanel3sLayout.setVerticalGroup(
                jPanel3sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 77, Short.MAX_VALUE));

        jPanelTask.add(jPanel3s, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 10, -1, -1));

        jPanel4s.setBackground(new java.awt.Color(225, 225, 225));
        jPanel4s.setPreferredSize(new java.awt.Dimension(2, 77));

        javax.swing.GroupLayout jPanel4sLayout = new javax.swing.GroupLayout(jPanel4s);
        jPanel4s.setLayout(jPanel4sLayout);
        jPanel4sLayout.setHorizontalGroup(
                jPanel4sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));
        jPanel4sLayout.setVerticalGroup(
                jPanel4sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 77, Short.MAX_VALUE));

        jPanelTask.add(jPanel4s, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 10, -1, -1));

        jPanel5s.setBackground(new java.awt.Color(225, 225, 225));
        jPanel5s.setPreferredSize(new java.awt.Dimension(2, 77));

        javax.swing.GroupLayout jPanel5sLayout = new javax.swing.GroupLayout(jPanel5s);
        jPanel5s.setLayout(jPanel5sLayout);
        jPanel5sLayout.setHorizontalGroup(
                jPanel5sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));
        jPanel5sLayout.setVerticalGroup(
                jPanel5sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 77, Short.MAX_VALUE));

        jPanelTask.add(jPanel5s, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        jPanel6s.setBackground(new java.awt.Color(225, 225, 225));
        jPanel6s.setPreferredSize(new java.awt.Dimension(2, 77));

        javax.swing.GroupLayout jPanel6sLayout = new javax.swing.GroupLayout(jPanel6s);
        jPanel6s.setLayout(jPanel6sLayout);
        jPanel6sLayout.setHorizontalGroup(
                jPanel6sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));
        jPanel6sLayout.setVerticalGroup(
                jPanel6sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 77, Short.MAX_VALUE));

        jPanelTask.add(jPanel6s, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 10, -1, -1));

        jPanel8s.setBackground(new java.awt.Color(225, 225, 225));
        jPanel8s.setPreferredSize(new java.awt.Dimension(2, 77));

        javax.swing.GroupLayout jPanel8sLayout = new javax.swing.GroupLayout(jPanel8s);
        jPanel8s.setLayout(jPanel8sLayout);
        jPanel8sLayout.setHorizontalGroup(
                jPanel8sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));
        jPanel8sLayout.setVerticalGroup(
                jPanel8sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 77, Short.MAX_VALUE));

        jPanelTask.add(jPanel8s, new org.netbeans.lib.awtextra.AbsoluteConstraints(724, 10, -1, -1));

        jPanel2u.setBackground(new java.awt.Color(225, 225, 225));
        jPanel2u.setPreferredSize(new java.awt.Dimension(90, 3));

        javax.swing.GroupLayout jPanel2uLayout = new javax.swing.GroupLayout(jPanel2u);
        jPanel2u.setLayout(jPanel2uLayout);
        jPanel2uLayout.setHorizontalGroup(
                jPanel2uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 90, Short.MAX_VALUE));
        jPanel2uLayout.setVerticalGroup(
                jPanel2uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 3, Short.MAX_VALUE));

        jPanelTask.add(jPanel2u, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 7, -1, -1));

        jPanel3u.setBackground(new java.awt.Color(225, 225, 225));
        jPanel3u.setPreferredSize(new java.awt.Dimension(100, 3));

        javax.swing.GroupLayout jPanel3uLayout = new javax.swing.GroupLayout(jPanel3u);
        jPanel3u.setLayout(jPanel3uLayout);
        jPanel3uLayout.setHorizontalGroup(
                jPanel3uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));
        jPanel3uLayout.setVerticalGroup(
                jPanel3uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 3, Short.MAX_VALUE));

        jPanelTask.add(jPanel3u, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 7, -1, -1));

        jPanel4u.setBackground(new java.awt.Color(225, 225, 225));
        jPanel4u.setPreferredSize(new java.awt.Dimension(90, 3));

        javax.swing.GroupLayout jPanel4uLayout = new javax.swing.GroupLayout(jPanel4u);
        jPanel4u.setLayout(jPanel4uLayout);
        jPanel4uLayout.setHorizontalGroup(
                jPanel4uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 90, Short.MAX_VALUE));
        jPanel4uLayout.setVerticalGroup(
                jPanel4uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 3, Short.MAX_VALUE));

        jPanelTask.add(jPanel4u, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 7, -1, -1));

        jPanel5u.setBackground(new java.awt.Color(225, 225, 225));
        jPanel5u.setPreferredSize(new java.awt.Dimension(120, 3));

        javax.swing.GroupLayout jPanel5uLayout = new javax.swing.GroupLayout(jPanel5u);
        jPanel5u.setLayout(jPanel5uLayout);
        jPanel5uLayout.setHorizontalGroup(
                jPanel5uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 120, Short.MAX_VALUE));
        jPanel5uLayout.setVerticalGroup(
                jPanel5uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 3, Short.MAX_VALUE));

        jPanelTask.add(jPanel5u, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 7, -1, -1));

        jPanel6u.setBackground(new java.awt.Color(225, 225, 225));
        jPanel6u.setPreferredSize(new java.awt.Dimension(100, 3));

        javax.swing.GroupLayout jPanel6uLayout = new javax.swing.GroupLayout(jPanel6u);
        jPanel6u.setLayout(jPanel6uLayout);
        jPanel6uLayout.setHorizontalGroup(
                jPanel6uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));
        jPanel6uLayout.setVerticalGroup(
                jPanel6uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 3, Short.MAX_VALUE));

        jPanelTask.add(jPanel6u, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 7, -1, -1));

        jPanel8u.setBackground(new java.awt.Color(225, 225, 225));
        jPanel8u.setPreferredSize(new java.awt.Dimension(130, 3));

        javax.swing.GroupLayout jPanel8uLayout = new javax.swing.GroupLayout(jPanel8u);
        jPanel8u.setLayout(jPanel8uLayout);
        jPanel8uLayout.setHorizontalGroup(
                jPanel8uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 130, Short.MAX_VALUE));
        jPanel8uLayout.setVerticalGroup(
                jPanel8uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 3, Short.MAX_VALUE));

        jPanelTask.add(jPanel8u, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 7, -1, -1));

        jPanel1d.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1d.setPreferredSize(new java.awt.Dimension(82, 2));

        javax.swing.GroupLayout jPanel1dLayout = new javax.swing.GroupLayout(jPanel1d);
        jPanel1d.setLayout(jPanel1dLayout);
        jPanel1dLayout.setHorizontalGroup(
                jPanel1dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 82, Short.MAX_VALUE));
        jPanel1dLayout.setVerticalGroup(
                jPanel1dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));

        jPanelTask.add(jPanel1d, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 87, -1, -1));

        jPanel2d.setBackground(new java.awt.Color(225, 225, 225));
        jPanel2d.setPreferredSize(new java.awt.Dimension(92, 2));

        javax.swing.GroupLayout jPanel2dLayout = new javax.swing.GroupLayout(jPanel2d);
        jPanel2d.setLayout(jPanel2dLayout);
        jPanel2dLayout.setHorizontalGroup(
                jPanel2dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 92, Short.MAX_VALUE));
        jPanel2dLayout.setVerticalGroup(
                jPanel2dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));

        jPanelTask.add(jPanel2d, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 87, -1, -1));

        jPanel3d.setBackground(new java.awt.Color(225, 225, 225));
        jPanel3d.setPreferredSize(new java.awt.Dimension(104, 2));

        javax.swing.GroupLayout jPanel3dLayout = new javax.swing.GroupLayout(jPanel3d);
        jPanel3d.setLayout(jPanel3dLayout);
        jPanel3dLayout.setHorizontalGroup(
                jPanel3dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 104, Short.MAX_VALUE));
        jPanel3dLayout.setVerticalGroup(
                jPanel3dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));

        jPanelTask.add(jPanel3d, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 87, -1, -1));

        jPanel4d.setBackground(new java.awt.Color(225, 225, 225));
        jPanel4d.setPreferredSize(new java.awt.Dimension(94, 2));

        javax.swing.GroupLayout jPanel4dLayout = new javax.swing.GroupLayout(jPanel4d);
        jPanel4d.setLayout(jPanel4dLayout);
        jPanel4dLayout.setHorizontalGroup(
                jPanel4dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 94, Short.MAX_VALUE));
        jPanel4dLayout.setVerticalGroup(
                jPanel4dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));

        jPanelTask.add(jPanel4d, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 87, -1, -1));

        jPanel5d.setBackground(new java.awt.Color(225, 225, 225));
        jPanel5d.setPreferredSize(new java.awt.Dimension(124, 2));

        javax.swing.GroupLayout jPanel5dLayout = new javax.swing.GroupLayout(jPanel5d);
        jPanel5d.setLayout(jPanel5dLayout);
        jPanel5dLayout.setHorizontalGroup(
                jPanel5dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 124, Short.MAX_VALUE));
        jPanel5dLayout.setVerticalGroup(
                jPanel5dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));

        jPanelTask.add(jPanel5d, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 87, -1, -1));

        jPanel6d.setBackground(new java.awt.Color(225, 225, 225));
        jPanel6d.setPreferredSize(new java.awt.Dimension(104, 2));

        javax.swing.GroupLayout jPanel6dLayout = new javax.swing.GroupLayout(jPanel6d);
        jPanel6d.setLayout(jPanel6dLayout);
        jPanel6dLayout.setHorizontalGroup(
                jPanel6dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 104, Short.MAX_VALUE));
        jPanel6dLayout.setVerticalGroup(
                jPanel6dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));

        jPanelTask.add(jPanel6d, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 87, -1, -1));

        jPanel8d.setBackground(new java.awt.Color(225, 225, 225));
        jPanel8d.setPreferredSize(new java.awt.Dimension(134, 2));

        javax.swing.GroupLayout jPanel8dLayout = new javax.swing.GroupLayout(jPanel8d);
        jPanel8d.setLayout(jPanel8dLayout);
        jPanel8dLayout.setHorizontalGroup(
                jPanel8dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 134, Short.MAX_VALUE));
        jPanel8dLayout.setVerticalGroup(
                jPanel8dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));

        jPanelTask.add(jPanel8d, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 87, -1, -1));

        jPanel9d.setBackground(new java.awt.Color(225, 225, 225));
        jPanel9d.setPreferredSize(new java.awt.Dimension(384, 2));

        javax.swing.GroupLayout jPanel9dLayout = new javax.swing.GroupLayout(jPanel9d);
        jPanel9d.setLayout(jPanel9dLayout);
        jPanel9dLayout.setHorizontalGroup(
                jPanel9dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 384, Short.MAX_VALUE));
        jPanel9dLayout.setVerticalGroup(
                jPanel9dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));

        jPanelTask.add(jPanel9d, new org.netbeans.lib.awtextra.AbsoluteConstraints(726, 87, -1, -1));

        jPanelWindow.add(jPanelTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        Paneltask2.setBackground(new java.awt.Color(255, 255, 255));
        Paneltask2.setPreferredSize(new java.awt.Dimension(1110, 510));
        Paneltask2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setPreferredSize(new java.awt.Dimension(1, 350));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
                jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1, Short.MAX_VALUE));
        jPanel24Layout.setVerticalGroup(
                jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 350, Short.MAX_VALUE));

        Paneltask2.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 80, -1, -1));

        jPanel34.setBackground(new java.awt.Color(255, 153, 51));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("LÀN RA");
        jPanel34.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Paneltask2.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 80, 40));

        jPanel35.setBackground(new java.awt.Color(255, 153, 51));
        jPanel35.setPreferredSize(new java.awt.Dimension(80, 40));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("LÀN VÀO");
        jPanel35.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Paneltask2.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        thongBaoLanVao.setEditable(false);
        Paneltask2.add(thongBaoLanVao, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 330, 40));

        thongBaoLanRa.setEditable(false);
        Paneltask2.add(thongBaoLanRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 330, 40));

        jLabel5.setText("Loại xe");
        Paneltask2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        gioVaoLanVao.setEditable(false);
        Paneltask2.add(gioVaoLanVao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 320, 30));

        jLabel24.setText("Giờ vào");
        Paneltask2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        loaiXeLanVao.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Ô tô", "Xe máy", "Xe đạp, xe đạp điện" }));
        loaiXeLanVao.setPreferredSize(new java.awt.Dimension(62, 30));
        Paneltask2.add(loaiXeLanVao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 320, -1));
        Paneltask2.add(bienSoLanRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 320, 30));

        jLabel25.setText("Biển số");
        Paneltask2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, -1, -1));

        ngayVaoLanVao.setEditable(false);
        Paneltask2.add(ngayVaoLanVao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 320, 30));

        jLabel26.setText("Ngày vào");
        Paneltask2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));
        Paneltask2.add(bienSoLanVao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 320, 30));

        jLabel27.setText("Biển số");
        Paneltask2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel28.setText("Loại xe");
        Paneltask2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, -1, -1));

        ngayRa.setEditable(false);
        Paneltask2.add(ngayRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 140, 30));

        jLabel29.setText("Ngày ra");
        Paneltask2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, -1, -1));

        loaiXeLanRa.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Ô tô", "Xe máy", "Xe đạp, xe đạp điện" }));
        loaiXeLanRa.setPreferredSize(new java.awt.Dimension(62, 30));
        Paneltask2.add(loaiXeLanRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 320, -1));

        ngayVaoLanRa.setEditable(false);
        Paneltask2.add(ngayVaoLanRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 140, 30));

        jLabel30.setText("Ngày vào");
        Paneltask2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, -1));

        clearLanVao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setText("Xóa");
        clearLanVao.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        Paneltask2.add(clearLanVao, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 90, 40));

        luuLanVao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setText("Lưu");
        luuLanVao.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        Paneltask2.add(luuLanVao, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 90, 40));

        clearLanRa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setText("Xóa");
        clearLanRa.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        Paneltask2.add(clearLanRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 380, 90, 40));

        tinhTien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setText("Tính tiền");
        tinhTien.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        Paneltask2.add(tinhTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 380, 90, 40));

        gioVaoLanRa.setEditable(false);
        Paneltask2.add(gioVaoLanRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 140, 30));

        jLabel35.setText("Giờ vào");
        Paneltask2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 230, -1, -1));

        gioRa.setEditable(false);
        Paneltask2.add(gioRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 320, 140, 30));

        jLabel36.setText("Giờ ra");
        Paneltask2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 300, -1, -1));

        jPanelWindow.add(Paneltask2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        Paneltask3.setBackground(new java.awt.Color(255, 255, 255));
        Paneltask3.setPreferredSize(new java.awt.Dimension(1110, 510));
        Paneltask3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(225, 225, 225));
        jPanel5.setPreferredSize(new java.awt.Dimension(1110, 1));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1110, Short.MAX_VALUE));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1, Short.MAX_VALUE));

        Paneltask3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        Tieude3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Tieude3.setForeground(new java.awt.Color(102, 204, 255));
        Tieude3.setText("DANH SÁCH VÉ THÁNG");
        Paneltask3.add(Tieude3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        Search3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Search3.setText("Tìm kiếm:");
        Paneltask3.add(Search3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        Paneltask3.add(search3text, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 95, 160, 30));

        chucNangPanel3.setBackground(new java.awt.Color(255, 255, 255));
        chucNangPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        chucNangPanel3.setPreferredSize(new java.awt.Dimension(360, 40));
        chucNangPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        giaHanVeThang.setBackground(new java.awt.Color(255, 255, 255));
        giaHanVeThang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        giaHanVeThang.setPreferredSize(new java.awt.Dimension(91, 37));
        giaHanVeThang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("GIA HẠN");
        jLabel4.setPreferredSize(new java.awt.Dimension(52, 16));
        giaHanVeThang.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 10, 60, -1));

        chucNangPanel3.add(giaHanVeThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 1, -1, -1));

        jPanel13.setBackground(new java.awt.Color(51, 153, 255));
        jPanel13.setPreferredSize(new java.awt.Dimension(2, 37));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));
        jPanel13Layout.setVerticalGroup(
                jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 37, Short.MAX_VALUE));

        chucNangPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 1, -1, -1));

        xoaVeThang.setBackground(new java.awt.Color(255, 255, 255));
        xoaVeThang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        xoaVeThang.setPreferredSize(new java.awt.Dimension(80, 37));
        xoaVeThang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("XÓA");
        jLabel2.setPreferredSize(new java.awt.Dimension(52, 16));
        xoaVeThang.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 10, 30, -1));

        chucNangPanel3.add(xoaVeThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 1, -1, -1));

        suaVeThang.setBackground(new java.awt.Color(255, 255, 255));
        suaVeThang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suaVeThang.setPreferredSize(new java.awt.Dimension(80, 37));
        suaVeThang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("SỬA");
        jLabel3.setPreferredSize(new java.awt.Dimension(52, 16));
        suaVeThang.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 10, 30, -1));

        chucNangPanel3.add(suaVeThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 1, -1, -1));

        jPanel16.setBackground(new java.awt.Color(51, 153, 255));
        jPanel16.setPreferredSize(new java.awt.Dimension(100, 2));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
                jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 100, Short.MAX_VALUE));
        jPanel16Layout.setVerticalGroup(
                jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));

        chucNangPanel3.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 38, -1, -1));

        jPanel17.setBackground(new java.awt.Color(51, 153, 255));
        jPanel17.setPreferredSize(new java.awt.Dimension(2, 37));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
                jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));
        jPanel17Layout.setVerticalGroup(
                jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 37, Short.MAX_VALUE));

        chucNangPanel3.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 1, -1, -1));

        jPanel18.setBackground(new java.awt.Color(51, 153, 255));
        jPanel18.setPreferredSize(new java.awt.Dimension(2, 37));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));
        jPanel18Layout.setVerticalGroup(
                jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 37, Short.MAX_VALUE));

        chucNangPanel3.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 1, -1, -1));

        dangKyVeThang.setBackground(new java.awt.Color(255, 255, 255));
        dangKyVeThang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dangKyVeThang.setPreferredSize(new java.awt.Dimension(100, 37));
        dangKyVeThang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("ĐĂNG KÝ");
        jLabel1.setPreferredSize(new java.awt.Dimension(52, 16));
        dangKyVeThang.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(32, 10, 60, -1));

        chucNangPanel3.add(dangKyVeThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        jPanel20.setBackground(new java.awt.Color(51, 153, 255));
        jPanel20.setPreferredSize(new java.awt.Dimension(80, 2));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
                jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 80, Short.MAX_VALUE));
        jPanel20Layout.setVerticalGroup(
                jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));

        chucNangPanel3.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 38, -1, -1));

        jPanel21.setBackground(new java.awt.Color(51, 153, 255));
        jPanel21.setPreferredSize(new java.awt.Dimension(80, 2));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
                jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 80, Short.MAX_VALUE));
        jPanel21Layout.setVerticalGroup(
                jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));

        chucNangPanel3.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 38, -1, -1));

        jPanel22.setBackground(new java.awt.Color(51, 153, 255));
        jPanel22.setForeground(new java.awt.Color(255, 255, 255));
        jPanel22.setPreferredSize(new java.awt.Dimension(92, 2));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
                jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 92, Short.MAX_VALUE));
        jPanel22Layout.setVerticalGroup(
                jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));

        chucNangPanel3.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 38, -1, -1));

        Paneltask3.add(chucNangPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        bangVeThang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bangVeThang.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Chọn", "Mã Thẻ", "Biển Số", "Chủ Xe", "Ngày Kích Hoạt", "Ngày Hết Hạn", "Loại Xe", "Giá Vé"
                }) {
            boolean[] canEdit = new boolean[] {
                    true, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        JTableHeader header = bangVeThang.getTableHeader();
        header.setFont(new Font("Segoe UI", Font.BOLD, 16));
        header.setBackground(Color.WHITE);
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        jScrollPane1.setViewportView(bangVeThang);

        Paneltask3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 1030, 280));

        jLabel56.setText("Đang chọn:");
        Paneltask3.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        jLabel57.setText("Tổng số:");
        Paneltask3.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabel58.setText("0");
        Paneltask3.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 10, -1));

        jLabel59.setText("0");
        Paneltask3.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        jPanelWindow.add(Paneltask3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        Paneltask4.setBackground(new java.awt.Color(255, 255, 255));
        Paneltask4.setPreferredSize(new java.awt.Dimension(1110, 510));
        Paneltask4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel23.setBackground(new java.awt.Color(225, 225, 225));
        jPanel23.setPreferredSize(new java.awt.Dimension(1110, 1));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
                jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1110, Short.MAX_VALUE));
        jPanel23Layout.setVerticalGroup(
                jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1, Short.MAX_VALUE));

        Paneltask4.add(jPanel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        Tieude4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Tieude4.setForeground(new java.awt.Color(102, 204, 255));
        Tieude4.setText("DANH SÁCH VÉ LƯỢT");
        Paneltask4.add(Tieude4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jTable5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTable5.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Chọn", "Mã Thẻ", "Biển Số", "Thời Gian Vào", "Loại Xe"
                }) {
            boolean[] canEdit = new boolean[] {
                    true, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        JTableHeader header5 = jTable5.getTableHeader();
        header5.setFont(new Font("Segoe UI", Font.BOLD, 16));
        header5.setBackground(Color.WHITE);
        DefaultTableCellRenderer renderer5 = (DefaultTableCellRenderer) header.getDefaultRenderer();
        renderer5.setHorizontalAlignment(SwingConstants.CENTER);
        jScrollPane5.setViewportView(jTable5);

        Paneltask4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 1030, 280));

        Search4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Search4.setText("Tìm kiếm:");
        Paneltask4.add(Search4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        Paneltask4.add(search3text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 95, 160, 30));

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));
        jPanel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel50.setPreferredSize(new java.awt.Dimension(164, 40));
        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel68.setBackground(new java.awt.Color(255, 255, 255));
        jPanel68.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel68.setPreferredSize(new java.awt.Dimension(80, 37));
        jPanel68.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel67.setText("XÓA");
        jLabel67.setPreferredSize(new java.awt.Dimension(52, 16));
        jPanel68.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 10, 30, -1));

        jPanel50.add(jPanel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        jPanel69.setBackground(new java.awt.Color(255, 255, 255));
        jPanel69.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel69.setPreferredSize(new java.awt.Dimension(80, 37));
        jPanel69.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel68.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel68.setText("SỬA");
        jLabel68.setPreferredSize(new java.awt.Dimension(52, 16));
        jPanel69.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 10, 30, -1));

        jPanel50.add(jPanel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 1, -1, -1));

        jPanel71.setBackground(new java.awt.Color(51, 153, 255));
        jPanel71.setPreferredSize(new java.awt.Dimension(2, 37));

        javax.swing.GroupLayout jPanel71Layout = new javax.swing.GroupLayout(jPanel71);
        jPanel71.setLayout(jPanel71Layout);
        jPanel71Layout.setHorizontalGroup(
                jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));
        jPanel71Layout.setVerticalGroup(
                jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 37, Short.MAX_VALUE));

        jPanel50.add(jPanel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 1, -1, -1));

        jPanel74.setBackground(new java.awt.Color(51, 153, 255));
        jPanel74.setPreferredSize(new java.awt.Dimension(80, 2));

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
                jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 80, Short.MAX_VALUE));
        jPanel74Layout.setVerticalGroup(
                jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));

        jPanel50.add(jPanel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 38, -1, -1));

        jPanel75.setBackground(new java.awt.Color(51, 153, 255));
        jPanel75.setPreferredSize(new java.awt.Dimension(80, 2));

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
                jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 80, Short.MAX_VALUE));
        jPanel75Layout.setVerticalGroup(
                jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 2, Short.MAX_VALUE));

        jPanel50.add(jPanel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 38, -1, -1));

        Paneltask4.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jLabel70.setText("Đang chọn:");
        Paneltask4.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 450, -1, -1));

        jLabel71.setText("Tổng số:");
        Paneltask4.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabel72.setText("0");
        Paneltask4.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 10, -1));

        jLabel73.setText("0");
        Paneltask4.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        jPanelWindow.add(Paneltask4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        Paneltask5.setBackground(new java.awt.Color(255, 255, 255));
        Paneltask5.setPreferredSize(new java.awt.Dimension(1110, 510));
        Paneltask5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(255, 102, 51));
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel66.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setText("TRA CỨU THÔNG TIN XE VÀO RA");
        jLabel66.setPreferredSize(new java.awt.Dimension(300, 25));
        jPanel10.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(415, 20, -1, -1));

        jLabel74.setText("Icon");
        jPanel10.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, -1, -1));

        Paneltask5.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 70));
        Paneltask5.add(bienSoLanRa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 320, 30));

        jLabel69.setText("Biển số");
        Paneltask5.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        jLabel75.setText("Loại xe");
        Paneltask5.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        loaiXeLanRa1.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Tất cả loại xe", "Ô tô", "Xe máy", "Xe đạp, xe đạp điện" }));
        loaiXeLanRa1.setPreferredSize(new java.awt.Dimension(62, 30));
        Paneltask5.add(loaiXeLanRa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 320, -1));

        jLabel86.setText("Loại vé");
        Paneltask5.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, -1, -1));

        loaiXeLanRa2.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả loại vé", "Vé lượt", "Vé tháng" }));
        loaiXeLanRa2.setPreferredSize(new java.awt.Dimension(62, 30));
        Paneltask5.add(loaiXeLanRa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 320, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Biển số", "Loại vé", "Loại xe"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        JTableHeader header6 = jTable1.getTableHeader();
        header6.setFont(new Font("Segoe UI", Font.BOLD, 16));
        header6.setBackground(Color.WHITE);
        DefaultTableCellRenderer renderer6 = (DefaultTableCellRenderer) header.getDefaultRenderer();
        renderer6.setHorizontalAlignment(SwingConstants.CENTER);
        jScrollPane6.setViewportView(jTable1);

        Paneltask5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 540, 380));

        jButton1.setBackground(new java.awt.Color(255, 153, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Xóa");
        jButton1.setBorderPainted(false);
        Paneltask5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 450, 90, -1));

        jButton2.setBackground(new java.awt.Color(255, 153, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Tìm kiếm");
        jButton2.setBorderPainted(false);
        Paneltask5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        jLabel76.setText("Ngày ra");
        Paneltask5.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 290, -1, -1));

        jLabel77.setText("Ngày vào");
        Paneltask5.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jDateChooser3.setPreferredSize(new java.awt.Dimension(83, 30));
        Paneltask5.add(jDateChooser3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 120, -1));

        jDateChooser4.setPreferredSize(new java.awt.Dimension(83, 30));
        Paneltask5.add(jDateChooser4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 120, -1));

        loaiXeLanRa3.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên 1", "Nhân viên 2", "Nhân viên 3" }));
        loaiXeLanRa3.setPreferredSize(new java.awt.Dimension(62, 30));
        Paneltask5.add(loaiXeLanRa3, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 120, -1));

        jLabel78.setText("Nhân viên ra");
        Paneltask5.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, -1, -1));

        jLabel79.setText("Nhân viên vào");
        Paneltask5.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        loaiXeLanRa4.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên 1", "Nhân viên 2", "Nhân viên 3" }));
        loaiXeLanRa4.setPreferredSize(new java.awt.Dimension(62, 30));
        Paneltask5.add(loaiXeLanRa4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 120, -1));

        jPanel7.setPreferredSize(new java.awt.Dimension(1, 400));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1, Short.MAX_VALUE));
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 400, Short.MAX_VALUE));

        Paneltask5.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 100, -1, -1));

        jPanelWindow.add(Paneltask5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        Paneltask6.setBackground(new java.awt.Color(255, 255, 255));
        Paneltask6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel45.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel45.setText("THỐNG KÊ");
        jPanel26.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(494, 30, -1, -1));

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setText("Loại xe:");
        jPanel26.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 85, -1, -1));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setText("Từ ngày:");
        jPanel26.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 85, 70, -1));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel64.setText("Đến ngày:");
        jPanel26.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 85, 80, -1));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel65.setText("Loại vé:");
        jPanel26.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 85, 70, -1));

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setPreferredSize(new java.awt.Dimension(160, 30));
        jPanel26.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        jDateChooser2.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser2.setPreferredSize(new java.awt.Dimension(160, 30));
        jPanel26.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Tất cả loại xe", "Ô tô", "Xe máy", "Xe đạp điện, xe đạp" }));
        jComboBox3.setPreferredSize(new java.awt.Dimension(90, 30));
        jPanel26.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 80, 110, -1));

        jComboBox4.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả loại vé", "Vé tháng", "Vé lượt" }));
        jComboBox4.setPreferredSize(new java.awt.Dimension(90, 30));
        jPanel26.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 80, 120, -1));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Loại vé", "Loại xe", "Tồn đầu kỳ", "Vào trong kỳ", "Ra trong kỳ", "Tồn cuối kỳ", "Tổng tiền"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        JTableHeader header2 = jTable4.getTableHeader();
        header2.setFont(new Font("Segoe UI", Font.BOLD, 16));
        header2.setBackground(Color.WHITE);
        DefaultTableCellRenderer renderer2 = (DefaultTableCellRenderer) header.getDefaultRenderer();
        renderer2.setHorizontalAlignment(SwingConstants.CENTER);
        jScrollPane2.setViewportView(jTable4);

        jPanel26.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 1040, 340));

        Paneltask6.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 510));

        jPanelWindow.add(Paneltask6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        Paneltask8.setBackground(new java.awt.Color(255, 255, 255));
        Paneltask8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chucNang8.setBackground(new java.awt.Color(245, 245, 245));
        chucNang8.setPreferredSize(new java.awt.Dimension(280, 510));
        chucNang8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText("ADMIN");
        chucNang8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jPanel27.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
                jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 28, Short.MAX_VALUE));
        jPanel27Layout.setVerticalGroup(
                jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 28, Short.MAX_VALUE));

        chucNang8.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 30, 30));

        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
                jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 28, Short.MAX_VALUE));
        jPanel28Layout.setVerticalGroup(
                jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 28, Short.MAX_VALUE));

        chucNang8.add(jPanel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 30, 30));

        task8_thongTin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        task8_thongTin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        task8_thongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                task8_thongTinMouseClicked(evt);
            }
        });
        task8_thongTin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setText("Thông tin");
        task8_thongTin.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, -1));

        chucNang8.add(task8_thongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 180, 30));

        task8_doiMatKhau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        task8_doiMatKhau.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        task8_doiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                task8_doiMatKhauMouseClicked(evt);
            }
        });
        task8_doiMatKhau.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setText("Đổi mật khẩu");
        task8_doiMatKhau.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 80, -1));

        chucNang8.add(task8_doiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 180, 30));

        jLabel10.setText("ICON");
        chucNang8.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        Paneltask8.add(chucNang8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        thongTin.setBackground(new java.awt.Color(204, 204, 255));
        thongTin.setPreferredSize(new java.awt.Dimension(830, 510));
        thongTin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setText("THÔNG TIN");
        thongTin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("THÔNG TIN NGƯỜI DÙNG");
        thongTin.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel11.setText("ICON");
        thongTin.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        capNhatNguoiDung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setText("Cập nhật thông tin");
        capNhatNguoiDung.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        thongTin.add(capNhatNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 160, 40));

        clearNguoiDung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setText("Xóa");
        clearNguoiDung.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        thongTin.add(clearNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 90, 40));

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel80.setText("Tên đăng nhập");
        thongTin.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        tenDangNhap.setEditable(false);
        tenDangNhap.setPreferredSize(new java.awt.Dimension(65, 30));
        thongTin.add(tenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 310, -1));

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel81.setText("Tên người dùng");
        thongTin.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        tenNguoiDung.setPreferredSize(new java.awt.Dimension(65, 30));
        thongTin.add(tenNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 310, -1));

        sdt.setPreferredSize(new java.awt.Dimension(65, 30));
        thongTin.add(sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 310, -1));

        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel82.setText("Số điện thoại");
        thongTin.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        caLam.setEditable(false);
        caLam.setPreferredSize(new java.awt.Dimension(65, 30));
        thongTin.add(caLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 310, -1));

        jLabel83.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel83.setText("Ca làm");
        thongTin.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel84.setText("Giới tính");
        thongTin.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        chucVu.setEditable(false);
        chucVu.setPreferredSize(new java.awt.Dimension(65, 30));
        thongTin.add(chucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 310, -1));

        jLabel85.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel85.setText("Chức vụ");
        thongTin.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton1.setText("Nam");
        thongTin.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jRadioButton2.setText("Nữ");
        thongTin.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, -1));

        Paneltask8.add(thongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        doiMatKhau.setBackground(new java.awt.Color(204, 204, 255));
        doiMatKhau.setPreferredSize(new java.awt.Dimension(830, 510));
        doiMatKhau.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel12.setText("TÀI KHOẢN");
        doiMatKhau.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("ĐỔI MẬT KHẨU");
        doiMatKhau.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel18.setText("ICON");
        doiMatKhau.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        matKhauCu.setBackground(new java.awt.Color(204, 204, 204));
        doiMatKhau.add(matKhauCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 580, 30));

        matKhauMoi.setBackground(new java.awt.Color(204, 204, 204));
        doiMatKhau.add(matKhauMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 580, 30));

        xacNhanMatKhau.setBackground(new java.awt.Color(204, 204, 204));
        doiMatKhau.add(xacNhanMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 580, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Xác nhận mật khẩu mới");
        doiMatKhau.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Mật khẩu hiện tại");
        doiMatKhau.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Mật khẩu mới");
        doiMatKhau.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        capNhatMatKhau.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setText("Cập nhật mật khẩu");
        capNhatMatKhau.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        doiMatKhau.add(capNhatMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 160, 40));

        xoaMatKhau.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setText("Xóa");
        xoaMatKhau.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        doiMatKhau.add(xoaMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 90, 40));

        Paneltask8.add(doiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        jPanelWindow.add(Paneltask8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1110, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 1111, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanelWindow, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 660, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jPanelWindow, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel2MouseClicked
        init();
        initText();
        initTask();
        jPanel2.setBackground(select);
        jPanel2u.setBackground(barSelect);
        jPanel1s.setBackground(barSelect);
        jPanel2s.setBackground(barSelect);
        jPanel1d.setBackground(barSelect);
        jPanel3d.setBackground(barSelect);
        jPanel4d.setBackground(barSelect);
        jPanel5d.setBackground(barSelect);
        jPanel6d.setBackground(barSelect);
        jPanel8d.setBackground(barSelect);
        jPanel9d.setBackground(barSelect);
        Panel2text.setFont(font2);
        Panel2text.setForeground(barSelect);
        Paneltask2.setVisible(true);
    }// GEN-LAST:event_jPanel2MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel3MouseClicked
        init();
        initText();
        initTask();
        jPanel3.setBackground(select);
        jPanel3u.setBackground(barSelect);
        jPanel2s.setBackground(barSelect);
        jPanel3s.setBackground(barSelect);
        jPanel1d.setBackground(barSelect);
        jPanel2d.setBackground(barSelect);
        jPanel4d.setBackground(barSelect);
        jPanel5d.setBackground(barSelect);
        jPanel6d.setBackground(barSelect);
        jPanel8d.setBackground(barSelect);
        jPanel9d.setBackground(barSelect);
        Panel3text.setFont(font2);
        Panel3text.setForeground(barSelect);
        Paneltask3.setVisible(true);
    }// GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel4MouseClicked
        init();
        initText();
        initTask();
        jPanel4.setBackground(select);
        jPanel4u.setBackground(barSelect);
        jPanel3s.setBackground(barSelect);
        jPanel4s.setBackground(barSelect);
        jPanel1d.setBackground(barSelect);
        jPanel2d.setBackground(barSelect);
        jPanel3d.setBackground(barSelect);
        jPanel5d.setBackground(barSelect);
        jPanel6d.setBackground(barSelect);
        jPanel8d.setBackground(barSelect);
        jPanel9d.setBackground(barSelect);
        Panel4text.setFont(font2);
        Panel4text.setForeground(barSelect);
        Paneltask4.setVisible(true);
    }// GEN-LAST:event_jPanel4MouseClicked

    private void JPanel5MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_JPanel5MouseClicked
        init();
        initText();
        initTask();
        JPanel5.setBackground(select);
        jPanel5u.setBackground(barSelect);
        jPanel4s.setBackground(barSelect);
        jPanel5s.setBackground(barSelect);
        jPanel1d.setBackground(barSelect);
        jPanel2d.setBackground(barSelect);
        jPanel3d.setBackground(barSelect);
        jPanel4d.setBackground(barSelect);
        jPanel6d.setBackground(barSelect);
        jPanel8d.setBackground(barSelect);
        jPanel9d.setBackground(barSelect);
        Panel5text.setFont(font2);
        Panel5text.setForeground(barSelect);
        Paneltask5.setVisible(true);
    }// GEN-LAST:event_JPanel5MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel6MouseClicked
        init();
        initText();
        initTask();
        jPanel6.setBackground(select);
        jPanel6u.setBackground(barSelect);
        jPanel5s.setBackground(barSelect);
        jPanel6s.setBackground(barSelect);
        jPanel1d.setBackground(barSelect);
        jPanel2d.setBackground(barSelect);
        jPanel3d.setBackground(barSelect);
        jPanel4d.setBackground(barSelect);
        jPanel5d.setBackground(barSelect);
        jPanel8d.setBackground(barSelect);
        jPanel9d.setBackground(barSelect);
        Panel6text.setFont(font2);
        Panel6text.setForeground(barSelect);
        Paneltask6.setVisible(true);
    }// GEN-LAST:event_jPanel6MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel8MouseClicked
        init();
        initText();
        initTask();
        jPanel8.setBackground(select);
        jPanel8u.setBackground(barSelect);
        jPanel6s.setBackground(barSelect);
        jPanel8s.setBackground(barSelect);
        jPanel1d.setBackground(barSelect);
        jPanel2d.setBackground(barSelect);
        jPanel3d.setBackground(barSelect);
        jPanel4d.setBackground(barSelect);
        jPanel5d.setBackground(barSelect);
        jPanel6d.setBackground(barSelect);
        jPanel9d.setBackground(barSelect);
        Panel9text.setFont(font2);
        Panel9text.setForeground(barSelect);
        Paneltask8.setVisible(true);
    }// GEN-LAST:event_jPanel8MouseClicked

    private void task8_thongTinMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_task8_thongTinMouseClicked
        thongTin.setVisible(true);
        doiMatKhau.setVisible(false);
    }// GEN-LAST:event_task8_thongTinMouseClicked

    private void task8_doiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_task8_doiMatKhauMouseClicked
        doiMatKhau.setVisible(true);
        thongTin.setVisible(false);
    }// GEN-LAST:event_task8_doiMatKhauMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {// GEN-FIRST:event_formWindowOpened
        for (double i = 0; i <= 1.0; i += 0.1) {
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
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

    private void init() {
        jPanel1.setBackground(notSelect);
        jPanel2.setBackground(notSelect);
        jPanel3.setBackground(notSelect);
        jPanel4.setBackground(notSelect);
        JPanel5.setBackground(notSelect);
        jPanel6.setBackground(notSelect);
        jPanel8.setBackground(notSelect);
        jPanel9.setBackground(notSelect);
        jPanel1s.setBackground(barNotSelect);
        jPanel2s.setBackground(barNotSelect);
        jPanel3s.setBackground(barNotSelect);
        jPanel4s.setBackground(barNotSelect);
        jPanel5s.setBackground(barNotSelect);
        jPanel6s.setBackground(barNotSelect);
        jPanel8s.setBackground(barNotSelect);
        jPanel2u.setBackground(barNotSelect);
        jPanel3u.setBackground(barNotSelect);
        jPanel4u.setBackground(barNotSelect);
        jPanel5u.setBackground(barNotSelect);
        jPanel6u.setBackground(barNotSelect);
        jPanel8u.setBackground(barNotSelect);
        jPanel1d.setBackground(barNotSelect);
        jPanel2d.setBackground(barNotSelect);
        jPanel3d.setBackground(barNotSelect);
        jPanel4d.setBackground(barNotSelect);
        jPanel5d.setBackground(barNotSelect);
        jPanel6d.setBackground(barNotSelect);
        jPanel8d.setBackground(barNotSelect);
    }

    private void initText() {
        Panel2text.setForeground(notSelectText);
        Panel3text.setForeground(notSelectText);
        Panel4text.setForeground(notSelectText);
        Panel5text.setForeground(notSelectText);
        Panel6text.setForeground(notSelectText);
        Panel9text.setForeground(notSelectText);
        Panel2text.setForeground(notSelectText);
        Panel2text.setFont(font1);
        Panel3text.setFont(font1);
        Panel4text.setFont(font1);
        Panel5text.setFont(font1);
        Panel6text.setFont(font1);
        Panel9text.setFont(font1);
    }

    private void initTask() {
        Paneltask2.setVisible(false);
        Paneltask3.setVisible(false);
        Paneltask4.setVisible(false);
        Paneltask5.setVisible(false);
        Paneltask6.setVisible(false);
        Paneltask8.setVisible(false);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FlatLightLaf.setup();
                UIManager.put("TextComponent.arc", 999);
                UIManager.put("Table.alternateRowColor", new java.awt.Color(240, 240, 240));
                System.setProperty("flatlaf.menuBarEmbbedded", "false");
                UserDashboard n = new UserDashboard();
                n.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel5;
    private javax.swing.JLabel Panel2text;
    private javax.swing.JLabel Panel3text;
    private javax.swing.JLabel Panel4text;
    private javax.swing.JLabel Panel5text;
    private javax.swing.JLabel Panel6text;
    private javax.swing.JLabel Panel9text;
    public static javax.swing.JPanel Paneltask2;
    private javax.swing.JPanel Paneltask3;
    private javax.swing.JPanel Paneltask4;
    private javax.swing.JPanel Paneltask5;
    private javax.swing.JPanel Paneltask6;
    private javax.swing.JPanel Paneltask8;
    private javax.swing.JLabel Search3;
    private javax.swing.JLabel Search4;
    private javax.swing.JLabel Tieude3;
    private javax.swing.JLabel Tieude4;
    private javax.swing.JTable bangVeThang;
    private javax.swing.JTextField bienSoLanRa;
    private javax.swing.JTextField bienSoLanRa1;
    private javax.swing.JTextField bienSoLanVao;
    private javax.swing.JTextField caLam;
    private javax.swing.JPanel capNhatMatKhau;
    private javax.swing.JPanel capNhatNguoiDung;
    private javax.swing.JPanel chucNang8;
    private javax.swing.JPanel chucNangPanel3;
    private javax.swing.JTextField chucVu;
    private javax.swing.JPanel clearLanRa;
    private javax.swing.JPanel clearLanVao;
    private javax.swing.JPanel clearNguoiDung;
    private javax.swing.JPanel dangKyVeThang;
    private javax.swing.JPanel doiMatKhau;
    private javax.swing.JPanel giaHanVeThang;
    private javax.swing.JTextField gioRa;
    private javax.swing.JTextField gioVaoLanRa;
    private javax.swing.JTextField gioVaoLanVao;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private com.toedter.calendar.JDateChooser jDateChooser3;
    private com.toedter.calendar.JDateChooser jDateChooser4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel1d;
    private javax.swing.JPanel jPanel1s;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel2d;
    private javax.swing.JPanel jPanel2s;
    private javax.swing.JPanel jPanel2u;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel3d;
    private javax.swing.JPanel jPanel3s;
    private javax.swing.JPanel jPanel3u;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel4d;
    private javax.swing.JPanel jPanel4s;
    private javax.swing.JPanel jPanel4u;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel5d;
    private javax.swing.JPanel jPanel5s;
    private javax.swing.JPanel jPanel5u;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel68;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel6d;
    private javax.swing.JPanel jPanel6s;
    private javax.swing.JPanel jPanel6u;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel8d;
    private javax.swing.JPanel jPanel8s;
    private javax.swing.JPanel jPanel8u;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel9d;
    private javax.swing.JPanel jPanelBar;
    private javax.swing.JPanel jPanelTask;
    private javax.swing.JPanel jPanelWindow;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable4;
    private javax.swing.JTable jTable5;
    private javax.swing.JComboBox<String> loaiXeLanRa;
    private javax.swing.JComboBox<String> loaiXeLanRa1;
    private javax.swing.JComboBox<String> loaiXeLanRa2;
    private javax.swing.JComboBox<String> loaiXeLanRa3;
    private javax.swing.JComboBox<String> loaiXeLanRa4;
    private javax.swing.JComboBox<String> loaiXeLanVao;
    private javax.swing.JPanel luuLanVao;
    private javax.swing.JPasswordField matKhauCu;
    private javax.swing.JPasswordField matKhauMoi;
    private javax.swing.JTextField ngayRa;
    private javax.swing.JTextField ngayVaoLanRa;
    private javax.swing.JTextField ngayVaoLanVao;
    private javax.swing.JTextField sdt;
    private javax.swing.JTextField search3text;
    private javax.swing.JTextField search3text1;
    private javax.swing.JPanel suaVeThang;
    private javax.swing.JPanel task8_doiMatKhau;
    private javax.swing.JPanel task8_thongTin;
    private javax.swing.JTextField tenDangNhap;
    private javax.swing.JTextField tenNguoiDung;
    private javax.swing.JTextField thongBaoLanRa;
    private javax.swing.JTextField thongBaoLanVao;
    private javax.swing.JPanel thongTin;
    private javax.swing.JPanel tinhTien;
    private javax.swing.JPasswordField xacNhanMatKhau;
    private javax.swing.JPanel xoaMatKhau;
    private javax.swing.JPanel xoaVeThang;
    // End of variables declaration//GEN-END:variables
}
