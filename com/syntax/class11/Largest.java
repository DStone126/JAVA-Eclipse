package com.syntax.class11;

public class Largest {
public static void main(String[] args) {
	// find the largest number in array
	int[] numbers = {-23, -56, -73, -16, -80, -70, -39};
	
	int largest = numbers[0];
	
	for(int num : numbers) {
		if(num > largest) {
			largest = num;
		}
		
	}	
	System.out.println(largest);

System.out.println("----------------------------");

int[] numbers1 = {23, 56, 73, 16, 80, 70, 39};

int larges = 0;

for(int num1 : numbers1) {
	if(num1 > larges) {
		larges = num1;
	}
	
}	
System.out.println(larges);

System.out.println("************************");

int[] number = {23, 56, 73, 16, 80, 70, 39};

int large = 0;

for(int nu : number) {
	if(nu > large) {
		large = nu;
	}
	
}	
System.out.println(large);

System.out.println("--------------------------");

}
}
