package com.common.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListner extends com.jqueryui.test.BaseTest implements ITestListener {

	public void onTestStart(ITestResult Result) {
	}

	public void onTestSuccess(ITestResult Result) {
	}

	public void onTestFailure(ITestResult Result) {
		System.out.println(Result.getName() + " failed ");
		takeScreenShot(Result);
	}

	public void onTestSkipped(ITestResult Result) {
		System.out.println(Result.getName() + "  test got skipped  ");
	}

	public void onStart(ITestContext Context) {
	}

	public void onFinish(ITestContext Context) {
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {
		System.out.println("this is printed via onTestFailedButWithinSuccessPercentage() method");
	}

}
