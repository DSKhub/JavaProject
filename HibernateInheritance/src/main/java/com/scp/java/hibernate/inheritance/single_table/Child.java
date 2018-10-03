package com.scp.java.hibernate.inheritance.single_table;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Child")
@DiscriminatorValue("child")
public class Child extends Parent{
	private int cId;
	private String cName;
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public Child(int pId, String pName, int cId, String cName) {
		super(pId, pName);
		this.cId = cId;
		this.cName = cName;
	}
	public Child() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Child(int pId, String pName) {
		super(pId, pName);
		
	}
	
}