package com.college.system.CollegeOnlineSystem.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="dept")
@Entity(name="Department")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private int dId;
	private String dName;
	public int getdId() {
		return dId;
	}
	public void setdId(int dId) {
		this.dId = dId;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public Department(int dId, String dName) {
		super();
		this.dId = dId;
		this.dName = dName;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
