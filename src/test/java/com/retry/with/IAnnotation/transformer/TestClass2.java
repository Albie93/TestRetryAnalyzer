package com.retry.with.IAnnotation.transformer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2 {

	@Test
	public void test4(){
	
		Assert.assertEquals(false, true);
		
	}
	
	
	@Test
	public void test5(){
		
		Assert.assertEquals(false, true);
		
	}
	
	@Test
	public void test6(){
		Assert.assertEquals(true, true);
		
	}
	
	
}
