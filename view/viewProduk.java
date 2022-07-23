/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Table.TableProduk;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import control.ProdukControl;
import exception.InputKosongException;
import java.util.List;
import model.Produk;


public class viewProduk extends javax.swing.JFrame {
    private ProdukControl produkControl;
    String action = null;
    List<Produk> listProduk;
    int selectedId = 0;
    
    public viewProduk() {
        initComponents();
        setComponent(false);
        setEditDeleteBtn(false);
        
        produkControl = new ProdukControl();
        
        showProduk();
    }

    public void setComponent(boolean value){
         IDProdukInput.setEnabled(value);
         NamaProdukInput.setEnabled(value);
         HargaProdukInput.setEnabled(value);
         
         saveBtn.setEnabled(value);
         cancelBtn.setEnabled(value);
    }
    
    public void setEditDeleteBtn(boolean value){
        editBtn.setEnabled(value);
        deleteBtn.setEnabled(value);
    }
    
    public void clearText(){
        NamaProdukInput.setText("");
        IDProdukInput.setText("");
        HargaProdukInput.setText("");
        
        searchInput.setText("");
    }
    
     public void showProduk(){
        produkTable.setModel(produkControl.showDataProduk(""));
    }
     
    
    public void inputKosongException() throws InputKosongException{
        if (IDProdukInput.getText().isEmpty() || NamaProdukInput.getText().isEmpty() || HargaProdukInput.getText().isEmpty()) {
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
        searchInput = new javax.swing.JTextField();
        IDProduklbl = new javax.swing.JLabel();
        IDProdukInput = new javax.swing.JTextField();
        NamaProduklbl = new javax.swing.JLabel();
        NamaProdukInput = new javax.swing.JTextField();
        HargaProduklbl = new javax.swing.JLabel();
        HargaProdukInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        produkTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();

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
                            .addComponent(departemen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addComponent(lblProduk))
                    .addComponent(lblKaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
            .addGroup(SideBarLayout.createSequentialGroup()
                .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(SideBarLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(SideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDepartemen, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(logoPerusahaan, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(SideBarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblDetailTransaksi, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                .addContainerGap(184, Short.MAX_VALUE))
        );

        ContainerPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        lblTitle.setText("Produk");

        searchInput.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N

        IDProduklbl.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        IDProduklbl.setText("ID Produk");

        IDProdukInput.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N

        NamaProduklbl.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        NamaProduklbl.setText("Nama Produk");

        NamaProdukInput.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N

        HargaProduklbl.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        HargaProduklbl.setText("Harga Produk");

        HargaProdukInput.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N

        produkTable.setModel(new javax.swing.table.DefaultTableModel(
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
        produkTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                produkTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(produkTable);

        addBtn.setBackground(new java.awt.Color(0, 204, 0));
        addBtn.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Tambah");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        editBtn.setBackground(new java.awt.Color(255, 153, 0));
        editBtn.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        editBtn.setForeground(new java.awt.Color(255, 255, 255));
        editBtn.setText("Ubah");
        editBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editBtnActionPerformed(evt);
            }
        });

        deleteBtn.setBackground(new java.awt.Color(204, 0, 0));
        deleteBtn.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        deleteBtn.setForeground(new java.awt.Color(255, 255, 255));
        deleteBtn.setText("Hapus");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        searchBtn.setBackground(new java.awt.Color(0, 0, 204));
        searchBtn.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        searchBtn.setForeground(new java.awt.Color(255, 255, 255));
        searchBtn.setText("Cari");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
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

        saveBtn.setBackground(new java.awt.Color(0, 204, 0));
        saveBtn.setFont(new java.awt.Font("Nirmala UI", 1, 12)); // NOI18N
        saveBtn.setForeground(new java.awt.Color(255, 255, 255));
        saveBtn.setText("Simpan");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerPanelLayout = new javax.swing.GroupLayout(ContainerPanel);
        ContainerPanel.setLayout(ContainerPanelLayout);
        ContainerPanelLayout.setHorizontalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                        .addComponent(lblTitle)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                        .addComponent(NamaProduklbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerPanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addGap(19, 19, 19))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerPanelLayout.createSequentialGroup()
                        .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerPanelLayout.createSequentialGroup()
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(HargaProduklbl)
                                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                                        .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IDProduklbl)
                                            .addComponent(addBtn))
                                        .addGap(8, 8, 8)
                                        .addComponent(editBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(deleteBtn)))
                                .addGap(129, 129, 129)
                                .addComponent(searchInput, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))
                            .addGroup(ContainerPanelLayout.createSequentialGroup()
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(HargaProdukInput, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(NamaProdukInput, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IDProdukInput, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(307, 307, 307)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(saveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelBtn)
                        .addGap(24, 24, 24))))
        );
        ContainerPanelLayout.setVerticalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(0, 81, Short.MAX_VALUE)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(addBtn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(editBtn)
                        .addComponent(deleteBtn)
                        .addComponent(searchBtn)))
                .addGap(18, 18, 18)
                .addComponent(IDProduklbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDProdukInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NamaProduklbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NamaProdukInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HargaProduklbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(HargaProdukInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
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

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        setComponent(true);
        clearText();
        searchInput.setText("");
        action = "Tambah";
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        setComponent(true);
        action = "Ubah";
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ingin menghapus data ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        
        switch (getAnswer) {
            case 0:
                try {
                    produkControl.deleteProduk(String.valueOf(IDProdukInput.getText()));
                    clearText();
                    showProduk();
                    setComponent(false);
                    setEditDeleteBtn(false);
                } catch (Exception e) {
                    System.out.println("Error : " + e.getMessage());
                }
            break;
                 
            case 1:    
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        try{
            inputKosongException();
            
            if (action.equals("Tambah")) {
                Produk p = new Produk(IDProdukInput.getText(), NamaProdukInput.getText(), Float.parseFloat(HargaProdukInput.getText()));
                produkControl.insertProduk(p);
            }else{
                Produk p = new Produk(NamaProdukInput.getText(), Float.parseFloat(HargaProdukInput.getText()));
                produkControl.updateProduk(p, IDProdukInput.getText());
            }

            clearText();
            showProduk();
            setComponent(false);
            setEditDeleteBtn(false);
        }catch(InputKosongException e){
            JOptionPane.showMessageDialog(this, e.message());
        }catch(Exception e1){
            JOptionPane.showMessageDialog(this, e1.getMessage());
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        setEditDeleteBtn(false);
        setComponent(false);
        
        try{
            TableProduk produk = produkControl.showDataProduk(searchInput.getText());
            if(produk.getRowCount() == 0){
                clearText();
                setEditDeleteBtn(false);
                JOptionPane.showConfirmDialog(null, "Data tidak ditemukan", "Konfirmasi", JOptionPane.DEFAULT_OPTION);
            }else{
                produkTable.setModel(produk);
            }
            clearText();
        }catch(Exception e){
            System.out.println("Error : " +e.getMessage());
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void produkTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_produkTableMouseClicked
        setEditDeleteBtn(true);
        setComponent(false);
        
        int clickedRow = produkTable.getSelectedRow();
        TableModel tableModel = produkTable.getModel();

        IDProdukInput.setText(tableModel.getValueAt(clickedRow, 0).toString());
        NamaProdukInput.setText(tableModel.getValueAt(clickedRow, 1).toString());
        HargaProdukInput.setText(tableModel.getValueAt(clickedRow, 2).toString());
    }//GEN-LAST:event_produkTableMouseClicked

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        setComponent(false);
        clearText();
    }//GEN-LAST:event_cancelBtnActionPerformed

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
            java.util.logging.Logger.getLogger(viewProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewProduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewProduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContainerPanel;
    private javax.swing.JTextField HargaProdukInput;
    private javax.swing.JLabel HargaProduklbl;
    private javax.swing.JTextField IDProdukInput;
    private javax.swing.JLabel IDProduklbl;
    private javax.swing.JTextField NamaProdukInput;
    private javax.swing.JLabel NamaProduklbl;
    private javax.swing.JPanel SideBar;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel departemen;
    private javax.swing.JLabel detailTransaksi;
    private javax.swing.JButton editBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel karyawan;
    private javax.swing.JLabel lblDepartemen;
    private javax.swing.JLabel lblDetailTransaksi;
    private javax.swing.JLabel lblKaryawan;
    private javax.swing.JLabel lblProduk;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTransaksi;
    private javax.swing.JLabel logoPerusahaan;
    private javax.swing.JLabel produk;
    private javax.swing.JTable produkTable;
    private javax.swing.JButton saveBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchInput;
    private javax.swing.JLabel transaksi;
    // End of variables declaration//GEN-END:variables
}
