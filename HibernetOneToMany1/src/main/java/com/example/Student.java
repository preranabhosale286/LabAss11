package com.example;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="StudentDetails")
public class Student 
{
	@Id
	private int srollno;
	private String name;
	@OneToMany(cascade=CascadeType.ALL)
	List<Laptop>laptop;
	
	public Student() 
	{
		
	}

	public int getSrollno() {
		return srollno;
	}

	public void setSrollno(int srollno) {
		this.srollno = srollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Laptop> getLaptop() {
		return laptop;
	}

	public void setLaptop(List<Laptop> laptop) {
		this.laptop = laptop;
	}
	
	
}
