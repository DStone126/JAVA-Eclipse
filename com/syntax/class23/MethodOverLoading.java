package com.syntax.class23;

public class MethodOverLoading {

	//lets creat a method add
	//how to keep the same name
	//1. by changing numbers of parameters
	
	public int sum(int num1, int num2) {
		return num1 + num2;
	}
	public int sum(int num1, int num2,int num3) {
		return num1 + num2 + num3;
		
	}

		//2.by changing type of parameters
	
	public double sum(double num1, double num2) {
		return num1 + num2;
	}
	public double sum(double num1, double num2, double num3) {
		return num1 + num2 + num3;
	}






}