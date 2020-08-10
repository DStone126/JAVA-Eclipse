package com.syntax.class31;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class AllMap {
public static void main(String[] args) {
	
	//creat a map of grocery that will hold item:price
	
	Map<String, Double> g = new HashMap<>();
	g.put("Apple",1.99 );
	g.put("Milk",4.99 );
	g.put("Ice Cream",2.99 );
	g.put("Eggs",4.99 );
	g.put("Juice",4.40 );
	g.put("Milk",5.00 );

System.out.println(g);


//LinkedHashMap<>(); preserve insertion order of keys
Map<String, Double> m = new LinkedHashMap<>();
m.put("Collone", 99.99);
m.put("T-Shirt", 15.99);
m.put("Shoes", 99.99);
m.put("Colone", 99.99);
m.put("Tea", 2.99);
m.put("Soup",1.99 );

System.out.println(m);


}
}