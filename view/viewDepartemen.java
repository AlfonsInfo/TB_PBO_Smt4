/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import control.DepartemenControl;
import exception.InputKosongException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import model.Departemen;
import Table.TableDepartemen;

public class viewDepartemen extends javax.swing.JFrame {

    private DepartemenControl departemenControl;
    String action = null;
    List<Departemen> listDepartemenBySearch;
    int selectedId = 0;
    
    public viewDepartemen() {
        initComponents();
        setComponent(false);
        setEditDeleteBtn(false);
        departemenControl = new DepartemenControl();
        showDepartemen();
    }

    public void setComponent(boolean value){
         IDDepartemenInput.setEnabled(value);
         NamaDepartemenInput.setEnabled(value);
         AlamatDepartemenInput.setEnabled(value);
         
         saveBtn.setEnabled(value);
         cancelBtn.setEnabled(value);
    }
    
    public void setEditDeleteBtn(boolean value){
        editBtn.setEnabled(value);
        deleteBtn.setEnabled(value);
    }
    
    public void clearText(){
        NamaDepartemenInput.setText("");
        IDDepartemenInput.setText("");
        AlamatDepartemenInput.setText("");
        
        searchInput.setText("");
    }
    
    public void showDepartemen() {
        tabelDepartemen.setModel(departemenControl.showDepartemen(""));
    }
    
    public void inputKosongException() throws InputKosongException{
        if (NamaDepartemenInput.getText().isEmpty() || AlamatDepartemenInput.getText().isEmpty()) {
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
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        searchInput = new javax.swing.JTextField();
        IDDepartemenlbl = new javax.swing.JLabel();
        IDDepartemenInput = new javax.swing.JTextField();
        NamaDepartemenlbl = new javax.swing.JLabel();
        NamaDepartemenInput = new javax.swing.JTextField();
        AlamatDepartemenlbl = new javax.swing.JLabel();
        AlamatDepartemenInput = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelDepartemen = new javax.swing.JTable();

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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        ContainerPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        lblTitle.setText("Departemen");

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

        searchInput.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        searchInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchInputActionPerformed(evt);
            }
        });

        IDDepartemenlbl.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        IDDepartemenlbl.setText("ID Departemen");

        IDDepartemenInput.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N

        NamaDepartemenlbl.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        NamaDepartemenlbl.setText("Nama Departemen");

        NamaDepartemenInput.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N

        AlamatDepartemenlbl.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        AlamatDepartemenlbl.setText("Alamat Departemen");

        AlamatDepartemenInput.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N

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

        tabelDepartemen.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelDepartemen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelDepartemenMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelDepartemen);

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
                        .addComponent(NamaDepartemenlbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerPanelLayout.createSequentialGroup()
                        .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(ContainerPanelLayout.createSequentialGroup()
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(saveBtn)
                                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                                        .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(NamaDepartemenInput, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(IDDepartemenInput, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, ContainerPanelLayout.createSequentialGroup()
                                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                                                        .addComponent(addBtn)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(editBtn))
                                                    .addComponent(IDDepartemenlbl))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(deleteBtn))
                                            .addComponent(AlamatDepartemenlbl, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(AlamatDepartemenInput, javax.swing.GroupLayout.Alignment.LEADING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(searchBtn)
                                    .addComponent(cancelBtn))))
                        .addGap(35, 35, 35))))
        );
        ContainerPanelLayout.setVerticalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(18, 18, 18)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn)
                    .addComponent(editBtn)
                    .addComponent(deleteBtn)
                    .addComponent(searchBtn)
                    .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(IDDepartemenlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDDepartemenInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NamaDepartemenlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NamaDepartemenInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AlamatDepartemenlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(AlamatDepartemenInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveBtn)
                    .addComponent(cancelBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        setComponent(true);
        clearText();
        searchInput.setText("");
        action = "Tambah";
    }//GEN-LAST:event_addBtnActionPerformed

    private void editBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editBtnActionPerformed
        setComponent(true);
        IDDepartemenInput.setEnabled(false);
        action = "Ubah";
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ingin menghapus data ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        
        if(getAnswer == JOptionPane.YES_OPTION){
            try{
                departemenControl.deleteDepartemen(IDDepartemenInput.getText());
                clearText();
                showDepartemen();
                JOptionPane.showMessageDialog(null, "Data berhasil dihapus !");
            }catch(Exception e){
                System.out.println("Error : " +e.getMessage());
            }
        }else{JOptionPane.showMessageDialog(null, "Data tidak jadi dihapus !");}
       
    }//GEN-LAST:event_deleteBtnActionPerformed

    private void searchInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchInputActionPerformed

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed

        setEditDeleteBtn(true);//fase
        setComponent(false);
        try{
            TableDepartemen departemen = departemenControl.showDepartemen(searchInput.getText());
            if(departemen.getRowCount() == 0)
            {
                clearText();
                setEditDeleteBtn(false);
                JOptionPane.showConfirmDialog(null, "Data tidak ditemukan","konfirmasi",JOptionPane.DEFAULT_OPTION);
            }else{
               tabelDepartemen.setModel(departemen);
               IDDepartemenInput.setText(departemen.getValueAt(0, 0).toString());
            }
        }catch(Exception e)
        {
            System.out.println("Error : "+e.getMessage());
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        setComponent(false);
        clearText();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        try {
            inputKosongException();
            
            Departemen d = new Departemen(Integer.parseInt(IDDepartemenInput.getText().toString()), NamaDepartemenInput.getText(),
                    AlamatDepartemenInput.getText());
            if (action.equals("Tambah")) {
                departemenControl.insertDepartemen(d);
            } else {
                departemenControl.updateDepartemen(d);
            }
            clearText();
            showDepartemen();
            setComponent(false);
            setEditDeleteBtn(false);
        } catch (InputKosongException e) {
            JOptionPane.showMessageDialog(this, e.message());
        } catch(Exception e1){
            JOptionPane.showMessageDialog(this, e1.getMessage());
        }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void tabelDepartemenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelDepartemenMouseClicked
        setEditDeleteBtn(true);
        setComponent(false);
       
       int clickedRow = tabelDepartemen.getSelectedRow();
       TableModel tableModel = tabelDepartemen.getModel();
       
       selectedId = Integer.parseInt(tableModel.getValueAt(clickedRow, 0).toString());
       IDDepartemenInput.setText(String.valueOf(selectedId));
       NamaDepartemenInput.setText(tableModel.getValueAt(clickedRow, 1).toString());
       AlamatDepartemenInput.setText(tableModel.getValueAt(clickedRow, 2).toString());
    }//GEN-LAST:event_tabelDepartemenMouseClicked

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
            java.util.logging.Logger.getLogger(viewDepartemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewDepartemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewDepartemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewDepartemen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new viewDepartemen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AlamatDepartemenInput;
    private javax.swing.JLabel AlamatDepartemenlbl;
    private javax.swing.JPanel ContainerPanel;
    private javax.swing.JTextField IDDepartemenInput;
    private javax.swing.JLabel IDDepartemenlbl;
    private javax.swing.JTextField NamaDepartemenInput;
    private javax.swing.JLabel NamaDepartemenlbl;
    private javax.swing.JPanel SideBar;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel departemen;
    private javax.swing.JLabel detailTransaksi;
    private javax.swing.JButton editBtn;
    private javax.swing.JScrollPane jScrollPane2;
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
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchInput;
    private javax.swing.JTable tabelDepartemen;
    private javax.swing.JLabel transaksi;
    // End of variables declaration//GEN-END:variables
}
