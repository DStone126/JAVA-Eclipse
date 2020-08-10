package com.syntax.class31;

import java.util.HashMap;

public class MapIntro {
public static void main(String[] args) {
	
	HashMap<Integer, String> hmap = new HashMap<>();
	hmap.put(10, "John");//key + value = entry
	hmap.put(11, "Jane");//k+v=E
	hmap.put(12, "James");//k+v=e can duplicate value but not keys
	
	System.out.println(hmap);
	
	hmap.put(11, "Bob");
	hmap.put(13, "D");
	hmap.put(14, "value");
	
	System.out.println(hmap);
	
	//how many entry objects inside the map?
	
	int eO = hmap.size();
	System.out.println(eO);
	
	//how to check in map how many elements?
	boolean iE = hmap.isEmpty();
	System.out.println(iE);
	
	//check if map has specific key or value
	
	boolean cK = hmap.containsKey(12);
	System.out.println(cK);
	
	boolean cV = hmap.containsValue("value");
	System.out.println(cV);
	
	//how to retrieve 1 value from the Map?
	
	String v = hmap.get(12);// gets the value of specified keys
	System.out.println(v);

	//how to remove a key from map
	hmap.remove(10);
	System.out.println(hmap);
	










}
}
