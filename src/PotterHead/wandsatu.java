/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PotterHead;

/**
 *
 * @author Lenovo
 */
public class wandsatu extends merch {
private double total;
    wandsatu(int jumlah){
    super (jumlah);
    }
    
	@Override
    public void totalharga (){
    }
    
    @Override
    public String tampil(){
        this.total = (double) 95000 * jumlah;
        super.tampil();
        return String.format("%-15s:%s", "Total Harga", this.total);
    }
}
