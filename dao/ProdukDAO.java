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
import model.Produk;

public class ProdukDAO {
    
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    public void insertProduk(Produk p) {
        con = dbcon.makeConnection();
                
        String sql = "INSERT INTO produk(id_produk, nama_produk, harga_produk) VALUES ('" 
                + p.getId_produk() + "','" + p.getNama_produk() + "','"
                + p.getHarga_produk() + "')";
        System.out.println("Adding Produk...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added " + result + " Produk");
            statement.close();
        } catch (Exception e) {
            System.out.println("Error adding Produk...");
            System.out.println(e);
        }
        
        dbcon.closeConnection();
    }
    
    public List<Produk> showProduk() {
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM produk";

        System.out.println("Mengambil data Produk...");
        
        List<Produk> list = new ArrayList();
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if (rs != null) {
                while (rs.next()) {
                    Produk k = new Produk(
                            rs.getString("id_produk"),
                            rs.getString("nama_produk"),
                            Float.parseFloat(rs.getString("harga_produk"))       
                    );
                    list.add(k);
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
    
    public List<Produk> showProdukBySearch(String query)
    {
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM produk WHERE (id_produk LIKE " 
                + "'%" + query + "%'"
                + "OR nama_produk LIKE '%" + query + "%'"
                + "OR harga_produk LIKE '%" + query + "%')";

        System.out.println("Mengambil data Produk...");
        
        List<Produk> list = new ArrayList();
        
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if (rs != null) {
                while (rs.next()) {
                    Produk p = new Produk(rs.getString("id_produk"), 
                            rs.getString("nama_produk"), 
                            Float.parseFloat(rs.getString("harga_produk")));
                    list.add(p);
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

    public Produk searchProduk(String id) {
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM produk WHERE id_produk = '" + id + "'";

        System.out.println("Searching Produk...");
        
        Produk p = null;
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if (rs != null) {
                while (rs.next()) {
                    p = new Produk(
                            rs.getString("id_produk"),
                            rs.getString("nama_produk"),
                            Float.parseFloat(rs.getString("harga_produk"))       
                    );
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e) {
            System.out.println("Error reading database...");
            System.out.println(e);
        }

        dbcon.closeConnection();

        return p;
    }
       

    public void updateProduk(Produk p, String id) {
        con = dbcon.makeConnection();
        
        String sql = "UPDATE produk SET nama_produk = '" +p.getNama_produk()
                + "', harga_produk = '" +p.getHarga_produk()
                +"' WHERE id_produk = '" +id+ "' ";
        

        
        System.out.println("Editing Produk...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited " + result + " Produk" + id);
            statement.close();
        } catch (Exception e) {
            System.out.println("Error editing produk...");
            System.out.println(e);
        }

        dbcon.closeConnection();
    }
    
    public void deleteProduk(String id) {
        con = dbcon.makeConnection();
        
        String sql = "DELETE FROM produk WHERE id_produk = '" + id + "'";

        System.out.println("Deleting Produk...");
        
        try {
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Produk " + id);
            statement.close();
        } catch (Exception e) {
            System.out.println("Error deleting Produk...");
            System.out.println(e);
        }

        dbcon.closeConnection();
        }
   

}
