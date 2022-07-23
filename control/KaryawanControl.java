/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.KaryawanDAO;
import java.util.List;
import model.Karyawan;
import Table.TableKaryawan;

/**
 *
 * @author user
 */
public class KaryawanControl {
    private KaryawanDAO kdao = new KaryawanDAO();
    
    public void insertDepartemen(Karyawan k){
     kdao.insertKaryawan(k);
    }
    
    public TableKaryawan showKaryawan(String query){
        List<Karyawan> dataKaryawan = kdao.showKaryawan(query);
        TableKaryawan tableKaryawan = new TableKaryawan(dataKaryawan);
        
        return tableKaryawan;
    }
    
    public List<Karyawan> showListAllKaryawan()
    {
        List<Karyawan> dataKaryawan = kdao.showKaryawan();
        return dataKaryawan;
    }
    
    
    public void updateKaryawan(Karyawan k){
        kdao.updateKaryawan(k);
    }
    
    public void deleteKaryawan(String id){
        kdao.deleteKaryawan(id);
    }
    
    public TableKaryawan showKaryawanByDepartemen(String query){
        List<Karyawan> dataKaryawan = kdao.showKaryawanByDepartemen(query);
        TableKaryawan tableKaryawan = new TableKaryawan(dataKaryawan);
        
        return tableKaryawan;
    }
    /*
    public Departemen searchDepartemen(String id){
        Departemen d = null;
        d = kdao.searchDepartemen(id);
        return d;
    }
    */
}
