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
public class infosatu extends Info{
private double total;
    infosatu(int power){
    super (power);
    }

	@Override
    public void besarkekuatan (){
    }
    
    @Override
    public String tampil(){
        this.total = (double) 2 * power;
        super.tampil();
        return String.format("%-15s:%s", "maksimal", this.total);
    }
}