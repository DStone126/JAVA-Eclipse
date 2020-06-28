package com.syntax.class03;

public class ElseCondition {
public static void main(String[] args) {
	
	double num1= 10.7;
	double num2= 10.7;
	if(num1 > num2) {
		System.out.println("number1 is larger than number2");	
	}else if (num1 < num2){
		System.out.println("number1 is smaller than number2");
	}else {
		System.out.println("Numbers a equal");
	}
System.out.println("we r done");
System.out.println("---------different way---------");

double num= 10.7;
double num3= 10.7;
if(num > num3) {
	System.out.println("number1 is larger than number2");	
}else if (num < num3){
	System.out.println("number1 is smaller than number2");
}else  if(num ==num3) {
	System.out.println("Numbers a equal");
}
System.out.println("we r done");
System.out.println("----------------------");

int day = 7;

if (day ==1) {
System.out.println("Monday");
}else if (day == 2) {
System.out.println("tuesday");
}else if (day == 3) {
	System.out.println("wedensday");
}else if(day == 7) {
	System.out.println("Sunday");
}



}
}
