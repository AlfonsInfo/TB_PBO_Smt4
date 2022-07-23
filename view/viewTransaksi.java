/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import control.KaryawanControl;
import control.DepartemenControl;
import control.TransaksiControl;
import control.ProdukControl;
import exception.InputKosongException;
import java.util.List;
import model.Produk;
import model.DetailTransaksi;
import model.Karyawan;
import model.Departemen;
import model.Transaksi;

public class viewTransaksi extends javax.swing.JFrame {

    private KaryawanControl karyawanControl;
    private TransaksiControl transaksiControl;
    private ProdukControl produkControl;
    String action = null;
    List<Karyawan> listKaryawan;
    List<Produk> listProduk;
    List<Transaksi> listTransaksi;
    int selectedId = 0;
    
    public viewTransaksi() {
        initComponents();
        setComponent(true);
        karyawanControl = new KaryawanControl();
        transaksiControl = new TransaksiControl();
        produkControl = new ProdukControl();
        setProdukToDropDown();
        setKaryawanToDropDown();
    }

    public void setComponent(boolean value){
         IDKaryawanDropDown.setEnabled(value);
         BarangDropDown.setEnabled(value);
         TransaksiInput.setEnabled(value);
         TanggalInput.setEnabled(value);
         JumlahInput.setEnabled(value);
         
         saveBtn.setEnabled(value);
         cancelBtn.setEnabled(value);
    }
    
    
    public void clearText(){
        TanggalInput.setText("");
        TransaksiInput.setText("");
        JumlahInput.setText("");
        IDKaryawanDropDown.setSelectedItem(false);
        BarangDropDown.setSelectedItem(false);
    }
    public void setProdukToDropDown(){
        listProduk = produkControl.showProduk();
        
        for(int i =0; i<listProduk.size();i++){
            BarangDropDown.addItem(listProduk.get(i));
        }
    }
    
    public void setKaryawanToDropDown(){
        listKaryawan = karyawanControl.showListAllKaryawan();
        for (int i = 0; i < listKaryawan.size(); i++) {
           IDKaryawanDropDown.addItem(listKaryawan.get(i));
        }
    }
    
