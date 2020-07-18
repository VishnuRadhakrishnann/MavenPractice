package org.tng;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class Testng6 implements IRetryAnalyzer{
int mincount=0, maxcount=10;
	public boolean retry(ITestResult result) {
		if(mincount<maxcount) {
			mincount++;
			return true;
			
		}
		return false;
	}
	
	

}
