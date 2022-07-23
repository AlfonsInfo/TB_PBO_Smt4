/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Karyawan;
public class TableKaryawan extends AbstractTableModel{
    
    private List<Karyawan> list;
    
    public TableKaryawan(List<Karyawan> list){
        this.list=list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 6;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch (columnIndex){
            case 0:
                return list.get(rowIndex).getId_karyawan();
            case 1:
                return list.get(rowIndex).getNama();
            case 2:
                return list.get(rowIndex).getEmail();
            case 3: 
                return list.get(rowIndex).getDepartemen().getNama_departemen();
            case 4:
                return list.get(rowIndex).getGaji();
            case 5:
                return list.get(rowIndex).getBonus();
            case 6:
                return list.get(rowIndex).getDepartemen().getId_departemen();
            default:
                return null;
    }
    }
        public String getColumnName(int column){
            switch(column){
                case 0:
                   return "ID Karyawan";
                
                case 1:
                   return "Nama Karyawan";
                            
                case 2:
                   return "Email";
                            
                case 3:
                   return "Departemen";
                
                case 4:
                    return "Gaji";
                
                case 5:
                    return "Bonus";
                
                default:
                    return null;
            }
        }
    }
    
    

