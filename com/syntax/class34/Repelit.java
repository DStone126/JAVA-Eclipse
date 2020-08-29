package com.syntax.class34;

public class Repelit {

//	import java.util.*;
//
//	class Student{
//		  
//		  public String name, lastName;
//		  public int studentId;
//		  
//		  public Student(String name, String lastName, int studentId){
//		    this.name=name;
//		    this.lastName=lastName;
//		    this.studentId=studentId;
//		  }
//		  
//		  public void displayDetails(){
//		    System.out.println("Student details: "+name+" "+lastName+" with id: "+studentId);
//		  }
//		}
//	
//	class Main {
//	  public static void main(String[] args) {
//	    
//	    // Create a HashSet
//	    Set<Student> set = new LinkedHashSet<>();
//	 
//	     //add elements to HashSet
//	     set.add(new Student("Samir", "Jawaid", 101));
//	     set.add(new Student("Asel", "Umurzakova", 102));
//	     set.add(new Student("Diego", "Juarez", 103));
//	     set.add(new Student("Sohil", "Aryan", 104));
//	     set.add(new Student("Alijon", "Nazarov", 105));
//	 
//	     for(Student stu : set){
//	        stu.displayDetails();
//	     }
//	    
//	  }
//	System.out.println("-------");
//class Employee {
//	
//	private String fullName;
//	private long ssn;
//	private double salary;
//
//	public Employee(String fullName, long ssn, double salary) {
//		this.fullName=fullName;
//		this.ssn = ssn;
//		this.salary = salary;
//	}
//	
//	public String getName() {
//		return fullName;
//	}
//
//	public double getSalary() {
//		return salary;
//	}
//	
//	public long getSsn(){
//	  return ssn;
//	}
//}
//
//import java.util.*;
//class Main {
//  public static void main(String[] args) {
//		
//		Set<Employee> company=new HashSet<>();
//		company.add(new Employee("John Doe", 123456789, 80000));
//		company.add(new Employee("Jane Smith", 987654321, 90000));
//		company.add(new Employee("Jackie Chan", 00000000, 1000000));
//		
//		Iterator<Employee> it=company.iterator();
//		while(it.hasNext()) {
//		  Employee emp=it.next();
//			System.out.println(emp.getName());
//			System.out.println(emp.getSsn());
//			System.out.println(emp.getSalary());
//		}
//	}
//
//	System.out.println("--------------------");
//	
//	import java.util.*;
//	class Main {
//	  public static void main(String[] args) {
//	    HashSet<Integer> list = new HashSet<Integer>();
//	      list.add(111);
//	      list.add(111);
//	      list.add(111);
//	      list.add(999);
//	      list.add(999);
//	      list.add(999);
//	      
//	      for(Integer li:list){
//	        System.out.println(li);   
//	      }
//	  }
//	}
//	
//System.out.println("-------------------");
//
//import java.util.*;
//class Main {
//  public static void main(String[] args) {
//
//     HashSet<String> h_set = new HashSet<>();
//          h_set.add("Red");
//          h_set.add("Pink");
//          h_set.add("Yellow");
//          h_set.add("White");
//          h_set.add("Black");
//          
//    System.out.println("Original Hash Set: " + h_set);
//    System.out.println("Size of the Hash Set: " + h_set.size());
//  }
//}
//
//System.out.println("------------------");
//
//import java.util.*; 
//class Main {
//  public static void main(String[] args) {
//		Set<String> countries=new TreeSet<>();
//		countries.add("India"); 
//		countries.add("Australia"); 
//		countries.add("South Africa"); 
//		countries.add("India");
//		countries.add("America");
//		countries.add("America");
//		
//		System.out.println(countries);
//
//	}
//}
//
//System.out.println("----------");
//
//import java.util.*; 
//class Main {
//  public static void main(String[] args) {
//        Set<String> h = new LinkedHashSet<>(); 
//  
//        // Adding elements into HashSet usind add() 
//        h.add(null);
//        h.add("Sohil");
//        h.add("Diego");
//        h.add("Alijon");
//        h.add("Asel");
//        h.add("Sumair");
//        
//        for(String s:h){
//          System.out.println(s);
//        }
//        
//        Iterator<String> it=h.iterator();
//        while(it.hasNext()){
//          System.out.println(it.next());
//        }
//  }
//}

//System.out.println("-----------");
//
//import java.util.*;
//
//class Main {
//  public static void main(String[] args) {
//    Map<String, String> map = new LinkedHashMap<>();
//         
//        map.put("Street", "Patrick ST");
//        map.put("Suite", "265");
//        map.put("City", "Vienna");
//        map.put("Zip", "22180"); 
//        map.put("Country" , "United State");
//               
//        for (String keys : map.keySet()){
//          System.out.println(map.get(keys));
//        }
//        
//  }
//}
//
//System.out.println("---------------");
//
//	import java.util.HashMap;
//
//	class Main {
//	  
//	  public static void main(String[] args) {
//	  
//	   HashMap<String, String> map = new HashMap<>();
//	         
//	        map.put("Street", "Patrick ST");
//	        map.put("Suite", "265");
//	        map.put("City", "Vienna");
//	        map.put("Zip", "22180");
//	        map.put("Country" , "United State");
//	        
//	        System.out.println(map.size());
//	       
//	        map.clear();
//	       
//	        System.out.println(map.size());
//	    
//	  }
//	}
//
//	System.out.println("-------------");
//
//import java.util.*;
//
//class Main {
//  public static void main(String[] args) {
//         
//        Map<String, String> map = new TreeMap<>();
//        
//        map.put("1 item","apple");
//        map.put("2 item","banana");
//        map.put("3 item","pear");
//        map.put("4 item","tomato");
//        map.put("5 item","mango");
//        map.put("6 item","kiwi");
//        
//        String pair;
//        for(String key: map.keySet()){
//          pair="Key is "+key+" and values is "+map.get(key);
//          System.out.println(pair);
//        }
//  }
//}
//
//System.out.println("---------");
//
//import java.util.*; 
//
//class Main {
//  public static void main(String[] args) {
//  Map<String, Integer> map = new HashMap<>(); 
//      map.put("mango", 10); 
//      map.put("apple", 30); 
//      map.put("orange", 20); 
//      map.put("mango", 40); 
//      map.put("orange", 20); 
//
//      Iterator<String> it=map.keySet().iterator();
//      String key;
//      while(it.hasNext()){
//        key=it.next();
//        System.out.println("Key = "+key +" and value = "+map.get(key));
//      }
//  }
//
//System.out.println("---------");
//
//import java.util.*;
//class Main {
//  public static void main(String[] args) {
//    Map<String, String> map = new LinkedHashMap<>();
//        map.put("Street", "Patrick ST");
//         
//        map.put("Suite", "265");
//         
//        map.put("City", "Vienna");
//         
//        map.put("Zip", "22180");
//         
//        map.put("Country" , "United State");
//         
//         Collection <String> values=map.values();
//         Iterator<String> it=values.iterator();
//         while(it.hasNext()){
//           System.out.println(it.next());
//         }
//  }
//}
//
//System.out.println("---------");
//
//	import java.util.*;
//	import java.util.Map.Entry;
//	 
//	class Main {
//	  public static void main(String[] args) {
//	    
//	    Map<String, String> map = new HashMap<>();
//	        
//	        map.put("Street", "Patrick ST"); 
//	        map.put("Suite", "265");
//	        map.put("City", "Vienna");
//	        map.put("Zip", "22180");
//	        map.put("Country" , "United State");
//	          
//	        Set<Entry<String, String>> sE = map.entrySet();
//			
//			  String value;
//		  	
//			  for (Entry<String, String> entry : sE) {
//			  	 value = entry.getValue().toUpperCase();
//			  	
//			  	 System.out.println(value);
//		  	}
//	  }
//	}
//
//System.out.println("---------");
//
//	import java.util.*;
//	import java.util.Map.Entry;
//
//	class Main {
//	  public static void main(String[] args) {
//	   
//		  Map<String, String> map = new HashMap<>();
//	         
//	       	 map.put("ONE", "AAA");
//	         map.put("TWO", "BBB");
//	         map.put("THREE", "CCC");
//	         map.put("FOUR", "DDD");
//	         map.put("FIVE", "EEE");
//	         
//	        System.out.println("HashMap Before Remove :");
//	         
//	        Set<Entry<String, String>> keyValueSet = map.entrySet();
//	         
//	        for (Entry<String, String> entry : keyValueSet) {
//	            System.out.println(entry.getKey()+" : "+entry.getValue());
//	        }
//	         
//	        System.out.println("------------------");
//	        
//	        map.remove("ONE", "AAA");
//	        map.remove("FOUR", "DDD");
//	         
//	        System.out.println("HashMap After Remove :");
//	         
//	        for (Entry<String, String> entry : keyValueSet) {
//	            System.out.println(entry.getKey()+" : "+entry.getValue());
//	        }
//	    }   
//	}
//
//System.out.println("---------");
//
//	import java.util.*;
//	import java.util.Map.Entry;
//
//	class Main {
//	  public static void main(String[] args) {
//	    Map<String, String> map = new HashMap<>();
//	         
//	        map.put("ONE", "AAA");
//	        map.put("TWO", "BBB");
//	        map.put("THREE", "CCC");
//	        map.put("FOUR", "DDD");
//	        map.put("FIVE", "EEE");  
//	        
//	   System.out.println("HashMap Before Replace :");
//	                 
//	   Set <Entry<String, String>> keyValueSet=map.entrySet();
//	    	
//	   Iterator <Entry<String, String>>it=keyValueSet.iterator();
//	    	
//	    	while(it.hasNext()) {
//				  Entry<String, String> entry = it.next();
//				  String entryValue=entry.getKey()+" : "+entry.getValue();
//				  System.out.println(entryValue);
//			  }
//	                 
//	    System.out.println("------------------");
//	         
//	        map.replace("THREE", "ASEL");
//	        map.replace("FIVE", "SUMAIR");
//	       
//	        System.out.println("HashMap After Replace :");
//	               
//	        it=map.entrySet().iterator();  
//	        
//	        while(it.hasNext()) {
//	  			  
//	    Entry<String, String> entry = it.next();
//	  			 
//	    String entryValue=entry.getKey()+" : "+entry.getValue();
//	  			  System.out.println(entryValue);
//			  }
//	    }   
//	}
//
//System.out.println("---------");
//
//	import java.util.HashMap; 
//	import java.util.Map; 
//	  
//
//	class Main {
//	  
//	   public static void dispay(Map<String, Integer> map)  {
//	      
//		   if (map.isEmpty()){ 
//	            System.out.println("map is empty"); 
//	       
//		   }else{ 
//	            
//			   for (String keys : map.keySet()) {
//	              System.out.println (keys + " : " + map.get(keys));
//	            }
//	        } 
//	     }
//	  public static void main(String[] args) {
//	  
//		  Map<String, Integer> map = new HashMap<>(); 
//	          
//	        map.put("mango", 10); 
//	        map.put("apple", 30); 
//	        map.put("orange", 20); 
//	     
//	        dispay(map); 
//	        map.clear();
//	        dispay(map); 
//	  }
//	}
//
//System.out.println("---------");



	public static void main(String[] args) {
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
		System.out.println("");
	}




















}
