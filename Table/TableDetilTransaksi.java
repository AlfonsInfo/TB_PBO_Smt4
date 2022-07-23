/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Table;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.DetailTransaksi;

public class TableDetilTransaksi extends AbstractTableModel{
    
    private List<DetailTransaksi> list;
    
    public TableDetilTransaksi(List<DetailTransaksi> list){
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
                return list.get(rowIndex).getNomor_detail_transaksi();
            case 1: 
                return list.get(rowIndex).getTransaksi().getTanggal_transaksi();
            case 2:
                return list.get(rowIndex).getTransaksi().getKaryawan().getNama();
            case 3:
                return list.get(rowIndex).getProduk().getNama_produk();
            case 4:
                return list.get(rowIndex).getTransaksi().getJumlah_produk();
            case 5:
                return list.get(rowIndex).getJumlah_total_harga_produk();
            default:
                return null;   
                
            
    }
}
    public String getColumnName(int column){
            switch(column){
                                            
                case 0:
                   return "Nomor Detail Transaksi";
                            
                case 1:
                   return "Tanggal Transaksi";
                
                case 2:
                    return "Nama Karyawan";
                    
                case 3:
                    return "Nama Produk";
                    
                case 4:
                    return "Jumlah Produk";
                    
                case 5:
                    return "Jumlah Total Harga Produk";
                    
                default:
                    return null;
            }
    }
}
