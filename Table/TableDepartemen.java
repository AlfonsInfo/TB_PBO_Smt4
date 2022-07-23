/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Departemen;

public class TableDepartemen extends AbstractTableModel{
    
    private List<Departemen> list;
    
    public TableDepartemen(List<Departemen> list){
        this.list=list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 3;
    }
    
        public Object getValueAt(int rowIndex, int columnIndex){
        switch (columnIndex){
            case 0:
                return list.get(rowIndex).getId_departemen();
            case 1:
                return list.get(rowIndex).getNama_departemen();
            case 2:
                return list.get(rowIndex).getAlamat();
            default:
                return null;
        }      
        }
        
         public String getColumnName(int column){
            switch(column){
                case 0:
                   return "ID Departemen";
                
                case 1:
                   return "Nama Departemen";
                            
                case 2:
                   return "Alamat";         
  
                default:
                    return null;
            
             }
        }
    }
    

