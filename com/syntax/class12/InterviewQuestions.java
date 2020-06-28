package com.syntax.class12;

import java.util.Arrays;

public class InterviewQuestions {
public static void main(String[] args) {
	
	// write program to swap 2 numbers without a temporary variable?
	int a = 20;
	int b = 30;
	System.out.println("value of a = " + a + " value of b = " + b);
//	int t = a;//this is a temporary variable
//	a = b;
//	b = t;
	
	a += b;
	b = a - b ;
	a -= b;
	
	System.out.println("value of a = " + a + " value of b = " + b);
	
	System.out.println("---------------------------------------");
	
	// write a java program to check whether a given number is prime or not?
	// prime number is greater than 1 
	// prime number is divisible by 1 and itself
	// 2 (1,2);p
	// 3 (1,3);p
	// 4 (1,2,4);np
	// 5 (1,5);p
	// 6 (1,2,3,6);np
	
    //int number1 = 10; // not prime
int number = 11;

boolean prime = true;

if(number > 1) {
for(int i = 2; i < number; i++) {
	if(number % i == 0) {// number divisible by i 
		prime = false;
		break;
	}
}

 }else {
	prime = false;
 }
	
	System.out.println("The number " + number + " is prime: " + prime);


System.out.println("--------------------------------");

// write a program to print the first 10 numbers of fibonacci series
//1,1,2,3,5,8,13,21,34,55

int c, d, f;

c = 1;
d = 1;
 

for(int u = 1; u <= 10; u++) {
	System.out.print(c + " ");
f = c + d;
c = d;
d = f;
}

System.out.println();
System.out.println("-----------------");
//
//int[] numberss = new int[10];
//
//for(int o = 0; o < numberss.length; o++) {
//	numberss[o] = numberss[o - 1] + numberss[o - 2];
//	
//}
//for(int o = 0; o < numberss.length; o++) {
//	System.out.println(numberss[o]);
//}

int s,w;
s = 1;
w = 1;
for(int p = 1; p <= 10; p++) {
	System.out.print(s + " ");
w = s + w;
s = w;
w = s;
}

System.out.println();
System.out.println("--------------");
// write a java program to find the second largest number in the array 
// maximum and minimum number in array

int [] numbers = {32,61,16,89,74,25};

//lets try to find the maximum
//1st way

int max = numbers [0];
int min = numbers [0];
for(int num:numbers) {
	if(num > max) {
		// i found a bigger number
		max = num;
		
	}else if(num < min) {
	// i found a smaller number
	min = num;
}
}
System.out.println("Minimum is: " + min);
System.out.println("Maximum is: " + max);

System.out.println("-------------------------");

// 2nd way
Arrays.sort(numbers);
for(int num: numbers) {// this will sort from smallest to largest


System.out.println("Maximum is: " + numbers[numbers.length - 1]);// the last
System.out.println("Second largest : " + numbers[numbers.length - 2]);
System.out.println("Minimum is: " + numbers[0]);// 1st element

}

System.out.println("-----------------------");

int largest = numbers[0];
int largest2 = numbers[0];

for(int num:numbers) {
	if(num > largest) {
		largest2 = largest;
		largest = num;
	}else if (num > largest2 && num != largest) {
		largest2 = num;
	}
	
}
System.out.println("Largest is :" + largest);
System.out.println("Second largest : " + largest2);



}
}
