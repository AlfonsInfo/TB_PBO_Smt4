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
import model.Departemen;
import model.Transaksi;
import model.Produk;
import model.DetailTransaksi;
import model.Karyawan;

public class DetailTransaksiDAO {
    
    private DbConnection dbcon = new DbConnection();
    private Connection con;
   
    public List<DetailTransaksi> showDetailTransaksi(String query) {
        con = dbcon.makeConnection();
        
        String sql = "SELECT dt.*, t.*, p.*, k.*, d.* FROM detail_transaksi as dt JOIN transaksi as t ON dt.nomor_transaksi = t.nomor_transaksi JOIN produk as p ON dt.id_produk = p.id_produk JOIN karyawan as k ON t.id_karyawan = k.id_karyawan JOIN departemen as d ON k.id_departemen = d.id_departemen "
                + " WHERE (t.nomor_transaksi LIKE " + "'%" + query + "%')";
        

        System.out.println("Mengambil data Detail Transaksi...");
        
        List<DetailTransaksi> list = new ArrayList();
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if (rs != null) {
                while (rs.next()){
                    Produk p = new Produk(rs.getString("p.id_produk"), rs.getString("p.nama_produk"), Integer.parseInt(rs.getString("p.harga_produk")));
                    
                    Departemen d = new Departemen(Integer.parseInt(rs.getString("d.id_departemen")), rs.getString("d.nama_departemen"), rs.getString("d.alamat"));
                    
                    Karyawan k = new Karyawan(Integer.parseInt(rs.getString("k.id_karyawan")), rs.getString("k.nama"), rs.getString("k.email"), Float.parseFloat(rs.getString("k.gaji")), d,  Float.parseFloat(rs.getString("k.bonus")));
                    
                    Transaksi t = new Transaksi(rs.getString("t.nomor_transaksi"), rs.getString("t.tanggal_transaksi"), k, Integer.parseInt(rs.getString("t.jumlah_produk")), p);
                    
                    DetailTransaksi dt = new DetailTransaksi(rs.getString("dt.nomor_detail_transaksi"), t,
                            Integer.parseInt(rs.getString("dt.jumlah_produk")), Integer.parseInt(rs.getString("dt.jumlah_total_harga_produk")),
                            p);
                    list.add(dt);
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error reading database...");
            System.out.println(e);
        }

        dbcon.closeConnection();

        return list;
    }
              
}
