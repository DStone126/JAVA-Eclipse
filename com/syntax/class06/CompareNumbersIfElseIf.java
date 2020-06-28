package com.syntax.class06;

import java.util.Scanner;

public class CompareNumbersIfElseIf {
public static void main(String[] args) {
	//repel it ? 34
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter first number:");
	double a = scan.nextDouble();
	
	System.out.println("Please enter second number:");
	double b = scan.nextDouble();
	
	System.out.println("Please enter third number:");
	double c = scan.nextDouble();
	
	double largest = 0;
	//int a = 5, b = 9, c = 1;
	//castros way
	if (a>b && a>c) {
largest = a;//a is the largest
		// int way System.out.println("Largest number is " + a);
	}else if (b >a && b>c) {//a is not the largest, im comparing b and c
largest = b;//  b is the largest
		// int way System.out.println("Largest number is " + b);
}else if (c>a && c> b) {//a is not the largest , b not the largest then just put else not if
largest = c;//c is the largest 
	// int way System.out.println("Largest number is " + c);
}
System.out.println("Largest number is " + largest);
// if (a> b){
//here a is larger than b
/*if(a>c){
 * a is largest
 * largest = a;
 * }else{
 * a is larger than b, but c is larger than a
 * largest = c;
 * }else{
 * if (b>c){
 * b is larger than a , but c is larger than b
 * largest =c ;
 * 
 */
}
}