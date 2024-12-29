package com.hotelogix.smoke.FrontdeskTest;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer {
	 int counter = 0;
	 int retryLimit = 0;
	public boolean retry(ITestResult result) {
		
		
		// TODO Auto-generated method stub
		 if(counter < retryLimit)
		 {
			 System.out.println("Retrying " + result.getName() + " again and the count is " + (counter+1));
			 counter++;
	            return true;
		 }
		 return false;
		 
		
	}

}
