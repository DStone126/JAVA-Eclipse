package com.syntax.class25;

public class RepelItFinalKeyWord {

//	public final String reverseString(String toReverse){
//	    
//	    String reverseString="";
//	    for(int i = toReverse.length() - 1; i >= 0;i--){
//	      reverseString = reverseString + toReverse.charAt(i);
//	    }
//	    
//	    return reverseString;
//  }
//	
//	
//	public static void main(String[] args){
//	    
//		RepelItFinalKeyWord rs = new RepelItFinalKeyWord();
//	    String newString = rs.reverseString("hello");
//	    System.out.println(newString);
//	 }
//	
//	  System.out.println("----------");
//
//	public static void main(String[] args) {
//		int[] a = {2,7,3,8,4};
//		System.out.println(avgElements(a)); //should print 4.8
//	}
//	
//	public static final double avgElements(int[] array){
//	 
//		double sum = 0;
//	
//		double avg = 0;
//		
//		for(int values:array){
//			sum = sum + values;
//			 avg = sum/array.length;
//		}
//		return avg;
//	
//	}
//System.out.println("--------------");
//
//	 final void b(boolean value){
//		    System.out.println("Final method with boolean parameter");
//		  }
//		   
//	 final void b(String value){
//		    System.out.println("Final method with String parameter");
//		  }
//		  
//		   public static void main(String[] args) {
//		   
//			   Main mm= new Main();
//		   
//			   mm.m1(false);
//			   mm.m1("Syntax");
//		}
//		   
// System.out.println("---------");
//
//	interface Outputs {
//		  
//		  void display (double result); 
//		  
//		}
//
//	interface Functions extends Outputs {
//		  double adding (double firstNumber, double secondNumber); 
//		  double subtracting (double firstNumber, double secondNumber); 
//		  double multiply (double firstNumber, double secondNumber); 
//		  double dividing (double firstNumber, double secondNumber); 
//		}
//	
//	@Override
//	public void display(double result) {
//		System.out.println("Result is ::: " + result);
//	}
//
//	@Override
//	public double adding(double firstNumber, double secondNumber) {
//		return firstNumber + secondNumber;
//	}
//
//	@Override
//	public double subtracting(double firstNumber, double secondNumber) {
//		return firstNumber - secondNumber;
//	}
//
//	@Override
//	public double multiply(double firstNumber, double secondNumber) {
//		return firstNumber * secondNumber;
//	}
//
//	@Override
//	public double dividing(double firstNumber, double secondNumber) {
//		return firstNumber / secondNumber;
//	}
//	
//	public static void main (String [] args) {
//		double firstNumber = 100; 
//		double secondNumber = 20;
//		double result; 
//		
//		Main run = new Main(); 
//		result = run.adding(firstNumber, secondNumber);
//		run.display(result);
//		
//		result = run.subtracting(firstNumber, secondNumber);
//		run.display(result);
//		result = run.multiply(firstNumber, secondNumber);
//		run.display(result);
//		result = run.dividing(firstNumber, secondNumber);
//		run.display(result);
//	}
//}
//
//	System.out.println("----------");
//	
//	private  String firstname;
//	private String lastname;
//	private int birthmonth;
//	private int birthday;
//	private int birthyear;
//	private String ssn;
//	
//	public Person(String firstname, String lastname, int birthmonth, int birthday, int birthyear, String ssn) {
//		this.firstname = firstname;
//		this.lastname = lastname;
//		this.birthmonth = birthmonth;
//		this.birthday = birthday;
//		this.birthyear = birthyear;
//		this.ssn = ssn;
//	}
//
//	public String getFirstname() {
//		return firstname;
//	}
//
//	public String getLastname() {
//		return lastname;
//	}
//
//	public int getBirthmonth() {
//		return birthmonth;
//	}
//
//	public int getBirthday() {
//		return birthday;
//	}
//
//	public int getBirthyear() {
//		return birthyear;
//	}
//
//	public String getSsn() {
//		return ssn;
//	}
//
//	public String formatBirthday() {
//		return this.birthmonth + "/" + this.birthday + "/" + this.birthyear;
//	}
//
//	public static void main(String[] args) {
//		Person person = new Person("John", "Doe", 10, 25, 1900, "123-45-6789");
//		
//		System.out.println(person.getFirstname());
//		System.out.println(person.getLastname());
//		System.out.println(person.formatBirthday());
//		System.out.println(person.getSsn());
//	
//	}
//System.out.println("------------");
//	
//	class Parent{
//	 
//	void method(){
//		    System.out.println("Parent method");
//		  }
//}
//	 class Child extends Parent{
//		  void method(){
//		    System.out.println("Child method");
//		  }
//		}
//
//	 public static void main(String[] args) {
//		    Parent parent= new Parent();
//		    parent.method();
//		   
//		   Child child= new Child();
//		   child.method();
//		}
//	 
// System.out.println("----------");
//
//	class Parent {
//		public void method1() {
//			System.out.println("I am a parent public method");
//		}
//
//		protected void method2() {
//			System.out.println("I am a parent protected method");
//		}
//
//		void method3() {
//			System.out.println("I am a parent default method");
//
//		}
//
//		private void method4() {
//			System.out.println("I am a parent private method");
//
//		}
//	}
//
//	class Child extends Parent {
//		public void method1() {
//			System.out.println("I am a child public method");
//		}
//
//		protected void method2() {
//			System.out.println("I am a child protected method");
//		}
//
//		void method3() {
//			System.out.println("I am a child default method");
//
//		}
//	}
//
//	 public static void main(String[] args) {
//		    Child child=new Child();
//				child.method1();
//				child.method2();
//				child.method3();
//		 } 
//	
//	 System.out.println("---------");

	public static final String APPLICATION_URL="https://syntaxtechs.com";
    
	  public static void main(String[] args) {
	    System.out.println(APPLICATION_URL);
	  }



}
