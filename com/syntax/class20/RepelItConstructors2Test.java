package com.syntax.class20;

public class RepelItConstructors2Test {

//	public static String make;
//protected String model,color;
// private double price;
// int year,door,speed;
//
//public void displayInfo() {
//	System.out.println("We build " + year + " " + make + " " + model + " for price = $" + price);
//}
//
//RepelItConstructors2Test(){
//	System.out.println("I am a consturctor");
//}
//
//public static void main(String[] args) {
//	
//	
//	RepelItConstructors2Test car = new RepelItConstructors2Test();
//	/*
//	 Car-->class name
//	 car-->reference variable
//	 new-->keyword
//	 Car();-->calling Constructor/constructor is a box of code that intialize the obj
//	  */
//	make = "BMW";
//	car.model = "M5";
//	car.year = 2021;
//	car.color = "Pink";
//	car.door = 4;
//	car.speed = 200;
//	car.price = 90000; 
//	car.displayInfo();
//	//System.out.println(car.model);
//	
//	//static String driver; local variables cannot be Static
//	//System.out.println(driver);
//
//	RepelItConstructors2Test car1 = new RepelItConstructors2Test();
//	
//	car1.model = "iS";
//	car1.year = 2020;
//	car1.color = "Blue";
//	car1.door = 2;
//	car1.speed = 200;
//	car1.price = 100000; 
//	car1.displayInfo();
//}
//
//System.out.println("------------");
//
//	class Parent{ 
//		   public Parent(String city){
//		     System.out.println(city);
//		   }
//		   
//		   public Parent(){
//		     System.out.println("Parent Constructor");
//		   }
//
//		}
//	class Child extends Parent{
//		  Child(String city){
//		    super(city);
//		  }
//		}
//
//public static void main(String[] args) {
//    Child c= new Child("Vienna");
// }
//
// 
//System.out.println("---------");
//
//	void display() {
//		System.out.println();
//	
//	}
//	
//	class Parent{
//		  
//		  Parent(){
//		    System.out.println("This is Parent constructor");
//		    
//		  }
//	}
//	
//	class Child extends Parent{
//		 
//		Child(){
//		 super();
//			
//		  }    
//		  }  
//	
//	public static void main(String [] args){
//		  
//		Child c = new Child();
//		
//		}	
//
//	System.out.println("-----------");  
//	
//	class Parent{
//		  public Parent(){
//		    System.out.println("Parent Constructor without argument");
//		  }
//		  
//		  public Parent(int number){
//		    System.out.println(number);
//		  }
//		}
//	class Child extends Parent {
//		  
//		  public Child(){
//		    System.out.println("Child Constructor without argument");
//		  }
//		  
//		  public Child(int number){
//		    super(number);
//		  }
//		}
//public static void main(String[] args) {
//	Parent c = new Child();
//	Child cc = new Child(10);
//}
//
//System.out.println("----------");
//
//	class A{
//		  A(){
//		    System.out.println("I");
//		  }
//		}
//		class B extends A{
//		  B(){
//		    System.out.println("am");
//		  }
//		}
//		class C extends B{
//		  C(){
//		    System.out.println("a tester");
//		  }
//		}
//		public static void main(String[] args) {
//			C c = new C();
//		}
//		
//System.out.println("-------------");
//
//	class A
//	{
//	    int i = 10;
//	}
//
//	class B extends A {
//	    int i = 20;
//	    
//	    public void display(){
//	      System.out.println(i);
//	      System.out.println(super.i);
//	    }
//	}
//	 public static void main(String[] args) {
//	     B bb= new B();
//	     bb.display();
//	   }
//	
//	System.out.println("----------");
//
//	class Parent{ 
//		  
//		  void m1(){
//		    System.out.println("m1 method in parent class");
//		  }
//		}
//
//	class Child extends Parent{
//		  void m1(){
//		    System.out.println("m1 method in child class");
//		  }
//
//		  void m2(){
//		    m1();
//		    super.m1();
//		  }
//		}
//
//	 public static void main(String[] args) {
//		    
//		    Child cc= new Child();
//		    cc.m2();
//		   } 
//		  
//		System.out.println("---------");
//
//	 public void s(int a, int b) {
//			System.out.println(a-b);
//		
//	 }
//		
//		public void s(int a, int b, int c) {
//			System.out.println(a-b-c);
//		
//	 }
//		
//		public void s(int a, int b, int c, int d) {
//			System.out.println(a-b-c-d);
//		
//		}
//		
//		public static void main(String[] args) {
//			
//			Main sub = new Main();
//			
//			sub.s(100, 30, 20, 10);
//			sub.s(50, 10, 10);
//			sub.s(30, 10);
//		}
//		
//System.out.println("--------");
//
//	void display(int a){
//	    System.out.println(a);
//	  
//	}
//	  
//	void display(String s){
//	    System.out.println(s);
//	  
//	   }
//	  
//	   void display(double n){
//	    System.out.println(n);
//	
//	   }
//	   
//	  public static void main(String[] args) {
//	   
//		  Main mm= new Main();
//	   
//		 mm.display(100);
//	    mm.display("Syntax Technologies");
//	    mm.display(100.09);
//	 }
//	 
// System.out.println("-------");
//
//	 private void m1(){
//		    System.out.println("private m1 method ");
//		  
//	 }
//		  
//	 private void m1(int a){
//		    System.out.println("private m1 method with int parameter ");
//		  
//		   }
//		  
//	public static void main(String[] args) {
//		    
//		    Main m=new Main();
//		    
//		    m.m1();
//		    m.m1(10);
//		  }  
//		  
//System.out.println("------");

	 static void method(){
		    System.out.println("static method without parameter");
		  }
		  static void method(int a){
		     System.out.println("static method with int parameter");
		  }
		  public static void main(String[] args) {
		   
		   method();
		   method(10);
		  }







}




























