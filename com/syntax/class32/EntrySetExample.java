package com.syntax.class32;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class EntrySetExample {
public static void main(String[] args) {
	
	Map<Integer, String> floors = new LinkedHashMap<>();
	floors.put(1, "A & CO.");
	floors.put(2, "S & CO.");
	floors.put(3, "K & CO.");
	floors.put(4, "M & CO.");
	floors.put(5, "S & CO.");
	floors.put(2, "Ol & CO.");
	floors.put(6, "K & CO.");
	System.out.println(" Original map :" + floors);
	
	System.out.println();
	System.out.println("----------------");
	System.out.println();

	Set<Entry<Integer, String>> entries = floors.entrySet();
	
	System.out.println("Set of entry objects "+ entries);
	
	System.out.println();
	System.out.println("--------------------");
	System.out.println();
	
	for(Entry ent:entries) {
		System.out.println(ent.getKey()+"---"+ent.getValue());
	}
	
	System.out.println();
	System.out.println("------Retrieving key and value pair from Entry using iterator------");
	System.out.println();
	
	Iterator<Entry<Integer, String>> it = entries.iterator();
	while(it.hasNext()) {
		Entry<Integer, String> entry = it.next();
		System.out.println(entry.getKey() +"---"+ entry.getValue());
	}
	
	
	
	
	
	
	
}
}
