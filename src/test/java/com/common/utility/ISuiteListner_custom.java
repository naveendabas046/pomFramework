package com.common.utility;

import org.testng.ISuite;
import org.testng.ISuiteListener;

public class ISuiteListner_custom implements ISuiteListener {
	
	@Override
	public void onStart(ISuite suite) {
		System.out.println("capturing OS version, browser version");		
	}
}
