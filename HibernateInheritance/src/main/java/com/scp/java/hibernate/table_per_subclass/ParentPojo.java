package com.scp.java.hibernate.table_per_subclass;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

@Entity
@Table(name="ParentPojo")
@Inheritance(strategy=InheritanceType.JOINED)
public class ParentPojo {

	@Id
	int pId;
	String pName;
	String pAddress;
	@Override
	public String toString() {
		return "ParentPojo [pId=" + pId + ", pName=" + pName + ", pAddress=" + pAddress + "]";
	}
	public ParentPojo(int pId, String pName, String pAddress) {
		super();
		this.pId = pId;
		this.pName = pName;
		this.pAddress = pAddress;
	}
	public ParentPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
