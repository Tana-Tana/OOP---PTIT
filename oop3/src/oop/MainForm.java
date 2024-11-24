/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package oop;

import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.stream.Collectors;

/**
 *
 * @author buiph
 */
public class MainForm extends javax.swing.JFrame {

    private DefaultTableModel tm;
    private List<MonHoc> list;
    private static int sMa=1;
    private int rowSua;
    private MonHoc monHocSua;

    public int getRowSua() {
        return rowSua;
    }

    public void setRowSua(int rowSua) {
        this.rowSua = rowSua;
    }

    public MonHoc getMonHocSua() {
        return monHocSua;
    }

    public void setMonHocSua(MonHoc monHocSua) {
        this.monHocSua = monHocSua;
    }
    
    public MainForm() {
        initComponents();
        setTitle("Quản lý phòng thực hành");
        setLocationRelativeTo(null);
        initTable();
        btnThem.addActionListener(e->{
            FormThem f = new FormThem(this,true);
            f.setVisible(true);
        });
        
        btnLuuFile.addActionListener(e->{
            IOFile.ghi("MONHOC.dat", list);
        });
        
        btnSua.addActionListener(e->{
            int row = tbMonHoc.getSelectedRow();
            if(row >= 0 && row < tbMonHoc.getRowCount()) {
                setRowSua(row);
                setMonHocSua(list.get(row));
                FormSua f = new FormSua(this,true);
                f.setVisible(true);
            }else{
                JOptionPane.showMessageDialog(this, "Chọn dòng để sửa");
            }
        });
        
        btnXoa.addActionListener(e->{
            int row = tbMonHoc.getSelectedRow();
            if(row != -1) {
                list.remove(row);
                tm.setRowCount(0);
                for(MonHoc i : list) {
                    tm.addRow(i.toObject());
                }
            }else{
                JOptionPane.showMessageDialog(this, "Chọn dòng để xóa");
            }
        });
        
        btnTimKiem.addActionListener(e->{
            String key = txtTimKiem.getText().toLowerCase();
            List<MonHoc> tmp = new ArrayList<>();
            if(key != null && !key.isEmpty()) {
                for(MonHoc i : list) {
                    if(i.getTenMon().toLowerCase().contains(key) ||
                            i.getLoaiMon().toLowerCase().contains(key)) {
                        tmp.add(i);
                    }
                }
                tm.setRowCount(0);
                for(MonHoc i : tmp) {
                    tm.addRow(i.toObject());
                }
            } 
        });
        
        cbSapXep.addItemListener((ItemEvent e) -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                String selectedItem = (String) e.getItem();
                if ("Tên phòng TH".equals(selectedItem)) {
                    list.sort(Comparator.comparing(MonHoc::getTenMon));
                } else if ("Số máy tính".equals(selectedItem)) {
                    list.sort(Comparator.comparingInt(MonHoc::getSoTinChi));
                }
                refreshTable();
            }
        });
        
        btnHienThi.addActionListener(e->{
            tm.setRowCount(0);
            for(MonHoc i : list) {
                tm.addRow(i.toObject());
            }
        });
        
//        btnThongKe.addActionListener(e->{
//            txtThongKe.setText("Thống kê tổng số tín chỉ theo từng loại môn học");
//            Map<String,Integer> m = list.stream().collect(
//            Collectors.groupingBy(MonHoc::getLoaiMon,
//            Collectors.summingInt(MonHoc::getSoTinChi)));
//            m.forEach((k,v)->{
//                txtThongKe.append("\n"+k+": "+v);
//            });
//        });
        
    }
    
    private void initTable() {
        String[] headers = {"Ma", "Tên phòng TH", "Số máy tính","Loại phòng"};
        tm = new DefaultTableModel(headers, 0);
        tbMonHoc.setModel(tm);
        
        list = IOFile.doc("MONHOC.dat");
        if(list == null) {
            list = new ArrayList<>();
        } else {
            for(MonHoc x : list) {
                tm.addRow(x.toObject());
            }
            list.sort((MonHoc m1, MonHoc m2)->m1.getMaMon().compareTo(m2.getMaMon()));
            sMa=Integer.parseInt(list.get(list.size() - 1).getMaMon().substring(3) + 1);
        }
    }
    
    public void themMoi(String tenMon, Integer soTin, String loaiMon) {
        MonHoc mh = new MonHoc(String.format("%05d", sMa++), tenMon, soTin, loaiMon);
        tm.addRow(mh.toObject());
        list.add(mh);
    }
    
    public void capNhat(MonHoc monHoc) {
        list.set(getRowSua(), monHoc);
        refreshTable();
    }
    
    public void refreshTable() {
        tm.setRowCount(0);
        for(MonHoc i : list) {
            tm.addRow(i.toObject());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tbMonHoc = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnLuuFile = new javax.swing.JButton();
        btnHienThi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        cbSapXep = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        btnTimKiem = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtThongKe = new javax.swing.JTextArea();
        btnThongKe = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tbMonHoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbMonHoc);

        btnThem.setForeground(new java.awt.Color(51, 51, 255));
        btnThem.setText("Thêm mới");

        btnXoa.setForeground(new java.awt.Color(51, 51, 255));
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnSua.setForeground(new java.awt.Color(51, 51, 255));
        btnSua.setText("Sửa");

        btnLuuFile.setForeground(new java.awt.Color(51, 51, 255));
        btnLuuFile.setText("Lưu File");

        btnHienThi.setForeground(new java.awt.Color(51, 51, 255));
        btnHienThi.setText("Hiển thị");

        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("Sắp xếp theo:");

        cbSapXep.setForeground(new java.awt.Color(51, 51, 255));
        cbSapXep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tên phòng TH", "Số máy tính" }));

        jLabel2.setForeground(new java.awt.Color(51, 0, 255));
        jLabel2.setText("Tìm theo:");

        txtTimKiem.setForeground(new java.awt.Color(51, 51, 255));

        btnTimKiem.setForeground(new java.awt.Color(51, 0, 255));
        btnTimKiem.setText("Tìm kiếm");

        txtThongKe.setEditable(false);
        txtThongKe.setColumns(20);
        txtThongKe.setForeground(new java.awt.Color(51, 51, 255));
        txtThongKe.setRows(5);
        jScrollPane2.setViewportView(txtThongKe);

        btnThongKe.setForeground(new java.awt.Color(51, 0, 255));
        btnThongKe.setText("Thống kê");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnThem)
                                .addGap(48, 48, 48)
                                .addComponent(btnXoa)
                                .addGap(45, 45, 45)
                                .addComponent(btnSua)
                                .addGap(53, 53, 53)
                                .addComponent(btnLuuFile)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                                .addComponent(btnHienThi))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(43, 43, 43)
                                        .addComponent(btnThongKe))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(44, 44, 44)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnTimKiem)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnXoa)
                    .addComponent(btnSua)
                    .addComponent(btnLuuFile)
                    .addComponent(btnHienThi))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTimKiem)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbSapXep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(btnThongKe)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHienThi;
    private javax.swing.JButton btnLuuFile;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton btnTimKiem;
    private javax.swing.JButton btnXoa;
    private javax.swing.JComboBox<String> cbSapXep;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbMonHoc;
    private javax.swing.JTextArea txtThongKe;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
}
