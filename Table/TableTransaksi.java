/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Transaksi;

public class TableTransaksi extends AbstractTableModel  {
    
    private List<Transaksi> list;
    
    public TableTransaksi(List<Transaksi> list){
        this.list=list;
    }
    
    public int getRowCount(){
        return list.size();
    }
    
    public int getColumnCount(){
        return 4;
    }
    
    public Object getValueAt(int rowIndex, int columnIndex){
        switch (columnIndex){
            case 0:
                return list.get(rowIndex).getNomor_transaksi();
            case 1:
                return list.get(rowIndex).getTanggal_transaksi();
            case 2:
                return list.get(rowIndex).getKaryawan().getId_karyawan();
            case 3: 
                return list.get(rowIndex).getJumlah_produk();
            
            default:
                return null;          
    }
    }
    
    public String getColumnName(int column){
            switch(column){
                case 0:
                   return "Nomor Transaksi";
                
                case 1:
                   return "Tanggal";
                            
                case 2:
                   return "Nama Karyawan";
                            
                case 3:
                   return "Total";
                                               
                default:
                    return null;
            }
        }

}

