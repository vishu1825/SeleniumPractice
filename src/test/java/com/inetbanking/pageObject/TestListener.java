package com.inetbanking.pageObject;

import java.util.Date;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	
	public void onFinish(ITestContext result) {
		
	}

	public void onStart(ITestContext result) {
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println(result.getName()+"Test Case Failed"+new Date());
		
	}

	public void onTestSkipped(ITestResult result) {
		System.out.println(result.getName()+"Test Case Skipped"+new Date());

	}

	public void onTestStart(ITestResult result) {
		System.out.println("Test Case executon starts "+new Date());

		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println(result.getName()+"Test Case Success"+new Date());

		
	}

}
