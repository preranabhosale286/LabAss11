package com.example;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity(name ="NewLaptop")
public class Laptop 
{
	@Id
	private int lid;
	private String lbrand;
	private int L_Price;
	
	public Laptop() 
	{
		
	}
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getLbrand() {
		return lbrand;
	}
	public void setLbrand(String lbrand) {
		this.lbrand = lbrand;
	}
	public int getL_Price() {
		return L_Price;
	}
	public void setL_Price(int l_Price) {
		L_Price = l_Price;
	}
	
}
