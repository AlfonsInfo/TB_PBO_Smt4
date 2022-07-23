/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import Table.TableKaryawan;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import control.KaryawanControl;
import control.DepartemenControl;
import exception.InputKosongException;
import java.util.List;
import model.Karyawan;
import model.Departemen;

public class viewKaryawan extends javax.swing.JFrame {
    private KaryawanControl karyawanControl;
    private DepartemenControl departemencontrol;
    String action = null;
    List<Karyawan> listKaryawan;
    List<Departemen> listDepartemen;
    int selectedId = 0;
    
    public viewKaryawan(){
        initComponents();
        setComponent(false);
        setEditDeleteBtn(false);
        karyawanControl = new KaryawanControl();
        departemencontrol = new DepartemenControl();
        showKaryawan();
        setDepartemenToDropDown();
    }

    public void setComponent(boolean value){
        IDKaryawanInput.setEnabled(value);
        NamaKaryawanInput.setEnabled(value);
        EmailInput.setEnabled(value);
        GajiInput.setEnabled(value);
        NamaDepartemenDropDown.setEnabled(value);
        saveBtn.setEnabled(value);
        cancelBtn.setEnabled(value);
    }
    
    public void setEditDeleteBtn(boolean value){
        editBtn.setEnabled(value);
        deleteBtn.setEnabled(value);
    }
    
    public void clearText(){
        IDKaryawanInput.setText("");
        NamaKaryawanInput.setText("");
        EmailInput.setText("");
        GajiInput.setText("");
        NamaDepartemenDropDown.setSelectedItem(false);

        searchInput.setText("");
    }
    
    
    public void setDepartemenToDropDown()
    {
        listDepartemen = departemencontrol.showListAllDepartemen();
        for(int i = 0 ;i<listDepartemen.size();i++)
        {
            NamaDepartemenDropDown.addItem(listDepartemen.get(i));
        }
    }
    
     public void showKaryawan(){
        tabelKaryawan.setModel(karyawanControl.showKaryawan(""));
    }
     
    
    public void inputKosongException() throws InputKosongException{
        if (IDKaryawanInput.getText().isEmpty() || NamaKaryawanInput.getText().isEmpty() || EmailInput.getText().isEmpty()) {
            throw new InputKosongException();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
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
        IDKaryawanlbl = new javax.swing.JLabel();
        NamaKaryawanlbl = new javax.swing.JLabel();
        NamaKaryawanInput = new javax.swing.JTextField();
        Emaillbl = new javax.swing.JLabel();
        EmailInput = new javax.swing.JTextField();
        addBtn = new javax.swing.JButton();
        editBtn = new javax.swing.JButton();
        deleteBtn = new javax.swing.JButton();
        searchBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        IDDepartemenlbl = new javax.swing.JLabel();
        NamaDepartemenDropDown = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelKaryawan = new javax.swing.JTable();
        IDKaryawanInput = new javax.swing.JTextField();
        Gajilbl = new javax.swing.JLabel();
        GajiInput = new javax.swing.JTextField();

        jMenu1.setText("jMenu1");

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
                .addContainerGap(383, Short.MAX_VALUE))
        );

        ContainerPanel.setBackground(new java.awt.Color(255, 255, 255));

        lblTitle.setFont(new java.awt.Font("Nirmala UI", 1, 36)); // NOI18N
        lblTitle.setText("Karyawan");

        searchInput.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N

        IDKaryawanlbl.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        IDKaryawanlbl.setText("ID Karyawan");

        NamaKaryawanlbl.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        NamaKaryawanlbl.setText("Nama Karyawan");

        NamaKaryawanInput.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N

        Emaillbl.setBackground(new java.awt.Color(0, 0, 0));
        Emaillbl.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        Emaillbl.setText("Email Karyawan");

        EmailInput.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N

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

        IDDepartemenlbl.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        IDDepartemenlbl.setText("Nama Departemen");

