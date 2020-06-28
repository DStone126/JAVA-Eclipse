package com.syntax.class12;

public class Recap2dArrays {
public static void main(String[] args) {
	
	String[][] animals = {
			{"cat","dog", "bird","hamater"},//array or 1st row
			{"tiger","kids","bear"},// 2array or 2nd row
	};		
	int howManyArrays = animals.length;// how many rows
	System.out.println(howManyArrays);

 int element1Array  = animals[1].length;//how many columns 2 row
System.out.println(element1Array);

String element  = animals[1][1];
System.out.println(element);

 //how to get all elements

for( int r = 0; r < animals.length; r++) {//loops over rows 1d arrays
	
	for(int c = 0; c < animals[r].length;c++) {
	
		String animal = animals[r][c];
	
		System.out.print(animal + " ");
}
System.out.println();
}

System.out.println("----------------using enhanced for loop-------------");

for(String[] array:animals) {
	for(String animal:array) {
		System.out.print(animal + " ");
	}
	}

System.out.println();
System.out.println("-----------------");




}
}
