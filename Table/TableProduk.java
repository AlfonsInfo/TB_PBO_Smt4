/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Produk;

public class TableProduk extends AbstractTableModel{
    private List<Produk> list;
    
    public TableProduk(List<Produk> list){
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
                return list.get(rowIndex).getId_produk();
            case 1:
                return list.get(rowIndex).getNama_produk();
            case 2:
                return list.get(rowIndex).getHarga_produk();
                        
            default:
                return null;          
    }
    }
    
    public String getColumnName(int column){
            switch(column){
                case 0:
                   return "ID Produk";
                
                case 1:
                   return "Nama Produk";
                            
                case 2:
                   return "Harga";           
                                                              
                default:
                    return null;
            }
        }

}
