/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package fa23.b2.sd18405.pma101;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class LTView extends javax.swing.JFrame {

    /**
     * Creates new form LTView
     */
    Qly ql = new Qly();
    DefaultTableModel defaultTableModel;

    public LTView() {
        initComponents();
        ArrayList<String> list = new ArrayList<>();
        list.add("");
        list.add("Màu Đỏ");
        list.add("Màu Xám");
        list.add("Màu Trắng");
        list.add("Màu Xanh");
        for (String string : list) {
            txtMauSac.addItem(string);
        }

    }

    void loadData(ArrayList<sanpham1> list) {
        defaultTableModel = (DefaultTableModel) tblsp.getModel();
        defaultTableModel.setRowCount(0);
        int stt = 1;
        for (sanpham1 object : list) {

            defaultTableModel.addRow(new Object[]{
                stt++,
                object.getMa(),
                object.getTen(),
                object.getSl(),
                object.getGia(),
                object.getMauSac(),
                object.getTrangThai(),
                object.thanhtien()
            });
        }
    }

    /**
     * new This method is called from within the constructor to initialize the
     * form. WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtma = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTen = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtsl = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtGia = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        rdDaThanhToan = new javax.swing.JRadioButton();
        rdChuaThanhToan = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblsp = new javax.swing.JTable();
        btnCapNhat = new javax.swing.JButton();
        btnHienThi = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtMauSac = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Sản Phẩm");

        jLabel2.setText("Mã");

        jLabel3.setText("Tên");

        txtTen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenActionPerformed(evt);
            }
        });

        jLabel4.setText("Số Lượng");

        jLabel5.setText("Giá");

        jLabel7.setText("Trạng Thái");

        buttonGroup1.add(rdDaThanhToan);
        rdDaThanhToan.setText("Đã Thanh Toán");
        rdDaThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdDaThanhToanActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdChuaThanhToan);
        rdChuaThanhToan.setText("Chưa Thanh Toán");
        rdChuaThanhToan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdChuaThanhToanActionPerformed(evt);
            }
        });

        btnThem.setText("Thêm");
        btnThem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnThemMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThemMouseEntered(evt);
            }
        });

        btnXoa.setText("Xoá");
        btnXoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnXoaMouseClicked(evt);
            }
        });

        btnTimKiem.setText("Tìm Kiếm");
        btnTimKiem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTimKiemMouseClicked(evt);
            }
        });

        tblsp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Stt", "Mã", "Tên", "Số Lượng", "Giá", "Màu Sắc ", "Trạng Thái", "Thành Tiền"
            }
        ));
        tblsp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblspMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblsp);

        btnCapNhat.setText("Cập Nhật");
        btnCapNhat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCapNhatMouseClicked(evt);
            }
        });
        btnCapNhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCapNhatActionPerformed(evt);
            }
        });

        btnHienThi.setText("Hiển Thị");
        btnHienThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHienThiMouseClicked(evt);
            }
        });

        jLabel6.setText("Màu Sắc ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(160, 160, 160)
                                .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtsl, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(105, 105, 105)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(18, 18, 18)
                                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtMauSac, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(173, 173, 173)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnTimKiem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCapNhat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnThem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnHienThi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnXoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(250, 250, 250)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(rdDaThanhToan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rdChuaThanhToan))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHienThi))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtsl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTimKiem)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(txtGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCapNhat))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnXoa)
                        .addComponent(txtMauSac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rdDaThanhToan)
                        .addComponent(rdChuaThanhToan)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdChuaThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdChuaThanhToanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdChuaThanhToanActionPerformed

    private void txtTenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTenActionPerformed

    private void btnThemMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemMouseEntered

    private void btnThemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThemMouseClicked
        // TODO add your handling code here:
        String ma = txtma.getText();
        if (ma.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã Không Bỏ Trống");
            return;
        }
        ArrayList<sanpham1> kq = ql.getlist();

        for (sanpham1 object : kq) {
            if (ma.equals(object.getMa())) {
                JOptionPane.showMessageDialog(this, "Sản Phẩm Đã Tồn Tại");
                return;
            }
        }

        String ten = txtTen.getText();
        if (ten.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Tên Không Bỏ Trống");
            return;
        }
        String soLuong = txtsl.getText();
        if (soLuong.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Số Lượng Không Bỏ Trống");
            return;
        }

        try {
            Integer sl = Integer.parseInt(txtsl.getText());
            Integer.valueOf(sl);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Số Lượng Phải Là Số");
            return;
        }

        Integer sl = Integer.parseInt(txtsl.getText());

        String Gia = txtGia.getText();
        if (Gia.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Giá Không Bỏ Trống");
            return;
        }
        try {
            Float gia = Float.parseFloat(txtGia.getText());
            Float.valueOf(gia);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Giá Phải Là Số");
            return;
        }

        Float gia = Float.parseFloat(txtGia.getText());
        String mau = txtMauSac.getSelectedItem().toString();
        if (mau.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Màu Sắc Không Bỏ Trống");
            return;
        }

        String tt = "";
//        if (rdChuaThanhToan.) {
//            JOptionPane.showMessageDialog(this, "Trạng Thái Không Bỏ Trống");
//            return;
//        }
        if (rdDaThanhToan.isSelected()) {
            tt = "Da Thanh Toan";
        } else if (rdChuaThanhToan.isSelected()) {
            tt = "Chua Thanh Toan";
        } else {
            JOptionPane.showMessageDialog(this, "Trạng Thái Không Bỏ Trống");
            return;
        }

        sanpham1 sp = new sanpham1(ma, ten, sl, gia, mau, tt);
        Boolean add = ql.add(sp);
        if (add) {
            JOptionPane.showMessageDialog(this, "Thêm Thành Công");
            loadData(ql.getlist());
        }
    }//GEN-LAST:event_btnThemMouseClicked

    private void btnTimKiemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTimKiemMouseClicked
        // TODO add your handling code here:
//        Integer gia = Integer.parseInt(txtGia.getText());
        String ma = txtma.getText();
        if (ma.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã Không Bỏ Trống");
            return;
        }
        ArrayList<sanpham1> tim = ql.tim(ma);
        loadData(tim);
    }//GEN-LAST:event_btnTimKiemMouseClicked

    private void btnCapNhatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCapNhatMouseClicked
        // TODO add your handling code here:
        int row = tblsp.getSelectedRow();
        String ma = txtma.getText();
        String ten = txtTen.getText();
        Integer sl = Integer.parseInt(txtsl.getText());
        float gia = Float.parseFloat(txtGia.getText());
        String mau = txtMauSac.getSelectedItem().toString();
        String tt = "";
        if (rdDaThanhToan.isSelected()) {
            tt = "Đã Thanh Toán";
        } else {
            tt = "Chưa Thanh Toán";
        }
        sanpham1 sp = new sanpham1(ma, ten, sl, gia, mau, tt);
        Boolean up = ql.update(row, sp);
        if (up) {
            JOptionPane.showMessageDialog(this, "Cập Nhật Thành Công");
            loadData(ql.getlist());
        }
    }//GEN-LAST:event_btnCapNhatMouseClicked

    private void btnHienThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHienThiMouseClicked
        // TODO add your handling code here:
        ArrayList<sanpham1> list = ql.getlist();
        loadData(list);
    }//GEN-LAST:event_btnHienThiMouseClicked

    private void btnCapNhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCapNhatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCapNhatActionPerformed

    private void btnXoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnXoaMouseClicked
        // TODO add your handling code here:
        String ma = txtma.getText();
        if (ma.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Khong Bo Trong Ma");
        } else {
            ArrayList<sanpham1> delete = ql.xoa(ma);
            JOptionPane.showMessageDialog(this, "Xoa Thanh Cong");
            loadData(delete);
        }
    }//GEN-LAST:event_btnXoaMouseClicked

    private void tblspMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblspMouseClicked
        // TODO add your handling code here:
        int i = tblsp.getSelectedRow();
        String ma = (String) tblsp.getValueAt(i, 1);
        txtma.setText(ma);
        String ten = (String) tblsp.getValueAt(i, 2);
        txtTen.setText(ten);
        Integer soLuong = (Integer) tblsp.getValueAt(i, 3);
        txtsl.setText(String.valueOf(soLuong));
        float gia = (float) tblsp.getValueAt(i, 4);
        txtGia.setText(String.valueOf(gia));
        String mau = (String) tblsp.getValueAt(i, 5);
        txtMauSac.setSelectedItem(mau);
        String trangThai = (String) tblsp.getValueAt(i, 6);
        if (trangThai.equals("Đã Thanh Toán")) {
            rdDaThanhToan.setSelected(true);
        } else {
            rdChuaThanhToan.setSelected(true);
        }
    }//GEN-LAST:event_tblspMouseClicked

    private void rdDaThanhToanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdDaThanhToanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdDaThanhToanActionPerformed

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LTView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LTView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LTView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LTView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LTView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCapNhat;
    private javax.swing.JButton btnHienThi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdChuaThanhToan;
    private javax.swing.JRadioButton rdDaThanhToan;
    private javax.swing.JTable tblsp;
    private javax.swing.JTextField txtGia;
    private javax.swing.JComboBox<String> txtMauSac;
    private javax.swing.JTextField txtTen;
    private javax.swing.JTextField txtma;
    private javax.swing.JTextField txtsl;
    // End of variables declaration//GEN-END:variables
}
