package com.laptrinhjavaweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.laptrinhjavaweb.service.HelloWorld;

@Controller(value="controllerOfWeb")
public class HomeController {
	@Autowired
	public static HelloWorld greeting;
	public static void main(String[] args) {
		System.out.println(greeting.run());
	}
}
