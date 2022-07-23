/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.DepartemenDAO;
import java.util.List;
import model.Departemen;
import Table.TableDepartemen;

public class DepartemenControl {
    private DepartemenDAO ddao = new DepartemenDAO();
    
    public void insertDepartemen(Departemen d){
     ddao.insertDepartemen(d);
    }
    
    public TableDepartemen showDepartemen (String query){
        List<Departemen> dataDepartemen= ddao.showDepartemenBySearch(query);
        TableDepartemen tableDepartemen = new TableDepartemen(dataDepartemen);
                
        return tableDepartemen;
    }
    
    public List<Departemen> showListAllDepartemen()
    {
        List<Departemen> dataDepartemen = ddao.showDepartemen();
        return dataDepartemen;
    }
    
    public void updateDepartemen(Departemen d){
        ddao.updateDepartemen(d);
    }
    public void deleteDepartemen(String id){
        ddao.deleteDepartemen(id);
    }
    
    public Departemen searchDepartemen(String id){
        Departemen d = null;
        d = ddao.searchDepartemen(id);
        return d;
    }
}
