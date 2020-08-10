package com.syntax.class32;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class AnimalsInMap {
	public static void main(String[] args) {

		Map<Integer, Animal> life = new LinkedHashMap<>();

		life.put(1, new Dog("Dog", "Multi colored White, Black, Brown"));
		life.put(2, new Monkey("Monkey", "Grey with Red and Blue face"));
		life.put(3, new Zebra("Zebra", "White with Black stripes"));

		System.out.println("-----Using Entry------");
		Set<Entry<Integer, Animal>> entries = life.entrySet();
		for(Entry<Integer, Animal> e:entries) {
			Animal an = e.getValue();
			System.out.println(an.type);
			System.out.println(an.color);
			
			an.eat();
			an.sleep();
			
			System.out.println("---------");
		}
	
	//write with Iterator
		System.out.println("-------2nd way to using values()---------");
	
	Collection<Animal> values = life.values();
	for(Animal animal:values) {
		System.out.println(animal.type);
		System.out.println(animal.color);
		animal.eat();
		animal.sleep();
		System.out.println("------------");
	
	}
	
	//write with Iterator
			System.out.println("-------2nd way to using keySet()---------");
		
	Set<Integer> keys = life.keySet();
	for(Integer key:keys) {
		Animal animal = life.get(key);
		System.out.println(animal.type);
		System.out.println(animal.color);
		animal.eat();
		animal.sleep();
		System.out.println("------------");
	}
	
	Iterator<Entry<Integer,Animal>> it = life.iterator();
	while(it.hasNext()) {
		Entry<Integer,Animal> en = it.next();
		int key = en.getKey();
		Animal value = en.getValue();
		System.out.println(key +"="+ value);
	}
	}
	
	
	}

