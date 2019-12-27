package com.laptrinhjavaweb.service;

import org.springframework.stereotype.Service;

@Service("helloWorldService")
public class HelloWorld {
	private String b;
	private Animal dog;
	public String sayHello() {
		dog = new Dog();
		return dog.sayHello();
	}
	public String run() {
		return "jump";
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
	public Animal getDog() {
		return dog;
	}
	public void setDog(Animal dog) {
		this.dog = dog;
	}
}
