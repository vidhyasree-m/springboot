package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Claculator {
	
	@GetMapping("/add")
	public String add(
			@RequestParam(value = "num1")int num1,
			@RequestParam(value = "num2")int num2) {
		
		//object creation
		Addition addition = new Addition(num1,num2);
		int result = addition.getSum();
		
		return "The sum of " + num1 + " and " + num2 + " is: " + result;
	}
	

}
