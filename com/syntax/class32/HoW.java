package com.syntax.class32;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
public class HoW {
	public static void main(String[] args) {
		/*
		 * Create a map of a building. Store floor number and it is associated company
		 * name. (Example: 1= Google, 2=Syntax etc..). Insert 7 entries with duplicate
		 * keys and values. Check how many entries you have? Update company on a 4th
		 * floor Remove company on the 7th floor Print your map
		 * 
		 * 2. Write code to get key and a value pair using Iterator 3. Look into
		 * EntrySet 4. Take some rest
		 */
		Map<Integer, String> floors = new LinkedHashMap<>();
		floors.put(1, "A & CO.");
		floors.put(2, "S & CO.");
		floors.put(3, "K & CO.");
		floors.put(4, "M & CO.");
		floors.put(5, "S & CO.");
		floors.put(2, "Ol & CO.");
		floors.put(6, "K & CO.");
		System.out.println(" Original map :" + floors);
		
		System.out.println("-------------------------------");
		System.out.println("The size of map:"  + floors.size());
		floors.put(4, "G & CO.");
		floors.remove(7);
		
		System.out.println("----------------------------");
		System.out.println("After updating floors :" + floors);
		Collection<String> values = floors.values();
		
		System.out.println("-------------------------");
		System.out.println("Company list :");
		Iterator<String> itValues = values.iterator();
		while (itValues.hasNext()) {
			System.out.println(itValues.next());
		}
		System.out.println("-----------------------------");
		Set<Integer> floor = floors.keySet();
		Iterator<Integer> fNum = floor.iterator();
		System.out.println("Floor numbers :");
		while (fNum.hasNext()) {
			System.out.println(fNum.next());
		}
		System.out.println("----------------------------");
		System.out.println("Entry:key+value in pair");
		for (Integer keyFloor : floor) {
			System.out.println(floors.get(keyFloor));
		}
		System.out.println("----------------------------------");
		Collection<String> v = floors.values();
		for(String val:values) {
			System.out.println(val);
		}
		System.out.println("----------------------------------------");
		Iterator<String> valuesIterator = floors.values().iterator();
		while(valuesIterator.hasNext()) {
			System.out.println(valuesIterator.next());
		}
	System.out.println("-----------------------------------");
		String something = floors.values().iterator().next();
	System.out.println(something);
	
	int k = floors.keySet().iterator().next();
	System.out.println(k);
	}
	

//
//	/*
//	 * Create a Map from array of cities that will sort keys in alphabetical order.
//	 * As a key store the name of the city and as a value store the length of the
//	 * city (Example: Paris=5, Moscow =6, Washington DC=13 etc..). If any city name
//	 * is more than 7 characters remove that city .
//	 */
//	
//		Map<String, Integer> cities = new TreeMap<>();
//		cities.put("Moscow", 6);
//		cities.put("Paris", 5);
//		cities.put("Washington DC", 13);
//		cities.put("Los Angeles", 10);
//		Set<String> keys = cities.keySet();
//		Iterator<String> it = keys.iterator();
//		while(it.hasNext()) {
//			String str = it.next();
//			if(str.length() > 7) {
//				it.remove();
//			}
//		}
//		System.out.println("Cities less than 7 charachters " + cities);
//	
//		
//}
//
//	Map<String, Integer> cities = new TreeMap<>();
//	cities.put(“Paris”, 5);
//	cities.put(“Moskow”, 6);
//	cities.put(“Washington DC”, 13);
//	cities.put(“Vienna”, 8);
//	cities.put(“Istanbul”, 25);
//	cities.put(“Cairo”, 4);
//	cities.put(“Kyiv”, 2);
//	
//	Set<String> keys = cities.keySet();
//	Iterator<String> it = keys.iterator();
//	while(it.hasNext()) {
//		String key = it.next();
//		if(key.length()>7) {
//			it.remove();
//		}
//	}
//	System.out.println(keys);
//}
//}
//
//	Map<String, Integer> emp = new LinkedHashMap<>();
//	emp.put("Sumair Jawaid", 150000);
//	emp.put("AliJon", 100000);
//	emp.put("Asel", 105000);
//	emp.put("Sohil", 100000);
//	Set<Entry<String, Integer>> entry = emp.entrySet();
//	int largest = 0;
//	String name = "";
//	for (Entry<String, Integer> entry2 : entry) {
//		if (entry2.getValue() > largest) {
//			largest = entry2.getValue();
//			name = entry2.getKey();
//		}
//	}
//	System.out.println(name + "= $" + largest);
//}
//}
}
