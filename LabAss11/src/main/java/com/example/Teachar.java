//name:Prerana Bhosale
//relationship: one to many
//program : one teacher many courses

package com.example;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Teachar {
	@Id
	private int T_id;
	private String T_Name;
	public Teachar() {
		
		// TODO Auto-generated constructor stub
	}
	public Teachar(int t_id, String t_Name) {
		super();
		T_id = t_id;
		T_Name = t_Name;
	}
	public int getT_id() {
		return T_id;
	}
	public void setT_id(int t_id) {
		T_id = t_id;
	}
	public String getT_Name() {
		return T_Name;
	}
	public void setT_Name(String t_Name) {
		T_Name = t_Name;
	}
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Courses> Courses;
	public List<Courses> getCourses() {
		return Courses;
	}
	public void setCourses(List<Courses> courses) {
		Courses = courses;
	}
}