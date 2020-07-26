package com.syntax.class29;

import java.util.ArrayList;
import java.util.Iterator;

public class RetrievingValuesFromArrayList {
public static void main(String[] args) {
	
	ArrayList<String> a = new ArrayList<>();
	a.add("Damien");
	a.add("Ana");
	a.add("Irr");
	a.add("Elias");
	a.add("Lucien");
	
	//how to retrieve a value
	
	String str = a.get(1);
	System.out.println(str);
	System.out.println();
	//how to retrieve values one by one
	
	for(String as:a) {
		System.out.println(as);
		if(as.equals("Damien")) {
			System.out.println("Damien your the Best");
		}
	}
System.out.println();
for(int i = 0; i < a.size(); i++) {
	String s = a.get(i);
	System.out.println(s);
}

System.out.println();
 
Iterator<String> it = a.iterator();
 
 while(it.hasNext()) {
	 String s= it.next();
	 System.out.println(s);
 }

}
}
