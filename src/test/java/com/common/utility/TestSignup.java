package com.common.utility;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider; 
import org.testng.annotations.Test;

public class TestSignup {
	
	@DataProvider(name = "userdetails")
	public Object[][] getData(){
		Object[][] userDetailsInput = { 
				     {new UserDetails1("Sachin","Tendulkar","#1234 GG", "36", "2001")},
				     {new UserDetails1("Rahul","Malik","#34 G3G", "26", "1501")}, 
				     {new UserDetails1("Virat","Kohil","#253 TR", "72", "2035")}  
				     };
		return userDetailsInput;
	}
	
	@Test(dataProvider = "userdetails")
	public void signup(UserDetails1 user_Detail) {
		System.out.println("fname - " +user_Detail.getFname() + "  lname -  " +user_Detail.getLname() +"  address -  " 
				           +user_Detail.getAddress());
	}
	
}

