package com.syntax.classReviewClass;

public class Repelit {

//	abstract class Parent{
//		  abstract void m1();
//		  abstract void m1(int a);
//		}
//
//	class Main extends Parent{
//		  void m1(){
//		  System.out.println("m1 without parameters");
//		  
//		  }
//		  void m1(int a){
//		    System.out.println("m1 method with parameter");
//		  
//		  }
//		  
//		  public static void main(String [] args) {
//		    Parent pp= new Main();
//		    pp.m1();
//		    pp.m1(100);
//		  }
//		}
//System.out.println("------------");
//
//	abstract class Parent{
//		   
//		abstract void m1();
//		  
//		void m2(){
//		    System.out.println("Parent class providing implementation");
//		  
//		}
//		}
//
//	class Main extends Parent {
//		 
//		void m1(){
//		    System.out.println("Child class providing implementation");
//		  }
//		   
//		  public void main(String[] args) {
//		   
//			  Parent pp=new Main();
//		    
//			  pp.m1();
//		    pp.m2();
//		  		  }
//	}
//System.out.println("---------");
//
//	abstract class Tea {
//
//		String teaType;
//
//		Tea(String teaType) {
//			this.teaType = teaType;
//		}
//
//		public abstract void addSugar();
//	}
//
//	class LemonTea extends Tea {
//
//		LemonTea(String teaType) {
//			super(teaType);
//		}
//
//		@Override
//		public void addSugar() {
//			System.out.println("For " + teaType + " we need 2 spoons of sugar");
//		}
//	}
//
//	class ChaiTea extends Tea {
//
//		ChaiTea(String teaType) {
//			super(teaType);
//		}
//
//		@Override
//		public void addSugar() {
//			System.out.println("For " + teaType + " we need 1 spoon of sugar");
//		}
//
//	}
//
//	class Main {
//		  public static void main(String[] args) {
//				Tea ltea = new LemonTea("Lemon Tea");
//				ltea.addSugar();
//
//				Tea ctea = new ChaiTea("Chai Tea");
//				ctea.addSugar();
//			  }
//	}
//		
//System.out.println("--------");
//
//	interface MyInterface {
//		   void method1();
//		   void method2();
//		}
//
//	class Main implements MyInterface{
//
//	    @Override
//	  public void method1(){
//		System.out.println("implementation of method1");
//	   }
//	   @Override
//	  public void method2(){
//		System.out.println("implementation of method2");
//	  }
//	  public static void main(String[] args) {
//	    
//	    MyInterface mi= new Main();
//	    mi.method1();
//	    mi.method2();
//	   } 
//	  }
//	
//System.out.println("---------");
//
//	interface FirstInterface{
//		   void firstMethod();
//		}
//
//	interface SecondInterface  {
//		   void secondMethod();
//		}
//
//	class Main implements FirstInterface,SecondInterface {
//		  
//	    public void firstMethod(){
//		    System.out.println("First Method implementing multiple Inheritance");
//	    }
//	    public void secondMethod(){
//		    System.out.println("Second Method implementing multiple Inheritance");
//	    }
//	  
//	  public static void main(String[] args) {
//	    
//	    Main mm= new Main();
//	    mm.firstMethod();
//	    mm.secondMethod();
//	   } 
//	 } 
//	
//System.out.println("----------");
//
//	public interface ParentInterface {
//		  void parentMethod(); 
//		}
//	public interface ChildInterface extends ParentInterface{
//		  void childMethod();
//		}
//	class Main implements ChildInterface{
//
//	    public void parentMethod(){
//	    	System.out.println("Parent Method-welcome to Syntax");
//	    }
//	    public void childMethod(){
//	      System.out.println("Child Method-hello Syntax");
//	    }
//	  
//	  public static void main(String[] args) {
//	    
//	    Main mm= new Main();
//	    mm.parentMethod();
//	    mm.childMethod();
//	
//	  }
//	}
// System.out.println("--------");
//
//	class EncapsulationDemo{
//		  
//		  private String empName;
//		  private int empAge;
//
//		  public String getEmpName(){
//		        return empName;
//		    }
//
//		    public int getEmpAge(){
//		        return empAge;
//		    }
//
//		public void setEmpAge(int newValue){
//		        empAge = newValue;
//		    }
//
//		    public void setEmpName(String newValue){
//		        empName = newValue;
//		    }
//
//		}
//	
//	class Main {
//		  public static void main(String[] args) {
//		    EncapsulationDemo obj = new EncapsulationDemo();
//		         obj.setEmpName("John");
//		         obj.setEmpAge(30);
//		         System.out.println("Employee Name: " + obj.getEmpName());
//		         
//		         System.out.println("Employee Age: " + obj.getEmpAge());
//		 
//		  }
//	
//	System.out.println('------');
//	
//	class EncapsulationDemo{
//	    
//	    private String empName;;
//	    private int empAge;
//	    
//	    //Getter and Setter methods
//	   
//	    public String getEmpName(){
//	        return empName;
//	    }
//
//	    public int getEmpAge(){
//	        return empAge;
//	    }
//
//	    public void setEmpAge(int newValue){
//	        empAge = newValue;
//	    }
//
//	    public void setEmpName(String newValue){
//	        empName = newValue;
//	    }
//
//	}
//	
//	class Main extends EncapsulationDemo {
//		  public static void main(String[] args) {
//		    
//		    EncapsulationDemo obj = new EncapsulationDemo();
//		         obj.setEmpName("Mario");
//		         obj.setEmpAge(32);
//		         
//		         System.out.println("Employee Name: " + obj.getEmpName());
//		         
//		         System.out.println("Employee Age: " + obj.getEmpAge());
//}
//		}   
//		  
//		System.out.println("---------");
//	
//	class EncapsulationDemo{
//	    
//	    private String empName="John";
//	    private int empAge=30;
//	    
//	    //Getter and Setter methods
//	    public String getEmpName(){
//	        return empName;
//	    }
//
//	    public int getEmpAge(){
//	        return empAge;
//	    }
//	}
//	class Main {
//		  public static void main(String[] args) {
//
//		    EncapsulationDemo obj = new EncapsulationDemo();
//		    
//		    System.out.println("Employee Name: " + obj.getEmpName());
//		    System.out.println("Employee Age: " + obj.getEmpAge());
//		}
//		  
//	 System.out.println("----------");
//	
//	class Account { 
//		//private data members  
//		private long acc_no;  
//		private String name,email;  
//		private double amount;  
//		//public getter and setter methods  
//		public long getAcc_no() {  
//		    return acc_no;  
//		}  
//		public void setAcc_no(long acc_no) {  
//		    this.acc_no = acc_no;  
//		}  
//		public String getName() {  
//		    return name;  
//		}  
//		public void setName(String name) {  
//		    this.name = name;  
//		}  
//		public String getEmail() {  
//		    return email;  
//		}  
//		public void setEmail(String email) {  
//		    this.email = email;  
//		}  
//		public double getAmount() {  
//		    return amount;  
//		}  
//		public void setAmount(double amount) {  
//		    this.amount = amount;  
//		}  
//		  
//		}  
//	
//	class Main {
//		  public static void main(String[] args) {
//		    
//		    //creating instance of Account class  
//		    Account acc=new Account();  
//		    //setting values through setter methods  
//		    acc.setAcc_no(7560504000l);  
//		    acc.setName("Sumair");  
//		    acc.setEmail("sumair@syntax.com");  
//		    acc.setAmount(50000);  
//		    //getting values through getter methods  
//		    System.out.println(acc.getAcc_no()+" "+acc.getName()+" "+acc.getEmail()+" "+acc.getAmount());  
//}
//		}
//	
//	 System.out.println("----------");
//	
//	import java.util.ArrayList;
//
//	class Main {
//	  public static void main(String[] args) {
//
//	       ArrayList<String> list = new ArrayList<>();
//	       System.out.println(list.isEmpty());  
//	        list.add("Syntax");
//	        System.out.println(list.isEmpty()); 
//	}
//	}
// 
//	System.out.println("----------");
//
//	import java.util.ArrayList;
//
//	class Main {
//	  public static void main(String[] args) {
//	    ArrayList<Integer> list = new ArrayList<>();
//	        list.add(111);
//	        list.add(222);
//	         list.add(333);
//	         list.add(444);
//	         list.add(555);
//	         list.add(666);
//	         System.out.println(list.get(0)); 
//	         System.out.println(list.get(2)); 
//	         System.out.println(list.get(4)); 
//	 }
//	 } 
//	
//System.out.println("-------");
//
//	import java.util.ArrayList;
//	class Main {
//	  public static void main(String[] args) {
//	    
//	    ArrayList<Integer> list = new ArrayList<>();
//	      list.add(111);
//	      list.add(111);
//	      list.add(111);
//	      list.add(999);
//	      list.add(999);
//	      list.add(999);
//	      
//	      for(int li:list){
//	        System.out.println(li);   
//	      }
//	   }
//	  }
//
//	System.out.println("-----------");
//
//import java.util.ArrayList;
//
//class Main {
//  public static void main(String[] args) {
//    ArrayList<Integer> list = new ArrayList<>();
//        list.add(111);
//        list.add(222);
//         list.add(333);
//         list.add(444);
//         list.add(555);
//         list.add(666);
//         System.out.println(list);   
//         list.clear();
//         System.out.println(list);
//  }
//}
//	System.out.println("-----------");
//
//	import java.util.ArrayList;
//
//	class Main{
//		public static void main(String[] args){
//			ArrayList<String> arrlist=new ArrayList<>();
//			
//			arrlist.add("hi");
//			arrlist.add("yo");
//			arrlist.add("sup");
//			arrlist.add("yolo");
//			arrlist.add("boop");
//			
//			arrlist.remove(0);
//			arrlist.remove(1);
//			arrlist.remove(2);
//			
//			for (String object : arrlist) {
//				System.out.print(object+" ");
//			}
//		}
//	}
//
//	System.out.println("-----------");
//
//	import java.util.Scanner;
//	import java.util.ArrayList;
//	class Main {
//		public static void main(String[] args) {
//			ArrayList<Integer> arrlist = new ArrayList<>();
//
//			Scanner input = new Scanner(System.in);
//			for (int i=0;i<5;i++){
//				arrlist.add(input.nextInt());
//			}
//
//			for (int num : arrlist) {
//				System.out.print(num + " ");
//			}
//		}
//	}
//
//	System.out.println("-----------");
//
//	import java.util.Iterator;
//	import java.util.LinkedList;
//	import java.util.List;
//
//	class Main {
//	  public static void main(String[] args) {
//			List<Integer> lList = new LinkedList<>();
//
//			for (int i = 50; i <=100; i++) {
//				lList.add(i);
//			}
//
//			Iterator<Integer> it=lList.iterator();
//			while(it.hasNext()) {
//				if(it.next()%3!=0) {
//					it.remove();
//				}
//			}
//			
//			System.out.println(lList);
//	 }
//	}
//
//	System.out.println("-----------");
//
//	import java.util.LinkedList;
//	import java.util.List;
//
//	class Main {
//	 public static void main(String[] args) {
//			
//			List<Integer> llist=new LinkedList<>();
//			int a=0;
//			int b=1;
//			int c;
//			
//			for(int i=1; i<=10; i++) {
//				
//				llist.add(a);
//				c=a+b;
//				a=b;
//				b=c;
//			}
//			
//			for(int num:llist) {
//				System.out.print(num+" ");
//			}
//	}
//	}
//
//	System.out.println("-----------");
//
//	import java.util.*;
//
//	class Main {
//		public static void main(String[] args) {
//			List <Boolean>listA = new LinkedList<>();
//			listA.add(true);
//			listA.add(false);
//			listA.add(false);
//			
//			List <Boolean>listB = new LinkedList<>();
//			listB.addAll(listA);
//			
//			Iterator<Boolean> it=listB.iterator();
//			while(it.hasNext()){
//			  System.out.println(it.next());
//			}
//		}
//	}
//
//	System.out.println("-----------");
//
//	import java.util.*;
//
//	class Main {
//	public static void main(String[] args) {
//			List<Integer> primeNumbers = new LinkedList<>();
//			for (int i = 2; i <= 100; i++) {
//				if (isPrime(i)) {
//					primeNumbers.add(i);
//				}
//			}
//
//			System.out.println(primeNumbers);
//		}
//
//		public static boolean isPrime(int number) {
//			for (int i = 2; i < number; i++) {
//				if (number % i == 0) {
//					return false;
//				}
//			}
//			return true;
//		}
//	}
//
//	System.out.println("-----------");
//
//	import java.util.LinkedList;
//
//	class Main {
//	  public static void main(String[] args) {
//			LinkedList<Integer> list = new LinkedList<Integer>(); 
//			list.add(111);
//			list.add(222);
//			list.add(333);
//			list.add(444);
//			list.add(555);
//			list.add(666);
//			
//			int result = 0; 
//			
//			for (Integer value : list) {
//				result = result + value;
//			}
//			
//			System.out.println("Result of sum is " + result);
//		}
//	}
//
//	System.out.println("-----------");
//
//	import java.util.*;
//
//	class Main {
//	public static List<String> removeElement(List<String> list, String letter) {
//
//			Iterator<String> it = list.iterator();
//			while (it.hasNext()) {
//				if (it.next().startsWith(letter)) {
//					it.remove();
//				}
//			}
//
//			return list;
//		}
//
//		public static void main(String[] args) {
//
//			List<String> countries = new LinkedList<>();
//			countries.add("Armenia");
//			countries.add("USA");
//			countries.add("Kazakhstan");
//			countries.add("Australia");
//			countries.add("Pakistan");
//			countries.add("Russia");
//			countries.add("Azerbaijan");
//
//			System.out.println(removeElement(countries, "A"));
//		}
//	}









































}
