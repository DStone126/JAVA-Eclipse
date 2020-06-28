package com.syntax.class05;

public class Quiz {
	

		   public static void main(String [] args) {
		     boolean a, b, c;
		     a = b = c = true;

		          if( !a || ( b && c ) ) {
		             System.out.println("If executed");
		          } else {
		             System.out.println("else executed");
		          }
System.out.println("******************************************");

if( 1 > 2 ) {
    System.out.println(" 1 is greater than 2");
} else {
    System.out.println(" 2 is greater than 1");
}
System.out.println("****************************");
int day = 7;

switch(day) {
case 1:
System.out.println("Monday");
case 2:
System.out.println("Tuesday");
case 3:
System.out.println("Wednesday");
case 4:
System.out.println("Thursday");
case 5:
System.out.println("Friday");
}
	System.out.println("*****************************");	   
	double discount;
	char code = 'C' ;

	switch ( code ) {
	case 'A':
	discount = 0.0;

	case 'B':
	discount = 0.1;

	case 'C':
	discount = 0.2;

	default:
	discount = 0.3;
	}
		System.out.println("***********************");   
		char direction = 'N';
		char west = 'W';

		switch(direction) {
		case 'N':
		System.out.println("North");
		break;
		case 'E':
		System.out.println("East");
		break;
		case 'T':
		System.out.println("West");
		break;
		case 'S':
		System.out.println("South");
		}
System.out.println("*****************");
boolean x = true;
boolean y = false;
if (x || y) {
System.out.println(true);
} else {
System.out.println(false);
}   
	System.out.println("***********************");	   
	boolean male = false;
	int age = 30;

	if( male ){
	     if( age < 20 ){
	         System.out.println("Boy");
	     } else {
	         System.out.println("Man");

	    }
	}else {

	      if( age < 20 ){
	          System.out.println("Girl");
	       }else  {
	          System.out.println("Woman");
	      }
	}System.out.println("*********************");
	float f = 75.0f;
	double d = 75.0;
	int i = 75;

	if( f == d ) {
	   if( f == i ) {
	      System.out.println("f, d and i are equal");
	    } else {
	      System.out.println("f, d are equal but i is not equal");
	    }

	} else {
	    System.out.println("f and d are not equal");
	}
System.out.println("************************");

	   float fl = 5.3f;
	   if (fl == 5.3) {
	      System.out.println("Both are equal");
	   } else {
	      System.out.println("Both are not equal");
	   }
	System.out.println("******************");
	 boolean a1, b1, c1;
     a1 = b1 = c1 = true;

          if( !a1 || ( b1 && c1 ) ) {
             System.out.println("If executed");
          } else {
             System.out.println("else executed");
          }


	 }
 }








		   
		
		

