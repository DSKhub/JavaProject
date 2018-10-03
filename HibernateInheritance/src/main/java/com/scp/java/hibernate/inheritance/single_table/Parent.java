package com.scp.java.hibernate.inheritance.single_table;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;*/
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="Parent")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="parent_Child",discriminatorType=DiscriminatorType.STRING)
@DiscriminatorValue(value="parent")
public class Parent {
	
    @Id
   /* @GeneratedValue(strategy=GenerationType.AUTO)*/
	private int pId;
	private String pName;
	
	@Override
	public String toString() {
		return "\nParent [pId=" + pId + ", pName=" + pName + "]";
	}
	public Parent(int pId, String pName) {
		super();
		this.pId = pId;
		this.pName = pName;
	}
	public Parent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getpId() {
		return pId;
	}
	public void setpId(int pId) {
		this.pId = pId;
	}
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	
}
