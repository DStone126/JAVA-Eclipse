package com.syntax.class30;

import java.util.ArrayList;
import java.util.Iterator;

public class RemovingElementsFromCollection {

	
	public static void main(String[] args) {
		
		ArrayList<String> cities = new ArrayList();
		
		cities.add("NewYork");
		cities.add("Kyiv");
		cities.add("LA");
		cities.add("DC");
		cities.add("Istanbul");
		cities.add("LA");
		
		System.out.println("Original arraylist "+ cities);
		//remove cities la, dc
		
		System.out.println("------Removing objects from arraylist using for loop------");
		
		for(int i = 0; i < cities.size(); i ++) {
			
			if(cities.get(i).equals("LA") || cities.get(i).equals("LA")) {
				cities.remove(i);
			
				System.out.println(cities);
			}
		}
	
		System.out.println("Final arraylist "+ cities);
	
		System.out.println("-----Removing objects from arraylist using advance for loop-----");
		
//		for(String city:cities) {
//			
//			if(city.equals("NewYork")) {
//				cities.remove(city);
//				
//			}
//		}
	
		System.out.println(cities);
		
		System.out.println("----Removing objects from arraylist using iterator-----");
	
		cities.add("LA");
		cities.add("LA");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Miami");
		cities.add("Moscow");
		
		System.out.println(cities);
		
		Iterator<String> citiesIT = cities.iterator();
		//lets remove new york , and la objects
		
		
		while(citiesIT.hasNext()) {
			String ci = citiesIT.next();
			if(ci.equals("LA") || ci.equals("NewYork")) {
				citiesIT.remove();
			}
		}
	
		System.out.println("ArrayList after modifications from Iterator: "+ cities);

		System.out.println("----Arraylist of cars-------");
		
ArrayList<String> cars = new ArrayList();
		
		cars.add("Toyata");
		cars.add("Dodge");
		cars.add("Honda");
		System.out.println(cars);
		
		cars.add("Ford");
		cars.add("GMC");
		cars.add("Jeep");
		System.out.println(cars);
		
		cars.add("Cadi");
		System.out.println(cars);
		
		System.out.println("----Removing word that end with e---");
		
ArrayList<String> words = new ArrayList();
		
		words.add("dogie");
		words.add("candy");
		words.add("latte");
		words.add("coffee");
		words.add("free");
		words.add("yo");
		System.out.println("Before removing anything "+ words);
		
		Iterator<String> wordsIT = words.iterator();
		while(wordsIT.hasNext()) {
			String ws = wordsIT.next();
			if(ws.equals("dogie") || ws.equals("latte") || ws.equals("coffee") || ws.equals("free")) {
				wordsIT.remove();
			
//			for(int i = 0; i < words.size(); i++) {
//				if( words.endsWith("e")) {
//					words.remove(i);
//				}
//			}
			}
		}
	
		System.out.println("After removing words with e "+ words);
	
	}
}

