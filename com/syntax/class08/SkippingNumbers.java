package com.syntax.class08;

import java.util.Scanner;

public class SkippingNumbers {
public static void main(String[] args) {
	//i want to print from 1-10
	//but i want to skip 5,6,7

System.out.println("Skippping numbers 5,6,7");
	
	for(int i = 1; i < 11 ; i++) {
 if(i==5 || i==6 || i==7) {
	 continue;
 }
System.out.println(i);
}

	System.out.println("-------------------------------");
	
	//we want to print number from 1-100
//but we want to skip numbers 35-55
		
	 System.out.println("I dont want to print from 35 to 55");
	for(int t = 1; t < 100 ; t++) {
		 if(t>=35 && t<=55) {
			 continue;
		 }
		System.out.println(t);
		}
	System.out.println("Im outside loop");

System.out.println("-----------------------------");

for(int w = 1; w < 50 ; w++) {
	 if(w %3 == 0 && w%6==0) {//divisible by 3 and 6 if just 3 just cut 6 out
		 System.out.println( w + " divisible by 3 and 6");
		 continue;
	 }
System.out.println(w);

}
System.out.println("-----------------------------");

Scanner scan = new Scanner(System.in);
	
for(int o = 101; o<=110; o++) {
	System.out.println("Do you want to apply for credit card?");
	String answer = scan.nextLine();
	
	if(answer.equals("yes")) {
		System.out.println("Congrats. Now you are in debt!");
	break;
	}
}


}
}