package com.syntax.class07;

public class ForLoop {
public static void main(String[] args) {
	// hwhen you know how may times it will execute, we should use for
for (int i = 1; i <= 10; ++i) {
		System.out.println( i);
	}
System.out.println("------------------------");	

int sum = 0;

for (int i = 1; i <= 1000; ++i) {
		sum += i; //sum = sum + i
}
		System.out.println("Sum = " + sum);
}
}
