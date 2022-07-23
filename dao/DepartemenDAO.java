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


//id_departemen,nama_departemen,alamat
public class DepartemenDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    //CRUD
    
    // Create / Insert
    //View departemen -> memasukan data, mengubah data, menghapus data, menampilkan data berdasarkan departemen. 
    public void insertDepartemen(Departemen d)
    {
        con = dbcon.makeConnection();
        
        String sql = "INSERT INTO departemen (id_departemen, nama_departemen, alamat) "
                + "VALUES ('"+d.getId_departemen()+"', '"+ d.getNama_departemen() +"', '"
                + d.getAlamat()+"')";
        System.out.println("Adding Departemen");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Adding "+result+" Departemen");
            statement.close();           
        }catch(Exception e)
        {
            System.out.println("Error Adding Departemen...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
    // Read  / Show  
    
    
    //Untuk show daftar departemen ke combobox / TextArea
    
    //coba dlu
    public List<Departemen> showDepartemenBySearch(String query)
    {
        con = dbcon.makeConnection();
        String sql = "SELECT * From departemen WHERE ("
                + "id_departemen LIKE '%" + query + "%'"
                + "OR nama_departemen LIKE '%" + query +"%'"
                + "OR alamat LIKE '%" + query +"%')";
        System.out.println("Mengambil data departemen");
        
        List<Departemen> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs !=null)
            {
                while(rs.next())
                {
                    Departemen d = new Departemen(
                            rs.getInt("id_departemen"),
                            rs.getString("nama_departemen"),
                            rs.getString("alamat")                            
                            );
                    list.add(d);
                }
            }
            rs.close();
            statement.close();
        }catch(Exception e)
        {
            System.out.println("Error reading database departemen...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return list;       
    }    
    //Update --> mau di update berdasarkan id, atau di klik dari tabel? 
    public void updateDepartemen(Departemen d )
    {
        con = dbcon.makeConnection();
        
        String sql = "UPDATE departemen SET nama_departemen = '" + d.getNama_departemen() +"', "
                +"alamat = '"+d.getAlamat() +"' "
                + "WHERE id_departemen = "+ d.getId_departemen()+" ";
        System.out.println("Editing Departemen");
        
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Edited "+ result + "Departemen");
        }catch(Exception e)
        {
            System.out.println("Error editing departemen");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
    //Delete
    public void deleteDepartemen(String id)
    {
        con = dbcon.makeConnection();
    
        String sql = "DELETE FROM departemen Where id_departemen = '" +id+"'";
        System.out.println("Deleting Departemen");
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Departemen "+ id);
            statement.close();
        }catch(Exception e)
        {
            System.out.println("Error deleting Departemen");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
  
    
    
    //Search 
    //Search berdasarkan id 
    public Departemen searchDepartemen(String id)
    {
        con = dbcon.makeConnection();
        
        String sql = "SELECT * FROM departemen WHERE id_departemen '" +id+"'";
        System.out.println("Searching Departemen");
        Departemen d = null;
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null)
            {
                while(rs.next())
                {
                    d = new Departemen(
                            rs.getInt("id_departemen"),
                            rs.getString("nama_departemen"),
                            rs.getString("alamat")                            
                    );
                }
            }
            rs.close();
            statement.close();
        } catch(Exception e)
        {
            System.out.println("Error reading departemen...");
            System.out.println(e);
        }
        
        dbcon.closeConnection();
        return d;
    }
    
    public List<Departemen> showDepartemen() {
        con = dbcon.makeConnection();
        
        String sql = "SELECT * From departemen";

        System.out.println("Mengambil data departemen...");
        
        List<Departemen> list = new ArrayList();
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if (rs != null) {
                while (rs.next()) {
                    Departemen d = new Departemen(rs.getInt("id_departemen"),rs.getString("nama_departemen"),rs.getString("alamat"));
                    list.add(d);
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
