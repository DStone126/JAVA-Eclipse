package com.syntax.class31;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class CollectionViewOfMap {

	public static void main(String[] args) {
		
		Map<String, Double> g = new HashMap<>();
		g.put("Apple",1.99 );
		g.put("Milk",4.99 );
		g.put("Ice Cream",2.99 );
		g.put("Eggs",4.99 );
		g.put("Juice",4.40 );
		g.put("Milk",5.00 );

	System.out.println(g);
	
	double v = g.get("Milk");
	System.out.println(v);
	
	//how to get all the values
	
	Collection<Double> va = g.values();
	System.out.println("----get all values 1 by 1 using for loop-----");
	
	for(Double val:va) {
		System.out.println(val);
	}
	
	System.out.println("-- get all values 1 by 1 using iterators-----");
	
	Iterator<Double> values = va.iterator();
	while(values.hasNext()) {
	double v1 = values.next();
	System.out.println(v1);
	
	//how to get all keys
	
	Set<String> keys = g.keySet();
	System.out.println("-- get all keys 1 by 1 using iterators-----");
	
	Iterator<String> k = keys.iterator();
	while(k.hasNext()) {
		System.out.println(k.next());
		
		System.out.println("-- get all keys 1 by 1 using forloop-----");
		
		for(String key:keys) {
			System.out.println(key);
		}
		
	}
	
	}
	}
}
