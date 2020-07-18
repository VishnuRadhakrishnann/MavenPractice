package org.tng;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Testng8 implements ITestListener {
	
	public void onFinish(ITestContext context) {
		System.out.println("<---Test suite completed--->");
		}
	
	public void onStart(ITestContext context) {
		System.out.println("<---Test suite started--->");
		}
	
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("<---success percentage--->");
		}
	
	public void onTestFailure(ITestResult result) {
		System.out.println("<---Test case failed is--->"+result.getName());
		}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("Name of the skipped test case"+ result.getName());

	
	}
	public void onTestStart(ITestResult result) {
		System.out.println(result.getName()+"<---Test case started--->");

		
	}
	
	public void onTestSuccess(ITestResult result) {
		System.out.println("<---Test case passed--->");

		
	}

}
