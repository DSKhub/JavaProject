package com.scp.java.hibernate.table_per_subclass;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="ChildPojo")
/*@PrimaryKeyJoinColumn(name="ID")*/
public class ChildPojo extends ParentPojo{
	
      int cId;
      String cName;
      String cAddress;
	@Override
	public String toString() {
		return "ChildPojo [cId=" + cId + ", cName=" + cName + ", cAddress=" + cAddress + "]";
	}
	public ChildPojo(int pId, String pName, String pAddress, int cId, String cName, String cAddress) {
		super(pId, pName, pAddress);
		this.cId = cId;
		this.cName = cName;
		this.cAddress = cAddress;
	}
	public ChildPojo() {
		super();
		// TODO Auto-generated constructor stub
	}
      
	
}
