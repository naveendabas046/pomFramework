package com.common.utility;

public class UserDetails1 {
	String fname;
	String lname;
	String address;
	String age;
	String picode;
	
	public UserDetails1(String fname, String lname, String address, String age, String pincode) {
		this.fname = fname;
		this.lname = lname;
		this.address = address;
		this.age = age;
		this.picode = pincode;	
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getAge() {
		return age;
	}
	
	public String getFname() {
		return fname;
	}
	
	public String getLname() {
		return lname;
	}
	
	public String getPicode() {
		return picode;
	}
}
