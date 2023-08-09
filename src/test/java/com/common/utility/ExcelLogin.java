package com.common.utility;

import org.testng.annotations.Test;

public class ExcelLogin {
	
	@Test(dataProvider = "userLoginData" , dataProviderClass = ExcelDataReader.class)
	public void login(Object username, Object password) {
		
		System.out.println("Username: " +username + "password: " +password);
		
	}

}

