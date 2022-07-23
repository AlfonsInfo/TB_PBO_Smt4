
package dao;
import connection.DbConnection;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.Karyawan;
import model.Departemen;
/**
 *
 * @author A412DA
 */

// int id_karyawan , String nama, email, float gaji, int id_departemen, String jabatan
public class KaryawanDAO {
    private DbConnection dbcon = new DbConnection();
    private Connection con;
    
    public void insertKaryawan(Karyawan p)
    {
        con = dbcon.makeConnection();
        String sql = "INSERT INTO karyawan (id_karyawan, nama, email, gaji, id_departemen, bonus) "
                + "VALUES ('" +p.getId_karyawan() + "', '"
                + p.getNama() + "', '"
                + p.getEmail() + "', '"
                + p.getGaji() + "', '"
                + p.getDepartemen().getId_departemen() + "', '"
                + p.getBonus() + " ')";
        System.out.println("Adding Karyawan...");
        
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Added "+ result + " Karyawan");
            statement.close();
        } catch (Exception e)
        {
            System.out.println("Error adding Karyawan...");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    //Combo box
    
    public List<Karyawan> showKaryawan() {
        con = dbcon.makeConnection();
        
        String sql = "SELECT * From karyawan";

        System.out.println("Mengambil data karyawan...");
        
        List<Karyawan> list = new ArrayList();
        
        try {
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if (rs != null) {
                while (rs.next()) {
                    
                    
                    Karyawan k = new Karyawan(rs.getInt("id_karyawan"), 
                            rs.getString("nama"), 
                            rs.getString("email"), 
                            rs.getFloat("gaji"), 
                            rs.getFloat("bonus"));
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
    
    public List<Karyawan> showKaryawan(String query)
    {
        con = dbcon.makeConnection();
        
        String sql = "SELECT k.*, d.* FROM karyawan as k JOIN departemen as d ON k.id_departemen = d.id_departemen WHERE ("
                + "k.id_karyawan LIKE '%" + query +"%'"
                + " OR k.nama LIKE '%" + query +"%'"
                + " OR k.email LIKE '%" + query +"%'"
                + " OR k.gaji LIKE '%" + query +"%'"
                + " OR d.nama_departemen LIKE '%" + query +"%'"
                + " OR k.bonus LIKE '%" + query +"%')";
        
        System.out.println("Mengambil data karyawan...");
        
        List<Karyawan> list = new ArrayList();
        
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
            if(rs != null)
            {
                while(rs.next())
                {
                    Departemen d = new Departemen(Integer.parseInt(rs.getString("id_departemen")), rs.getString("nama_departemen"), rs.getString("alamat"));
                    Karyawan k = new Karyawan(Integer.parseInt(rs.getString("id_karyawan")),
                            rs.getString("nama"), rs.getString("email"), 
                            Float.parseFloat(rs.getString("gaji")), d, 
                            Float.parseFloat(rs.getString("bonus"))
                    );
                    
                    list.add(k);
                }
            }
            rs.close();
            statement.close();
        } catch (Exception e)
        {
            System.out.println("Error reading database...");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return list;
    }
                //Update
        public void updateKaryawan(Karyawan k)
        {
            con = dbcon.makeConnection();
            
            String sql = "UPDATE karyawan SET nama = '"+k.getNama()
                    +"', email = '"+k.getEmail()
                    +"', gaji =  '"+k.getGaji()
                    +"', id_departemen = '"+k.getDepartemen().getId_departemen()
                    +"', bonus = '"+k.getBonus()
                    +"' WHERE id_karyawan = '"+k.getId_karyawan()+"'";
            
            System.out.println("Editing karyawan");
            
            try{
               Statement statement = con.createStatement();
               int result = statement.executeUpdate(sql);
                System.out.println("Edited " + result + " Karyawan " + k.getId_karyawan());
                statement.close();              
            }catch(Exception e)
            {
                System.out.println("Error editing data karyawan");
                System.out.println(e);
            }
            
            dbcon.closeConnection();
        }
        
        //Delete
    public void deleteKaryawan(String id)
    {
        con = dbcon.makeConnection();
    
        String sql = "DELETE FROM karyawan WHERE id_karyawan = '" +id+"'";
        System.out.println("Deleting Departemen");
        try{
            Statement statement = con.createStatement();
            int result = statement.executeUpdate(sql);
            System.out.println("Delete " + result + " Karyawan  "+ id);
            statement.close();
        }catch(Exception e)
        {
            System.out.println("Error deleting Departemen");
            System.out.println(e);
        }
        dbcon.closeConnection();
    }
    
    
        public List<Karyawan> showKaryawanByDepartemen(String query)
    {
        con = dbcon.makeConnection();
        String sql = " SELECT k.*, d.* FROM karyawan as k JOIN departemen as d ON k.id_departemen = d.id_departemen WHERE d.nama_departemen = '" +query+"'";
        System.out.println("Mengambil Data Karyawan");
        
        List<Karyawan> list = new ArrayList();
        try{
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            
           if( rs != null)
           {
               while(rs.next())
               {
                   Departemen d = new Departemen(Integer.parseInt(rs.getString("id_departemen")), rs.getString("nama_departemen"),rs.getString("alamat"));
                    Karyawan k = new Karyawan(Integer.parseInt(rs.getString("k.id_karyawan")),
                                 rs.getString("k.nama"),
                                 rs.getString("k.email"),
                                 Float.parseFloat(rs.getString("k.gaji")),
                                 d, Float.parseFloat(rs.getString("k.bonus")));
               }
           }
        }catch(Exception e)
        {
            System.out.println("Error reading database karyawan");
            System.out.println(e);
        }
        dbcon.closeConnection();
        return list;
    }
    

}