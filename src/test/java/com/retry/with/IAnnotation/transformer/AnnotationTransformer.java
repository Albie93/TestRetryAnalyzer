package com.retry.with.IAnnotation.transformer;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

import com.retry.classes.RetryAnalyzer;

public class AnnotationTransformer implements IAnnotationTransformer {

	
	public void transform(ITestAnnotation annotation, Class testClass,Constructor constructor, Method testMethod){
		
		annotation.setRetryAnalyzer(RetryAnalyzer.class);
		
	}
	
	
}
