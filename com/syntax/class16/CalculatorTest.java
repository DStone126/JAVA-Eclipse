package com.syntax.class16;

public class CalculatorTest {
public static void main(String[] args) {
	//Method with parameters
	//method add();
	Calculator c = new Calculator();
	c.add(100, 200);
	c.add(10, 20);
	c.add(1000, 2000);
	
	c.sub(100, 10);	
	
	c.div(10, 2);
	
	c.multi(10, 10);

	c.multi(10, 9);

	//c.multi(10); CE: numbers of values must match numbers of parameters
	//c.multi(10.99, 9.99);CE: values must match type of parameters





}
}
