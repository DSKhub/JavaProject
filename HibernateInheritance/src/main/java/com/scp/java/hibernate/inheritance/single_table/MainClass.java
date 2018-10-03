package com.scp.java.hibernate.inheritance.single_table;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {

	public static void main(String[] args) {
		Session session=new Configuration().configure("com/scp/java/hibernate/inheritance/HibernateInheritance/hibernate.cfg.xml").buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		Parent p1=new Parent(3, "Satish");
		Child c1=new Child(4, "Rahul",  204, "Raj");
		/*Parent p1=new Parent();
		p1.setpName("Satish");
		
		Child c1=new Child();
		c1.setcName("Rajiv");
		c1.setpName("Abhi");
		c1.setcId(101);*/
		session.persist(p1);
		session.persist(c1);
		session.flush();
		tx.commit();
		
		System.out.println("object Insert successfully");
		session.close();
	}
}
