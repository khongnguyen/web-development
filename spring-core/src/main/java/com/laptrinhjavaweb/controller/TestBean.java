package com.laptrinhjavaweb.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.laptrinhjavaweb.service.Dog;
import com.laptrinhjavaweb.service.HelloWorld;

public class TestBean {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// loading the definitions from the given XML file
				
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		 
		HelloWorld service = (HelloWorld) context.getBean("helloWorldService");
		Dog service1 = (Dog) context.getBean("dog");
		
		System.out.println(service.sayHello());
		System.out.println(service1.getA());
		 
				
	}
}
