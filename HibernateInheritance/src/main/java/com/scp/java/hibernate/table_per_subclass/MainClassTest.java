package com.scp.java.hibernate.table_per_subclass;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClassTest {
	public static void main(String[] args) {
		Session session=new Configuration().configure("/com/scp/java/hibernate/table_per_subclass/hibernateInheri.cfg.xml").buildSessionFactory().openSession();
	   	Transaction tx=session.beginTransaction();
	   	ParentPojo po1=new ParentPojo(1,"Rajiv", "Pune");
	   	ParentPojo po2=new ParentPojo(2,"Narayn", "Mumbai");
	   	ParentPojo po3=new ParentPojo(3,"Mahadev", "Nashik");
	   	
	   	ChildPojo  ch1=new ChildPojo(4, "Laxman1", "Banglore1", 101, "Abhi1", "cAddress1");
	   	ChildPojo  ch2=new ChildPojo(5, "Laxman2", "Banglore2", 102, "Abhi2", "cAddress2");
	   	
	   	session.persist(po1);
	   	session.persist(po2);
	   	session.persist(po3);
	   	session.persist(ch1);
	   	session.persist(ch2);
	   	tx.commit();
	   	System.out.println("object inserted Successfully");
	   	session.close();
	   
	}

}