    public void InputKosongException() throws InputKosongException{
        if (IDKaryawanDropDown.getSelectedIndex() == -1 || TransaksiInput.getText().isEmpty() || TanggalInput.getText().isEmpty() || JumlahInput.getText().isEmpty()|| BarangDropDown.getSelectedIndex()== -1) {
            throw new InputKosongException();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        SideBar = new javax.swing.JPanel();
        logoPerusahaan = new javax.swing.JLabel();
        departemen = new javax.swing.JLabel();
        lblDepartemen = new javax.swing.JLabel();
        karyawan = new javax.swing.JLabel();
        lblKaryawan = new javax.swing.JLabel();
        produk = new javax.swing.JLabel();
        lblProduk = new javax.swing.JLabel();
        transaksi = new javax.swing.JLabel();
        lblTransaksi = new javax.swing.JLabel();
        detailTransaksi = new javax.swing.JLabel();
        lblDetailTransaksi = new javax.swing.JLabel();
        ContainerPanel = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        TransaksiLabel = new javax.swing.JLabel();
        TransaksiInput = new javax.swing.JTextField();
        TanggalLabel = new javax.swing.JLabel();
        TanggalInput = new javax.swing.JTextField();
        JumlahLabel = new javax.swing.JLabel();
        JumlahInput = new javax.swing.JTextField();
        IdKaryawaLabel = new javax.swing.JLabel();
        IDKaryawanDropDown = new javax.swing.JComboBox<>();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        BarangDropDown = new javax.swing.JComboBox<>();
        NamaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        SideBar.setBackground(new java.awt.Color(173, 29, 36));
        SideBar.setForeground(new java.awt.Color(173, 29, 36));

        logoPerusahaan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Logo Perusahaan.png"))); // NOI18N
        logoPerusahaan.setText("jLabel1");

        departemen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Departemen.png"))); // NOI18N
        departemen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                departemenMouseClicked(evt);
            }
        });

        lblDepartemen.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lblDepartemen.setForeground(new java.awt.Color(255, 255, 255));
        lblDepartemen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDepartemen.setText("Departemen");

        karyawan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Karyawan .png"))); // NOI18N
        karyawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                karyawanMouseClicked(evt);
            }
        });

        lblKaryawan.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lblKaryawan.setForeground(new java.awt.Color(255, 255, 255));
        lblKaryawan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblKaryawan.setText("Karyawan");

        produk.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Produk .png"))); // NOI18N
        produk.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produkMouseClicked(evt);
            }
        });

        lblProduk.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lblProduk.setForeground(new java.awt.Color(255, 255, 255));
        lblProduk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblProduk.setText("Produk");

        transaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Transaksi.png"))); // NOI18N
        transaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transaksiMouseClicked(evt);
            }
        });

        lblTransaksi.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lblTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        lblTransaksi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTransaksi.setText("Transaksi");

        detailTransaksi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/Detail Transaksi .png"))); // NOI18N
        detailTransaksi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                detailTransaksiMouseClicked(evt);
            }
        });

        lblDetailTransaksi.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lblDetailTransaksi.setForeground(new java.awt.Color(255, 255, 255));
        lblDetailTransaksi.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDetailTransaksi.setText("Detail Transaksi");

        javax.swing.GroupLayout SideBarLayout = new javax.swing.GroupLayout(SideBar);
        SideBar.setLayout(SideBarLayout);
        SideBarLayout.setHorizontalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SideBarLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(detailTransaksi)
                        .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(transaksi, javax.swing.GroupLayout.DEFAULT_SIZE, 67, Short.MAX_VALUE)
                            .addComponent(produk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(karyawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(departemen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(SideBarLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lblProduk))))
                    .addComponent(lblKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addGroup(SideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDetailTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblDepartemen, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(logoPerusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        SideBarLayout.setVerticalGroup(
            SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(logoPerusahaan)
                .addGap(18, 18, 18)
                .addComponent(departemen)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDepartemen, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(karyawan)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(produk)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProduk, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(transaksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(detailTransaksi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDetailTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(168, Short.MAX_VALUE))
        );

        ContainerPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        lblTitle.setText("Transaksi");

        TransaksiLabel.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        TransaksiLabel.setText("Nomor Transaksi");

        TransaksiInput.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N

        TanggalLabel.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        TanggalLabel.setText("Tanggal Transaksi");

        TanggalInput.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        TanggalInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TanggalInputActionPerformed(evt);
            }
        });

        JumlahLabel.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        JumlahLabel.setText("Jumlah");

        JumlahInput.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        JumlahInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahInputActionPerformed(evt);
            }
        });

        IdKaryawaLabel.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        IdKaryawaLabel.setText("ID Karyawan");

        IDKaryawanDropDown.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        IDKaryawanDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDKaryawanDropDownActionPerformed(evt);
            }
        });

        saveBtn.setBackground(new java.awt.Color(0, 204, 0));
        saveBtn.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Simpan");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setBackground(new java.awt.Color(204, 0, 0));
        cancelBtn.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        cancelBtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelBtn.setText("Batal");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        BarangDropDown.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        BarangDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BarangDropDownActionPerformed(evt);
            }
        });

        NamaLabel.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        NamaLabel.setText("Nama Barang");

        javax.swing.GroupLayout ContainerPanelLayout = new javax.swing.GroupLayout(ContainerPanel);
        ContainerPanel.setLayout(ContainerPanelLayout);
        ContainerPanelLayout.setHorizontalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContainerPanelLayout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                        .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(ContainerPanelLayout.createSequentialGroup()
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(TanggalInput, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(TransaksiInput, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(IDKaryawanDropDown, 0, 232, Short.MAX_VALUE)
                                        .addComponent(TransaksiLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(IdKaryawaLabel, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(TanggalLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 95, Short.MAX_VALUE)
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(BarangDropDown, javax.swing.GroupLayout.Alignment.TRAILING, 0, 232, Short.MAX_VALUE)
                                    .addComponent(NamaLabel)
                                    .addComponent(JumlahLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JumlahInput)))
                            .addGroup(ContainerPanelLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(saveBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelBtn)
                        .addGap(35, 35, 35))))
        );
        ContainerPanelLayout.setVerticalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(58, 58, 58)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TransaksiLabel)
                    .addComponent(NamaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TransaksiInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BarangDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TanggalLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TanggalInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IdKaryawaLabel)
                    .addComponent(JumlahLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(IDKaryawanDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JumlahInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(cancelBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(SideBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SideBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(ContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JumlahInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JumlahInputActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        try{
           InputKosongException();
           int SelectedIndexK = IDKaryawanDropDown.getSelectedIndex();
           Karyawan SelectedK = listKaryawan.get(SelectedIndexK);
           
           int SelectedIndexP = BarangDropDown.getSelectedIndex();
           Produk SelectedP = listProduk.get(SelectedIndexP);
           
           Transaksi tk = new Transaksi(TransaksiInput.getText(), TanggalInput.getText(), SelectedK,Integer.parseInt(JumlahInput.getText()) , SelectedP);
           transaksiControl.insertTransaksi(tk);
           setComponent(false);
           saveBtn.setEnabled(true);
           cancelBtn.setEnabled(true);
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this,e.message());
        }catch(Exception e1){
            JOptionPane.showMessageDialog(this, e1.getMessage());
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
       setComponent(true);
       clearText();
    }//GEN-LAST:event_cancelBtnActionPerformed
    
    private void IDKaryawanDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDKaryawanDropDownActionPerformed
        
    }//GEN-LAST:event_IDKaryawanDropDownActionPerformed

    private void TanggalInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TanggalInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TanggalInputActionPerformed

    private void BarangDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BarangDropDownActionPerformed
        
    }//GEN-LAST:event_BarangDropDownActionPerformed

    private void departemenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_departemenMouseClicked
        viewDepartemen dv = new viewDepartemen();
        this.dispose();
        dv.setVisible(true);
    }//GEN-LAST:event_departemenMouseClicked

    private void karyawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_karyawanMouseClicked
        viewKaryawan dv = new viewKaryawan();
        this.dispose();
        dv.setVisible(true);
    }//GEN-LAST:event_karyawanMouseClicked

    private void produkMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produkMouseClicked
        viewProduk dv = new viewProduk();
        this.dispose();
        dv.setVisible(true);
    }//GEN-LAST:event_produkMouseClicked

    private void transaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaksiMouseClicked
        viewTransaksi dv = new viewTransaksi();
        this.dispose();
        dv.setVisible(true);
    }//GEN-LAST:event_transaksiMouseClicked

    private void detailTransaksiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_detailTransaksiMouseClicked
        viewDetailTransaksi dv = new viewDetailTransaksi();
        this.dispose();
        dv.setVisible(true);
    }//GEN-LAST:event_detailTransaksiMouseClicked
                          
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
            java.util.logging.Logger.getLogger(viewTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewTransaksi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewTransaksi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Produk> BarangDropDown;
    private javax.swing.JPanel ContainerPanel;
    private javax.swing.JComboBox<Karyawan> IDKaryawanDropDown;
    private javax.swing.JLabel IdKaryawaLabel;
    private javax.swing.JTextField JumlahInput;
    private javax.swing.JLabel JumlahLabel;
    private javax.swing.JLabel NamaLabel;
    private javax.swing.JPanel SideBar;
    private javax.swing.JTextField TanggalInput;
    private javax.swing.JLabel TanggalLabel;
    private javax.swing.JTextField TransaksiInput;
    private javax.swing.JLabel TransaksiLabel;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JLabel departemen;
    private javax.swing.JLabel detailTransaksi;
    private javax.swing.JLabel karyawan;
    private javax.swing.JLabel lblDepartemen;
    private javax.swing.JLabel lblDetailTransaksi;
    private javax.swing.JLabel lblKaryawan;
    private javax.swing.JLabel lblProduk;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTransaksi;
    private javax.swing.JLabel logoPerusahaan;
    private javax.swing.JLabel produk;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel transaksi;
    // End of variables declaration//GEN-END:variables
}
