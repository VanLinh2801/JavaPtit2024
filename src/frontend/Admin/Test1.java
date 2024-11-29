package src.frontend.Admin;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;

public class Test1 extends javax.swing.JFrame {
        Color notSelect = new Color(240, 240, 240);
        Color select = new Color(255, 255, 255);
        Color barNotSelect = new Color(225, 225, 225);
        Color barSelect = new Color(51, 153, 255);
        Color downSelect = new Color(204, 255, 255);
        Color notSelectText = new Color(153, 153, 153);
        int xx, xy;
        Font font1 = new Font("Segoe UI", Font.PLAIN, 18);
        Font font2 = new Font("Segoe UI", Font.BOLD, 18);

        public Test1() {
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
                jPanel10 = new javax.swing.JPanel();
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
                jPanel7 = new javax.swing.JPanel();
                Panel7text = new javax.swing.JLabel();
                jPanel8 = new javax.swing.JPanel();
                Panel8text = new javax.swing.JLabel();
                jPanel9 = new javax.swing.JPanel();
                Panel9text = new javax.swing.JLabel();
                jPanel1s = new javax.swing.JPanel();
                jPanel2s = new javax.swing.JPanel();
                jPanel3s = new javax.swing.JPanel();
                jPanel4s = new javax.swing.JPanel();
                jPanel5s = new javax.swing.JPanel();
                jPanel6s = new javax.swing.JPanel();
                jPanel7s = new javax.swing.JPanel();
                jPanel8s = new javax.swing.JPanel();
                jPanel9s = new javax.swing.JPanel();
                jPanel0s = new javax.swing.JPanel();
                jPanel1u = new javax.swing.JPanel();
                jPanel2u = new javax.swing.JPanel();
                jPanel3u = new javax.swing.JPanel();
                jPanel4u = new javax.swing.JPanel();
                jPanel5u = new javax.swing.JPanel();
                jPanel6u = new javax.swing.JPanel();
                jPanel7u = new javax.swing.JPanel();
                jPanel8u = new javax.swing.JPanel();
                jPanel9u = new javax.swing.JPanel();
                jPanel1d = new javax.swing.JPanel();
                jPanel2d = new javax.swing.JPanel();
                jPanel3d = new javax.swing.JPanel();
                jPanel4d = new javax.swing.JPanel();
                jPanel5d = new javax.swing.JPanel();
                jPanel6d = new javax.swing.JPanel();
                jPanel7d = new javax.swing.JPanel();
                jPanel8d = new javax.swing.JPanel();
                jPanel9d = new javax.swing.JPanel();
                jPanel10d = new javax.swing.JPanel();
                Paneltask2 = new javax.swing.JPanel();
                jPanel24 = new javax.swing.JPanel();
                jLabel5 = new javax.swing.JLabel();
                jLabel6 = new javax.swing.JLabel();
                Paneltask3 = new javax.swing.JPanel();
                jPanel5 = new javax.swing.JPanel();
                Tieude3 = new javax.swing.JLabel();
                Search3 = new javax.swing.JLabel();
                search3text = new javax.swing.JTextField();
                jPanel11 = new javax.swing.JPanel();
                jPanel12 = new javax.swing.JPanel();
                jLabel4 = new javax.swing.JLabel();
                jPanel13 = new javax.swing.JPanel();
                jPanel14 = new javax.swing.JPanel();
                jLabel2 = new javax.swing.JLabel();
                jPanel15 = new javax.swing.JPanel();
                jLabel3 = new javax.swing.JLabel();
                jPanel16 = new javax.swing.JPanel();
                jPanel17 = new javax.swing.JPanel();
                jPanel18 = new javax.swing.JPanel();
                jPanel19 = new javax.swing.JPanel();
                jLabel1 = new javax.swing.JLabel();
                jPanel20 = new javax.swing.JPanel();
                jPanel21 = new javax.swing.JPanel();
                jPanel22 = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTable1 = new javax.swing.JTable();
                Paneltask4 = new javax.swing.JPanel();
                jPanel23 = new javax.swing.JPanel();
                Tieude4 = new javax.swing.JLabel();
                Paneltask5 = new javax.swing.JPanel();
                Paneltask6 = new javax.swing.JPanel();
                Paneltask7 = new javax.swing.JPanel();
                Paneltask8 = new javax.swing.JPanel();
                Paneltask9 = new javax.swing.JPanel();

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
                getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

                jPanel10.setPreferredSize(new java.awt.Dimension(200, 77));

                javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
                jPanel10.setLayout(jPanel10Layout);
                jPanel10Layout.setHorizontalGroup(
                                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 180, Short.MAX_VALUE));
                jPanel10Layout.setVerticalGroup(
                                jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 77, Short.MAX_VALUE));

                jPanelTask.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 180, -1));

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

                jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jPanel7.setPreferredSize(new java.awt.Dimension(100, 77));
                jPanel7.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jPanel7MouseClicked(evt);
                        }
                });
                jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                Panel7text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                Panel7text.setForeground(new java.awt.Color(153, 153, 153));
                Panel7text.setText("NHẬT KÝ");
                jPanel7.add(Panel7text, new org.netbeans.lib.awtextra.AbsoluteConstraints(13, 40, -1, -1));

                jPanelTask.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 10, -1, -1));

                jPanel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jPanel8.setPreferredSize(new java.awt.Dimension(100, 77));
                jPanel8.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jPanel8MouseClicked(evt);
                        }
                });
                jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                Panel8text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                Panel8text.setForeground(new java.awt.Color(153, 153, 153));
                Panel8text.setText("HỆ THỐNG");
                jPanel8.add(Panel8text, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 40, -1, -1));

                jPanelTask.add(jPanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 10, -1, -1));

                jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jPanel9.setPreferredSize(new java.awt.Dimension(130, 77));
                jPanel9.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                jPanel9MouseClicked(evt);
                        }
                });
                jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                Panel9text.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
                Panel9text.setForeground(new java.awt.Color(153, 153, 153));
                Panel9text.setText("NGƯỜI DÙNG");
                jPanel9.add(Panel9text, new org.netbeans.lib.awtextra.AbsoluteConstraints(8, 40, -1, -1));

                jPanelTask.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 10, -1, -1));

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

                jPanel7s.setBackground(new java.awt.Color(225, 225, 225));
                jPanel7s.setPreferredSize(new java.awt.Dimension(2, 77));

                javax.swing.GroupLayout jPanel7sLayout = new javax.swing.GroupLayout(jPanel7s);
                jPanel7s.setLayout(jPanel7sLayout);
                jPanel7sLayout.setHorizontalGroup(
                                jPanel7sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 2, Short.MAX_VALUE));
                jPanel7sLayout.setVerticalGroup(
                                jPanel7sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 77, Short.MAX_VALUE));

                jPanelTask.add(jPanel7s, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 10, -1, -1));

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

                jPanelTask.add(jPanel8s, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 10, -1, -1));

                jPanel9s.setBackground(new java.awt.Color(225, 225, 225));
                jPanel9s.setPreferredSize(new java.awt.Dimension(2, 77));

                javax.swing.GroupLayout jPanel9sLayout = new javax.swing.GroupLayout(jPanel9s);
                jPanel9s.setLayout(jPanel9sLayout);
                jPanel9sLayout.setHorizontalGroup(
                                jPanel9sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 2, Short.MAX_VALUE));
                jPanel9sLayout.setVerticalGroup(
                                jPanel9sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 77, Short.MAX_VALUE));

                jPanelTask.add(jPanel9s, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 10, -1, -1));

                jPanel0s.setBackground(new java.awt.Color(225, 225, 225));
                jPanel0s.setPreferredSize(new java.awt.Dimension(2, 77));

                javax.swing.GroupLayout jPanel0sLayout = new javax.swing.GroupLayout(jPanel0s);
                jPanel0s.setLayout(jPanel0sLayout);
                jPanel0sLayout.setHorizontalGroup(
                                jPanel0sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 2, Short.MAX_VALUE));
                jPanel0sLayout.setVerticalGroup(
                                jPanel0sLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 77, Short.MAX_VALUE));

                jPanelTask.add(jPanel0s, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

                jPanel1u.setBackground(new java.awt.Color(225, 225, 225));
                jPanel1u.setPreferredSize(new java.awt.Dimension(80, 3));

                javax.swing.GroupLayout jPanel1uLayout = new javax.swing.GroupLayout(jPanel1u);
                jPanel1u.setLayout(jPanel1uLayout);
                jPanel1uLayout.setHorizontalGroup(
                                jPanel1uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 80, Short.MAX_VALUE));
                jPanel1uLayout.setVerticalGroup(
                                jPanel1uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 3, Short.MAX_VALUE));

                jPanelTask.add(jPanel1u, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 7, -1, -1));

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

                jPanel7u.setBackground(new java.awt.Color(225, 225, 225));
                jPanel7u.setPreferredSize(new java.awt.Dimension(100, 3));

                javax.swing.GroupLayout jPanel7uLayout = new javax.swing.GroupLayout(jPanel7u);
                jPanel7u.setLayout(jPanel7uLayout);
                jPanel7uLayout.setHorizontalGroup(
                                jPanel7uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 100, Short.MAX_VALUE));
                jPanel7uLayout.setVerticalGroup(
                                jPanel7uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 3, Short.MAX_VALUE));

                jPanelTask.add(jPanel7u, new org.netbeans.lib.awtextra.AbsoluteConstraints(594, 7, -1, -1));

                jPanel8u.setBackground(new java.awt.Color(225, 225, 225));
                jPanel8u.setPreferredSize(new java.awt.Dimension(100, 3));

                javax.swing.GroupLayout jPanel8uLayout = new javax.swing.GroupLayout(jPanel8u);
                jPanel8u.setLayout(jPanel8uLayout);
                jPanel8uLayout.setHorizontalGroup(
                                jPanel8uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 100, Short.MAX_VALUE));
                jPanel8uLayout.setVerticalGroup(
                                jPanel8uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 3, Short.MAX_VALUE));

                jPanelTask.add(jPanel8u, new org.netbeans.lib.awtextra.AbsoluteConstraints(696, 7, -1, -1));

                jPanel9u.setBackground(new java.awt.Color(225, 225, 225));
                jPanel9u.setPreferredSize(new java.awt.Dimension(130, 3));

                javax.swing.GroupLayout jPanel9uLayout = new javax.swing.GroupLayout(jPanel9u);
                jPanel9u.setLayout(jPanel9uLayout);
                jPanel9uLayout.setHorizontalGroup(
                                jPanel9uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 130, Short.MAX_VALUE));
                jPanel9uLayout.setVerticalGroup(
                                jPanel9uLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 3, Short.MAX_VALUE));

                jPanelTask.add(jPanel9u, new org.netbeans.lib.awtextra.AbsoluteConstraints(798, 7, -1, -1));

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

                jPanel7d.setBackground(new java.awt.Color(225, 225, 225));
                jPanel7d.setPreferredSize(new java.awt.Dimension(104, 2));

                javax.swing.GroupLayout jPanel7dLayout = new javax.swing.GroupLayout(jPanel7d);
                jPanel7d.setLayout(jPanel7dLayout);
                jPanel7dLayout.setHorizontalGroup(
                                jPanel7dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 104, Short.MAX_VALUE));
                jPanel7dLayout.setVerticalGroup(
                                jPanel7dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 2, Short.MAX_VALUE));

                jPanelTask.add(jPanel7d, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 87, -1, -1));

                jPanel8d.setBackground(new java.awt.Color(225, 225, 225));
                jPanel8d.setPreferredSize(new java.awt.Dimension(104, 2));

                javax.swing.GroupLayout jPanel8dLayout = new javax.swing.GroupLayout(jPanel8d);
                jPanel8d.setLayout(jPanel8dLayout);
                jPanel8dLayout.setHorizontalGroup(
                                jPanel8dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 104, Short.MAX_VALUE));
                jPanel8dLayout.setVerticalGroup(
                                jPanel8dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 2, Short.MAX_VALUE));

                jPanelTask.add(jPanel8d, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 87, -1, -1));

                jPanel9d.setBackground(new java.awt.Color(225, 225, 225));
                jPanel9d.setPreferredSize(new java.awt.Dimension(134, 2));

                javax.swing.GroupLayout jPanel9dLayout = new javax.swing.GroupLayout(jPanel9d);
                jPanel9d.setLayout(jPanel9dLayout);
                jPanel9dLayout.setHorizontalGroup(
                                jPanel9dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 134, Short.MAX_VALUE));
                jPanel9dLayout.setVerticalGroup(
                                jPanel9dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 2, Short.MAX_VALUE));

                jPanelTask.add(jPanel9d, new org.netbeans.lib.awtextra.AbsoluteConstraints(796, 87, -1, -1));

                jPanel10d.setBackground(new java.awt.Color(225, 225, 225));
                jPanel10d.setPreferredSize(new java.awt.Dimension(182, 2));

                javax.swing.GroupLayout jPanel10dLayout = new javax.swing.GroupLayout(jPanel10d);
                jPanel10d.setLayout(jPanel10dLayout);
                jPanel10dLayout.setHorizontalGroup(
                                jPanel10dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 182, Short.MAX_VALUE));
                jPanel10dLayout.setVerticalGroup(
                                jPanel10dLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGap(0, 2, Short.MAX_VALUE));

                jPanelTask.add(jPanel10d, new org.netbeans.lib.awtextra.AbsoluteConstraints(928, 87, -1, -1));

                jPanelWindow.add(jPanelTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, -1, -1));

                Paneltask2.setBackground(new java.awt.Color(255, 255, 255));
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

                jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                jLabel5.setForeground(new java.awt.Color(102, 204, 255));
                jLabel5.setText("LÀN RA");
                Paneltask2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(792, 40, -1, -1));

                jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
                jLabel6.setForeground(new java.awt.Color(102, 204, 255));
                jLabel6.setText("LÀN VÀO");
                Paneltask2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 40, -1, -1));

                jPanelWindow.add(Paneltask2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1110, 510));

                Paneltask3.setBackground(new java.awt.Color(255, 255, 255));
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

                jPanel11.setBackground(new java.awt.Color(255, 255, 255));
                jPanel11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
                jPanel11.setPreferredSize(new java.awt.Dimension(360, 40));
                jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jPanel12.setBackground(new java.awt.Color(255, 255, 255));
                jPanel12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jPanel12.setPreferredSize(new java.awt.Dimension(91, 37));
                jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel4.setText("GIA HẠN");
                jLabel4.setPreferredSize(new java.awt.Dimension(52, 16));
                jPanel12.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 10, 50, -1));

                jPanel11.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 1, -1, -1));

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

                jPanel11.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 1, -1, -1));

                jPanel14.setBackground(new java.awt.Color(255, 255, 255));
                jPanel14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jPanel14.setPreferredSize(new java.awt.Dimension(80, 37));
                jPanel14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel2.setText("XÓA");
                jLabel2.setPreferredSize(new java.awt.Dimension(52, 16));
                jPanel14.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 10, 30, -1));

                jPanel11.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 1, -1, -1));

                jPanel15.setBackground(new java.awt.Color(255, 255, 255));
                jPanel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jPanel15.setPreferredSize(new java.awt.Dimension(80, 37));
                jPanel15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel3.setText("SỬA");
                jLabel3.setPreferredSize(new java.awt.Dimension(52, 16));
                jPanel15.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 10, 30, -1));

                jPanel11.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 1, -1, -1));

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

                jPanel11.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 38, -1, -1));

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

                jPanel11.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(183, 1, -1, -1));

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

                jPanel11.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 1, -1, -1));

                jPanel19.setBackground(new java.awt.Color(255, 255, 255));
                jPanel19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
                jPanel19.setPreferredSize(new java.awt.Dimension(100, 37));
                jPanel19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

                jLabel1.setText("ĐĂNG KÝ");
                jLabel1.setPreferredSize(new java.awt.Dimension(52, 16));
                jPanel19.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, -1, -1));

                jPanel11.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, -1));

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

                jPanel11.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(103, 38, -1, -1));

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

                jPanel11.add(jPanel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(185, 38, -1, -1));

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

                jPanel11.add(jPanel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(267, 38, -1, -1));

                Paneltask3.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, -1, -1));

                jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));
                jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

                jTable1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
                jTable1.setModel(new javax.swing.table.DefaultTableModel(
                                new Object[][] {

                                },
                                new String[] {
                                                "Mã Thẻ", "Biển Số", "Chủ Xe", "Ngày Kích Hoạt", "Ngày Hết Hạn",
                                                "Loại Vé", "Giá Vé"
                                }) {
                        boolean[] canEdit = new boolean[] {
                                        false, false, false, false, false, false, false
                        };

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit[columnIndex];
                        }
                });
                JTableHeader header = jTable1.getTableHeader();
                header.setFont(new Font("Segoe UI", Font.BOLD, 16));
                header.setBackground(Color.WHITE);
                DefaultTableCellRenderer renderer = (DefaultTableCellRenderer) header.getDefaultRenderer();
                renderer.setHorizontalAlignment(SwingConstants.CENTER);
                jScrollPane1.setViewportView(jTable1);

                Paneltask3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 1030, 280));

                jPanelWindow.add(Paneltask3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1110, 510));

                Paneltask4.setBackground(new java.awt.Color(255, 255, 255));
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

                jPanelWindow.add(Paneltask4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1110, 510));

                Paneltask5.setBackground(new java.awt.Color(255, 255, 255));
                Paneltask5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                jPanelWindow.add(Paneltask5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1110, 510));

                Paneltask6.setBackground(new java.awt.Color(255, 255, 255));
                Paneltask6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                jPanelWindow.add(Paneltask6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1110, 510));

                Paneltask7.setBackground(new java.awt.Color(255, 255, 255));
                Paneltask7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                jPanelWindow.add(Paneltask7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1110, 510));

                Paneltask8.setBackground(new java.awt.Color(255, 255, 255));
                Paneltask8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                jPanelWindow.add(Paneltask8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1110, 510));

                Paneltask9.setBackground(new java.awt.Color(255, 255, 255));
                Paneltask9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
                jPanelWindow.add(Paneltask9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 1110, 510));

                getContentPane().add(jPanelWindow, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1110, 660));

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
                jPanel7d.setBackground(barSelect);
                jPanel8d.setBackground(barSelect);
                jPanel9d.setBackground(barSelect);
                jPanel10d.setBackground(barSelect);
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
                jPanel7d.setBackground(barSelect);
                jPanel8d.setBackground(barSelect);
                jPanel9d.setBackground(barSelect);
                jPanel10d.setBackground(barSelect);
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
                jPanel7d.setBackground(barSelect);
                jPanel8d.setBackground(barSelect);
                jPanel9d.setBackground(barSelect);
                jPanel10d.setBackground(barSelect);
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
                jPanel7d.setBackground(barSelect);
                jPanel8d.setBackground(barSelect);
                jPanel9d.setBackground(barSelect);
                jPanel10d.setBackground(barSelect);
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
                jPanel7d.setBackground(barSelect);
                jPanel8d.setBackground(barSelect);
                jPanel9d.setBackground(barSelect);
                jPanel10d.setBackground(barSelect);
                Panel6text.setFont(font2);
                Panel6text.setForeground(barSelect);
                Paneltask6.setVisible(true);
        }// GEN-LAST:event_jPanel6MouseClicked

        private void jPanel7MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel7MouseClicked
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
                jPanel10d.setBackground(barSelect);
                Panel7text.setFont(font2);
                Panel7text.setForeground(barSelect);
                Paneltask7.setVisible(true);
        }// GEN-LAST:event_jPanel7MouseClicked

        private void jPanel8MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel8MouseClicked
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
                jPanel10d.setBackground(barSelect);
                Panel8text.setFont(font2);
                Panel8text.setForeground(barSelect);
                Paneltask8.setVisible(true);
        }// GEN-LAST:event_jPanel8MouseClicked

        private void jPanel9MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jPanel9MouseClicked
                init();
                initText();
                initTask();
                jPanel9.setBackground(select);
                jPanel9u.setBackground(barSelect);
                jPanel8s.setBackground(barSelect);
                jPanel9s.setBackground(barSelect);
                jPanel1d.setBackground(barSelect);
                jPanel2d.setBackground(barSelect);
                jPanel3d.setBackground(barSelect);
                jPanel4d.setBackground(barSelect);
                jPanel5d.setBackground(barSelect);
                jPanel6d.setBackground(barSelect);
                jPanel7d.setBackground(barSelect);
                jPanel8d.setBackground(barSelect);
                jPanel10d.setBackground(barSelect);
                Panel9text.setFont(font2);
                Panel9text.setForeground(barSelect);
                Paneltask9.setVisible(true);
        }// GEN-LAST:event_jPanel9MouseClicked

        private void formMouseDragged(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_formMouseDragged
                int x = evt.getXOnScreen();
                int y = evt.getYOnScreen();
                this.setLocation(x - xx, y - xy);
        }// GEN-LAST:event_formMouseDragged

        private void formMousePressed(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_formMousePressed
                xx = evt.getX();
                xy = evt.getY();
        }// GEN-LAST:event_formMousePressed

        private void init() {
                jPanel1.setBackground(notSelect);
                jPanel2.setBackground(notSelect);
                jPanel3.setBackground(notSelect);
                jPanel4.setBackground(notSelect);
                JPanel5.setBackground(notSelect);
                jPanel6.setBackground(notSelect);
                jPanel7.setBackground(notSelect);
                jPanel8.setBackground(notSelect);
                jPanel8.setBackground(notSelect);
                jPanel9.setBackground(notSelect);
                jPanel10.setBackground(notSelect);
                jPanel0s.setBackground(barNotSelect);
                jPanel1s.setBackground(barNotSelect);
                jPanel2s.setBackground(barNotSelect);
                jPanel3s.setBackground(barNotSelect);
                jPanel4s.setBackground(barNotSelect);
                jPanel5s.setBackground(barNotSelect);
                jPanel6s.setBackground(barNotSelect);
                jPanel7s.setBackground(barNotSelect);
                jPanel8s.setBackground(barNotSelect);
                jPanel9s.setBackground(barNotSelect);
                jPanel1u.setBackground(barNotSelect);
                jPanel2u.setBackground(barNotSelect);
                jPanel3u.setBackground(barNotSelect);
                jPanel4u.setBackground(barNotSelect);
                jPanel5u.setBackground(barNotSelect);
                jPanel6u.setBackground(barNotSelect);
                jPanel7u.setBackground(barNotSelect);
                jPanel8u.setBackground(barNotSelect);
                jPanel9u.setBackground(barNotSelect);
                jPanel1d.setBackground(barNotSelect);
                jPanel2d.setBackground(barNotSelect);
                jPanel3d.setBackground(barNotSelect);
                jPanel4d.setBackground(barNotSelect);
                jPanel5d.setBackground(barNotSelect);
                jPanel6d.setBackground(barNotSelect);
                jPanel7d.setBackground(barNotSelect);
                jPanel8d.setBackground(barNotSelect);
                jPanel9d.setBackground(barNotSelect);
        }

        private void initText() {
                Panel2text.setForeground(notSelectText);
                Panel3text.setForeground(notSelectText);
                Panel4text.setForeground(notSelectText);
                Panel5text.setForeground(notSelectText);
                Panel6text.setForeground(notSelectText);
                Panel7text.setForeground(notSelectText);
                Panel8text.setForeground(notSelectText);
                Panel9text.setForeground(notSelectText);
                Panel2text.setForeground(notSelectText);
                Panel2text.setFont(font1);
                Panel3text.setFont(font1);
                Panel4text.setFont(font1);
                Panel5text.setFont(font1);
                Panel6text.setFont(font1);
                Panel7text.setFont(font1);
                Panel8text.setFont(font1);
                Panel9text.setFont(font1);
        }

        private void initTask() {
                Paneltask2.setVisible(false);
                Paneltask3.setVisible(false);
                Paneltask4.setVisible(false);
                Paneltask5.setVisible(false);
                Paneltask6.setVisible(false);
                Paneltask7.setVisible(false);
                Paneltask8.setVisible(false);
                Paneltask9.setVisible(false);
        }

        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Test1.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Test1.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Test1.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Test1.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Test1().setVisible(true);
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
        private javax.swing.JLabel Panel7text;
        private javax.swing.JLabel Panel8text;
        private javax.swing.JLabel Panel9text;
        private javax.swing.JPanel Paneltask2;
        private javax.swing.JPanel Paneltask3;
        private javax.swing.JPanel Paneltask4;
        private javax.swing.JPanel Paneltask5;
        private javax.swing.JPanel Paneltask6;
        private javax.swing.JPanel Paneltask7;
        private javax.swing.JPanel Paneltask8;
        private javax.swing.JPanel Paneltask9;
        private javax.swing.JLabel Search3;
        private javax.swing.JLabel Tieude3;
        private javax.swing.JLabel Tieude4;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JPanel jPanel0s;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel10;
        private javax.swing.JPanel jPanel10d;
        private javax.swing.JPanel jPanel11;
        private javax.swing.JPanel jPanel12;
        private javax.swing.JPanel jPanel13;
        private javax.swing.JPanel jPanel14;
        private javax.swing.JPanel jPanel15;
        private javax.swing.JPanel jPanel16;
        private javax.swing.JPanel jPanel17;
        private javax.swing.JPanel jPanel18;
        private javax.swing.JPanel jPanel19;
        private javax.swing.JPanel jPanel1d;
        private javax.swing.JPanel jPanel1s;
        private javax.swing.JPanel jPanel1u;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JPanel jPanel20;
        private javax.swing.JPanel jPanel21;
        private javax.swing.JPanel jPanel22;
        private javax.swing.JPanel jPanel23;
        private javax.swing.JPanel jPanel24;
        private javax.swing.JPanel jPanel2d;
        private javax.swing.JPanel jPanel2s;
        private javax.swing.JPanel jPanel2u;
        private javax.swing.JPanel jPanel3;
        private javax.swing.JPanel jPanel3d;
        private javax.swing.JPanel jPanel3s;
        private javax.swing.JPanel jPanel3u;
        private javax.swing.JPanel jPanel4;
        private javax.swing.JPanel jPanel4d;
        private javax.swing.JPanel jPanel4s;
        private javax.swing.JPanel jPanel4u;
        private javax.swing.JPanel jPanel5;
        private javax.swing.JPanel jPanel5d;
        private javax.swing.JPanel jPanel5s;
        private javax.swing.JPanel jPanel5u;
        private javax.swing.JPanel jPanel6;
        private javax.swing.JPanel jPanel6d;
        private javax.swing.JPanel jPanel6s;
        private javax.swing.JPanel jPanel6u;
        private javax.swing.JPanel jPanel7;
        private javax.swing.JPanel jPanel7d;
        private javax.swing.JPanel jPanel7s;
        private javax.swing.JPanel jPanel7u;
        private javax.swing.JPanel jPanel8;
        private javax.swing.JPanel jPanel8d;
        private javax.swing.JPanel jPanel8s;
        private javax.swing.JPanel jPanel8u;
        private javax.swing.JPanel jPanel9;
        private javax.swing.JPanel jPanel9d;
        private javax.swing.JPanel jPanel9s;
        private javax.swing.JPanel jPanel9u;
        private javax.swing.JPanel jPanelBar;
        private javax.swing.JPanel jPanelTask;
        private javax.swing.JPanel jPanelWindow;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable jTable1;
        private javax.swing.JTextField search3text;
        // End of variables declaration//GEN-END:variables
}
