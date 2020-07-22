package com.syntax.class25;

public class StoreTest {
public static void main(String[] args) {
	
	Store macys = new Macys("Macys", "Tysons , Virginia");
	Store starbucks = new Starbucks("Starbucks","New York");
	Store nike = new Nike("Nike","Los Angeles","Jordans");	

	String[]array = {"Hello","Hi"};
	Store[] myStores = {macys,starbucks,nike};	
	Store[] stores ={new Macys("Macys","Florida"),new Starbucks("Starbucks", "Texas"),new Nike("Nike","Illinois","Kyrees")};
	int size = stores.length;
	System.out.println(size);
	
	for(Store s:stores) {
		System.out.println();
		s.openHours();
		s.sell();
		System.out.println("------------");
		
	}
System.out.println("---LOOPING MYSTORES ARRAY---");
	System.out.println();
	for(int i = 0; i < myStores.length; i++) {
		myStores[i].openHours();
		myStores[i].sell();
	System.out.println("----------");
	}
}
}
