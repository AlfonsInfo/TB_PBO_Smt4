/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import dao.TransaksiDAO;
import java.util.List;
import model.Transaksi;

public class TransaksiControl {
    private TransaksiDAO tdao = new TransaksiDAO();
    
    public void insertTransaksi(Transaksi t){
        tdao.insertTransaksi(t);
    }
}
