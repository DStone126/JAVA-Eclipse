package com.syntax.class07;

public class LoopHomeWork {
public static void main(String[] args) {
	
	System.out.println("------------1-100 1line with space------------");
	
	int n = 1;
	while(n <= 100) {
		System.out.print(n + " ");
	n++;
	}

	System.out.println();
	System.out.println("------------------100-1-------------------------------");

for(int nu = 100; nu >1; nu--) {
	System.out.println(nu);
}

System.out.println("--------------20-1 evens(2 ways)-------------------");

int num = 20;
while ( num >= 1) {
	System.out.println(num);
num -= 2;
}

System.out.println("--------------------20-1 even pt 2----------------------");

int numb = 20;
do {
	System.out.println(numb);
	numb-= 2;
} while(numb > 1);
 
System.out.println("----------------20-50 odds (2ways)-------------");	
		
int numbe = 20;
do {
	numbe++;
	System.out.println(numbe);
	numbe += 1;
} while(numbe < 50);

System.out.println("----------------------20-50 pt 2--------------------");

int number = 20;
while(number < 50) {
	number++;
	System.out.println(number);
	number += 1;
	
}

}

}