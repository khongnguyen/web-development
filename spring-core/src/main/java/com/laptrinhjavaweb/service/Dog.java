package com.laptrinhjavaweb.service;

import org.springframework.stereotype.Service;

@Service("dog")
public class Dog extends Animal{
	int a = 11;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String sayHello() {
		return "go go";
	}
}
