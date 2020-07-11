package com.syntax.class17;

import java.util.Scanner;

public class RepelItJavaMethods {

	// this is the right way to do this
	//	 void m1(){
//	     System.out.println("m1 method implementation");
//	   }
//	   void m2(){
//	     System.out.println("m2 method implementation");
//	   }
//	  public static void main(String[] args) {
//	    Main mm= new Main();
//	    mm.m1();
//	    mm.m2();
//}
//
//System.out.print("-----------------")
//
//	void newLine(){
//	     System.out.println("newLine method implementation");
//	  }
//	  public static void main(String[] args) {
//	    
//	    Main mm= new Main();
//	    mm.newLine();
//	    mm.newLine();
//	    mm.newLine();
//	  }
//
//System.out.println("-------------------");
//
//	void newLine(){
//		   System.out.println("newLine method implementation");
//		 }
//		void displayLine(){
//		  System.out.println("displayLine method implementation");
//		}
//		  public static void main(String [] args){
//		    Main mm = new Main();
//		    mm.newLine();
//		    mm.displayLine();
//		  }
//
//	public static void main(String[] args) {
//	    Main mm= new Main();
//	    mm.newLine();
//	    mm.displayLine();
//	  }
//	   void  newLine(){
//	      System.out.println("newLine method implementation");
//	   }
//	    void  displayLine(){
//	      System.out.println("displayLine method implementation");
//	   }
//	
//System.out.println("------------------");
//
//	void syntaxTechnologies(){
//		  System.out.println("Welcome to Syntax Technologies!");
//		}
//		void syntaxStudents(){
//		  System.out.println("Welcome Syntax Students!");
//		}
//		public static void main(String[] args) {
//		   Main mm= new Main();
//		    mm.syntaxTechnologies();
//		   mm.syntaxStudents();
//		}
//
//System.out.println("-----------");
//
//	public static void main(String [] args){
//		  for(int i = 1; i <=10; i++){
//		    System.out.println(i);
//		  
//		}
//		}
//
//			//this is the right way to do it
//	void printNumbers(){
//	    for (int i = 1; i <= 10; i++)
//	      {
//	         System.out.println(i);
//	      }
//	  }
//	  public static void main(String[] args) {
//	    
//	    Main mm= new Main();
//	    mm.printNumbers();
//	    
//	  }
//
//System.out.println("-------");
//
//	int a =11;
//	int b = 30;
//
//	void hour(){
//	  System.out.print(a);
//	}
//	void minutes(){
//	  System.out.println(b);
//	}
//
//	public static void main(String [] args){
//	  Main mm = new Main();
//	  mm.hour();
//	  mm.minutes();
//	}
//// this is the right way to do it
//	void printTime(int hour, int minute){
//	    System.out.println(hour+":"+minute);
//	  }
//	  public static void main(String[] args) {
//	    Main mm= new Main();
//	    mm.printTime(11,30);
//	    
//	  }
//
//System.out.println("--------");
//
//	int a =3;
//	int b = 10;
//	int c = 20;
//	int d = 30;
//
//	void multi(int a , int b){
//	  System.out.println("Multiplication "+ (a * b));
//	 } 
//	void add(int c , int b){
//	  System.out.println("Addition "+ (c + b));
//	}
//	void sub(int d , int b){
//	  System.out.println("Subtraction "+ (d - b));
//	}public static void main(String [] args){
//	  Main mm = new Main();
//	  mm.add(20,10);
//	  mm.multi(3,10);
//	  mm.sub(30,10);
//	}
//
//		//this is the right way to do it
//	 void add(int a,int b){
//		    System.out.println("Addition " + (a+b));
//		    
//		  }
//		  void mul(int a,int b){
//		    System.out.println("Multiplication" + (a*b));
//		  }
//		  void sub(int a,int b){
//		    System.out.println("Subtraction " + (a-b));
//		  }
//		  public static void main(String[] args) {
//		    Main mm=new Main();
//		    mm.add(10,20);
//		    mm.mul(5,6);
//		    mm.sub(40,20);
//		    
//		  }
//
//System.out.println("------------")
//
//	public static void main(String[] args) {
//		MethodsWithReturn obj=new MethodsWithReturn();
//
//		String word=obj.convertToUpperCase("test");
//		System.out.println(word);
//	}
//				String convertToUpperCase(String word) {
//				return word.toUpperCase();
//}
//	
//				//this is the right way to do it
//				public static String makeCapital(String name)
//				{
//					return name.toUpperCase();
//				}
//				
//				//test case below (dont change):
//				public static void main(String[] args){
//					System.out.println(makeCapital("test"));
//				}
//
//System.out.println("------------------")
//
//	public static boolean  bothEven(int a,int b)
//	{
//		if(a % 2 == 0 && b % 2 == 0){
//		  return true;
//		 } else{
//		   return  false;
//		 }
//	}
//	public static void main(String[] args){
//		System.out.println(bothEven(-1,1)); 
//	}
//
//	//this is the right way to do it
//
//	public static boolean  bothEven(int num1,int num2)
//	{
//		if(num1%2==0 && num2%2==0){
//		  return true;
//		 } else{
//		   return  false;
//		 }
//	}
//	
//	//test case below (dont change):
//	public static void main(String[] args){
//		System.out.println(bothEven(5,6)); //should be false
//	}
//}
//
//System.out.println("-------------");
//
//	 public static void main(String[] args){
//				  Main obj = new Main();
//					System.out.println(obj.sumEvenToX(5)); 
//					System.out.println(obj.sumEvenToX(8)); 
//				}
//	
//	public int sumEvenToX(int x)	{
//		 
//			int sum = 0;
//			for(int i = 1;i <= x;i++) {
//				if(i % 2 == 0) {
//				sum += i;
//			  }
//			}
//			return sum ;
//		}
//				
//			//this is the right way to do this
//
//		public int sumEvenToX(int x)	{
//					 
//				int sum=0;
//			for(int i=1;i<=x;i++) {
//			if(i%2==0) {
//			sum+=i;
//		}
//		}
//		return sum ;
//		}
//		//		test case below (dont change):
//		public static void main(String[] args){
//			Main obj=new Main();
//		System.out.println(obj.sumEvenToX(5)); //6
//		System.out.println(obj.sumEvenToX(8)); //20
//	}
//							
//System.out.println("---------------");
//
//	 public static void main(String[] args) {
//		    Main obj=new Main();
//				System.out.println(obj.spaceOut("hello"));
//				System.out.println(obj.spaceOut("technology"));
//			}
//			
//			String spaceOut(String str) {
//				
//				String newString = " ";
//				
//				for(int i = 0; i < str.length(); i++ ) {
//					newString = newString + str.charAt(i)+" ";
//				}
//				return newString;
//			}
				









	//System.out.println("------------------");


































}