package Admin;

import Customer.CustomRoundedPanel;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.IntelliJTheme;
import com.formdev.flatlaf.ui.FlatBorder;
import java.awt.Color;
import java.awt.Font;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import Dao.TicketDAO;
import Dao.Users;
import Dao.VehiclePriceDAO;
import Dao.UserDAO;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.jfr.Timestamp;

public class AdminDashBoard extends javax.swing.JFrame {
    Color notSelect = new Color(240, 240, 240);
    Color select = new Color(255, 255, 255);
    Color barNotSelect = new Color(225, 225, 225);
    Color barSelect = new Color(51, 153, 255);
    Color downSelect = new Color(204,255,255);
    Color notSelectText = new Color(153, 153, 153);
    int xx, xy;
    Font font1 = new Font("Segoe UI", Font.PLAIN, 18);
    Font font2 = new Font("Segoe UI", Font.BOLD, 18);
    Users u;
    UserDAO userDao = new UserDAO();
    VehiclePriceDAO vehicle = new VehiclePriceDAO();
    public static TicketDAO ticketDao = new TicketDAO();
    DefaultTableModel model2, model3, model4, model5, model6;
    public static DefaultTableModel model1;
    public AdminDashBoard() {
        try {
            u = UserDAO.getProfile();
        } catch (SQLException ex) {
            Logger.getLogger(AdminDashBoard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AdminDashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setUndecorated(true);
        initComponents();
        init();
        initThongTin();
        tableNguoiDung();
        tableBangGia();
        tableVeLuot();
        tableVeThang();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanelWindow = new javax.swing.JPanel();
        jPanelBar = new javax.swing.JPanel();
        jPanelTask = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Panel2text = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Panel3text = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Panel4text = new javax.swing.JLabel();
        JPanel5 = new javax.swing.JPanel();
        Panel5text = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Panel6text = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        Panel8text = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Panel9text = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jPanel1s = new javax.swing.JPanel();
        jPanel2s = new javax.swing.JPanel();
        jPanel3s = new javax.swing.JPanel();
        jPanel4s = new javax.swing.JPanel();
        jPanel5s = new javax.swing.JPanel();
        jPanel6s = new javax.swing.JPanel();
        jPanel7s = new javax.swing.JPanel();
        jPanel8s = new javax.swing.JPanel();
        jPanel2u = new javax.swing.JPanel();
        jPanel3u = new javax.swing.JPanel();
        jPanel4u = new javax.swing.JPanel();
        jPanel5u = new javax.swing.JPanel();
        jPanel6u = new javax.swing.JPanel();
        jPanel7u = new javax.swing.JPanel();
        jPanel8u = new javax.swing.JPanel();
        jPanel1d = new javax.swing.JPanel();
        jPanel2d = new javax.swing.JPanel();
        jPanel3d = new javax.swing.JPanel();
        jPanel4d = new javax.swing.JPanel();
        jPanel5d = new javax.swing.JPanel();
        jPanel6d = new javax.swing.JPanel();
        jPanel7d = new javax.swing.JPanel();
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
        PanelTieuDe3 = new javax.swing.JPanel();
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
        tongVeThang = new javax.swing.JLabel();
        dangChonVeThang = new javax.swing.JLabel();
        Paneltask4 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        bangVeLuot = new javax.swing.JTable();
        Search4 = new javax.swing.JLabel();
        search3text1 = new javax.swing.JTextField();
        jPanel50 = new javax.swing.JPanel();
        xoaVeLuot = new javax.swing.JPanel();
        jLabel67 = new javax.swing.JLabel();
        jPanel69 = new javax.swing.JPanel();
        jLabel68 = new javax.swing.JLabel();
        jPanel71 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        jPanel75 = new javax.swing.JPanel();
        PanelTieuDe4 = new javax.swing.JPanel();
        Tieude5 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        Paneltask5 = new javax.swing.JPanel();
        timKiemBienSo = new javax.swing.JTextField();
        jLabel69 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        timKiemLoaiVe = new javax.swing.JComboBox<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        bangTimKiem = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        timKiemLoaiXe = new javax.swing.JComboBox<>();
        PanelTieuDe5 = new javax.swing.JPanel();
        Tieude6 = new javax.swing.JLabel();
        Paneltask6 = new javax.swing.JPanel();
        jPanel26 = new javax.swing.JPanel();
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
        PanelTieuDe6 = new javax.swing.JPanel();
        Tieude8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Paneltask7 = new javax.swing.JPanel();
        chucNang7 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jPanel31 = new javax.swing.JPanel();
        jPanel32 = new javax.swing.JPanel();
        jPanel39 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jPanel40 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        quanLyNguoiDung = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        chucNangQuanLyNguoiDung = new javax.swing.JPanel();
        jPanel45 = new javax.swing.JPanel();
        xoaNguoiDung = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        suaNguoiDung = new javax.swing.JPanel();
        jLabel54 = new javax.swing.JLabel();
        jPanel48 = new javax.swing.JPanel();
        jPanel49 = new javax.swing.JPanel();
        themNguoiDung = new javax.swing.JPanel();
        jLabel55 = new javax.swing.JLabel();
        jPanel52 = new javax.swing.JPanel();
        jPanel53 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        bangNguoiDung = new javax.swing.JTable();
        bangGiaVe = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        giaVe = new javax.swing.JTable();
        jPanel51 = new javax.swing.JPanel();
        jPanel70 = new javax.swing.JPanel();
        jLabel87 = new javax.swing.JLabel();
        jPanel72 = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jPanel73 = new javax.swing.JPanel();
        jPanel76 = new javax.swing.JPanel();
        jPanel77 = new javax.swing.JPanel();
        jPanel78 = new javax.swing.JPanel();
        jLabel89 = new javax.swing.JLabel();
        jPanel79 = new javax.swing.JPanel();
        jPanel80 = new javax.swing.JPanel();
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
        jLabel84 = new javax.swing.JLabel();
        chucVu = new javax.swing.JTextField();
        jLabel85 = new javax.swing.JLabel();
        gtNam = new javax.swing.JRadioButton();
        gtNu = new javax.swing.JRadioButton();
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
        jLabel66 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();

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

        jPanelWindow.setBackground(new java.awt.Color(255, 255, 255));
        jPanelWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBar.setBackground(new java.awt.Color(255, 153, 51));

        javax.swing.GroupLayout jPanelBarLayout = new javax.swing.GroupLayout(jPanelBar);
        jPanelBar.setLayout(jPanelBarLayout);
        jPanelBarLayout.setHorizontalGroup(
            jPanelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1111, Short.MAX_VALUE)
        );
        jPanelBarLayout.setVerticalGroup(
            jPanelBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        jPanelWindow.add(jPanelBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1111, 50));

        jPanelTask.setBackground(new java.awt.Color(225, 225, 225));
        jPanelTask.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(80, 77));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 10, -1, -1));

        jPanel9.setPreferredSize(new java.awt.Dimension(280, 77));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 280, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 10, -1, -1));

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

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_black.jpg"))); // NOI18N
        jPanel2.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_blue.jpg"))); // NOI18N
        jPanel2.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

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

        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.setPreferredSize(new java.awt.Dimension(100, 77));
        jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel7MouseClicked(evt);
            }
        });
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel8text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Panel8text.setForeground(new java.awt.Color(153, 153, 153));
        Panel8text.setText("HỆ THỐNG");
        jPanel7.add(Panel8text, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 40, -1, -1));

        jPanelTask.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 10, -1, -1));

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

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_gray.jpg"))); // NOI18N
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_black.jpg"))); // NOI18N
        jPanel8.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, -1, -1));

        jPanelTask.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 10, -1, -1));

        jPanel1s.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1s.setPreferredSize(new java.awt.Dimension(2, 77));

        javax.swing.GroupLayout jPanel1sLayout = new javax.swing.GroupLayout(jPanel1s);
        jPanel1s.setLayout(jPanel1sLayout);
        jPanel1sLayout.setHorizontalGroup(
            jPanel1sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel1sLayout.setVerticalGroup(
            jPanel1sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel1s, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 10, -1, -1));

        jPanel2s.setBackground(new java.awt.Color(225, 225, 225));
        jPanel2s.setPreferredSize(new java.awt.Dimension(2, 77));

        javax.swing.GroupLayout jPanel2sLayout = new javax.swing.GroupLayout(jPanel2s);
        jPanel2s.setLayout(jPanel2sLayout);
        jPanel2sLayout.setHorizontalGroup(
            jPanel2sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel2sLayout.setVerticalGroup(
            jPanel2sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel2s, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 10, -1, -1));

        jPanel3s.setBackground(new java.awt.Color(225, 225, 225));
        jPanel3s.setPreferredSize(new java.awt.Dimension(2, 77));

        javax.swing.GroupLayout jPanel3sLayout = new javax.swing.GroupLayout(jPanel3s);
        jPanel3s.setLayout(jPanel3sLayout);
        jPanel3sLayout.setHorizontalGroup(
            jPanel3sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel3sLayout.setVerticalGroup(
            jPanel3sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel3s, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 10, -1, -1));

        jPanel4s.setBackground(new java.awt.Color(225, 225, 225));
        jPanel4s.setPreferredSize(new java.awt.Dimension(2, 77));

        javax.swing.GroupLayout jPanel4sLayout = new javax.swing.GroupLayout(jPanel4s);
        jPanel4s.setLayout(jPanel4sLayout);
        jPanel4sLayout.setHorizontalGroup(
            jPanel4sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel4sLayout.setVerticalGroup(
            jPanel4sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel4s, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 10, -1, -1));

        jPanel5s.setBackground(new java.awt.Color(225, 225, 225));
        jPanel5s.setPreferredSize(new java.awt.Dimension(2, 77));

        javax.swing.GroupLayout jPanel5sLayout = new javax.swing.GroupLayout(jPanel5s);
        jPanel5s.setLayout(jPanel5sLayout);
        jPanel5sLayout.setHorizontalGroup(
            jPanel5sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel5sLayout.setVerticalGroup(
            jPanel5sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel5s, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        jPanel6s.setBackground(new java.awt.Color(225, 225, 225));
        jPanel6s.setPreferredSize(new java.awt.Dimension(2, 77));

        javax.swing.GroupLayout jPanel6sLayout = new javax.swing.GroupLayout(jPanel6s);
        jPanel6s.setLayout(jPanel6sLayout);
        jPanel6sLayout.setHorizontalGroup(
            jPanel6sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel6sLayout.setVerticalGroup(
            jPanel6sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel6s, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 10, -1, -1));

        jPanel7s.setBackground(new java.awt.Color(225, 225, 225));
        jPanel7s.setPreferredSize(new java.awt.Dimension(2, 77));

        javax.swing.GroupLayout jPanel7sLayout = new javax.swing.GroupLayout(jPanel7s);
        jPanel7s.setLayout(jPanel7sLayout);
        jPanel7sLayout.setHorizontalGroup(
            jPanel7sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel7sLayout.setVerticalGroup(
            jPanel7sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel7s, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 10, -1, -1));

        jPanel8s.setBackground(new java.awt.Color(225, 225, 225));
        jPanel8s.setPreferredSize(new java.awt.Dimension(2, 77));

        javax.swing.GroupLayout jPanel8sLayout = new javax.swing.GroupLayout(jPanel8s);
        jPanel8s.setLayout(jPanel8sLayout);
        jPanel8sLayout.setHorizontalGroup(
            jPanel8sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel8sLayout.setVerticalGroup(
            jPanel8sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 77, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel8s, new org.netbeans.lib.awtextra.AbsoluteConstraints(826, 10, -1, -1));

        jPanel2u.setBackground(new java.awt.Color(225, 225, 225));
        jPanel2u.setPreferredSize(new java.awt.Dimension(90, 3));

        javax.swing.GroupLayout jPanel2uLayout = new javax.swing.GroupLayout(jPanel2u);
        jPanel2u.setLayout(jPanel2uLayout);
        jPanel2uLayout.setHorizontalGroup(
            jPanel2uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel2uLayout.setVerticalGroup(
            jPanel2uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel2u, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 7, -1, -1));

        jPanel3u.setBackground(new java.awt.Color(225, 225, 225));
        jPanel3u.setPreferredSize(new java.awt.Dimension(100, 3));

        javax.swing.GroupLayout jPanel3uLayout = new javax.swing.GroupLayout(jPanel3u);
        jPanel3u.setLayout(jPanel3uLayout);
        jPanel3uLayout.setHorizontalGroup(
            jPanel3uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3uLayout.setVerticalGroup(
            jPanel3uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel3u, new org.netbeans.lib.awtextra.AbsoluteConstraints(176, 7, -1, -1));

        jPanel4u.setBackground(new java.awt.Color(225, 225, 225));
        jPanel4u.setPreferredSize(new java.awt.Dimension(90, 3));

        javax.swing.GroupLayout jPanel4uLayout = new javax.swing.GroupLayout(jPanel4u);
        jPanel4u.setLayout(jPanel4uLayout);
        jPanel4uLayout.setHorizontalGroup(
            jPanel4uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 90, Short.MAX_VALUE)
        );
        jPanel4uLayout.setVerticalGroup(
            jPanel4uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel4u, new org.netbeans.lib.awtextra.AbsoluteConstraints(278, 7, -1, -1));

        jPanel5u.setBackground(new java.awt.Color(225, 225, 225));
        jPanel5u.setPreferredSize(new java.awt.Dimension(120, 3));

        javax.swing.GroupLayout jPanel5uLayout = new javax.swing.GroupLayout(jPanel5u);
        jPanel5u.setLayout(jPanel5uLayout);
        jPanel5uLayout.setHorizontalGroup(
            jPanel5uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
        );
        jPanel5uLayout.setVerticalGroup(
            jPanel5uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel5u, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 7, -1, -1));

        jPanel6u.setBackground(new java.awt.Color(225, 225, 225));
        jPanel6u.setPreferredSize(new java.awt.Dimension(100, 3));

        javax.swing.GroupLayout jPanel6uLayout = new javax.swing.GroupLayout(jPanel6u);
        jPanel6u.setLayout(jPanel6uLayout);
        jPanel6uLayout.setHorizontalGroup(
            jPanel6uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel6uLayout.setVerticalGroup(
            jPanel6uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel6u, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 7, -1, -1));

        jPanel7u.setBackground(new java.awt.Color(225, 225, 225));
        jPanel7u.setPreferredSize(new java.awt.Dimension(100, 3));

        javax.swing.GroupLayout jPanel7uLayout = new javax.swing.GroupLayout(jPanel7u);
        jPanel7u.setLayout(jPanel7uLayout);
        jPanel7uLayout.setHorizontalGroup(
            jPanel7uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7uLayout.setVerticalGroup(
            jPanel7uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel7u, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 7, -1, -1));

        jPanel8u.setBackground(new java.awt.Color(225, 225, 225));
        jPanel8u.setPreferredSize(new java.awt.Dimension(130, 3));

        javax.swing.GroupLayout jPanel8uLayout = new javax.swing.GroupLayout(jPanel8u);
        jPanel8u.setLayout(jPanel8uLayout);
        jPanel8uLayout.setHorizontalGroup(
            jPanel8uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 130, Short.MAX_VALUE)
        );
        jPanel8uLayout.setVerticalGroup(
            jPanel8uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 3, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel8u, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 7, -1, -1));

        jPanel1d.setBackground(new java.awt.Color(225, 225, 225));
        jPanel1d.setPreferredSize(new java.awt.Dimension(82, 2));

        javax.swing.GroupLayout jPanel1dLayout = new javax.swing.GroupLayout(jPanel1d);
        jPanel1d.setLayout(jPanel1dLayout);
        jPanel1dLayout.setHorizontalGroup(
            jPanel1dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
        );
        jPanel1dLayout.setVerticalGroup(
            jPanel1dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel1d, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 87, -1, -1));

        jPanel2d.setBackground(new java.awt.Color(225, 225, 225));
        jPanel2d.setPreferredSize(new java.awt.Dimension(92, 2));

        javax.swing.GroupLayout jPanel2dLayout = new javax.swing.GroupLayout(jPanel2d);
        jPanel2d.setLayout(jPanel2dLayout);
        jPanel2dLayout.setHorizontalGroup(
            jPanel2dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );
        jPanel2dLayout.setVerticalGroup(
            jPanel2dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel2d, new org.netbeans.lib.awtextra.AbsoluteConstraints(84, 87, -1, -1));

        jPanel3d.setBackground(new java.awt.Color(225, 225, 225));
        jPanel3d.setPreferredSize(new java.awt.Dimension(104, 2));

        javax.swing.GroupLayout jPanel3dLayout = new javax.swing.GroupLayout(jPanel3d);
        jPanel3d.setLayout(jPanel3dLayout);
        jPanel3dLayout.setHorizontalGroup(
            jPanel3dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );
        jPanel3dLayout.setVerticalGroup(
            jPanel3dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel3d, new org.netbeans.lib.awtextra.AbsoluteConstraints(174, 87, -1, -1));

        jPanel4d.setBackground(new java.awt.Color(225, 225, 225));
        jPanel4d.setPreferredSize(new java.awt.Dimension(94, 2));

        javax.swing.GroupLayout jPanel4dLayout = new javax.swing.GroupLayout(jPanel4d);
        jPanel4d.setLayout(jPanel4dLayout);
        jPanel4dLayout.setHorizontalGroup(
            jPanel4dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );
        jPanel4dLayout.setVerticalGroup(
            jPanel4dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel4d, new org.netbeans.lib.awtextra.AbsoluteConstraints(276, 87, -1, -1));

        jPanel5d.setBackground(new java.awt.Color(225, 225, 225));
        jPanel5d.setPreferredSize(new java.awt.Dimension(124, 2));

        javax.swing.GroupLayout jPanel5dLayout = new javax.swing.GroupLayout(jPanel5d);
        jPanel5d.setLayout(jPanel5dLayout);
        jPanel5dLayout.setHorizontalGroup(
            jPanel5dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 124, Short.MAX_VALUE)
        );
        jPanel5dLayout.setVerticalGroup(
            jPanel5dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel5d, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 87, -1, -1));

        jPanel6d.setBackground(new java.awt.Color(225, 225, 225));
        jPanel6d.setPreferredSize(new java.awt.Dimension(104, 2));

        javax.swing.GroupLayout jPanel6dLayout = new javax.swing.GroupLayout(jPanel6d);
        jPanel6d.setLayout(jPanel6dLayout);
        jPanel6dLayout.setHorizontalGroup(
            jPanel6dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );
        jPanel6dLayout.setVerticalGroup(
            jPanel6dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel6d, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 87, -1, -1));

        jPanel7d.setBackground(new java.awt.Color(225, 225, 225));
        jPanel7d.setPreferredSize(new java.awt.Dimension(104, 2));

        javax.swing.GroupLayout jPanel7dLayout = new javax.swing.GroupLayout(jPanel7d);
        jPanel7d.setLayout(jPanel7dLayout);
        jPanel7dLayout.setHorizontalGroup(
            jPanel7dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 104, Short.MAX_VALUE)
        );
        jPanel7dLayout.setVerticalGroup(
            jPanel7dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel7d, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 87, -1, -1));

        jPanel8d.setBackground(new java.awt.Color(225, 225, 225));
        jPanel8d.setPreferredSize(new java.awt.Dimension(134, 2));

        javax.swing.GroupLayout jPanel8dLayout = new javax.swing.GroupLayout(jPanel8d);
        jPanel8d.setLayout(jPanel8dLayout);
        jPanel8dLayout.setHorizontalGroup(
            jPanel8dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 134, Short.MAX_VALUE)
        );
        jPanel8dLayout.setVerticalGroup(
            jPanel8dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel8d, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 87, -1, -1));

        jPanel9d.setBackground(new java.awt.Color(225, 225, 225));
        jPanel9d.setPreferredSize(new java.awt.Dimension(282, 2));

        javax.swing.GroupLayout jPanel9dLayout = new javax.swing.GroupLayout(jPanel9d);
        jPanel9d.setLayout(jPanel9dLayout);
        jPanel9dLayout.setHorizontalGroup(
            jPanel9dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );
        jPanel9dLayout.setVerticalGroup(
            jPanel9dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanelTask.add(jPanel9d, new org.netbeans.lib.awtextra.AbsoluteConstraints(828, 87, -1, -1));

        jPanelWindow.add(jPanelTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

        Paneltask2.setBackground(new java.awt.Color(255, 255, 255));
        Paneltask2.setPreferredSize(new java.awt.Dimension(1110, 510));
        Paneltask2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel24.setPreferredSize(new java.awt.Dimension(1, 350));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1, Short.MAX_VALUE)
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 350, Short.MAX_VALUE)
        );

        Paneltask2.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 80, -1, -1));

        jPanel34.setBackground(new java.awt.Color(255, 153, 51));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("LÀN RA");
        jPanel34.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Paneltask2.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 80, 40));

        jPanel35.setBackground(new java.awt.Color(255, 153, 102));
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

        loaiXeLanVao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ô tô", "Xe máy", "Xe đạp, xe đạp điện" }));
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

        loaiXeLanRa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ô tô", "Xe máy", "Xe đạp, xe đạp điện" }));
        loaiXeLanRa.setPreferredSize(new java.awt.Dimension(62, 30));
        Paneltask2.add(loaiXeLanRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 320, -1));

        ngayVaoLanRa.setEditable(false);
        Paneltask2.add(ngayVaoLanRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 140, 30));

        jLabel30.setText("Ngày vào");
        Paneltask2.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, -1, -1));

        clearLanVao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearLanVao = new CustomRoundedPanel(50, 50);
        clearLanVao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearLanVaoMouseClicked(evt);
            }
        });
        clearLanVao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Xóa");
        clearLanVao.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        Paneltask2.add(clearLanVao, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 90, 40));

        luuLanVao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        luuLanVao = new CustomRoundedPanel(50, 50);
        luuLanVao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                luuLanVaoMouseClicked(evt);
            }
        });
        luuLanVao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("Lưu");
        luuLanVao.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        Paneltask2.add(luuLanVao, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 90, 40));

        clearLanRa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearLanRa = new CustomRoundedPanel(50, 50);
        clearLanRa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearLanRaMouseClicked(evt);
            }
        });
        clearLanRa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Xóa");
        clearLanRa.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        Paneltask2.add(clearLanRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 380, 90, 40));

        tinhTien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tinhTien = new CustomRoundedPanel(50, 50);
        tinhTien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
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

        PanelTieuDe3.setBackground(new java.awt.Color(255, 255, 255));
        PanelTieuDe3.setPreferredSize(new java.awt.Dimension(1110, 60));
        PanelTieuDe3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tieude3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Tieude3.setForeground(new java.awt.Color(255, 153, 102));
        Tieude3.setText("DANH SÁCH VÉ THÁNG");
        PanelTieuDe3.add(Tieude3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        Paneltask3.add(PanelTieuDe3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Search3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Search3.setText("Tìm kiếm:");
        Paneltask3.add(Search3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        search3text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search3textKeyReleased(evt);
            }
        });
        Paneltask3.add(search3text, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 95, 160, 30));

        chucNangPanel3.setBackground(new java.awt.Color(255, 255, 255));
        chucNangPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        chucNangPanel3.setPreferredSize(new java.awt.Dimension(360, 40));
        chucNangPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        giaHanVeThang.setBackground(new java.awt.Color(255, 255, 255));
        giaHanVeThang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        giaHanVeThang.setPreferredSize(new java.awt.Dimension(91, 37));
        giaHanVeThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                giaHanVeThangMouseClicked(evt);
            }
        });
        giaHanVeThang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("GIA HẠN");
        jLabel4.setPreferredSize(new java.awt.Dimension(52, 16));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        giaHanVeThang.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 10, 60, -1));

        chucNangPanel3.add(giaHanVeThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 1, -1, -1));

        jPanel13.setBackground(new java.awt.Color(51, 153, 255));
        jPanel13.setPreferredSize(new java.awt.Dimension(2, 37));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        chucNangPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 1, -1, -1));

        xoaVeThang.setBackground(new java.awt.Color(255, 255, 255));
        xoaVeThang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        xoaVeThang.setPreferredSize(new java.awt.Dimension(80, 37));
        xoaVeThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xoaVeThangMouseClicked(evt);
            }
        });
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
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        chucNangPanel3.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 38, -1, -1));

        jPanel17.setBackground(new java.awt.Color(51, 153, 255));
        jPanel17.setPreferredSize(new java.awt.Dimension(2, 37));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        chucNangPanel3.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 1, -1, -1));

        jPanel18.setBackground(new java.awt.Color(51, 153, 255));
        jPanel18.setPreferredSize(new java.awt.Dimension(2, 37));

        javax.swing.GroupLayout jPanel18Layout = new javax.swing.GroupLayout(jPanel18);
        jPanel18.setLayout(jPanel18Layout);
        jPanel18Layout.setHorizontalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel18Layout.setVerticalGroup(
            jPanel18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        chucNangPanel3.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 1, -1, -1));

        dangKyVeThang.setBackground(new java.awt.Color(255, 255, 255));
        dangKyVeThang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        dangKyVeThang.setPreferredSize(new java.awt.Dimension(100, 37));
        dangKyVeThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dangKyVeThangMouseClicked(evt);
            }
        });
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
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        chucNangPanel3.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 38, -1, -1));

        jPanel21.setBackground(new java.awt.Color(51, 153, 255));
        jPanel21.setPreferredSize(new java.awt.Dimension(80, 2));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        chucNangPanel3.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 38, -1, -1));

        jPanel22.setBackground(new java.awt.Color(51, 153, 255));
        jPanel22.setForeground(new java.awt.Color(255, 255, 255));
        jPanel22.setPreferredSize(new java.awt.Dimension(92, 2));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 92, Short.MAX_VALUE)
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        chucNangPanel3.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 38, -1, -1));

        Paneltask3.add(chucNangPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        bangVeThang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bangVeThang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chọn", "Biển Số", "Ngày Kích Hoạt", "Ngày Hết Hạn", "Loại Xe", "Giá Vé"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableHeader header = bangVeThang.getTableHeader();
        header.setFont(new Font("Segoe UI", Font.BOLD, 16));
        header.setBackground(Color.WHITE);
        DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        jScrollPane1.setViewportView(bangVeThang);

        Paneltask3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 1030, 280));

        jLabel56.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel56.setText("Đang chọn:");
        Paneltask3.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, -1));

        jLabel57.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel57.setText("Tổng số:");
        Paneltask3.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        tongVeThang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tongVeThang.setText("0");
        Paneltask3.add(tongVeThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 10, -1));

        dangChonVeThang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dangChonVeThang.setText("0");
        Paneltask3.add(dangChonVeThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        jPanelWindow.add(Paneltask3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        Paneltask4.setBackground(new java.awt.Color(255, 255, 255));
        Paneltask4.setPreferredSize(new java.awt.Dimension(1110, 510));
        Paneltask4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        bangVeLuot.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bangVeLuot.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chọn", "Biển Số", "Thời Gian Vào", "Loại Xe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableHeader header5 = bangVeLuot.getTableHeader();
        header5.setFont(new Font("Segoe UI", Font.BOLD, 16));
        header5.setBackground(Color.WHITE);
        DefaultTableCellRenderer renderer5 = (DefaultTableCellRenderer) header.getDefaultRenderer();
        renderer5.setHorizontalAlignment(SwingConstants.CENTER);
        jScrollPane5.setViewportView(bangVeLuot);

        Paneltask4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 1030, 280));

        Search4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Search4.setText("Tìm kiếm:");
        Paneltask4.add(Search4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        search3text1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search3text1KeyReleased(evt);
            }
        });
        Paneltask4.add(search3text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 95, 160, 30));

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));
        jPanel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel50.setPreferredSize(new java.awt.Dimension(164, 40));
        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        xoaVeLuot.setBackground(new java.awt.Color(255, 255, 255));
        xoaVeLuot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        xoaVeLuot.setPreferredSize(new java.awt.Dimension(80, 37));
        xoaVeLuot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xoaVeLuotMouseClicked(evt);
            }
        });
        xoaVeLuot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel67.setText("XÓA");
        jLabel67.setPreferredSize(new java.awt.Dimension(52, 16));
        xoaVeLuot.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 10, 30, -1));

        jPanel50.add(xoaVeLuot, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

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
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel71Layout.setVerticalGroup(
            jPanel71Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jPanel50.add(jPanel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 1, -1, -1));

        jPanel74.setBackground(new java.awt.Color(51, 153, 255));
        jPanel74.setPreferredSize(new java.awt.Dimension(80, 2));

        javax.swing.GroupLayout jPanel74Layout = new javax.swing.GroupLayout(jPanel74);
        jPanel74.setLayout(jPanel74Layout);
        jPanel74Layout.setHorizontalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel74Layout.setVerticalGroup(
            jPanel74Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel50.add(jPanel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 38, -1, -1));

        jPanel75.setBackground(new java.awt.Color(51, 153, 255));
        jPanel75.setPreferredSize(new java.awt.Dimension(80, 2));

        javax.swing.GroupLayout jPanel75Layout = new javax.swing.GroupLayout(jPanel75);
        jPanel75.setLayout(jPanel75Layout);
        jPanel75Layout.setHorizontalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel75Layout.setVerticalGroup(
            jPanel75Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel50.add(jPanel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 38, -1, -1));

        Paneltask4.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        PanelTieuDe4.setBackground(new java.awt.Color(255, 255, 255));
        PanelTieuDe4.setPreferredSize(new java.awt.Dimension(1110, 60));
        PanelTieuDe4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tieude5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Tieude5.setForeground(new java.awt.Color(255, 153, 102));
        Tieude5.setText("DANH SÁCH VÉ LƯỢT");
        PanelTieuDe4.add(Tieude5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        Paneltask4.add(PanelTieuDe4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel60.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel60.setText("Đang chọn:");
        Paneltask4.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, -1, -1));

        jLabel61.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel61.setText("Tổng số:");
        Paneltask4.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        jLabel62.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel62.setText("0");
        Paneltask4.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 10, -1));

        jLabel63.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel63.setText("0");
        Paneltask4.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        jPanelWindow.add(Paneltask4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        Paneltask5.setBackground(new java.awt.Color(255, 255, 255));
        Paneltask5.setPreferredSize(new java.awt.Dimension(1110, 510));
        Paneltask5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Paneltask5.add(timKiemBienSo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 320, 30));

        jLabel69.setText("Biển số");
        Paneltask5.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel75.setText("Loại xe");
        Paneltask5.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jLabel86.setText("Loại vé");
        Paneltask5.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        timKiemLoaiVe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả loại vé", "Vé lượt", "Vé tháng" }));
        timKiemLoaiVe.setPreferredSize(new java.awt.Dimension(62, 30));
        Paneltask5.add(timKiemLoaiVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 320, -1));

        bangTimKiem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Biển số", "Loại vé", "Loại xe"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableHeader header6 = bangTimKiem.getTableHeader();
        header6.setFont(new Font("Segoe UI", Font.BOLD, 16));
        header6.setBackground(Color.WHITE);
        DefaultTableCellRenderer renderer6 = (DefaultTableCellRenderer) header.getDefaultRenderer();
        renderer6.setHorizontalAlignment(SwingConstants.CENTER);
        jScrollPane6.setViewportView(bangTimKiem);

        Paneltask5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 540, 380));

        jButton1.setBackground(new java.awt.Color(255, 153, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Xóa");
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Paneltask5.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 350, 90, -1));

        jButton2.setBackground(new java.awt.Color(255, 153, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Tìm kiếm");
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Paneltask5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        timKiemLoaiXe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả loại xe", "Ô tô", "Xe máy", "Xe đạp, xe đạp điện" }));
        timKiemLoaiXe.setPreferredSize(new java.awt.Dimension(62, 30));
        Paneltask5.add(timKiemLoaiXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 320, -1));

        PanelTieuDe5.setBackground(new java.awt.Color(255, 255, 255));
        PanelTieuDe5.setPreferredSize(new java.awt.Dimension(1110, 60));
        PanelTieuDe5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tieude6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Tieude6.setForeground(new java.awt.Color(255, 153, 102));
        Tieude6.setText("TRA CỨU THÔNG TIN XE VÀO RA");
        PanelTieuDe5.add(Tieude6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        Paneltask5.add(PanelTieuDe5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanelWindow.add(Paneltask5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        Paneltask6.setBackground(new java.awt.Color(255, 255, 255));
        Paneltask6.setPreferredSize(new java.awt.Dimension(1110, 510));
        Paneltask6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel26.setBackground(new java.awt.Color(255, 255, 255));
        jPanel26.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel47.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel47.setText("Loại xe:");
        jPanel26.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 85, -1, -1));

        jLabel52.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel52.setText("Từ ngày:");
        jPanel26.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 85, 70, -1));

        jLabel64.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel64.setText("Đến ngày:");
        jPanel26.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 85, 80, -1));

        jLabel65.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel65.setText("Loại vé:");
        jPanel26.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 85, 70, -1));

        jDateChooser1.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser1.setPreferredSize(new java.awt.Dimension(160, 30));
        jPanel26.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        jDateChooser2.setBackground(new java.awt.Color(255, 255, 255));
        jDateChooser2.setPreferredSize(new java.awt.Dimension(160, 30));
        jPanel26.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả loại xe", "Ô tô", "Xe máy", "Xe đạp điện, xe đạp" }));
        jComboBox3.setPreferredSize(new java.awt.Dimension(90, 30));
        jPanel26.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 110, -1));

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả loại vé", "Vé tháng", "Vé lượt" }));
        jComboBox4.setPreferredSize(new java.awt.Dimension(90, 30));
        jPanel26.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 120, -1));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loại vé", "Loại xe", "Tồn đầu kỳ", "Vào trong kỳ", "Ra trong kỳ", "Tồn cuối kỳ", "Tổng tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableHeader header2 = jTable4.getTableHeader();
        header2.setFont(new Font("Segoe UI", Font.BOLD, 16));
        header2.setBackground(Color.WHITE);
        DefaultTableCellRenderer renderer2 = (DefaultTableCellRenderer) header.getDefaultRenderer();
        renderer2.setHorizontalAlignment(SwingConstants.CENTER);
        jScrollPane2.setViewportView(jTable4);

        jPanel26.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 1040, 340));

        PanelTieuDe6.setBackground(new java.awt.Color(255, 255, 255));
        PanelTieuDe6.setPreferredSize(new java.awt.Dimension(1110, 60));
        PanelTieuDe6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tieude8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Tieude8.setForeground(new java.awt.Color(255, 153, 102));
        Tieude8.setText("THỐNG KÊ");
        PanelTieuDe6.add(Tieude8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel26.add(PanelTieuDe6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 153, 102));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Thống Kê");
        jButton3.setBorderPainted(false);
        jButton3.setPreferredSize(new java.awt.Dimension(87, 30));
        jPanel26.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 80, -1, -1));

        Paneltask6.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 510));

        jPanelWindow.add(Paneltask6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        Paneltask7.setBackground(new java.awt.Color(255, 255, 255));
        Paneltask7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chucNang7.setBackground(new java.awt.Color(245, 245, 245));
        chucNang7.setPreferredSize(new java.awt.Dimension(280, 510));
        chucNang7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel16.setText("ADMIN");
        chucNang7.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jPanel31.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel31Layout = new javax.swing.GroupLayout(jPanel31);
        jPanel31.setLayout(jPanel31Layout);
        jPanel31Layout.setHorizontalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        jPanel31Layout.setVerticalGroup(
            jPanel31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        chucNang7.add(jPanel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 30, 30));

        jPanel32.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel32Layout = new javax.swing.GroupLayout(jPanel32);
        jPanel32.setLayout(jPanel32Layout);
        jPanel32Layout.setHorizontalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        jPanel32Layout.setVerticalGroup(
            jPanel32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        chucNang7.add(jPanel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 30, 30));

        jPanel39.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel39.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel39.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel39MouseClicked(evt);
            }
        });
        jPanel39.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setText("Quản lý người dùng");
        jPanel39.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, -1));

        chucNang7.add(jPanel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, 180, 30));

        jPanel40.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel40.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel40.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel40MouseClicked(evt);
            }
        });
        jPanel40.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel37.setText("Quản lý giá vé");
        jPanel40.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 110, -1));

        chucNang7.add(jPanel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 260, 180, 30));

        jLabel38.setText("ICON");
        chucNang7.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        Paneltask7.add(chucNang7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 510));

        quanLyNguoiDung.setBackground(new java.awt.Color(204, 204, 255));
        quanLyNguoiDung.setPreferredSize(new java.awt.Dimension(830, 510));
        quanLyNguoiDung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel39.setText("QUẢN LÝ NGƯỜI DÙNG");
        quanLyNguoiDung.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jLabel40.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel40.setText("DANH SÁCH NGƯỜI DÙNG");
        quanLyNguoiDung.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel41.setText("ICON");
        quanLyNguoiDung.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        chucNangQuanLyNguoiDung.setBackground(new java.awt.Color(255, 255, 255));
        chucNangQuanLyNguoiDung.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        chucNangQuanLyNguoiDung.setPreferredSize(new java.awt.Dimension(360, 40));
        chucNangQuanLyNguoiDung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel45.setBackground(new java.awt.Color(51, 153, 255));
        jPanel45.setPreferredSize(new java.awt.Dimension(2, 37));

        javax.swing.GroupLayout jPanel45Layout = new javax.swing.GroupLayout(jPanel45);
        jPanel45.setLayout(jPanel45Layout);
        jPanel45Layout.setHorizontalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel45Layout.setVerticalGroup(
            jPanel45Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        chucNangQuanLyNguoiDung.add(jPanel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 1, -1, -1));

        xoaNguoiDung.setBackground(new java.awt.Color(255, 255, 255));
        xoaNguoiDung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        xoaNguoiDung.setPreferredSize(new java.awt.Dimension(80, 37));
        xoaNguoiDung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel53.setText("XÓA");
        jLabel53.setPreferredSize(new java.awt.Dimension(52, 16));
        xoaNguoiDung.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 10, 30, -1));

        jLabel46.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete_orange.png"))); // NOI18N
        xoaNguoiDung.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 5, -1, -1));

        chucNangQuanLyNguoiDung.add(xoaNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 1, -1, -1));

        suaNguoiDung.setBackground(new java.awt.Color(255, 255, 255));
        suaNguoiDung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suaNguoiDung.setPreferredSize(new java.awt.Dimension(80, 37));
        suaNguoiDung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                suaNguoiDungMouseClicked(evt);
            }
        });
        suaNguoiDung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel54.setText("SỬA");
        jLabel54.setPreferredSize(new java.awt.Dimension(52, 16));
        suaNguoiDung.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 10, 30, -1));

        chucNangQuanLyNguoiDung.add(suaNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 1, -1, -1));

        jPanel48.setBackground(new java.awt.Color(51, 153, 255));
        jPanel48.setPreferredSize(new java.awt.Dimension(100, 2));

        javax.swing.GroupLayout jPanel48Layout = new javax.swing.GroupLayout(jPanel48);
        jPanel48.setLayout(jPanel48Layout);
        jPanel48Layout.setHorizontalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel48Layout.setVerticalGroup(
            jPanel48Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        chucNangQuanLyNguoiDung.add(jPanel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 38, -1, -1));

        jPanel49.setBackground(new java.awt.Color(51, 153, 255));
        jPanel49.setPreferredSize(new java.awt.Dimension(2, 37));

        javax.swing.GroupLayout jPanel49Layout = new javax.swing.GroupLayout(jPanel49);
        jPanel49.setLayout(jPanel49Layout);
        jPanel49Layout.setHorizontalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel49Layout.setVerticalGroup(
            jPanel49Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        chucNangQuanLyNguoiDung.add(jPanel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 1, -1, -1));

        themNguoiDung.setBackground(new java.awt.Color(255, 255, 255));
        themNguoiDung.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        themNguoiDung.setPreferredSize(new java.awt.Dimension(100, 37));
        themNguoiDung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                themNguoiDungMouseClicked(evt);
            }
        });
        themNguoiDung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel55.setText("THÊM");
        jLabel55.setPreferredSize(new java.awt.Dimension(52, 16));
        themNguoiDung.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 40, -1));

        chucNangQuanLyNguoiDung.add(themNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        jPanel52.setBackground(new java.awt.Color(51, 153, 255));
        jPanel52.setPreferredSize(new java.awt.Dimension(80, 2));

        javax.swing.GroupLayout jPanel52Layout = new javax.swing.GroupLayout(jPanel52);
        jPanel52.setLayout(jPanel52Layout);
        jPanel52Layout.setHorizontalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel52Layout.setVerticalGroup(
            jPanel52Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        chucNangQuanLyNguoiDung.add(jPanel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 38, -1, -1));

        jPanel53.setBackground(new java.awt.Color(51, 153, 255));
        jPanel53.setPreferredSize(new java.awt.Dimension(80, 2));

        javax.swing.GroupLayout jPanel53Layout = new javax.swing.GroupLayout(jPanel53);
        jPanel53.setLayout(jPanel53Layout);
        jPanel53Layout.setHorizontalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel53Layout.setVerticalGroup(
            jPanel53Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        chucNangQuanLyNguoiDung.add(jPanel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 38, -1, -1));

        quanLyNguoiDung.add(chucNangQuanLyNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, 265, -1));

        bangNguoiDung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chọn", "Tên đăng nhập", "Tên người dùng", "Số điện thoại", "Chức vụ", "Ca làm việc"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableHeader header1 = bangNguoiDung.getTableHeader();
        header1.setFont(new Font("Segoe UI", Font.BOLD, 16));
        header1.setBackground(Color.WHITE);
        DefaultTableCellRenderer renderer1 = (DefaultTableCellRenderer) header.getDefaultRenderer();
        renderer1.setHorizontalAlignment(SwingConstants.CENTER);
        jScrollPane3.setViewportView(bangNguoiDung);
        if (bangNguoiDung.getColumnModel().getColumnCount() > 0) {
            bangNguoiDung.getColumnModel().getColumn(0).setMinWidth(10);
            bangNguoiDung.getColumnModel().getColumn(0).setPreferredWidth(60);
            bangNguoiDung.getColumnModel().getColumn(0).setMaxWidth(90);
            bangNguoiDung.getColumnModel().getColumn(1).setMinWidth(10);
            bangNguoiDung.getColumnModel().getColumn(1).setPreferredWidth(120);
            bangNguoiDung.getColumnModel().getColumn(1).setMaxWidth(150);
            bangNguoiDung.getColumnModel().getColumn(2).setPreferredWidth(150);
        }

        quanLyNguoiDung.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 750, 290));

        Paneltask7.add(quanLyNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        bangGiaVe.setBackground(new java.awt.Color(204, 204, 255));
        bangGiaVe.setPreferredSize(new java.awt.Dimension(830, 510));
        bangGiaVe.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel42.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel42.setText("QUẢN LÝ GIÁ VÉ");
        bangGiaVe.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jLabel43.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel43.setText("BẢNG GIÁ VÉ");
        bangGiaVe.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel44.setText("ICON");
        bangGiaVe.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        giaVe.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Loại xe", "6h - 18h", "18h - 22h", "22h - 6h", "Vé tháng"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        JTableHeader header8 = giaVe.getTableHeader();
        header8.setFont(new Font("Segoe UI", Font.BOLD, 16));
        header8.setBackground(Color.WHITE);
        DefaultTableCellRenderer renderer8 = (DefaultTableCellRenderer) header.getDefaultRenderer();
        renderer8.setHorizontalAlignment(SwingConstants.CENTER);
        jScrollPane4.setViewportView(giaVe);

        bangGiaVe.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 750, 290));

        jPanel51.setBackground(new java.awt.Color(255, 255, 255));
        jPanel51.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel51.setPreferredSize(new java.awt.Dimension(246, 40));
        jPanel51.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel70.setBackground(new java.awt.Color(255, 255, 255));
        jPanel70.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel70.setPreferredSize(new java.awt.Dimension(80, 37));
        jPanel70.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel87.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel87.setText("XÓA");
        jLabel87.setPreferredSize(new java.awt.Dimension(52, 16));
        jPanel70.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 10, 30, -1));

        jPanel51.add(jPanel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        jPanel72.setBackground(new java.awt.Color(255, 255, 255));
        jPanel72.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel72.setPreferredSize(new java.awt.Dimension(80, 37));
        jPanel72.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel88.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel88.setText("SỬA");
        jLabel88.setPreferredSize(new java.awt.Dimension(52, 16));
        jPanel72.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 10, 30, -1));

        jPanel51.add(jPanel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 1, -1, -1));

        jPanel73.setBackground(new java.awt.Color(51, 153, 255));
        jPanel73.setPreferredSize(new java.awt.Dimension(2, 37));

        javax.swing.GroupLayout jPanel73Layout = new javax.swing.GroupLayout(jPanel73);
        jPanel73.setLayout(jPanel73Layout);
        jPanel73Layout.setHorizontalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel73Layout.setVerticalGroup(
            jPanel73Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jPanel51.add(jPanel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 1, -1, -1));

        jPanel76.setBackground(new java.awt.Color(51, 153, 255));
        jPanel76.setPreferredSize(new java.awt.Dimension(80, 2));

        javax.swing.GroupLayout jPanel76Layout = new javax.swing.GroupLayout(jPanel76);
        jPanel76.setLayout(jPanel76Layout);
        jPanel76Layout.setHorizontalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel76Layout.setVerticalGroup(
            jPanel76Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel51.add(jPanel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 38, -1, -1));

        jPanel77.setBackground(new java.awt.Color(51, 153, 255));
        jPanel77.setPreferredSize(new java.awt.Dimension(80, 2));

        javax.swing.GroupLayout jPanel77Layout = new javax.swing.GroupLayout(jPanel77);
        jPanel77.setLayout(jPanel77Layout);
        jPanel77Layout.setHorizontalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel77Layout.setVerticalGroup(
            jPanel77Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel51.add(jPanel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 38, -1, -1));

        jPanel78.setBackground(new java.awt.Color(255, 255, 255));
        jPanel78.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel78.setPreferredSize(new java.awt.Dimension(80, 37));
        jPanel78.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel89.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel89.setText("SỬA");
        jLabel89.setPreferredSize(new java.awt.Dimension(52, 16));
        jPanel78.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 10, 30, -1));

        jPanel51.add(jPanel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 1, -1, -1));

        jPanel79.setBackground(new java.awt.Color(51, 153, 255));
        jPanel79.setPreferredSize(new java.awt.Dimension(80, 2));

        javax.swing.GroupLayout jPanel79Layout = new javax.swing.GroupLayout(jPanel79);
        jPanel79.setLayout(jPanel79Layout);
        jPanel79Layout.setHorizontalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel79Layout.setVerticalGroup(
            jPanel79Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );

        jPanel51.add(jPanel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 38, -1, -1));

        jPanel80.setBackground(new java.awt.Color(51, 153, 255));
        jPanel80.setPreferredSize(new java.awt.Dimension(2, 37));

        javax.swing.GroupLayout jPanel80Layout = new javax.swing.GroupLayout(jPanel80);
        jPanel80.setLayout(jPanel80Layout);
        jPanel80Layout.setHorizontalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 2, Short.MAX_VALUE)
        );
        jPanel80Layout.setVerticalGroup(
            jPanel80Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 37, Short.MAX_VALUE)
        );

        jPanel51.add(jPanel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 1, -1, -1));

        bangGiaVe.add(jPanel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        Paneltask7.add(bangGiaVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        jPanelWindow.add(Paneltask7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1110, 510));

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
            .addGap(0, 28, Short.MAX_VALUE)
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

        chucNang8.add(jPanel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 30, 30));

        jPanel28.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel28Layout = new javax.swing.GroupLayout(jPanel28);
        jPanel28.setLayout(jPanel28Layout);
        jPanel28Layout.setHorizontalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );
        jPanel28Layout.setVerticalGroup(
            jPanel28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 28, Short.MAX_VALUE)
        );

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

        capNhatNguoiDung = new CustomRoundedPanel(50, 50);
        capNhatNguoiDung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                capNhatNguoiDungMouseClicked(evt);
            }
        });
        capNhatNguoiDung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setText("Cập nhật thông tin");
        capNhatNguoiDung.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        thongTin.add(capNhatNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 160, 40));

        clearNguoiDung = new CustomRoundedPanel(50, 50);
        clearNguoiDung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearNguoiDungMouseClicked(evt);
            }
        });
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

        jLabel84.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel84.setText("Giới tính");
        thongTin.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        chucVu.setEditable(false);
        chucVu.setPreferredSize(new java.awt.Dimension(65, 30));
        thongTin.add(chucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 310, -1));

        jLabel85.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel85.setText("Chức vụ");
        thongTin.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        gtNam.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(gtNam);
        gtNam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gtNam.setText("Nam");
        thongTin.add(gtNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        gtNu.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(gtNu);
        gtNu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gtNu.setText("Nữ");
        thongTin.add(gtNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, -1));

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
        doiMatKhau.add(matKhauCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 580, 30));

        matKhauMoi.setBackground(new java.awt.Color(204, 204, 204));
        doiMatKhau.add(matKhauMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 580, 30));

        xacNhanMatKhau.setBackground(new java.awt.Color(204, 204, 204));
        doiMatKhau.add(xacNhanMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 580, 30));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel19.setText("Xác nhận mật khẩu mới");
        doiMatKhau.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel20.setText("Mật khẩu hiện tại");
        doiMatKhau.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel22.setText("Mật khẩu mới");
        doiMatKhau.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        capNhatMatKhau = new CustomRoundedPanel(50, 50);
        capNhatMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                capNhatMatKhauMouseClicked(evt);
            }
        });
        capNhatMatKhau.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setText("Cập nhật mật khẩu");
        capNhatMatKhau.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        doiMatKhau.add(capNhatMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 160, 40));

        xoaMatKhau = new CustomRoundedPanel(50, 50);
        xoaMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xoaMatKhauMouseClicked(evt);
            }
        });
        xoaMatKhau.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setText("Xóa");
        xoaMatKhau.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        doiMatKhau.add(xoaMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 90, 40));

        jLabel66.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/password_hide.jpg"))); // NOI18N
        jLabel66.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel66.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel66MouseClicked(evt);
            }
        });
        doiMatKhau.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 175, -1, -1));

        jLabel70.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/password_show.jpg"))); // NOI18N
        jLabel70.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel70.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel70MouseClicked(evt);
            }
        });
        doiMatKhau.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 175, -1, -1));

        jLabel71.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/password_hide.jpg"))); // NOI18N
        jLabel71.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel71.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel71MouseClicked(evt);
            }
        });
        doiMatKhau.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 255, -1, -1));

        jLabel72.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/password_show.jpg"))); // NOI18N
        jLabel72.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel72.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel72MouseClicked(evt);
            }
        });
        doiMatKhau.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 255, -1, -1));

        jLabel73.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/password_hide.jpg"))); // NOI18N
        jLabel73.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel73.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel73MouseClicked(evt);
            }
        });
        doiMatKhau.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 335, -1, -1));

        jLabel74.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/password_show.jpg"))); // NOI18N
        jLabel74.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel74.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel74MouseClicked(evt);
            }
        });
        doiMatKhau.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 335, -1, -1));

        Paneltask8.add(doiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        jPanelWindow.add(Paneltask8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1110, 510));

        getContentPane().add(jPanelWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tableNguoiDung(){
        model5 = new DefaultTableModel(new Object[]{"Chọn", "Tên đăng nhập", "Tên người dùng", "Số điện thoại", "Chức vụ", "Ca làm"}, 0) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 0 ? Boolean.class : super.getColumnClass(columnIndex);
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 0; // Chỉ cho phép chỉnh sửa cột checkbox
            }
        };
        bangNguoiDung.setModel(model5);
        userDao.getUsersValue(bangNguoiDung, "");
    }
    
    private void tableBangGia() {
        vehicle.getPrice(giaVe);
        model6 = (DefaultTableModel) giaVe.getModel();
    }
    
    private void tableTimKiem() {
        String bienSo = timKiemBienSo.getText();
        String loaiVe = "";
        if(timKiemLoaiVe.getSelectedItem().toString().equals("Vé tháng")) loaiVe = "MONTHLY";
        else if(timKiemLoaiVe.getSelectedItem().toString().equals("Vé lượt")) loaiVe = "DAILY";
        String loaiXe = "";
        if(timKiemLoaiXe.getSelectedItem().toString().equals("Ô tô")) loaiXe = "CAR";
        else if(timKiemLoaiXe.getSelectedItem().toString().equals("Xe máy")) loaiXe = "MOTORBIKE";
        else if(timKiemLoaiXe.getSelectedItem().toString().equals("Xe đạp, xe đạp điện")) loaiXe = "BIKE";
        ticketDao.searchTicket(bangTimKiem, bienSo, loaiVe, loaiXe);
        model3 = (DefaultTableModel) bangTimKiem.getModel();
    }

    private void tableVeLuot(){
        model2 = new DefaultTableModel(new Object[]{"Chọn", "Biển số", "Thời gian vào", "Loại xe"}, 0) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 0 ? Boolean.class : super.getColumnClass(columnIndex);
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 0; // Chỉ cho phép chỉnh sửa cột checkbox
            }
        };
        bangVeLuot.setModel(model2);
        ticketDao.getDailyTicket(bangVeLuot, "");
    }
    
    public static void tableVeThang(){
        model1 = new DefaultTableModel(new Object[]{"Chọn", "Biển số", "Ngày kích hoạt", "Ngày hết hạn", "Loại xe", "Giá vé"}, 0) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 0 ? Boolean.class : super.getColumnClass(columnIndex);
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 0;
            }
        };
        bangVeThang.setModel(model1);
        ticketDao.getMonthlyTicket(bangVeThang, "");
    }
    
    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        init();
        initText();
        initTask();
        initIcon();
        jPanel2.setBackground(select);
        jPanel2u.setBackground(barSelect);
        jPanel1s.setBackground(barSelect);
        jPanel2s.setBackground(barSelect);
        jPanel1d.setBackground(barSelect);
        jPanel3d.setBackground(barSelect);
        jPanel4d.setBackground(barSelect);
        jPanel5d.setBackground(barSelect);
        jPanel6d.setBackground(barSelect);
        jPanel7d.setBackground(barSelect);
        jPanel8d.setBackground(barSelect);
        jPanel9d.setBackground(barSelect);
        Panel2text.setFont(font2);
        Panel2text.setForeground(barSelect);
        Paneltask2.setVisible(true);
        jLabel83.setVisible(false);
        jLabel90.setVisible(true);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void initIcon(){
        jLabel83.setVisible(true);
        jLabel90.setVisible(false);
    }
    
    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        init();
        initText();
        initTask();
        initIcon();
        jPanel3.setBackground(select);
        jPanel3u.setBackground(barSelect);
        jPanel2s.setBackground(barSelect);
        jPanel3s.setBackground(barSelect);
        jPanel1d.setBackground(barSelect);
        jPanel2d.setBackground(barSelect);
        jPanel4d.setBackground(barSelect);
        jPanel5d.setBackground(barSelect);
        jPanel6d.setBackground(barSelect);
        jPanel7d.setBackground(barSelect);
        jPanel8d.setBackground(barSelect);
        jPanel9d.setBackground(barSelect);
        Panel3text.setFont(font2);
        Panel3text.setForeground(barSelect);
        Paneltask3.setVisible(true);
    }//GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
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
        jPanel7d.setBackground(barSelect);
        jPanel8d.setBackground(barSelect);
        jPanel9d.setBackground(barSelect);
        Panel4text.setFont(font2);
        Panel4text.setForeground(barSelect);
        Paneltask4.setVisible(true);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void JPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JPanel5MouseClicked
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
        jPanel7d.setBackground(barSelect);
        jPanel8d.setBackground(barSelect);
        jPanel9d.setBackground(barSelect);
        Panel5text.setFont(font2);
        Panel5text.setForeground(barSelect);
        Paneltask5.setVisible(true);
    }//GEN-LAST:event_JPanel5MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
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
        jPanel7d.setBackground(barSelect);
        jPanel8d.setBackground(barSelect);
        jPanel9d.setBackground(barSelect);
        Panel6text.setFont(font2);
        Panel6text.setForeground(barSelect);
        Paneltask6.setVisible(true);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel7MouseClicked
        init();
        initText();
        initTask();
        jPanel7.setBackground(select);
        jPanel7u.setBackground(barSelect);
        jPanel6s.setBackground(barSelect);
        jPanel7s.setBackground(barSelect);
        jPanel1d.setBackground(barSelect);
        jPanel2d.setBackground(barSelect);
        jPanel3d.setBackground(barSelect);
        jPanel4d.setBackground(barSelect);
        jPanel5d.setBackground(barSelect);
        jPanel6d.setBackground(barSelect);
        jPanel8d.setBackground(barSelect);
        jPanel9d.setBackground(barSelect);
        Panel8text.setFont(font2);
        Panel8text.setForeground(barSelect);
        Paneltask7.setVisible(true);
    }//GEN-LAST:event_jPanel7MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel8MouseClicked
        init();
        initText();
        initTask();
        jPanel8.setBackground(select);
        jPanel8u.setBackground(barSelect);
        jPanel7s.setBackground(barSelect);
        jPanel8s.setBackground(barSelect);
        jPanel1d.setBackground(barSelect);
        jPanel2d.setBackground(barSelect);
        jPanel3d.setBackground(barSelect);
        jPanel4d.setBackground(barSelect);
        jPanel5d.setBackground(barSelect);
        jPanel6d.setBackground(barSelect);
        jPanel7d.setBackground(barSelect);
        jPanel9d.setBackground(barSelect);
        Panel9text.setFont(font2);
        Panel9text.setForeground(barSelect);
        Paneltask8.setVisible(true);
    }//GEN-LAST:event_jPanel8MouseClicked

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void task8_thongTinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_task8_thongTinMouseClicked
        thongTin.setVisible(true);
        doiMatKhau.setVisible(false);
    }//GEN-LAST:event_task8_thongTinMouseClicked

    private void task8_doiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_task8_doiMatKhauMouseClicked
        doiMatKhau.setVisible(true);
        thongTin.setVisible(false);
    }//GEN-LAST:event_task8_doiMatKhauMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for(double i = 0; i <= 1.0; i += 0.1){
            String s = "" + i;
            float f = Float.parseFloat(s);
            this.setOpacity(f);
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(AdminDashBoard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void themNguoiDungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_themNguoiDungMouseClicked
        new AddUser().setVisible(true);
    }//GEN-LAST:event_themNguoiDungMouseClicked

    private void jPanel40MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel40MouseClicked
        quanLyNguoiDung.setVisible(false);
        bangGiaVe.setVisible(true);
    }//GEN-LAST:event_jPanel40MouseClicked

    private void jPanel39MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel39MouseClicked
        quanLyNguoiDung.setVisible(true);
        bangGiaVe.setVisible(false);
    }//GEN-LAST:event_jPanel39MouseClicked

    private void clearLanVaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearLanVaoMouseClicked
        bienSoLanVao.setText("");
        loaiXeLanVao.setSelectedItem("Ô tô");
        ngayVaoLanVao.setText("");
        gioVaoLanVao.setText("");
    }//GEN-LAST:event_clearLanVaoMouseClicked

    private void clearLanRaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearLanRaMouseClicked
        bienSoLanRa.setText("");
        loaiXeLanRa.setSelectedItem("Ô tô");
        ngayVaoLanRa.setText("");
        gioVaoLanRa.setText("");
        ngayRa.setText("");
        gioRa.setText("");
    }//GEN-LAST:event_clearLanRaMouseClicked

    private void luuLanVaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_luuLanVaoMouseClicked
        String bienSo = bienSoLanVao.getText();
        String loaiXe = loaiXeLanVao.getSelectedItem().toString();
        
    }//GEN-LAST:event_luuLanVaoMouseClicked

    private void clearNguoiDungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clearNguoiDungMouseClicked
        tenNguoiDung.setText("");
        sdt.setText("");
    }//GEN-LAST:event_clearNguoiDungMouseClicked

    private void capNhatNguoiDungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_capNhatNguoiDungMouseClicked
        String phoneNumber = sdt.getText();
        if(tenNguoiDung.getText().isEmpty() || sdt.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ dữ liệu", "Thông báo", 2);
        }
        if(userDao.isPhoneExist(phoneNumber, u.getId())){
            JOptionPane.showMessageDialog(this, "Số điện thoại này đã được đăng ký", "Thông báo", 2);
        }
        else {
            try {
                String username = tenDangNhap.getText();
                String fullName = tenNguoiDung.getText();
                String gt = "";
                if (gtNam.isSelected()) {
                    gt = "Male";
                } else {
                    gt = "Female";
                }
                int workShift = 1;
                Users o = new Users(username, fullName, gt, phoneNumber, workShift);
                UserDAO.updateUser(o);
            } catch (SQLException ex) {
                Logger.getLogger(AdminDashBoard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_capNhatNguoiDungMouseClicked

    private void xoaMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xoaMatKhauMouseClicked
        matKhauCu.setText("");
        matKhauMoi.setText("");
        xacNhanMatKhau.setText("");
    }//GEN-LAST:event_xoaMatKhauMouseClicked
    
    private void jLabel66MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel66MouseClicked
        matKhauCu.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        matKhauCu.setEchoChar((char) 0);
        jLabel66.setVisible(false);
        jLabel70.setVisible(true);
    }//GEN-LAST:event_jLabel66MouseClicked

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel70MouseClicked
        matKhauCu.setFont(new Font("Segoe UI", Font.BOLD, 12));
        matKhauCu.setEchoChar('*');
        jLabel66.setVisible(true);
        jLabel70.setVisible(false);
    }//GEN-LAST:event_jLabel70MouseClicked

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel71MouseClicked
        matKhauMoi.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        matKhauMoi.setEchoChar((char) 0);
        jLabel71.setVisible(false);
        jLabel72.setVisible(true);
    }//GEN-LAST:event_jLabel71MouseClicked

    private void jLabel72MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel72MouseClicked
        matKhauMoi.setFont(new Font("Segoe UI", Font.BOLD, 12));
        matKhauMoi.setEchoChar('*');
        jLabel71.setVisible(true);
        jLabel72.setVisible(false);
    }//GEN-LAST:event_jLabel72MouseClicked

    private void jLabel73MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel73MouseClicked
        xacNhanMatKhau.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        xacNhanMatKhau.setEchoChar((char) 0);
        jLabel73.setVisible(false);
        jLabel74.setVisible(true);
    }//GEN-LAST:event_jLabel73MouseClicked

    private void jLabel74MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel74MouseClicked
        xacNhanMatKhau.setFont(new Font("Segoe UI", Font.BOLD, 12));
        xacNhanMatKhau.setEchoChar('*');
        jLabel73.setVisible(true);
        jLabel74.setVisible(false);
    }//GEN-LAST:event_jLabel74MouseClicked

    private boolean checkMatKhau(String oldPass, String newPass, String cfPass, String pass){
        if (oldPass.isEmpty() || newPass.isEmpty() || cfPass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ dữ liệu", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (!oldPass.equals(pass)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu cũ không chính xác", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (!newPass.equals(cfPass)) {
            JOptionPane.showMessageDialog(this, "Xác nhận mật khẩu không chính xác", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (newPass.equals(oldPass)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu mới không được trùng với mật khẩu cũ", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    
    private void capNhatMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_capNhatMatKhauMouseClicked
        int id = u.getId();
        String oldPass = new String(matKhauCu.getPassword());
        String newPass = new String(matKhauMoi.getPassword());
        String cfPass = new String(xacNhanMatKhau.getPassword());
        String pass = userDao.getPassword(id);

        if (checkMatKhau(oldPass, newPass, cfPass, pass)) {
            try {
                UserDAO.changePassword(id, oldPass, newPass);
                JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(AdminDashBoard.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Đổi mật khẩu thất bại. Vui lòng thử lại sau!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_capNhatMatKhauMouseClicked

    private void dangKyVeThangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dangKyVeThangMouseClicked
        new AddMonthlyTicket().setVisible(true);
    }//GEN-LAST:event_dangKyVeThangMouseClicked

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        
    }//GEN-LAST:event_jLabel4MouseClicked

    private void suaNguoiDungMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_suaNguoiDungMouseClicked
        new ModifyUser().setVisible(true);
    }//GEN-LAST:event_suaNguoiDungMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tableTimKiem();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        timKiemBienSo.setText("");
        timKiemLoaiVe.setSelectedItem("Tất cả loại xe");
        timKiemLoaiVe.setSelectedItem("Tất cả loại vé");
        model3.setRowCount(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void search3textKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search3textKeyReleased
        model1 = new DefaultTableModel(new Object[]{"Chọn", "Biển số", "Ngày kích hoạt", "Ngày hết hạn", "Loại xe", "Giá vé"}, 0) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 0 ? Boolean.class : super.getColumnClass(columnIndex);
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 0;
            }
        };
        bangVeThang.setModel(model1);
        ticketDao.getMonthlyTicket(bangVeThang, search3text.getText());
    }//GEN-LAST:event_search3textKeyReleased

    private void search3text1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search3text1KeyReleased
        model2 = new DefaultTableModel(new Object[]{"Chọn", "Biển số", "Thời gian vào", "Loại xe"}, 0) {
            @Override
            public Class<?> getColumnClass(int columnIndex) {
                return columnIndex == 0 ? Boolean.class : super.getColumnClass(columnIndex);
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                return column == 0; // Chỉ cho phép chỉnh sửa cột checkbox
            }
        };
        bangVeLuot.setModel(model2);
        ticketDao.getDailyTicket(bangVeLuot, search3text1.getText());
    }//GEN-LAST:event_search3text1KeyReleased

    private void xoaVeThangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xoaVeThangMouseClicked
        DefaultTableModel model = (DefaultTableModel) bangVeThang.getModel();
        boolean hasDeleted = false;

        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            Boolean isSelected = (Boolean) model.getValueAt(i, 0);
            if (isSelected != null && isSelected) { // Kiểm tra checkbox
                String bienSo = (String) model.getValueAt(i, 1);
                boolean isDeleted = ticketDao.delete(bienSo, "MONTHLY");
                if (isDeleted) {
                    model.removeRow(i);
                    hasDeleted = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Không thể xóa vé: " + bienSo, "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        if (hasDeleted) {
            JOptionPane.showMessageDialog(null, "Đã xóa vé thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Không có vé nào được chọn để xóa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_xoaVeThangMouseClicked

    private void xoaVeLuotMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xoaVeLuotMouseClicked
        DefaultTableModel model = (DefaultTableModel) bangVeLuot.getModel();
        boolean hasDeleted = false;

        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            Boolean isSelected = (Boolean) model.getValueAt(i, 0);
            if (isSelected != null && isSelected) { // Kiểm tra checkbox
                String bienSo = (String) model.getValueAt(i, 1);
                boolean isDeleted = ticketDao.delete(bienSo, "DAILY");
                if (isDeleted) {
                    model.removeRow(i);
                    hasDeleted = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Không thể xóa vé: " + bienSo, "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        if (hasDeleted) {
            JOptionPane.showMessageDialog(null, "Đã xóa vé thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Không có vé nào được chọn để xóa.", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_xoaVeLuotMouseClicked

    private void giaHanVeThangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_giaHanVeThangMouseClicked
        DefaultTableModel model = (DefaultTableModel) bangVeThang.getModel();

        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            Boolean isSelected = (Boolean) model.getValueAt(i, 0);
            if (isSelected != null && isSelected) { // Kiểm tra checkbox
                String bienSo = (String) model.getValueAt(i, 1);
                boolean isExtended = false;
                try {
                    isExtended = ticketDao.extendMonthlyTicket(bienSo);
                } catch (SQLException ex) {
                    Logger.getLogger(AdminDashBoard.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(AdminDashBoard.class.getName()).log(Level.SEVERE, null, ex);
                }
                if (isExtended) {
                    JOptionPane.showMessageDialog(this, "Gia hạn thành công", "Thông báo", 2);
                    tableVeThang();
                } else {
                    JOptionPane.showMessageDialog(null, "Không thể xóa vé: " + bienSo, "Lỗi", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }//GEN-LAST:event_giaHanVeThangMouseClicked

    private void init(){
        jPanel1.setBackground(notSelect);
        jPanel2.setBackground(notSelect);
        jPanel3.setBackground(notSelect);
        jPanel4.setBackground(notSelect);
        JPanel5.setBackground(notSelect);
        jPanel6.setBackground(notSelect);
        jPanel7.setBackground(notSelect);
        jPanel7.setBackground(notSelect);
        jPanel8.setBackground(notSelect);
        jPanel9.setBackground(notSelect);
        jPanel1s.setBackground(barNotSelect);
        jPanel2s.setBackground(barNotSelect);
        jPanel3s.setBackground(barNotSelect);
        jPanel4s.setBackground(barNotSelect);
        jPanel5s.setBackground(barNotSelect);
        jPanel6s.setBackground(barNotSelect);
        jPanel7s.setBackground(barNotSelect);
        jPanel8s.setBackground(barNotSelect);
        jPanel2u.setBackground(barNotSelect);
        jPanel3u.setBackground(barNotSelect);
        jPanel4u.setBackground(barNotSelect);
        jPanel5u.setBackground(barNotSelect);
        jPanel6u.setBackground(barNotSelect);
        jPanel7u.setBackground(barNotSelect);
        jPanel8u.setBackground(barNotSelect);
        jPanel1d.setBackground(barNotSelect);
        jPanel2d.setBackground(barNotSelect);
        jPanel3d.setBackground(barNotSelect);
        jPanel4d.setBackground(barNotSelect);
        jPanel5d.setBackground(barNotSelect);
        jPanel6d.setBackground(barNotSelect);
        jPanel7d.setBackground(barNotSelect);
        jPanel8d.setBackground(barNotSelect);
    }
    
    private void initText(){
        Panel2text.setForeground(notSelectText);
        Panel3text.setForeground(notSelectText);
        Panel4text.setForeground(notSelectText);
        Panel5text.setForeground(notSelectText);
        Panel6text.setForeground(notSelectText);
        Panel8text.setForeground(notSelectText);
        Panel9text.setForeground(notSelectText);
        Panel2text.setForeground(notSelectText);
        Panel2text.setFont(font1);
        Panel3text.setFont(font1);
        Panel4text.setFont(font1);
        Panel5text.setFont(font1);
        Panel6text.setFont(font1);
        Panel8text.setFont(font1);
        Panel9text.setFont(font1);
        tongVeThang.setText(String.valueOf(ticketDao.getTotalMonthlyTicket()));
    }
    
    private void initTask(){
        Paneltask2.setVisible(false);
        Paneltask3.setVisible(false);
        Paneltask4.setVisible(false);
        Paneltask5.setVisible(false);
        Paneltask6.setVisible(false);
        Paneltask7.setVisible(false);
        Paneltask7.setVisible(false);
        Paneltask8.setVisible(false);
    }
    
    private void initThongTin(){
        tenDangNhap.setText(u.getUserName());
        tenNguoiDung.setText(u.getFullName());
        sdt.setText(u.getPhoneNumber());
//            int c = u.getShift();
//            if(c == 1) caLam.setText("Sáng");
//            else if(c == 2) caLam.setText("Chiều");
//            else caLam.setText("Tối");
        String gt = u.getGender();
        if (gt.toLowerCase().trim().equals("male")) {
            gtNam.setSelected(true);
        } else {
            gtNu.setSelected(true);
        }
        chucVu.setText("Quản lý");
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FlatLightLaf.setup();
                UIManager.put("TextComponent.arc", 999);
                UIManager.put("Component.arc", 999);
                UIManager.put("Table.alternateRowColor", new java.awt.Color(240, 240, 240));
                System.setProperty("flatlaf.menuBarEmbbedded", "false");
                AdminDashBoard n = new AdminDashBoard();
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
    private javax.swing.JLabel Panel8text;
    private javax.swing.JLabel Panel9text;
    private javax.swing.JPanel PanelTieuDe3;
    private javax.swing.JPanel PanelTieuDe4;
    private javax.swing.JPanel PanelTieuDe5;
    private javax.swing.JPanel PanelTieuDe6;
    public static javax.swing.JPanel Paneltask2;
    private javax.swing.JPanel Paneltask3;
    private javax.swing.JPanel Paneltask4;
    private javax.swing.JPanel Paneltask5;
    private javax.swing.JPanel Paneltask6;
    private javax.swing.JPanel Paneltask7;
    private javax.swing.JPanel Paneltask8;
    private javax.swing.JLabel Search3;
    private javax.swing.JLabel Search4;
    private javax.swing.JLabel Tieude3;
    private javax.swing.JLabel Tieude5;
    private javax.swing.JLabel Tieude6;
    private javax.swing.JLabel Tieude8;
    private javax.swing.JPanel bangGiaVe;
    private javax.swing.JTable bangNguoiDung;
    private javax.swing.JTable bangTimKiem;
    private javax.swing.JTable bangVeLuot;
    public static javax.swing.JTable bangVeThang;
    private javax.swing.JTextField bienSoLanRa;
    private javax.swing.JTextField bienSoLanVao;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel capNhatMatKhau;
    private javax.swing.JPanel capNhatNguoiDung;
    private javax.swing.JPanel chucNang7;
    private javax.swing.JPanel chucNang8;
    private javax.swing.JPanel chucNangPanel3;
    private javax.swing.JPanel chucNangQuanLyNguoiDung;
    private javax.swing.JTextField chucVu;
    private javax.swing.JPanel clearLanRa;
    private javax.swing.JPanel clearLanVao;
    private javax.swing.JPanel clearNguoiDung;
    private javax.swing.JLabel dangChonVeThang;
    private javax.swing.JPanel dangKyVeThang;
    private javax.swing.JPanel doiMatKhau;
    private javax.swing.JPanel giaHanVeThang;
    private javax.swing.JTable giaVe;
    private javax.swing.JTextField gioRa;
    private javax.swing.JTextField gioVaoLanRa;
    private javax.swing.JTextField gioVaoLanVao;
    private javax.swing.JRadioButton gtNam;
    private javax.swing.JRadioButton gtNu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
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
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JPanel jPanel1;
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
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel28;
    private javax.swing.JPanel jPanel2d;
    private javax.swing.JPanel jPanel2s;
    private javax.swing.JPanel jPanel2u;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel31;
    private javax.swing.JPanel jPanel32;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel3d;
    private javax.swing.JPanel jPanel3s;
    private javax.swing.JPanel jPanel3u;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel45;
    private javax.swing.JPanel jPanel48;
    private javax.swing.JPanel jPanel49;
    private javax.swing.JPanel jPanel4d;
    private javax.swing.JPanel jPanel4s;
    private javax.swing.JPanel jPanel4u;
    private javax.swing.JPanel jPanel50;
    private javax.swing.JPanel jPanel51;
    private javax.swing.JPanel jPanel52;
    private javax.swing.JPanel jPanel53;
    private javax.swing.JPanel jPanel5d;
    private javax.swing.JPanel jPanel5s;
    private javax.swing.JPanel jPanel5u;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel69;
    private javax.swing.JPanel jPanel6d;
    private javax.swing.JPanel jPanel6s;
    private javax.swing.JPanel jPanel6u;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel70;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel72;
    private javax.swing.JPanel jPanel73;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel75;
    private javax.swing.JPanel jPanel76;
    private javax.swing.JPanel jPanel77;
    private javax.swing.JPanel jPanel78;
    private javax.swing.JPanel jPanel79;
    private javax.swing.JPanel jPanel7d;
    private javax.swing.JPanel jPanel7s;
    private javax.swing.JPanel jPanel7u;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel80;
    private javax.swing.JPanel jPanel8d;
    private javax.swing.JPanel jPanel8s;
    private javax.swing.JPanel jPanel8u;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPanel jPanel9d;
    private javax.swing.JPanel jPanelBar;
    private javax.swing.JPanel jPanelTask;
    private javax.swing.JPanel jPanelWindow;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTable jTable4;
    private javax.swing.JComboBox<String> loaiXeLanRa;
    private javax.swing.JComboBox<String> loaiXeLanVao;
    private javax.swing.JPanel luuLanVao;
    private javax.swing.JPasswordField matKhauCu;
    private javax.swing.JPasswordField matKhauMoi;
    private javax.swing.JTextField ngayRa;
    private javax.swing.JTextField ngayVaoLanRa;
    private javax.swing.JTextField ngayVaoLanVao;
    private javax.swing.JPanel quanLyNguoiDung;
    private javax.swing.JTextField sdt;
    private javax.swing.JTextField search3text;
    private javax.swing.JTextField search3text1;
    private javax.swing.JPanel suaNguoiDung;
    private javax.swing.JPanel suaVeThang;
    private javax.swing.JPanel task8_doiMatKhau;
    private javax.swing.JPanel task8_thongTin;
    private javax.swing.JTextField tenDangNhap;
    private javax.swing.JTextField tenNguoiDung;
    private javax.swing.JPanel themNguoiDung;
    private javax.swing.JTextField thongBaoLanRa;
    private javax.swing.JTextField thongBaoLanVao;
    private javax.swing.JPanel thongTin;
    private javax.swing.JTextField timKiemBienSo;
    private javax.swing.JComboBox<String> timKiemLoaiVe;
    private javax.swing.JComboBox<String> timKiemLoaiXe;
    private javax.swing.JPanel tinhTien;
    private javax.swing.JLabel tongVeThang;
    private javax.swing.JPasswordField xacNhanMatKhau;
    private javax.swing.JPanel xoaMatKhau;
    private javax.swing.JPanel xoaNguoiDung;
    private javax.swing.JPanel xoaVeLuot;
    private javax.swing.JPanel xoaVeThang;
    // End of variables declaration//GEN-END:variables
}
