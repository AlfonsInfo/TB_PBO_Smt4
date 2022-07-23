/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class DetailTransaksi {
    private String nomor_detail_transaksi;
    private Transaksi transaksi;
    private int jumlah_produk ;
    private int jumlah_total_harga_produk ;
    private Produk produk;
    
    public DetailTransaksi(String nomor_detail_transaksi, Transaksi transaksi, int jumlah_produk, int jumlah_total_harga_produk, Produk produk){
        this.nomor_detail_transaksi = nomor_detail_transaksi;
        this.transaksi = transaksi;
        this.jumlah_produk = jumlah_produk;
        this.jumlah_total_harga_produk = jumlah_total_harga_produk;
        this.produk = produk;
    }
    
    public DetailTransaksi(Transaksi transaksi, int jumlah_produk, int jumlah_total_harga_produk, Produk produk){
        this.transaksi = transaksi;
        this.jumlah_produk = jumlah_produk;
        this.jumlah_total_harga_produk = jumlah_total_harga_produk;
        this.produk = produk;
    }
    
    public String getNomor_detail_transaksi(){
        return nomor_detail_transaksi;
    }
    
    public void setNomor_detail_transaksi(String nomor_detail_transaksi){
        this.nomor_detail_transaksi = nomor_detail_transaksi;
    }
    
    public Transaksi getTransaksi(){
        return transaksi;
    }
    
    public void setTransaksi(Transaksi transaksi){
        this.transaksi = transaksi;
    }
    
    public int getJumlah_produk(){
        return jumlah_produk;
    }
    
    public void setJumlah_produk(int jumlah_produk){
        this.jumlah_produk = jumlah_produk;
    }
    
    public int getJumlah_total_harga_produk(){
        return getJumlah_produk() * (int)getProduk().getHarga_produk();
    }
    
    public void setJumlah_total_harga_produk(int jumlah_total_harga_produk){
        this.jumlah_total_harga_produk = jumlah_total_harga_produk;
    }  
    
    public Produk getProduk(){
        return produk;
    }
    
    public void setProduk(Produk produk){
        this.produk = produk;
    }
}
