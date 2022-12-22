package com.example;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;




public class App 
{
    public static void main( String[] args )
    {
        Configuration con=new Configuration().configure().addAnnotatedClass(Student.class);
        Configuration con1=new Configuration().configure().addAnnotatedClass(Laptop.class);
        
        SessionFactory sf=con.buildSessionFactory();
        Session ss=sf.openSession();
        Transaction T=ss.beginTransaction();
        
        Student s1=new Student();
        s1.setSrollno(201);
        s1.setName("Pratiksha");
        
        
        Laptop l1=new Laptop();
        Laptop l2=new Laptop();
       l1.setLid(1);
       l1.setLbrand("Lenovo");
       l1.setL_Price(59000);
        //
       l2.setLid(2);
       l2.setLbrand("HP");
       l2.setL_Price(60000);
        
        List<Laptop> lap=new ArrayList<Laptop>();
        lap.add(l1);
        lap.add(l2);
        s1.setLaptop(lap);
        
        ss.persist(s1);
        
        T.commit();
        ss.close();
        
        
        
    }
}
