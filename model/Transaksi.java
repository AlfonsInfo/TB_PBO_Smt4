/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Transaksi {
    private String nomor_transaksi ;
    private String tanggal_transaksi ;
    private Karyawan karyawan;
    private Produk produk;
    private int jumlah_produk;
    
    public Transaksi(String nomor_transaksi, String tanggal_transaksi, Karyawan karyawan, int jumlah_produk, Produk produk){
        this.nomor_transaksi = nomor_transaksi;
        this.tanggal_transaksi = tanggal_transaksi;
        this.karyawan = karyawan;
        this.jumlah_produk = jumlah_produk;
        this.produk = produk;
    }
    
    public Transaksi(String nomor_transaksi, String tanggal_transaksi, Karyawan karyawan,Produk produk){
        this.nomor_transaksi = nomor_transaksi;
        this.tanggal_transaksi = tanggal_transaksi;
        this.karyawan = karyawan;
        this.produk = produk;
    }
    
    public String getNomor_transaksi(){
        return nomor_transaksi;
    }
    
    public void setNomor_transaksi(String nomor_transaksi){
        this.nomor_transaksi = nomor_transaksi;
    }
    
    public String getTanggal_transaksi(){
        return tanggal_transaksi;
    }
    
    public void setTanggal_transaksi(String tanggal_transaksi){
        this.tanggal_transaksi = tanggal_transaksi;
    }
    
    public Karyawan getKaryawan(){
        return karyawan;
    }
    
    public void setKaryawan(Karyawan karyawan){
        this.karyawan = karyawan;
    }

    public void setJumlah_produk(int jumlah_produk) {
        this.jumlah_produk = jumlah_produk;
    }

    public int getJumlah_produk() {
        return jumlah_produk;
    }

    public Produk getProduk() {
        return produk;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }
}
