package com.scp.java.hibernate.table_per_concreate_class;

import javax.persistence.AssociationOverride;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="childDemo")

public class ChildDemo extends ParentDemo{

	int cId;
	String cName;
	String cAdd;
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
	public String getcAdd() {
		return cAdd;
	}
	public void setcAdd(String cAdd) {
		this.cAdd = cAdd;
	}
	public ChildDemo(int pid, String pName, String pAddress, int cId, String cName, String cAdd) {
		super(pid, pName, pAddress);
		this.cId = cId;
		this.cName = cName;
		this.cAdd = cAdd;
	}
	
	public ChildDemo(int pid, String pName, String pAddress) {
		super(pid, pName, pAddress);
		// TODO Auto-generated constructor stub
	}
	

	 
}