        NamaDepartemenDropDown.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        NamaDepartemenDropDown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaDepartemenDropDownActionPerformed(evt);
            }
        });

        tabelKaryawan.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelKaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelKaryawanMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelKaryawan);

        IDKaryawanInput.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N

        Gajilbl.setFont(new java.awt.Font("Nirmala UI", 1, 18)); // NOI18N
        Gajilbl.setText("Gaji Karyawan");

        GajiInput.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        GajiInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GajiInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ContainerPanelLayout = new javax.swing.GroupLayout(ContainerPanel);
        ContainerPanel.setLayout(ContainerPanelLayout);
        ContainerPanelLayout.setHorizontalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerPanelLayout.createSequentialGroup()
                        .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ContainerPanelLayout.createSequentialGroup()
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IDKaryawanlbl)
                                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                                        .addComponent(addBtn)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(editBtn)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                                .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ContainerPanelLayout.createSequentialGroup()
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(NamaKaryawanInput, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(IDKaryawanInput, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Gajilbl, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(GajiInput)
                                    .addComponent(EmailInput, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(316, 316, 316)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(searchBtn)
                        .addGap(25, 25, 25))
                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                        .addComponent(NamaDepartemenDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(255, 255, 255)
                        .addComponent(saveBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelBtn))
                    .addGroup(ContainerPanelLayout.createSequentialGroup()
                        .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Emaillbl)
                            .addComponent(lblTitle)
                            .addComponent(IDDepartemenlbl)
                            .addComponent(NamaKaryawanlbl))
                        .addContainerGap())))
        );
        ContainerPanelLayout.setVerticalGroup(
            ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ContainerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle)
                .addGap(0, 100, Short.MAX_VALUE)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(addBtn)
                        .addComponent(editBtn)
                        .addComponent(deleteBtn))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(searchInput, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(searchBtn)))
                .addGap(18, 18, 18)
                .addComponent(IDKaryawanlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(IDKaryawanInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NamaKaryawanlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NamaKaryawanInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(1, 1, 1)
                .addComponent(Gajilbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GajiInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Emaillbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(EmailInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(IDDepartemenlbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveBtn)
                        .addComponent(cancelBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(NamaDepartemenDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
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
        IDKaryawanInput.setEnabled(false);
        action = "Ubah";
    }//GEN-LAST:event_editBtnActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        int getAnswer = JOptionPane.showConfirmDialog(rootPane, "Apakah yakin ingin menghapus data ?","Konfirmasi",JOptionPane.YES_NO_OPTION);
        
        switch (getAnswer) {
            case 0:
                try {
                    karyawanControl.deleteKaryawan(String.valueOf(IDKaryawanInput.getText()));
                    clearText();
                   showKaryawan();
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
            int selectedIndex = NamaDepartemenDropDown.getSelectedIndex();
            Departemen selectedDepartemen = listDepartemen.get(selectedIndex);
            float bonus;
            if(selectedDepartemen.getNama_departemen().equalsIgnoreCase("sales"))
            {
                bonus = 100000f;
            }else
            {
                bonus = 0f;
            }
            
            if (action.equals("Tambah")) {
                Karyawan k = new Karyawan(Integer.parseInt(IDKaryawanInput.getText()), NamaKaryawanInput.getText(),EmailInput.getText(), Float.parseFloat(GajiInput.getText()),selectedDepartemen, bonus);           
                   karyawanControl.insertDepartemen(k);
         
            }else{
                Karyawan k = new Karyawan(Integer.parseInt(IDKaryawanInput.getText()), NamaKaryawanInput.getText(),EmailInput.getText(), Float.parseFloat(GajiInput.getText()),selectedDepartemen, bonus);
                karyawanControl.updateKaryawan(k);
            }

            clearText();
            showKaryawan();
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
            TableKaryawan karyawan = karyawanControl.showKaryawan(searchInput.getText());
            if(karyawan.getRowCount() == 0)
            {
                clearText();
                setEditDeleteBtn(false);
                JOptionPane.showConfirmDialog(null, "Data tidak ditemukan", "Konfirmasi", JOptionPane.DEFAULT_OPTION);
            }else
            {
                tabelKaryawan.setModel(karyawan);
            }
            clearText();            
        }catch(Exception e){
            System.out.println("Error : " +e.getMessage());
        }
    }//GEN-LAST:event_searchBtnActionPerformed

    private void tabelKaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelKaryawanMouseClicked
        int indexDepartemen = -1;
        setEditDeleteBtn(true);
        setComponent(false);
        
        int clickedRow = tabelKaryawan.getSelectedRow();
        TableModel tableModel = tabelKaryawan.getModel();

        IDKaryawanInput.setText(tableModel.getValueAt(clickedRow, 0).toString());
        NamaKaryawanInput.setText(tableModel.getValueAt(clickedRow, 1).toString());
        EmailInput.setText(tableModel.getValueAt(clickedRow, 2).toString());
        GajiInput.setText(tableModel.getValueAt(clickedRow, 4).toString());
        
        int idDepartemen = Integer.parseInt(tableModel.getValueAt(clickedRow, 6).toString());
        for(Departemen departemen : listDepartemen){
            if(departemen.getId_departemen() == idDepartemen){
                indexDepartemen = listDepartemen.indexOf(departemen);
            }
        }
        NamaDepartemenDropDown.setSelectedIndex(indexDepartemen);
       
    }//GEN-LAST:event_tabelKaryawanMouseClicked

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        setComponent(false);
        clearText();
    }//GEN-LAST:event_cancelBtnActionPerformed

    private void GajiInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GajiInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GajiInputActionPerformed

    private void NamaDepartemenDropDownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaDepartemenDropDownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaDepartemenDropDownActionPerformed

    
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
            java.util.logging.Logger.getLogger(viewKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(viewKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(viewKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(viewKaryawan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new viewKaryawan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ContainerPanel;
    private javax.swing.JTextField EmailInput;
    private javax.swing.JLabel Emaillbl;
    private javax.swing.JTextField GajiInput;
    private javax.swing.JLabel Gajilbl;
    private javax.swing.JLabel IDDepartemenlbl;
    private javax.swing.JTextField IDKaryawanInput;
    private javax.swing.JLabel IDKaryawanlbl;
    private javax.swing.JComboBox<Departemen> NamaDepartemenDropDown;
    private javax.swing.JTextField NamaKaryawanInput;
    private javax.swing.JLabel NamaKaryawanlbl;
    private javax.swing.JPanel SideBar;
    private javax.swing.JButton addBtn;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel departemen;
    private javax.swing.JLabel detailTransaksi;
    private javax.swing.JButton editBtn;
    private javax.swing.JMenu jMenu1;
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
    private javax.swing.JTable tabelKaryawan;
    private javax.swing.JLabel transaksi;
    // End of variables declaration//GEN-END:variables
}
