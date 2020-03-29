package com.springaop.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.service.EmployeeService;

public class AopExampleController {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		EmployeeService employeeService = ctx.getBean("employeeService", EmployeeService.class);
		
		System.out.println(employeeService.getEmployee().getName());
		
		employeeService.getEmployee().setName("Patil");
		
		employeeService.getEmployee().throwException();
		
		ctx.close();
	}
}
