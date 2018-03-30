package com.retry.classes;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTestExecution {

	@Test(retryAnalyzer=com.retry.classes.RetryAnalyzer.class)
	public void test1(){
	
		Assert.assertEquals(false, true);
		
	}
	
	
	@Test(retryAnalyzer=com.retry.classes.RetryAnalyzer.class)
	public void test2(){
		
		Assert.assertEquals(false, true);
		
	}
	
	
}
