/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.DetailTransaksiDAO;
import model.DetailTransaksi;
import Table.TableDetilTransaksi;
import java.util.List;

/**
 *
 * @author user
 */
public class DetailTransaksiControl {
    private DetailTransaksiDAO dtdao = new DetailTransaksiDAO();
    
    
    //aku ubah 
    public TableDetilTransaksi showDetailTransaksi(String query){
       List<DetailTransaksi> dataTransaksi = dtdao.showDetailTransaksi(query);
       TableDetilTransaksi tabledetiltransaksi = new TableDetilTransaksi(dataTransaksi);
       
       return tabledetiltransaksi;
    }
}
