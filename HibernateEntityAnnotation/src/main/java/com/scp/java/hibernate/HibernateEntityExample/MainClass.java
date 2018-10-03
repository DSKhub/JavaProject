package com.scp.java.hibernate.HibernateEntityExample;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainClass {
	public static void main(String[] args) {
		SessionFactory sessionFactory=new Configuration().configure("/com/scp/java/hibernate/HibernateEntityExample/hibernate.cfg.xml").buildSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		PojoClass p1=new PojoClass(1, "Snehal", "Aurangabad", 56000);
		PojoClass p2=new PojoClass(452, "Radha", "Nashik", 78000);
		PojoClass p3=new PojoClass(873, "Johan", "Dhule", 90000);
		PojoClass p4=new PojoClass(124, "Zara", "Jalgaon", 63000);
		session.save(p1);
		session.save(p2);
		session.save(p3);
		session.save(p4);
		tx.commit();
		System.out.println("Object insert successfully......!!!!");
		session.close();
		/*session.evict(p1);
		PojoClass po1=session.get(PojoClass.class, 101);
		session.close();
		System.out.println("object retrive using get() method:"+po1);
		
		po1.setStudAddress("Pune");
		Session session2=sessionFactory.openSession();
		PojoClass po2=session2.get(PojoClass.class, 101);		
		Transaction tx2=session2.beginTransaction();
		//org.hibernate.NonUniqueObjectException    ......update method.......
			//session2.update(po1);//in update method if same object is updated in second session then throw exception
		
		session2.merge(po1);  //in merge method if same object is merge then can't throw the exception
		    tx2.commit();
		System.out.println("Updated record:"+po1);*/
	}

}
