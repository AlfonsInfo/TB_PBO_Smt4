/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author user
 */
public class Karyawan {
    private int id_karyawan;
    private String nama;
    private String email;
    private float gaji;
    private Departemen departemen; 
    private float bonus;
    
    
    public Karyawan(int id_karyawan, String nama, String email, float gaji, Departemen departemen, float bonus){
        this.id_karyawan = id_karyawan;
        this.nama = nama;
        this.email = email;
        this.gaji = gaji;
        this.departemen = departemen;
        this.bonus = bonus;
    }
    
    public Karyawan(int id_karyawan, String nama, String email, float gaji, float bonus){
        this.id_karyawan = id_karyawan;
        this.nama = nama;
        this.email = email;
        this.gaji = gaji;
        this.bonus = bonus;
    }
    
    public int getId_karyawan(){
        return id_karyawan;
    }
    
    public void setId_karyawan(int id_karyawan){
        this.id_karyawan = id_karyawan;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public float getGaji(){
        return gaji;
    }
    
    public void setGaji(float gaji){
        this.gaji = gaji;
    }
    
    public Departemen getDepartemen(){
        return departemen;
    }
    
    public void setDepartemen(Departemen departemen){
        this.departemen = departemen;
    }
    
    public float getBonus(){
        return bonus;
    }
    
    public void setBonus(float bonus){
        this.bonus = bonus;
    }
    
    @Override
    public String toString(){
        return nama;
    }
}
