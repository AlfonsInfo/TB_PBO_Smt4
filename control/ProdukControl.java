/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package control;

import Table.TableProduk;
import dao.ProdukDAO;
import model.Produk;
import java.util.List;

public class ProdukControl {
    private ProdukDAO pdao = new ProdukDAO();
    
    public void insertProduk(Produk p){
        pdao.insertProduk(p);
    }
    
    public List<Produk> showProduk(){
        List<Produk> dataProduk = pdao.showProduk();
        return dataProduk;
    }
    
    public TableProduk showDataProduk(String query){
        List<Produk> dataProduk = pdao.showProdukBySearch(query);
        TableProduk tableProduk = new TableProduk(dataProduk);

        return tableProduk;
    }

    
    public Produk searchProduk(String id){
        Produk p = null;
        p = pdao.searchProduk(id);
        
        return p;
    }
    
    public void updateProduk(Produk p, String id){
        pdao.updateProduk(p, id);
    }
    
    public void deleteProduk(String id){
        pdao.deleteProduk(id);
    }
}
