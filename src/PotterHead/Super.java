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
public class Super {

	//merch
	private String nama;
	private String alamat;
	private int jenis;
	int jumlah;
	
	public String getNama(){
    return nama;
    }
    public void setNama(String nm){
    this.nama=nm;
    }
	
	public String getAlamat(){
    return alamat;
    }
    public void setAlamat(String al){
    this.alamat=al;
    }
	
	public int getJenis(){
    return jenis;
    }
    public void setJenis(int jn){
    this.jenis=jn;
    }
	
	//info
	private String sihirA;
	private int usia;
	int power;
	
	
	public String getsihirA(){
    return sihirA;
    }
    public void setsihirA(String sa){
    this.sihirA=sa;
    }
	}

