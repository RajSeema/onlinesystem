package com.college.system.CollegeOnlineSystem.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name="college")
@Entity(name="College")
public class College {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="regNo")
	private int regNo;
	
	@Column(name="collegeName")
	private String collegeName;
	
	@Column(name="contactNo")
	private String contactNo;
	
	@Column(name="emailId")
	private String emailId;
	
	@Column(name="address")
	private String address;
	
	public int getRegNo() {
		return regNo;
	}
	public void setRegNo(int regNo) {
		this.regNo = regNo;
	}
	public String getCollegeName() {
		return collegeName;
	}
	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
	}
	public String getContactNo() {
		return contactNo;
	}
	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public College(int regNo, String collegeName, String contactNo, String emailId, String address) {
		super();
		this.regNo = regNo;
		this.collegeName = collegeName;
		this.contactNo = contactNo;
		this.emailId = emailId;
		this.address = address;
	}
	public College() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
