package src.frontend.User;

import src.frontend.Admin.AddMonthlyTicket;
import src.frontend.Admin.ModifyTicket;
import src.frontend.Customer.CustomRoundedPanel;
import src.backend.statistic.StatisticDAO;
import src.backend.ticket.Ticket;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.formdev.flatlaf.IntelliJTheme;
import com.formdev.flatlaf.ui.FlatBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import src.backend.ticket.TicketDAO;
import src.backend.users.Users;
import src.backend.vehiclePrice.VehiclePriceDAO;
import src.backend.users.UserDAO;
import src.frontend.User.Login;
import src.backend.enums.ticketTypeEnum;
import src.backend.enums.vehicleTypeEnum;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.jfr.Timestamp;

public class UserDashboard extends javax.swing.JFrame {
    Color notSelect = new Color(240, 240, 240);
    Color select = new Color(255, 255, 255);
    Color barNotSelect = new Color(225, 225, 225);
    Color barSelect = new Color(51, 153, 255);
    Color downSelect = new Color(204, 255, 255);
    Color notSelectText = new Color(153, 153, 153);
    Color warning = new Color(255, 51, 51);
    Color ok = new Color(51, 204, 0);
    int xx, xy;
    Font font1 = new Font("Segoe UI", Font.PLAIN, 18);
    Font font2 = new Font("Segoe UI", Font.BOLD, 18);
    Users u;
    static UserDAO userDao = new UserDAO();
    static VehiclePriceDAO vehicle = new VehiclePriceDAO();
    static StatisticDAO sta = new StatisticDAO();
    public static TicketDAO ticketDao = new TicketDAO();
    public static DefaultTableModel model1, model2, model3, model4, model5, model6;

