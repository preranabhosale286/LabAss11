//name:Prerana Bhosale
//relationship: one to many
//program : one teacher many courses

package com.example;
import javax.persistence.Id;
import javax.persistence.Entity;
@Entity
public class Courses {
    @Id
	private int C_id;
	private String C_Name;
	public int getC_id() {
		return C_id;
	}
	public void setC_id(int c_id) {//create the getter setter method
		C_id = c_id;
	}
	public String getC_Name() {
		return C_Name;
	}
	public void setC_Name(String c_Name) {
		C_Name = c_Name;
	}
	public Courses(int c_id, String c_Name) {
		super();
		C_id = c_id;
		C_Name = c_Name;
	}
	public Courses() {
		
		// TODO Auto-generated constructor stub
	}
   
}