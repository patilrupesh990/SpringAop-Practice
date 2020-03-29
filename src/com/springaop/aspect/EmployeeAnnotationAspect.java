package com.springaop.aspect;

import org.aspectj.lang.annotation.Before;

public class EmployeeAnnotationAspect {
	@Before("@annotation(com.springaop.aspect.Loggable)")
	public void myAdvice() {
		System.out.println("Executing myAdvice!!");
	}
}
