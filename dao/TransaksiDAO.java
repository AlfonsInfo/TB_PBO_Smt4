/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Transaksi;
import model.Produk;

/**
 *
 * @author user
 */
public class TransaksiDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    public void insertTransaksi(Transaksi t) {
        con = dbcon.makeConnection();
                
        String sql = "INSERT INTO transaksi(nomor_transaksi, tanggal_transaksi, id_karyawan, id_produk, jumlah_produk) "
                + "VALUES ('" + t.getNomor_transaksi() + "', '" +t.getTanggal_transaksi()+ "', '"
                +t.getKaryawan().getId_karyawan()+ "', '" +t.getProduk().getId_produk()+ "', '" +t.getJumlah_produk()+ "')";
        System.out.println("Adding Transaksi...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Transaksi");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error adding Transaksi...");
            System.out.println(e);
        }
        
        dbcon.closeConnection();
    }
}
