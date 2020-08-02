package com.syntax.class30;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		
		LinkedList<String> food =new LinkedList<>();
		food.add("Beshparmak");
		food.add("Pizza");
		food.add("Biryani");
		food.add("Tacos");
		
		String myFood = food.get(2);
		System.out.println(myFood);
		
		LinkedList<String> deserts = new LinkedList<>();
		deserts.add("Cake");
		deserts.add("Ice Cream");
		deserts.add("Cookies");
		
		food.addAll(deserts);
		System.out.println("Linklist after adding desert "+ food);
		
		food.remove("Biryani");
		System.out.println("After removing biryani "+ food);
		
		food.set(5, "Brownie");
		System.out.println("Replacing cookies with brownies "+ food);
		
		// i want to get all values 1 by 1
		
		System.out.println("---Using iterator-----");
		Iterator<String> foodIterator = food.iterator();
		
		while(foodIterator.hasNext()) {
			String foood = foodIterator.next();
			System.out.print(foood + " ");
		if(foood.equals("Beshparmak") || foood.equals("Tacos"))
			foodIterator.remove();
		
		}
		
		
	System.out.println();
		System.out.println("LinkeList after iterator "+ food);
		
		//lets create list with country type of objects
		
		System.out.println("------difference between ArrayList and LinkedList-------");
		
		LinkedList<Country> countries = new LinkedList<>();
		countries.add(new USA("USA"));
		countries.add(new Kazakhstan("Kazakhstan"));
		countries.add(new Afghanistan("Afghanistan"));
		
		System.out.println("Collection of Country Objects has "+ countries.size() + " elements");

		for(Country c:countries) {
			c.election();
			
		}
	
	}
}
