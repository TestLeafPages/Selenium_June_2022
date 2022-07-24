package week7.day2;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryFailedTests implements IRetryAnalyzer {

	int retryCount = 0;
	
	public boolean retry(ITestResult result) {
		if(retryCount < 2) {
			retryCount++;
			return true; //retry
		}
		
		return false; // stop retry 
	}

}
