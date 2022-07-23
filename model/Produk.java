/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Produk {
    private String id_produk;
    private String nama_produk;
    private float harga_produk;
    
    
    public Produk(String id_produk, String nama_produk, float harga_produk){
        this.id_produk = id_produk;
        this.nama_produk = nama_produk;
        this.harga_produk = harga_produk;
    }
    
    public Produk(String nama_produk, float harga_produk){
        this.nama_produk = nama_produk;
        this.harga_produk = harga_produk;
    }
    
    public String getId_produk(){
        return id_produk;
    }
    
    public void setId_produk(String id_produk){
        this.id_produk = id_produk;
    }
    
    public String getNama_produk(){
        return nama_produk;
    }
    
    public void setNama_departemen(String nama_produk){
        this.nama_produk = nama_produk;
    }
    
    public float getHarga_produk(){
        return harga_produk;
    }
    
    public void setHarga_produk(float harga_produk){
        this.harga_produk = harga_produk;
    }
    
    @Override
    public String toString(){
        return nama_produk;
    }
}
