package com.hotelogix.smoke.FrontdeskTest;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.IRetryAnalyzer;
import org.testng.annotations.ITestAnnotation;

public class AnnotationTransformer implements IAnnotationTransformer {

	public void transform(ITestAnnotation testannotation, Class arg1, Constructor arg2, Method arg3) {
		// TODO Auto-generated method stub
		testannotation.setRetryAnalyzer(RetryAnalyzer.class);
		
	}

}
