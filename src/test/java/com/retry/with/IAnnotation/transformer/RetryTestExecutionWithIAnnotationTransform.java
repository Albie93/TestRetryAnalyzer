package com.retry.with.IAnnotation.transformer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class RetryTestExecutionWithIAnnotationTransform {

	@Test
	public void test1(){
	
		Assert.assertEquals(false, true);
		
	}
	
	
	@Test
	public void test2(){
		
		Assert.assertEquals(false, true);
		
	}
	
	@Test
	public void test3(){
		Assert.assertEquals(true, true);
		
	}
	
	
}