    public UserDashboard() throws ClassNotFoundException, SQLException {
        try {
            u = UserDAO.getProfile();
        } catch (SQLException ex) {
            Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        FlatLightLaf.setup();
        UIManager.put("TextComponent.arc", 999);
        UIManager.put("Button.arc", 999);
        UIManager.put("Component.arc", 999);
        System.setProperty("flatlaf.menuBarEmbbedded", "false");
        this.setUndecorated(true);
        initComponents();
        init();
        initThongTin();
        tableVeLuot();
        tableVeThang();
        this.setLocationRelativeTo(null);
        log();
        this.setVisible(true);
        tongVe();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelWindow = new javax.swing.JPanel();
        jPanelBar = new javax.swing.JPanel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        ten = new javax.swing.JLabel();
        jPanelTask = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        Panel2text = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        Panel3text = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        Panel4text = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        JPanel5 = new javax.swing.JPanel();
        Panel5text = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        Panel6text = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        Panel9text = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
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
        clearLanVao = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        luuLanVao = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        clearLanRa = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        tinhTien = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        gioRa = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        thongBaoLanRa = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        thongBaoLanVao = new javax.swing.JTextField();
        Paneltask3 = new javax.swing.JPanel();
        PanelTieuDe3 = new javax.swing.JPanel();
        Tieude3 = new javax.swing.JLabel();
        Search3 = new javax.swing.JLabel();
        search3text = new javax.swing.JTextField();
        chucNangPanel3 = new javax.swing.JPanel();
        giaHanVeThang = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel96 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        xoaVeThang = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        suaVeThang = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel95 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        dangKyVeThang = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
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
        jLabel97 = new javax.swing.JLabel();
        jPanel71 = new javax.swing.JPanel();
        jPanel74 = new javax.swing.JPanel();
        PanelTieuDe4 = new javax.swing.JPanel();
        Tieude5 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        tongVeLuot = new javax.swing.JLabel();
        dangChonVeLuot = new javax.swing.JLabel();
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
        thongKeNgayVao = new com.toedter.calendar.JDateChooser();
        thongKeNgayRa = new com.toedter.calendar.JDateChooser();
        thongKeLoaiXe = new javax.swing.JComboBox<>();
        thongKeLoaiVe = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        bangThongKe = new javax.swing.JTable();
        PanelTieuDe6 = new javax.swing.JPanel();
        Tieude8 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        Paneltask8 = new javax.swing.JPanel();
        chucNang8 = new javax.swing.JPanel();
        name = new javax.swing.JLabel();
        task8_thongTin = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        task8_doiMatKhau = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        thongTin = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        capNhatNguoiDung = new javax.swing.JPanel();
        jLabel48 = new javax.swing.JLabel();
        jLabel104 = new javax.swing.JLabel();
        clearNguoiDung = new javax.swing.JPanel();
        jLabel49 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
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
        caLam = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
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
        jLabel107 = new javax.swing.JLabel();
        xoaMatKhau = new javax.swing.JPanel();
        jLabel51 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
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

        jPanelWindow.setBackground(new java.awt.Color(255, 255, 255));
        jPanelWindow.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBar.setBackground(new java.awt.Color(255, 102, 51));
        jPanelBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel110.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setText("Đăng xuất");
        jLabel110.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel110.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel110MouseClicked(evt);
            }
        });
        jPanelBar.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 15, -1, -1));

        jLabel111.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        jLabel111.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel111.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel111MouseClicked(evt);
            }
        });
        jPanelBar.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 15, -1, -1));

        jLabel112.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_1.png"))); // NOI18N
        jLabel112.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel112.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel112MouseClicked(evt);
            }
        });
        jPanelBar.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 15, -1, -1));

        ten.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ten.setForeground(new java.awt.Color(255, 255, 255));
        ten.setText("Nguyen Van Linh");
        ten.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tenMouseClicked(evt);
            }
        });
        jPanelBar.add(ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 15, -1, -1));

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

        jLabel83.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/in and out.png"))); // NOI18N
        jPanel2.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 10, -1, -1));

        jLabel90.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/in and out _blue.png"))); // NOI18N
        jPanel2.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 10, -1, -1));

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
        jPanel3.add(Panel3text, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, -1, -1));

        jLabel79.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ve╠ü tha╠üng.png"))); // NOI18N
        jPanel3.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 10, -1, -1));

        jLabel106.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ve╠ü tha╠üng _blue.png"))); // NOI18N
        jPanel3.add(jLabel106, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 10, -1, -1));

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
        jPanel4.add(Panel4text, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 40, -1, -1));

        jLabel77.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ticket.png"))); // NOI18N
        jPanel4.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 10, -1, -1));

        jLabel78.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ticket _blue.png"))); // NOI18N
        jPanel4.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(33, 10, -1, -1));

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
        JPanel5.add(Panel5text, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 40, -1, -1));

        jLabel68.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search (2).png"))); // NOI18N
        jLabel68.setToolTipText("");
        JPanel5.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel76.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search_blue.png"))); // NOI18N
        jLabel76.setToolTipText("");
        JPanel5.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

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
        jPanel6.add(Panel6text, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 40, -1, -1));

        jLabel62.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tho╠é╠üng ke╠é.png"))); // NOI18N
        jPanel6.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 10, -1, -1));

        jLabel63.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/tho╠é╠üng ke╠é _blue.png"))); // NOI18N
        jPanel6.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 10, -1, -1));

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
        jPanel8.add(Panel9text, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 40, -1, -1));

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        jPanel8.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 10, -1, -1));

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user_blue.png"))); // NOI18N
        jPanel8.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

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

        Paneltask2.add(jPanel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(528, 80, -1, -1));

        jPanel34.setBackground(new java.awt.Color(255, 102, 51));
        jPanel34.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("LÀN RA");
        jPanel34.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Paneltask2.add(jPanel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 450, 80, 40));

        jPanel35.setBackground(new java.awt.Color(255, 102, 51));
        jPanel35.setPreferredSize(new java.awt.Dimension(80, 40));
        jPanel35.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("LÀN VÀO");
        jPanel35.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Paneltask2.add(jPanel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Loại xe");
        Paneltask2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, -1, -1));

        gioVaoLanVao.setEditable(false);
        Paneltask2.add(gioVaoLanVao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 320, 320, 30));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel24.setText("Giờ vào");
        Paneltask2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        loaiXeLanVao.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Ô tô", "Xe máy", "Xe đạp, xe đạp điện" }));
        loaiXeLanVao.setPreferredSize(new java.awt.Dimension(62, 30));
        Paneltask2.add(loaiXeLanVao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, 320, -1));

        bienSoLanRa.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bienSoLanRaFocusGained(evt);
            }
        });
        Paneltask2.add(bienSoLanRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 100, 320, 30));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel25.setText("Biển số");
        Paneltask2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 80, -1, -1));

        ngayVaoLanVao.setEditable(false);
        Paneltask2.add(ngayVaoLanVao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 250, 320, 30));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel26.setText("Ngày vào");
        Paneltask2.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, -1, -1));

        bienSoLanVao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                bienSoLanVaoFocusGained(evt);
            }
        });
        Paneltask2.add(bienSoLanVao, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 320, 30));

        jLabel27.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel27.setText("Biển số");
        Paneltask2.add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, -1, -1));

        jLabel28.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel28.setText("Loại xe");
        Paneltask2.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 160, -1, -1));

        ngayRa.setEditable(false);
        Paneltask2.add(ngayRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 320, 30));

        jLabel29.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel29.setText("Ngày ra");
        Paneltask2.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 230, 230, -1));

        loaiXeLanRa.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Ô tô", "Xe máy", "Xe đạp, xe đạp điện" }));
        loaiXeLanRa.setPreferredSize(new java.awt.Dimension(62, 30));
        Paneltask2.add(loaiXeLanRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 180, 320, -1));

        clearLanVao.setBackground(new java.awt.Color(255, 102, 51));
        clearLanVao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearLanVao = new CustomRoundedPanel(50, 50);
        clearLanVao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearLanVaoMouseClicked(evt);
            }
        });
        clearLanVao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel32.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("XÓA");
        clearLanVao.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        jLabel89.setToolTipText("");
        clearLanVao.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, -1, -1));

        Paneltask2.add(clearLanVao, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 90, 40));

        luuLanVao.setBackground(new java.awt.Color(255, 102, 51));
        luuLanVao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        luuLanVao = new CustomRoundedPanel(50, 50);
        luuLanVao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    luuLanVaoMouseClicked(evt);
                } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        luuLanVao.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setBackground(new java.awt.Color(255, 51, 51));
        jLabel31.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("LƯU");
        luuLanVao.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel88.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/diskette.png"))); // NOI18N
        luuLanVao.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, -1, -1));

        Paneltask2.add(luuLanVao, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 380, 90, 40));

        clearLanRa.setBackground(new java.awt.Color(255, 102, 51));
        clearLanRa.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearLanRa = new CustomRoundedPanel(50, 50);
        clearLanRa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearLanRaMouseClicked(evt);
            }
        });
        clearLanRa.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("XÓA");
        clearLanRa.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, -1));

        jLabel92.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        clearLanRa.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 8, -1, -1));

        Paneltask2.add(clearLanRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 380, 90, 40));

        tinhTien.setBackground(new java.awt.Color(255, 102, 51));
        tinhTien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tinhTien = new CustomRoundedPanel(50, 50);
        tinhTien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    tinhTienMouseClicked(evt);
                } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        tinhTien.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel33.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("TÍNH TIỀN");
        tinhTien.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

        jLabel91.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/money.png"))); // NOI18N
        tinhTien.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Paneltask2.add(tinhTien, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 380, 120, 40));

        gioRa.setEditable(false);
        Paneltask2.add(gioRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 320, 320, 30));

        jLabel36.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel36.setText("Giờ ra");
        Paneltask2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 300, 220, -1));

        jPanel5.setPreferredSize(new java.awt.Dimension(100, 30));

        thongBaoLanRa.setEditable(false);
        thongBaoLanRa.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        thongBaoLanRa.setBorder(null);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(thongBaoLanRa, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(77, Short.MAX_VALUE)));
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(thongBaoLanRa, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));

        Paneltask2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 320, 40));

        jPanel10.setPreferredSize(new java.awt.Dimension(100, 30));

        thongBaoLanVao.setEditable(false);
        thongBaoLanVao.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        thongBaoLanVao.setBorder(null);

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel10Layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addComponent(thongBaoLanVao, javax.swing.GroupLayout.PREFERRED_SIZE, 190,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(74, Short.MAX_VALUE)));
        jPanel10Layout.setVerticalGroup(
                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(thongBaoLanVao, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));

        Paneltask2.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 450, 320, 40));

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

        Search3.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Search3.setText("Tìm kiếm theo biển số:");
        Paneltask3.add(Search3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        search3text.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                try {
                    search3textKeyReleased(evt);
                } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        Paneltask3.add(search3text, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 280, 30));

        chucNangPanel3.setBackground(new java.awt.Color(255, 255, 255));
        chucNangPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        chucNangPanel3.setPreferredSize(new java.awt.Dimension(360, 40));
        chucNangPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        giaHanVeThang.setBackground(new java.awt.Color(255, 255, 255));
        giaHanVeThang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        giaHanVeThang.setPreferredSize(new java.awt.Dimension(91, 37));
        giaHanVeThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    giaHanVeThangMouseClicked(evt);
                } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
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

        jLabel96.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/refresh.png"))); // NOI18N
        giaHanVeThang.add(jLabel96, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 7, -1, -1));

        chucNangPanel3.add(giaHanVeThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 1, -1, -1));

        jPanel13.setBackground(new java.awt.Color(255, 153, 102));
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
        xoaVeThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    xoaVeThangMouseClicked(evt);
                } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        xoaVeThang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("XÓA");
        jLabel2.setPreferredSize(new java.awt.Dimension(52, 16));
        xoaVeThang.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 10, 30, -1));

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        xoaVeThang.add(jLabel94, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 7, -1, -1));

        chucNangPanel3.add(xoaVeThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 1, -1, -1));

        suaVeThang.setBackground(new java.awt.Color(255, 255, 255));
        suaVeThang.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        suaVeThang.setPreferredSize(new java.awt.Dimension(80, 37));
        suaVeThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    suaVeThangMouseClicked(evt);
                } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        suaVeThang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("SỬA");
        jLabel3.setPreferredSize(new java.awt.Dimension(52, 16));
        suaVeThang.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 10, 30, -1));

        jLabel95.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        suaVeThang.add(jLabel95, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 7, -1, -1));

        chucNangPanel3.add(suaVeThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 1, -1, -1));

        jPanel16.setBackground(new java.awt.Color(255, 153, 102));
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

        jPanel17.setBackground(new java.awt.Color(255, 153, 102));
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

        jPanel18.setBackground(new java.awt.Color(255, 153, 102));
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
        dangKyVeThang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dangKyVeThangMouseClicked(evt);
            }
        });
        dangKyVeThang.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("ĐĂNG KÝ");
        jLabel1.setPreferredSize(new java.awt.Dimension(52, 16));
        dangKyVeThang.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 70, -1));

        jLabel93.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/notes.png"))); // NOI18N
        dangKyVeThang.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 7, -1, -1));

        chucNangPanel3.add(dangKyVeThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        jPanel20.setBackground(new java.awt.Color(255, 153, 102));
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

        jPanel21.setBackground(new java.awt.Color(255, 153, 102));
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

        jPanel22.setBackground(new java.awt.Color(255, 153, 102));
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

        Paneltask3.add(chucNangPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 90, -1, -1));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jScrollPane1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseMoved(evt);
            }
        });

        bangVeThang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bangVeThang.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Chọn", "Biển Số", "Ngày Kích Hoạt", "Ngày Hết Hạn", "Loại Xe", "Giá Vé"
                }) {
            boolean[] canEdit = new boolean[] {
                    true, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        JTableHeader header = bangVeThang.getTableHeader();
        header.setFont(new Font("Segoe UI", Font.BOLD, 16));
        header.setBackground(Color.WHITE);
        DefaultTableCellRenderer headerRenderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
        headerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        for (int i = 0; i < bangVeThang.getColumnCount(); i++) {
            bangVeThang.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
        }
        bangVeThang.setFont(new Font("Segoe UI", Font.PLAIN, 14)); // Đặt font chữ cho bảng
        bangVeThang.setRowHeight(30);
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
        Paneltask3.add(tongVeThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 10, -1));

        dangChonVeThang.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dangChonVeThang.setText("0");
        Paneltask3.add(dangChonVeThang, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, -1, -1));

        jPanelWindow.add(Paneltask3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        Paneltask4.setBackground(new java.awt.Color(255, 255, 255));
        Paneltask4.setPreferredSize(new java.awt.Dimension(1110, 510));
        Paneltask4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane5.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jScrollPane5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jScrollPane5MouseMoved(evt);
            }
        });

        bangVeLuot.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        bangVeLuot.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Chọn", "Biển Số", "Thời Gian Vào", "Loại Xe"
                }) {
            boolean[] canEdit = new boolean[] {
                    true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        JTableHeader header2 = bangVeLuot.getTableHeader();
        header2.setFont(new Font("Segoe UI", Font.BOLD, 16));
        header2.setBackground(Color.WHITE);
        DefaultTableCellRenderer headerRenderer2 = (DefaultTableCellRenderer) header2.getDefaultRenderer();
        headerRenderer2.setHorizontalAlignment(SwingConstants.CENTER);

        DefaultTableCellRenderer centerRenderer2 = new DefaultTableCellRenderer();
        centerRenderer2.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < bangVeLuot.getColumnCount(); i++) {
            bangVeLuot.getColumnModel().getColumn(i).setCellRenderer(centerRenderer2);
        }

        bangVeLuot.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        bangVeLuot.setRowHeight(30);
        jScrollPane5.setViewportView(bangVeLuot);

        Paneltask4.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 1030, 280));

        Search4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        Search4.setText("Tìm kiếm theo biển số:");
        Paneltask4.add(Search4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));

        search3text1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                try {
                    search3text1KeyReleased(evt);
                } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        Paneltask4.add(search3text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 100, 280, 30));

        jPanel50.setBackground(new java.awt.Color(255, 255, 255));
        jPanel50.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        jPanel50.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        xoaVeLuot.setBackground(new java.awt.Color(255, 255, 255));
        xoaVeLuot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        xoaVeLuot.setPreferredSize(new java.awt.Dimension(80, 37));
        xoaVeLuot.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    xoaVeLuotMouseClicked(evt);
                } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        xoaVeLuot.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel67.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel67.setText("XÓA");
        jLabel67.setPreferredSize(new java.awt.Dimension(52, 16));
        xoaVeLuot.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 10, 30, -1));

        jLabel97.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        xoaVeLuot.add(jLabel97, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 7, -1, -1));

        jPanel50.add(xoaVeLuot, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

        jPanel71.setBackground(new java.awt.Color(255, 153, 102));
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

        jPanel74.setBackground(new java.awt.Color(255, 153, 102));
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

        Paneltask4.add(jPanel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(987, 90, -1, -1));

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

        tongVeLuot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tongVeLuot.setText("0");
        Paneltask4.add(tongVeLuot, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 10, -1));

        dangChonVeLuot.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        dangChonVeLuot.setText("0");
        Paneltask4.add(dangChonVeLuot, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, -1, -1));

        jPanelWindow.add(Paneltask4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        Paneltask5.setBackground(new java.awt.Color(255, 255, 255));
        Paneltask5.setPreferredSize(new java.awt.Dimension(1110, 510));
        Paneltask5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Paneltask5.add(timKiemBienSo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 320, 30));

        jLabel69.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel69.setText("Biển số");
        Paneltask5.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, -1, -1));

        jLabel75.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel75.setText("Loại xe");
        Paneltask5.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        jLabel86.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel86.setText("Loại vé");
        Paneltask5.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, -1, -1));

        timKiemLoaiVe.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả loại vé", "Vé lượt", "Vé tháng" }));
        timKiemLoaiVe.setPreferredSize(new java.awt.Dimension(62, 30));
        Paneltask5.add(timKiemLoaiVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 320, -1));

        bangTimKiem.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Biển số", "Loại vé", "Loại xe", "Giờ vào", "Giờ ra"
                }) {
            boolean[] canEdit = new boolean[] {
                    false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        JTableHeader header3 = bangTimKiem.getTableHeader();
        header3.setFont(new Font("Segoe UI", Font.BOLD, 16));
        header3.setBackground(Color.WHITE);
        DefaultTableCellRenderer headerRenderer3 = (DefaultTableCellRenderer) header3.getDefaultRenderer();
        headerRenderer3.setHorizontalAlignment(SwingConstants.CENTER);

        DefaultTableCellRenderer centerRenderer3 = new DefaultTableCellRenderer();
        centerRenderer3.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < bangTimKiem.getColumnCount(); i++) {
            bangTimKiem.getColumnModel().getColumn(i).setCellRenderer(centerRenderer3);
        }

        bangTimKiem.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        bangTimKiem.setRowHeight(30);
        jScrollPane6.setViewportView(bangTimKiem);

        Paneltask5.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 100, 540, 380));

        jButton1.setBackground(new java.awt.Color(255, 102, 51));
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

        jButton2.setBackground(new java.awt.Color(255, 102, 51));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Tìm kiếm");
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
                    jButton2ActionPerformed(evt);
                } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        Paneltask5.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        timKiemLoaiXe.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Tất cả loại xe", "Ô tô", "Xe máy", "Xe đạp, xe đạp điện" }));
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

        thongKeNgayVao.setBackground(new java.awt.Color(255, 255, 255));
        thongKeNgayVao.setPreferredSize(new java.awt.Dimension(160, 30));
        jPanel26.add(thongKeNgayVao, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        thongKeNgayRa.setBackground(new java.awt.Color(255, 255, 255));
        thongKeNgayRa.setPreferredSize(new java.awt.Dimension(160, 30));
        jPanel26.add(thongKeNgayRa, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, -1));

        thongKeLoaiXe.setModel(new javax.swing.DefaultComboBoxModel<>(
                new String[] { "Tất cả loại xe", "Ô tô", "Xe máy", "Xe đạp điện, xe đạp" }));
        thongKeLoaiXe.setPreferredSize(new java.awt.Dimension(90, 30));
        jPanel26.add(thongKeLoaiXe, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 80, 110, -1));

        thongKeLoaiVe.setModel(
                new javax.swing.DefaultComboBoxModel<>(new String[] { "Tất cả loại vé", "Vé tháng", "Vé lượt" }));
        thongKeLoaiVe.setPreferredSize(new java.awt.Dimension(90, 30));
        jPanel26.add(thongKeLoaiVe, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 120, -1));

        bangThongKe.setModel(new javax.swing.table.DefaultTableModel(
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
        JTableHeader header4 = bangThongKe.getTableHeader();
        header4.setFont(new Font("Segoe UI", Font.BOLD, 16));
        header4.setBackground(Color.WHITE);
        DefaultTableCellRenderer headerRenderer4 = (DefaultTableCellRenderer) header4.getDefaultRenderer();
        headerRenderer4.setHorizontalAlignment(SwingConstants.CENTER);

        DefaultTableCellRenderer centerRenderer4 = new DefaultTableCellRenderer();
        centerRenderer4.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < bangThongKe.getColumnCount(); i++) {
            bangThongKe.getColumnModel().getColumn(i).setCellRenderer(centerRenderer4);
        }

        bangThongKe.setFont(new Font("Segoe UI", Font.PLAIN, 14));
        bangThongKe.setRowHeight(30);
        jScrollPane2.setViewportView(bangThongKe);

        jPanel26.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 1040, 340));

        PanelTieuDe6.setBackground(new java.awt.Color(255, 255, 255));
        PanelTieuDe6.setPreferredSize(new java.awt.Dimension(1110, 60));
        PanelTieuDe6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Tieude8.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        Tieude8.setForeground(new java.awt.Color(255, 153, 102));
        Tieude8.setText("THỐNG KÊ");
        PanelTieuDe6.add(Tieude8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jPanel26.add(PanelTieuDe6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton3.setBackground(new java.awt.Color(255, 102, 51));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Thống Kê");
        jButton3.setBorderPainted(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setPreferredSize(new java.awt.Dimension(87, 30));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel26.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 80, 90, -1));

        Paneltask6.add(jPanel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 510));

        jPanelWindow.add(Paneltask6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, -1, -1));

        Paneltask8.setBackground(new java.awt.Color(255, 255, 255));
        Paneltask8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        chucNang8.setBackground(new java.awt.Color(255, 204, 153));
        chucNang8.setPreferredSize(new java.awt.Dimension(280, 510));
        chucNang8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        name.setText("ADMIN");
        chucNang8.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, -1, -1));

        task8_thongTin.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        task8_thongTin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        task8_thongTin = new CustomRoundedPanel(50, 50);
        task8_thongTin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                task8_thongTinMouseClicked(evt);
            }
        });
        task8_thongTin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("THÔNG TIN");
        task8_thongTin.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 15, 90, -1));

        jLabel102.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        task8_thongTin.add(jLabel102, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, 28));

        chucNang8.add(task8_thongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, 230, 50));

        task8_doiMatKhau.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        task8_doiMatKhau.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        task8_doiMatKhau = new CustomRoundedPanel(50, 50);
        task8_doiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                task8_doiMatKhauMouseClicked(evt);
            }
        });
        task8_doiMatKhau.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("ĐỔI MẬT KHẨU");
        task8_doiMatKhau.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 15, 110, -1));

        jLabel103.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/key.png"))); // NOI18N
        task8_doiMatKhau.add(jLabel103, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 30, 28));

        chucNang8.add(task8_doiMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 230, 50));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/ava.png"))); // NOI18N
        chucNang8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, -1, -1));

        Paneltask8.add(chucNang8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        thongTin.setBackground(new java.awt.Color(255, 255, 255));
        thongTin.setPreferredSize(new java.awt.Dimension(830, 510));
        thongTin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel8.setText("THÔNG TIN");
        thongTin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("THÔNG TIN NGƯỜI DÙNG");
        thongTin.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/user.png"))); // NOI18N
        thongTin.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, -1, -1));

        capNhatNguoiDung.setBackground(new java.awt.Color(255, 102, 51));
        capNhatNguoiDung = new CustomRoundedPanel(50, 50);
        capNhatNguoiDung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    capNhatNguoiDungMouseClicked(evt);
                } catch (HeadlessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        capNhatNguoiDung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel48.setBackground(new java.awt.Color(255, 255, 255));
        jLabel48.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setText("CẬP NHẬT");
        capNhatNguoiDung.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 12, -1, -1));

        jLabel104.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/diskette.png"))); // NOI18N
        capNhatNguoiDung.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 8, -1, -1));

        thongTin.add(capNhatNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, 120, 40));

        clearNguoiDung.setBackground(new java.awt.Color(255, 102, 51));
        clearNguoiDung = new CustomRoundedPanel(50, 50);
        clearNguoiDung.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clearNguoiDungMouseClicked(evt);
            }
        });
        clearNguoiDung.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel49.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setText("XÓA");
        clearNguoiDung.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(48, 12, -1, -1));

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete copy 2.png"))); // NOI18N
        clearNguoiDung.add(jLabel105, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 8, -1, -1));

        thongTin.add(clearNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, 90, 40));

        jLabel80.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel80.setText("Tên đăng nhập");
        thongTin.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        tenDangNhap.setEditable(false);
        tenDangNhap.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tenDangNhap.setPreferredSize(new java.awt.Dimension(65, 30));
        thongTin.add(tenDangNhap, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 310, -1));

        jLabel81.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel81.setText("Tên người dùng");
        thongTin.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        tenNguoiDung.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tenNguoiDung.setPreferredSize(new java.awt.Dimension(65, 30));
        thongTin.add(tenNguoiDung, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 240, 310, -1));

        sdt.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        sdt.setPreferredSize(new java.awt.Dimension(65, 30));
        thongTin.add(sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 310, 310, -1));

        jLabel82.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel82.setText("Số điện thoại");
        thongTin.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jLabel84.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel84.setText("Giới tính");
        thongTin.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, -1, -1));

        chucVu.setEditable(false);
        chucVu.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        chucVu.setPreferredSize(new java.awt.Dimension(65, 30));
        thongTin.add(chucVu, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 170, 310, -1));

        jLabel85.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel85.setText("Chức vụ");
        thongTin.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 140, -1, -1));

        gtNam.setBackground(new java.awt.Color(255, 255, 255));
        gtNam.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gtNam.setText("Nam");
        thongTin.add(gtNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, -1, -1));

        gtNu.setBackground(new java.awt.Color(255, 255, 255));
        gtNu.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        gtNu.setText("Nữ");
        thongTin.add(gtNu, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 240, -1, -1));

        caLam.setEditable(false);
        caLam.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        caLam.setPreferredSize(new java.awt.Dimension(65, 30));
        thongTin.add(caLam, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 310, 310, -1));

        jLabel87.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel87.setText("Ca làm");
        thongTin.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, -1, -1));

        Paneltask8.add(thongTin, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, -1, -1));

        doiMatKhau.setBackground(new java.awt.Color(255, 255, 255));
        doiMatKhau.setPreferredSize(new java.awt.Dimension(830, 510));
        doiMatKhau.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel12.setText("TÀI KHOẢN");
        doiMatKhau.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 30, -1, -1));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel13.setText("ĐỔI MẬT KHẨU");
        doiMatKhau.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 100, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/key.png"))); // NOI18N
        doiMatKhau.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));
        doiMatKhau.add(matKhauCu, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, 580, 30));
        doiMatKhau.add(matKhauMoi, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 580, 30));
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

        capNhatMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        capNhatMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        capNhatMatKhau = new CustomRoundedPanel(50, 50);
        capNhatMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                try {
                    capNhatMatKhauMouseClicked(evt);
                } catch (ClassNotFoundException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (SQLException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        });
        capNhatMatKhau.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel50.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setText("CẬP NHẬT");
        capNhatMatKhau.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 12, -1, -1));

        jLabel107.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/diskette.png"))); // NOI18N
        capNhatMatKhau.add(jLabel107, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        doiMatKhau.add(capNhatMatKhau, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 130, 40));

        xoaMatKhau.setForeground(new java.awt.Color(255, 255, 255));
        xoaMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        xoaMatKhau = new CustomRoundedPanel(50, 50);
        xoaMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xoaMatKhauMouseClicked(evt);
            }
        });
        xoaMatKhau.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel51.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setText("XÓA");
        xoaMatKhau.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 12, -1, -1));

        jLabel108.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/delete.png"))); // NOI18N
        xoaMatKhau.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

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

    public void log() {
        init();
        initText();
        initTask();
        initIconAdmin();
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
        jLabel83.setVisible(false);
        jLabel90.setVisible(true);
        Paneltask2.setVisible(true);
        Paneltask3.setVisible(false);
        Paneltask4.setVisible(false);
        Paneltask5.setVisible(false);
        Paneltask6.setVisible(false);
        Paneltask8.setVisible(false);
    }

    public void ThongTin() {
        init();
        initText();
        initTask();
        initIconAdmin();
        jPanel8.setBackground(select);
        jPanel8u.setBackground(barSelect);
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
        jLabel21.setVisible(false);
        jLabel58.setVisible(true);
        thongTin.setVisible(true);
        doiMatKhau.setVisible(false);
    }

    public static void tableThongKe() throws ClassNotFoundException, SQLException {
        java.util.Date st = thongKeNgayVao.getDate();
        java.util.Date end = thongKeNgayRa.getDate();
        java.sql.Date startTime = new java.sql.Date(st.getTime());
        java.sql.Date endTime = new java.sql.Date(end.getTime());
        String loaiXe = thongKeLoaiXe.getSelectedItem().toString();
        vehicleTypeEnum xe = null;
        if (loaiXe.equals("Ô tô")) {
            xe = vehicleTypeEnum.CAR;
        } else if (loaiXe.equals("Xe máy")) {
            xe = vehicleTypeEnum.MOTORBIKE;
        } else if (loaiXe.equals("Xe đạp, xe đạp điện")) {
            xe = vehicleTypeEnum.BIKE;
        }
        String loaiVe = thongKeLoaiVe.getSelectedItem().toString();
        ticketTypeEnum ve = null;
        if (loaiVe.equals("Vé tháng")) {
            ve = ticketTypeEnum.MONTHLY;
        } else if (loaiVe.equals("Vé lượt")) {
            ve = ticketTypeEnum.DAILY;
        }
        sta.calculateStatistic(bangThongKe, startTime, endTime, ve, xe);
        model4 = (DefaultTableModel) bangThongKe.getModel();
    }

    private void tableTimKiem() throws ClassNotFoundException, SQLException {
        String bienSo = timKiemBienSo.getText();
        String loaiVe = "";
        if (timKiemLoaiVe.getSelectedItem().toString().equals("Vé tháng")) {
            loaiVe = "MONTHLY";
        } else if (timKiemLoaiVe.getSelectedItem().toString().equals("Vé lượt")) {
            loaiVe = "DAILY";
        }
        String loaiXe = "";
        if (timKiemLoaiXe.getSelectedItem().toString().equals("Ô tô")) {
            loaiXe = "CAR";
        } else if (timKiemLoaiXe.getSelectedItem().toString().equals("Xe máy")) {
            loaiXe = "MOTORBIKE";
        } else if (timKiemLoaiXe.getSelectedItem().toString().equals("Xe đạp, xe đạp điện")) {
            loaiXe = "BIKE";
        }
        ticketDao.searchTicket(bangTimKiem, bienSo, loaiVe, loaiXe);
        model3 = (DefaultTableModel) bangTimKiem.getModel();
    }

    public static void tableVeLuot() throws ClassNotFoundException, SQLException {
        model2 = new DefaultTableModel(new Object[] { "Chọn", "Biển số", "Thời gian vào", "Loại xe" }, 0) {
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

    public static void tableVeThang() throws ClassNotFoundException, SQLException {
        model1 = new DefaultTableModel(
                new Object[] { "Chọn", "Biển số", "Ngày kích hoạt", "Ngày hết hạn", "Loại xe", "Giá vé" }, 0) {
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

    private void jLabel110MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel110MouseClicked
        int a = JOptionPane.showOptionDialog(
                null,
                "Bạn có muốn đăng xuất này không?",
                "Thông báo",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[] { "Có", "Hủy" },
                "Hủy");
        if (a == 0) {
            Login n = new Login();
            n.setLocationRelativeTo(null);
            n.setVisible(true);
            this.dispose();
        }
    }// GEN-LAST:event_jLabel110MouseClicked

    private void jLabel111MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel111MouseClicked
        int a = JOptionPane.showOptionDialog(
                null,
                "Bạn có muốn đăng xuất này không?",
                "Thông báo",
                JOptionPane.OK_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[] { "Có", "Hủy" },
                "Hủy");
        if (a == 0) {
            Login n = new Login();
            n.setLocationRelativeTo(null);
            n.setVisible(true);
            this.dispose();
        }
    }// GEN-LAST:event_jLabel111MouseClicked

    private void jLabel112MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel112MouseClicked
        ThongTin();
    }// GEN-LAST:event_jLabel112MouseClicked

    private void tenMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_tenMouseClicked
        ThongTin();
    }// GEN-LAST:event_tenMouseClicked

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel2MouseClicked
        init();
        initText();
        initTask();
        initIconAdmin();
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
        jLabel83.setVisible(false);
        jLabel90.setVisible(true);
    }// GEN-LAST:event_jPanel2MouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel3MouseClicked
        init();
        initText();
        initTask();
        initIconAdmin();
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
        jLabel79.setVisible(false);
        jLabel106.setVisible(true);
    }// GEN-LAST:event_jPanel3MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel4MouseClicked
        init();
        initText();
        initTask();
        initIconAdmin();
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
        jLabel77.setVisible(false);
        jLabel78.setVisible(true);
    }// GEN-LAST:event_jPanel4MouseClicked

    private void JPanel5MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_JPanel5MouseClicked
        init();
        initText();
        initTask();
        initIconAdmin();
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
        jLabel68.setVisible(false);
        jLabel76.setVisible(true);
    }// GEN-LAST:event_JPanel5MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel6MouseClicked
        init();
        initText();
        initTask();
        initIconAdmin();
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
        jLabel62.setVisible(false);
        jLabel63.setVisible(true);
    }// GEN-LAST:event_jPanel6MouseClicked

    private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel8MouseClicked
        init();
        initText();
        initTask();
        initIconAdmin();
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
        jLabel21.setVisible(false);
        jLabel58.setVisible(true);
        thongTin.setVisible(true);
        doiMatKhau.setVisible(false);
    }// GEN-LAST:event_jPanel8MouseClicked

    private void bienSoLanRaFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_bienSoLanRaFocusGained
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date today = new Date();
        String formattedDate = dateFormat.format(today);
        ngayRa.setText(formattedDate);
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        Date now = new Date();
        String formattedTime = timeFormat.format(now);
        gioRa.setText(formattedTime);
    }// GEN-LAST:event_bienSoLanRaFocusGained

    private void bienSoLanVaoFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_bienSoLanVaoFocusGained
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date today = new Date();
        String formattedDate = dateFormat.format(today);
        ngayVaoLanVao.setText(formattedDate);
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
        Date now = new Date();
        String formattedTime = timeFormat.format(now);
        gioVaoLanVao.setText(formattedTime);
    }// GEN-LAST:event_bienSoLanVaoFocusGained

    private void clearLanVaoMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_clearLanVaoMouseClicked
        bienSoLanVao.setText("");
        loaiXeLanVao.setSelectedItem("Ô tô");
        ngayVaoLanVao.setText("");
        gioVaoLanVao.setText("");
        thongBaoLanVao.setText("");
    }// GEN-LAST:event_clearLanVaoMouseClicked

    private void luuLanVaoMouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {// GEN-FIRST:event_luuLanVaoMouseClicked
        String bienSo = bienSoLanVao.getText();
        String x = loaiXeLanVao.getSelectedItem().toString();
        vehicleTypeEnum loaiXe;
        if (x.equals("Ô tô")) {
            loaiXe = vehicleTypeEnum.CAR;
        } else if (x.equals("Xe máy")) {
            loaiXe = vehicleTypeEnum.MOTORBIKE;
        } else {
            loaiXe = vehicleTypeEnum.BIKE;
        }
        if (bienSo.isEmpty()) {
            thongBaoLanVao.setForeground(warning);
            thongBaoLanVao.setText("Hãy nhập biển số");
        } else if (ticketDao.isMonthlyTicket(bienSo)) {
            thongBaoLanVao.setForeground(ok);
            thongBaoLanVao.setText("Vé tháng");
        } else if (ticketDao.isInside(bienSo)) {
            thongBaoLanVao.setForeground(warning);
            thongBaoLanVao.setText("Biển số đã tồn tại");
        } else {
            Ticket t = new Ticket(bienSo, loaiXe);
            try {
                ticketDao.addDailyTicket(t);
            } catch (SQLException ex) {
                Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
            thongBaoLanVao.setForeground(ok);
            thongBaoLanVao.setText("Thành công");
        }
        tableVeLuot();
    }// GEN-LAST:event_luuLanVaoMouseClicked

    private void clearLanRaMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_clearLanRaMouseClicked
        bienSoLanRa.setText("");
        loaiXeLanRa.setSelectedItem("Ô tô");
        ngayRa.setText("");
        gioRa.setText("");
        thongBaoLanRa.setText("");
    }// GEN-LAST:event_clearLanRaMouseClicked

    private void tinhTienMouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {// GEN-FIRST:event_tinhTienMouseClicked
        String bienSo = bienSoLanRa.getText();
        String x = loaiXeLanRa.getSelectedItem().toString();
        vehicleTypeEnum loaiXe;
        if (x.equals("Ô tô")) {
            loaiXe = vehicleTypeEnum.CAR;
        } else if (x.equals("Xe máy")) {
            loaiXe = vehicleTypeEnum.MOTORBIKE;
        } else {
            loaiXe = vehicleTypeEnum.BIKE;
        }
        ticketDao.changeTicketType();

        if (bienSo.isEmpty()) {
            thongBaoLanRa.setForeground(warning);
            thongBaoLanRa.setText("Hãy nhập biển số");
        } else if (ticketDao.isMonthlyTicket(bienSo)) {
            thongBaoLanRa.setForeground(ok);
            thongBaoLanRa.setText("Vé tháng");
        } else if (!ticketDao.isPlateNumberExist2(bienSo)) {
            thongBaoLanRa.setForeground(warning);
            thongBaoLanRa.setText("Vé không tồn tại");
        } else {
            try {
                ticketDao.calculateDailyPrice(bienSo);
                thongBaoLanRa.setForeground(ok);
                thongBaoLanRa.setText(String.valueOf(ticketDao.getPrice(bienSo)));
            } catch (SQLException ex) {
                Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        tableVeLuot();
    }// GEN-LAST:event_tinhTienMouseClicked

    private void search3textKeyReleased(java.awt.event.KeyEvent evt) throws ClassNotFoundException, SQLException {// GEN-FIRST:event_search3textKeyReleased
        model1 = new DefaultTableModel(
                new Object[] { "Chọn", "Biển số", "Ngày kích hoạt", "Ngày hết hạn", "Loại xe", "Giá vé" }, 0) {
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
    }// GEN-LAST:event_search3textKeyReleased

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel4MouseClicked

    }// GEN-LAST:event_jLabel4MouseClicked

    private void giaHanVeThangMouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {// GEN-FIRST:event_giaHanVeThangMouseClicked
        DefaultTableModel model = (DefaultTableModel) bangVeThang.getModel();
        boolean check = false, ok = false;
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            Boolean isSelected = (Boolean) model.getValueAt(i, 0);
            if (isSelected != null && isSelected) {
                check = true; // Đã có checkbox được chọn
                String bienSo = (String) model.getValueAt(i, 1);
                if (ticketDao.extend(bienSo)) {
                    tableVeThang();
                    ok = true;
                }
            }
        }
        if (ok) {
            JOptionPane.showMessageDialog(this, "Gia hạn thành công", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        } else if (!check) {
            JOptionPane.showMessageDialog(this, "Xin hãy chọn vé", "Thông báo", JOptionPane.WARNING_MESSAGE);
        }
    }// GEN-LAST:event_giaHanVeThangMouseClicked

    private void xoaVeThangMouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {// GEN-FIRST:event_xoaVeThangMouseClicked
        DefaultTableModel model = (DefaultTableModel) bangVeThang.getModel();
        boolean hasDeleted = false, ok = false;

        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            Boolean isSelected = (Boolean) model.getValueAt(i, 0);
            if (isSelected != null && isSelected) { // Kiểm tra checkbox
                ok = true;
                String bienSo = (String) model.getValueAt(i, 1);
                boolean isDeleted = ticketDao.delete(bienSo, "MONTHLY");
                if (isDeleted) {
                    model.removeRow(i);
                    hasDeleted = true;
                }
            }
        }

        if (hasDeleted) {
            JOptionPane.showMessageDialog(null, "Đã xóa vé thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        if (!ok) {
            JOptionPane.showMessageDialog(null, "Không có vé nào được chọn để xóa.", "Thông báo",
                    JOptionPane.WARNING_MESSAGE);
        }
        tongVe();
    }// GEN-LAST:event_xoaVeThangMouseClicked

    private void suaVeThangMouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {// GEN-FIRST:event_suaVeThangMouseClicked
        DefaultTableModel model = (DefaultTableModel) bangVeThang.getModel();
        int c = 0, j = 0;
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            Boolean isSelected = (Boolean) model.getValueAt(i, 0);
            if (isSelected != null && isSelected) {
                c++;
                j = i;
            }
        }
        if (c != 1) {
            JOptionPane.showMessageDialog(this, "Hãy chọn vé bạn muốn sửa", "Thông báo", JOptionPane.WARNING_MESSAGE);
        } else {
            ModifyTicket n = new ModifyTicket();
            n.jTextField1.setText(model.getValueAt(j, 1).toString());
            n.jComboBox1.setSelectedItem(model.getValueAt(j, 4));
            n.jDateChooser1.setDate((Date) model.getValueAt(j, 3));
            n.b = model.getValueAt(j, 1).toString();
            n.time = (java.sql.Timestamp) model.getValueAt(j, 2);
        }
        tableVeThang();
    }// GEN-LAST:event_suaVeThangMouseClicked

    private void dangKyVeThangMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_dangKyVeThangMouseClicked
        new AddMonthlyTicket().setVisible(true);
    }// GEN-LAST:event_dangKyVeThangMouseClicked

    private void jScrollPane1MouseMoved(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jScrollPane1MouseMoved
        DefaultTableModel model = (DefaultTableModel) bangVeThang.getModel();
        int c = 0;
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            Boolean isSelected = (Boolean) model.getValueAt(i, 0);
            if (isSelected != null && isSelected) {
                c++;
            }
        }
        dangChonVeThang.setText(String.valueOf(c));
    }// GEN-LAST:event_jScrollPane1MouseMoved

    private void jScrollPane5MouseMoved(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jScrollPane5MouseMoved
        DefaultTableModel model = (DefaultTableModel) bangVeLuot.getModel();
        int c = 0;
        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            Boolean isSelected = (Boolean) model.getValueAt(i, 0);
            if (isSelected != null && isSelected) {
                c++;
            }
        }
        dangChonVeLuot.setText(String.valueOf(c));
    }// GEN-LAST:event_jScrollPane5MouseMoved

    private void search3text1KeyReleased(java.awt.event.KeyEvent evt) throws ClassNotFoundException, SQLException {// GEN-FIRST:event_search3text1KeyReleased
        model2 = new DefaultTableModel(new Object[] { "Chọn", "Biển số", "Thời gian vào", "Loại xe" }, 0) {
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
    }// GEN-LAST:event_search3text1KeyReleased

    private void xoaVeLuotMouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {// GEN-FIRST:event_xoaVeLuotMouseClicked
        DefaultTableModel model = (DefaultTableModel) bangVeLuot.getModel();
        boolean hasDeleted = false, ok = false;

        for (int i = model.getRowCount() - 1; i >= 0; i--) {
            Boolean isSelected = (Boolean) model.getValueAt(i, 0);
            if (isSelected != null && isSelected) {
                ok = true;
                String bienSo = (String) model.getValueAt(i, 1);
                boolean isDeleted = ticketDao.delete(bienSo, "DAILY");
                if (isDeleted) {
                    model.removeRow(i);
                    hasDeleted = true;
                }
            }
        }
        if (hasDeleted) {
            JOptionPane.showMessageDialog(null, "Đã xóa vé thành công.", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        }
        if (!ok) {
            JOptionPane.showMessageDialog(null, "Không có vé nào được chọn để xóa.", "Thông báo",
                    JOptionPane.WARNING_MESSAGE);
        }
        tongVe();
    }// GEN-LAST:event_xoaVeLuotMouseClicked

    private void tongVe() throws ClassNotFoundException, SQLException {
        tongVeThang.setText(String.valueOf(ticketDao.getTotalMonthlyTicket()));
        tongVeLuot.setText(String.valueOf(ticketDao.getTotalDailyTicket()));
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        timKiemBienSo.setText("");
        timKiemLoaiVe.setSelectedItem("Tất cả loại xe");
        timKiemLoaiVe.setSelectedItem("Tất cả loại vé");
        model3.setRowCount(0);
    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws ClassNotFoundException, SQLException {// GEN-FIRST:event_jButton2ActionPerformed
        tableTimKiem();
    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed
        model4 = (DefaultTableModel) bangThongKe.getModel();
        model4.setRowCount(0);
        if (thongKeNgayVao.getDate() == null || thongKeNgayRa.getDate() == null)
            JOptionPane.showMessageDialog(this, "Hãy chọn ngày bạn muốn thống kê", "Thông báo", 2);
        else {
            try {
                tableThongKe();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }// GEN-LAST:event_jButton3ActionPerformed

    private void task8_thongTinMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_task8_thongTinMouseClicked
        thongTin.setVisible(true);
        doiMatKhau.setVisible(false);
        initThongTin();
    }// GEN-LAST:event_task8_thongTinMouseClicked

    private void task8_doiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_task8_doiMatKhauMouseClicked
        doiMatKhau.setVisible(true);
        thongTin.setVisible(false);
    }// GEN-LAST:event_task8_doiMatKhauMouseClicked

    private void capNhatNguoiDungMouseClicked(java.awt.event.MouseEvent evt)
            throws HeadlessException, ClassNotFoundException {// GEN-FIRST:event_capNhatNguoiDungMouseClicked
        String phoneNumber = sdt.getText();
        if (tenNguoiDung.getText().isEmpty() || sdt.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ dữ liệu", "Thông báo", 2);
        } else if (userDao.isPhoneExist(phoneNumber, u.getId())) {
            JOptionPane.showMessageDialog(this, "Số điện thoại này đã được đăng ký", "Thông báo", 2);
        } else {
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
                Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }// GEN-LAST:event_capNhatNguoiDungMouseClicked

    private void clearNguoiDungMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_clearNguoiDungMouseClicked
        tenNguoiDung.setText("");
        sdt.setText("");
    }// GEN-LAST:event_clearNguoiDungMouseClicked

    private void capNhatMatKhauMouseClicked(java.awt.event.MouseEvent evt) throws ClassNotFoundException, SQLException {// GEN-FIRST:event_capNhatMatKhauMouseClicked
        int id = u.getId();
        String oldPass = new String(matKhauCu.getPassword());
        String newPass = new String(matKhauMoi.getPassword());
        String cfPass = new String(xacNhanMatKhau.getPassword());
        String pass = userDao.getPasswordById(id);

        if (checkMatKhau(oldPass, newPass, cfPass, pass)) {
            try {
                UserDAO.changePassword(id, oldPass, newPass);
                JOptionPane.showMessageDialog(this, "Đổi mật khẩu thành công", "Thông báo",
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (SQLException | ClassNotFoundException ex) {
                Logger.getLogger(UserDashboard.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(this, "Đổi mật khẩu thất bại. Vui lòng thử lại sau!", "Lỗi",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }// GEN-LAST:event_capNhatMatKhauMouseClicked

    private boolean checkMatKhau(String oldPass, String newPass, String cfPass, String pass) {
        if (oldPass.isEmpty() || newPass.isEmpty() || cfPass.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập đủ dữ liệu", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (!oldPass.equals(pass)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu cũ không chính xác", "Cảnh báo", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (!newPass.equals(cfPass)) {
            JOptionPane.showMessageDialog(this, "Xác nhận mật khẩu không chính xác", "Cảnh báo",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (newPass.equals(oldPass)) {
            JOptionPane.showMessageDialog(this, "Mật khẩu mới không được trùng với mật khẩu cũ", "Cảnh báo",
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private void xoaMatKhauMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_xoaMatKhauMouseClicked
        matKhauCu.setText("");
        matKhauMoi.setText("");
        xacNhanMatKhau.setText("");
    }// GEN-LAST:event_xoaMatKhauMouseClicked

    private void jLabel66MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel66MouseClicked
        matKhauCu.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        matKhauCu.setEchoChar((char) 0);
        jLabel66.setVisible(false);
        jLabel70.setVisible(true);
    }// GEN-LAST:event_jLabel66MouseClicked

    private void jLabel70MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel70MouseClicked
        matKhauCu.setFont(new Font("Segoe UI", Font.BOLD, 12));
        matKhauCu.setEchoChar('*');
        jLabel66.setVisible(true);
        jLabel70.setVisible(false);
    }// GEN-LAST:event_jLabel70MouseClicked

    private void jLabel71MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel71MouseClicked
        matKhauMoi.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        matKhauMoi.setEchoChar((char) 0);
        jLabel71.setVisible(false);
        jLabel72.setVisible(true);
    }// GEN-LAST:event_jLabel71MouseClicked

    private void jLabel72MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel72MouseClicked
        matKhauMoi.setFont(new Font("Segoe UI", Font.BOLD, 12));
        matKhauMoi.setEchoChar('*');
        jLabel71.setVisible(true);
        jLabel72.setVisible(false);
    }// GEN-LAST:event_jLabel72MouseClicked

    private void jLabel73MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel73MouseClicked
        xacNhanMatKhau.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        xacNhanMatKhau.setEchoChar((char) 0);
        jLabel73.setVisible(false);
        jLabel74.setVisible(true);
    }// GEN-LAST:event_jLabel73MouseClicked

    private void jLabel74MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel74MouseClicked
        xacNhanMatKhau.setFont(new Font("Segoe UI", Font.BOLD, 12));
        xacNhanMatKhau.setEchoChar('*');
        jLabel73.setVisible(true);
        jLabel74.setVisible(false);
    }// GEN-LAST:event_jLabel74MouseClicked

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

    private void initIconAdmin() {
        jLabel21.setVisible(true);
        jLabel58.setVisible(false);
        jLabel62.setVisible(true);
        jLabel63.setVisible(false);
        jLabel68.setVisible(true);
        jLabel76.setVisible(false);
        jLabel77.setVisible(true);
        jLabel78.setVisible(false);
        jLabel83.setVisible(true);
        jLabel90.setVisible(false);
        jLabel79.setVisible(true);
        jLabel106.setVisible(false);
    }

    private void initThongTin() {
        tenDangNhap.setText(u.getUserName());
        tenNguoiDung.setText(u.getFullName());
        sdt.setText(u.getPhoneNumber());
        int c = u.getShift();
        if (c == 1)
            caLam.setText("Sáng");
        else
            caLam.setText("Tối");
        String gt = u.getGender();
        if (gt.toLowerCase().trim().equals("male")) {
            gtNam.setSelected(true);
        } else {
            gtNu.setSelected(true);
        }
        chucVu.setText("Bảo vệ");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel5;
    private javax.swing.JLabel Panel2text;
    private javax.swing.JLabel Panel3text;
    private javax.swing.JLabel Panel4text;
    private javax.swing.JLabel Panel5text;
    private javax.swing.JLabel Panel6text;
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
    private javax.swing.JPanel Paneltask8;
    private javax.swing.JLabel Search3;
    private javax.swing.JLabel Search4;
    private javax.swing.JLabel Tieude3;
    private javax.swing.JLabel Tieude5;
    private javax.swing.JLabel Tieude6;
    private javax.swing.JLabel Tieude8;
    public static javax.swing.JTable bangThongKe;
    private javax.swing.JTable bangTimKiem;
    public static javax.swing.JTable bangVeLuot;
    public static javax.swing.JTable bangVeThang;
    private javax.swing.JTextField bienSoLanRa;
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
    private javax.swing.JLabel dangChonVeLuot;
    private javax.swing.JLabel dangChonVeThang;
    private javax.swing.JPanel dangKyVeThang;
    private javax.swing.JPanel doiMatKhau;
    private javax.swing.JPanel giaHanVeThang;
    private javax.swing.JTextField gioRa;
    private javax.swing.JTextField gioVaoLanVao;
    private javax.swing.JRadioButton gtNam;
    private javax.swing.JRadioButton gtNu;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
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
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    public static javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel1d;
    public static javax.swing.JPanel jPanel1s;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel26;
    private javax.swing.JPanel jPanel2d;
    public static javax.swing.JPanel jPanel2s;
    private javax.swing.JPanel jPanel2u;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel34;
    private javax.swing.JPanel jPanel35;
    private javax.swing.JPanel jPanel3d;
    public static javax.swing.JPanel jPanel3s;
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
    private javax.swing.JPanel jPanel6d;
    private javax.swing.JPanel jPanel6s;
    private javax.swing.JPanel jPanel6u;
    private javax.swing.JPanel jPanel71;
    private javax.swing.JPanel jPanel74;
    private javax.swing.JPanel jPanel8;
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
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JComboBox<String> loaiXeLanRa;
    private javax.swing.JComboBox<String> loaiXeLanVao;
    private javax.swing.JPanel luuLanVao;
    private javax.swing.JPasswordField matKhauCu;
    private javax.swing.JPasswordField matKhauMoi;
    public static javax.swing.JLabel name;
    private javax.swing.JTextField ngayRa;
    private javax.swing.JTextField ngayVaoLanVao;
    private javax.swing.JTextField sdt;
    private javax.swing.JTextField search3text;
    private javax.swing.JTextField search3text1;
    private javax.swing.JPanel suaVeThang;
    private javax.swing.JPanel task8_doiMatKhau;
    private javax.swing.JPanel task8_thongTin;
    public static javax.swing.JLabel ten;
    private javax.swing.JTextField tenDangNhap;
    private javax.swing.JTextField tenNguoiDung;
    private javax.swing.JTextField thongBaoLanRa;
    private javax.swing.JTextField thongBaoLanVao;
    public static javax.swing.JComboBox<String> thongKeLoaiVe;
    public static javax.swing.JComboBox<String> thongKeLoaiXe;
    public static com.toedter.calendar.JDateChooser thongKeNgayRa;
    public static com.toedter.calendar.JDateChooser thongKeNgayVao;
    private javax.swing.JPanel thongTin;
    private javax.swing.JTextField timKiemBienSo;
    private javax.swing.JComboBox<String> timKiemLoaiVe;
    private javax.swing.JComboBox<String> timKiemLoaiXe;
    private javax.swing.JPanel tinhTien;
    private javax.swing.JLabel tongVeLuot;
    private javax.swing.JLabel tongVeThang;
    private javax.swing.JPasswordField xacNhanMatKhau;
    private javax.swing.JPanel xoaMatKhau;
    private javax.swing.JPanel xoaVeLuot;
    private javax.swing.JPanel xoaVeThang;
    // End of variables declaration//GEN-END:variables
}
