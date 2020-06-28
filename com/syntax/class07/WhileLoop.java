package com.syntax.class07;

public class WhileLoop {
	public static void main(String[] args) {
	//wrong way you go to jail
		// 5Xs System.out.println();
		
	int x = 10;
	x = x + 1;
	x += 1;
	//another way to add 1 to variable
	x++;
	//3++; compiler error
	System.out.println(x);

	int y = 50;
	y = y -1;
	y -= 1;
	y--;
	System.out.println(y);
	//3--; compiler error
	System.out.println(y);
	//x++ post-increment
	//++x pre-increment

int z = 5;
System.out.println(z++);

if(++z == 6) {//per-increment
	System.out.println("Hi there!");
	
}

int k =10;
if(k++ == 11) {//post-increment
	System.out.println("Nail waz here!");
}
System.out.println(k);

//what if i want to increase by 2?
int m = 5;
//m++2; compile error
m += 2;

System.out.println(m);

for (int m1 = 5; m1 <= 10; ++m1) {
	System.out.println(m1);
}
System.out.println("----------while loop----------");
	 // this code will execute infinitely
	// but we fix it by adding time++
	int time = 10;
	while (time < 12) {
		System.out.println("Good morning");
		time++;
	}
//	this will not execute false
//	int time = 10;
//	while (time > 12) {
//		System.out.println("Good morning");
//		time++;
//	}
	
	System.out.println("-------if isRain---------");
	
	boolean isRain = true;
	if(isRain) {
		System.out.println("Take umbrella");
	}
	
	System.out.println("-----------while loop--------");
	
	while (isRain) {
		System.out.println("Take umbrella");
	//isRain++;compile error
		isRain = false;
	}

System.out.println("--------------WL 1-50------------");

int n = 1;
while(n <= 50) {
	System.out.println(n);
n++;
}
	
System.out.println("--------------WL 20-30------------");

int e = 20;
while(e <= 30) {
	System.out.println(e);
e++;
}

System.out.println("--------------WL same line  5-15------------");
	
int f = 5;
while(f <= 15) {
	System.out.print(f + " ");//(f + " ") for the space 
f++;
}
	
System.out.println();	
System.out.println("--------------WL 10-1------------");
	
int q = 10;
while(q >= 1) {
	System.out.println(q);
q--;
}
	
System.out.println("--------------WL 50-1------------");	
	
int w = 50;
while(w >= 1) {
	System.out.println(w);
w--;
}
	
System.out.println("--------------WL 1-20 only odds------------");		
	

int a = 1;
while(a < 20) {
	System.out.println(a);
	a += 2;
}

System.out.println("--------------WL with mod% if ------------");

int o = 1;
while(o < 20) {
	if(o % 2 ==1) {
		System.out.println(o);
	}
o++;//when doing mod make sure its outside "if"right here
}

System.out.println("--------------WL 3rd way to increase  ------------");

	int i = 0;
	while(i < 20) {
		i++;
		System.out.println(i);
		i++;
	}
	
	System.out.println("--------------WL 4th way to increase  ------------");
	
	int l = 0;
	while(l < 20) {
		l++;
		System.out.println(++l);
		}
	l++;
	System.out.println("--------------WL with boolean and int  ------------");
	
	boolean workDay = true;
	 int day = 1;
	while (workDay) {
		if(day < 6) {
			System.out.println("I need day off");
		day++;
		}else {
			System.out.println("I dont need a day off any more");
		workDay = false;//if i dont add this it will go forever
		}
		}

	System.out.println("-------------------WL 2nd way to do boolean and int---------------");

	boolean workDay1 = true;
	 int day1 = 1;
	while (workDay1) {
		System.out.println("I need day off");
		day1++;
	if(day1 == 6) {
		workDay1 = false;
			System.out.println("I dont need a day off any more");
	}
	}	
	
	System.out.println("--------------WL   ------------");
	
	
	
	
	
	}
}