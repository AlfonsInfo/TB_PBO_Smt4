/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Departemen {
    private int id_departemen;
    private String nama_departemen ;
    private String alamat;
    
    
    public Departemen(int id_departemen, String nama_departemen, String alamat){
        this.id_departemen = id_departemen;
        this.nama_departemen = nama_departemen;
        this.alamat = alamat;
    }
    
    public Departemen(String nama_departemen, String alamat){
        this.nama_departemen = nama_departemen;
        this.alamat = alamat;
    }
    
    public int getId_departemen(){
        return id_departemen;
    }
    
    public void setId_departemen(int id_departemen){
        this.id_departemen = id_departemen;
    }
    
    public String getNama_departemen(){
        return nama_departemen;
    }
    
    public void setNama_departemen(String nama_departemen){
        this.nama_departemen = nama_departemen;
    }
    
    public String getAlamat(){
        return alamat;
    }
    
    public void setAlamat(String alamat){
        this.alamat = alamat;
    }
    
    @Override
    public String toString(){
        return nama_departemen;
    }
}
