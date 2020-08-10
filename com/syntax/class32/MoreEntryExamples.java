package com.syntax.class32;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class MoreEntryExamples {
public static void main(String[] args) {
	
	Map<String,String> movies = new TreeMap<>();
	
	movies.put("Comedy", "Elf");
	movies.put("Horror", "Anne");
	movies.put("Fiction", "Blood Lad");
	movies.put("Action", "Ong Bak 2");
	movies.put("Romance", "Titanic");
	
	System.out.println(movies);
	
	System.out.println();
	System.out.println("-----------");
	System.out.println();
	
	Set<Entry<String,String>> allEntries = movies.entrySet();
	System.out.println(allEntries);
	System.out.println();
	
	Iterator<Entry<String,String>> it = allEntries.iterator();
	while(it.hasNext()) {
		Entry<String,String> ent = it.next();
		String key = ent.getKey();
		String value = ent.getValue();
		
		System.out.println(key +"="+ value);
	}
	
	System.out.println();
	System.out.println("---------------");
	System.out.println();

	for(Entry<String,String> entry:allEntries) {
	String pair = entry.getKey() +" "+ entry.getValue();
	System.out.println(pair);
	}







}
}
