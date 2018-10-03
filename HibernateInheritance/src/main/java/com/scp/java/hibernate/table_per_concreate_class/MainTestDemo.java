package com.scp.java.hibernate.table_per_concreate_class;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainTestDemo {

	public static void main(String[] args) {
		Session session=new Configuration().configure("/com/scp/java/hibernate/table_per_concreate_class/hibernateDemo.cfg.xml").buildSessionFactory().openSession();
		Transaction tx=session.beginTransaction();
		ParentDemo pd1=new ParentDemo(1, "pName1","pAddress1");
		ParentDemo pd2=new ParentDemo(2, "pName2","pAddress2");
		ParentDemo pd3=new ParentDemo(3, "pName3","pAddress3");
		
		ChildDemo cd1=new ChildDemo(4, "pName21", "pAddress31", 101, "cName1", "cAdd1");
		ChildDemo cd2=new ChildDemo(5, "pName22", "pAddress32", 102, "cName2", "cAdd2");
		
		session.persist(pd1);
		session.persist(pd2);
		session.persist(pd3);
		session.persist(cd1);
		session.persist(cd2);
		
		tx.commit();
		System.out.println("object inserted Successfully........!!1");
		session.close();
	}
}
