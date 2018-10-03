package com.scp.java.hibernate.table_per_concreate_class;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="ParentDemo")
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)

public class ParentDemo {
	@Id
	int pid;
	
	String pName;
	String pAddress;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpAddress() {
		return pAddress;
	}
	public void setpAddress(String pAddress) {
		this.pAddress = pAddress;
	}
	@Override
	public String toString() {
		return "ParentDemo [pid=" + pid + ", pName=" + pName + ", pAddress=" + pAddress + "]";
	}
	public ParentDemo(int pid, String pName, String pAddress) {
		super();
		this.pid = pid;
		this.pName = pName;
		this.pAddress = pAddress;
	}
	public ParentDemo() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
