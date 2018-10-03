package com.scp.java.hibernate.HibernateEntityExample;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="AnnotationStudent")
public class PojoClass {
	@Id
	@GeneratedValue(strategy=GenerationType.TABLE) 
		
	@Column(name="Stud_Id")
	private int studId;
	
	@Column(name="Stud_Name")
	private String studName;
	
	@Column(name="Stud_Address")
	private String studAddress;
	
	@Column(name="Stud_Fess")
	private double fees;
	
	public int getStudId() {
		return studId;
	}
	public void setStudId(int studId) {
		this.studId = studId;
	}
	public String getStudName() {
		return studName;
	}
	public void setStudName(String studName) {
		this.studName = studName;
	}
	public String getStudAddress() {
		return studAddress;
	}
	public void setStudAddress(String studAddress) {
		this.studAddress = studAddress;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return "\nStudent [studId=" + studId + ", studName=" + studName + ", studAddress=" + studAddress + ", fees="
				+ fees + "]";
	}
	public PojoClass(int studId, String studName, String studAddress, double fees) {
		super();
		this.studId = studId;
		this.studName = studName;
		this.studAddress = studAddress;
		this.fees = fees;
	}
	public PojoClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
