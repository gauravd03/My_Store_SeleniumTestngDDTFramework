package com.myStore.utilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("stared test");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test success");

		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test fail");

		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("stared test");

		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test finishs");

		
	}
	

}
