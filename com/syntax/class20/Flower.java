package com.syntax.class20;

public class Flower {

	String type;
	
	

	/*
	 Flower(){ default non argument
	 if you are not going to create a constructor --> compiler will create 1 for you 
	 if you create a constructor then complier will not create any other constructor for you
	 */
	


//	Flower(){
//		System.out.println("Im pointless constructor");
//	}
	
	private Flower(String flowerType){
		type = flowerType;
		
}
	
	void Flower() {
		System.out.println("Printing shyt");
	}
	
	public void display() {
		System.out.println(type);
	}
	
	public static void main(String[] args) {
		
//	Flower flower = new Flower();CE:since we do not 
//	
//		System.out.println(flower.type);
	
	Flower flower2 = new Flower("Tulip");
	//System.out.println(flower2.type);
	flower2.display();
	flower2.Flower();
	}
}
