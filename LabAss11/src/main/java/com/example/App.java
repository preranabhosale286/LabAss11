//name:Prerana Bhosale
//relationship: one to many
//program : one teacher many courses


        package com.example;
        import java.util.ArrayList;
    	import java.util.List;
    	import org.hibernate.Session;
    	import org.hibernate.SessionFactory;
    	import org.hibernate.Transaction;
    	import org.hibernate.cfg.Configuration;
    	/**
    	 * Hello world!
    	 *
    	 */
    	public class App 
    	{
    	    public static void main( String[] args )
    	     {
    	    	Configuration con=new Configuration().configure().addAnnotatedClass(Courses.class);
    	    	Configuration conl=new Configuration().configure().addAnnotatedClass(Teachar.class);
    	    	 SessionFactory sf= con.buildSessionFactory();
    	    	 Session ss= sf.openSession();
    	    	 Transaction T= ss.beginTransaction();
    	    
    	    	 Teachar T1 = new Teachar();//create the obj of teacher
    	    	 T1.setT_id(1);
    	    	 T1.setT_Name("Prerana");
    	    	 
    	    	 Courses C1 =new Courses();
    	    	 Courses C2 = new Courses();//create the obj of courses
    	    	 Courses C3 = new Courses();
    	    	 
    	    	 C1.setC_id(101);//add the course id 
    	    	 C2.setC_id(102);
    	    	 C3.setC_id(103);
    	    	 
    	    	 C1.setC_Name("Java Progaramming");//add the course list
    	    	 C2.setC_Name("Pyton Progaramming");
    	    	 C3.setC_Name("Angular Progaramming");
    	    	 
    	    	 List<Courses> Cos = new ArrayList<Courses>();
    	    	 
    	    	 Cos.add(C1);
    	    	 Cos.add(C2);
    	    	 Cos.add(C3);
    	    	 
    	    	 T1.setCourses (Cos);
    	    	 
    	    	 ss.save(T1);
    	    	 T.commit();//commit
    	    	
    	        System.out.println( "Hello World!" );
    	    }
    	}
    
