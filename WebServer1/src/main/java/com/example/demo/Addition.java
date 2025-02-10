package com.example.demo;

public class Addition {
    
	//private variables
	private int num1;
	private int num2;
	
	//constructor to initialize the numbers
	public Addition(int num1, int num2) {
		this.num1 =  num1;
		this.num2 = num2;
	}
	
	//Method to perform the addition
	public int getSum() {
		return num1+num2;
	}

}
