package com.khaja.restapi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="aemployee")
public class AEmployee {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private int empid;
private String empname;
private String email;
private String role;


public AEmployee() {
	
}
public int getEmpid() {
	return empid;
}
public void setEmpid(int empid) {
	this.empid = empid;
}
public String getEmpname() {
	return empname;
}
public void setEmpname(String empname) {
	this.empname = empname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getRole() {
	return role;
}
public void setRole(String role) {
	this.role = role;
}
@Override
public String toString() {
	return "AEmployee [empid=" + empid + ", empname=" + empname + ", email=" + email + ", role=" + role + "]";
}
public AEmployee(int empid, String empname, String email, String role) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.email = email;
	this.role = role;
}

}
