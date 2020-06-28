package com.syntax.class07;

import java.util.Scanner;

public class RepelForLoop {
public static void main(String[] args) {
	
	for(int q = 0; q <12; q++) {
		System.out.println(q);
	}

System.out.println("-------------------");

	
	for(int e = 10; e > 0; e--) {
		System.out.print(e + ",");
	e -= 1;
	  }  
	  
System.out.println();
System.out.println("-----------------------------");
	
	if (true)
	//for with if
		 for (int n = 2; n <= 14; ++n){
		System.out.println(n);
	n+= 1;
}

System.out.println("------------------");

	 for (int o = 5; o < 22; o++) {
			System.out.println(o);
		o+=1;
	 }

System.out.println("---------------------------------");

for (int g = 1; g <= 20; g++) {
	System.out.println("Good Morning!");
}

System.out.println("---------------");
//for loop with string
for (int i = 2011; i <= 2019; ++i) {
	System.out.println("Hey, it is year: ");

	System.out.println(i);
}
System.out.println("---------------------");			
		
	for (int p = 10; p >= 1; --p) {
		System.out.println(p);
	}
System.out.println("Happy New Year!");

System.out.println("--------------------");

int n = 3;// this is for loop with *
for(int a = 1; a <= 10; ++a)
{
    System.out.printf("%d * %d = %d \n", n, a, n * a);
}

System.out.println("---------------------");

for (int t = 1; t <= 4; ++t) {
	System.out.println(t);
	
}
for (int t = 7; t <= 10; ++t) {
	System.out.println(t);
}

System.out.println("-------------------------");

Scanner scanner = new Scanner(System.in);

System.out.print("In:");

int x = scanner.nextInt();// ending at the x(value must be taken from a user), exclusive.
for(int z = 0; z <x; z++) {
System.out.print(z);
}
System.out.println();
System.out.println("-------------------------");

System.out.print("In:");
int u = scanner.nextInt();
for(int k = 0; k <u * 2; k++) {//doubled value of end k <u * 2
System.out.print(k + " ");
}

System.out.println();
System.out.println("------------------------------------");

System.out.print("In:");
int v = scanner.nextInt();

for(int j = v -=1 ; j >= 0  ; j--) {//one less than x and ending at 0.
System.out.print(j + " ");
}


}
}
