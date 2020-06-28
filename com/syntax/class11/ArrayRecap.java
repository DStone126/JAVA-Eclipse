package com.syntax.class11;

public class ArrayRecap {
public static void main(String[] args) {
			int[] grades = new int[5];		

			int size = grades.length;
			System.out.println(size);
			
			grades[4] = 90;
			grades[3] = 85;
			grades[2] =	92;
			grades[1] = 75;
			grades[0] = 100;
			
			// what is the average of the class?	
			//1st silly way
			int average = (grades[0] + grades[1] + grades[2] 
					+ grades[3] + grades[4]) / size;
			System.out.println("Class average is: " + average);
			//2nd best way
			int total = 0;
			for(int k = 0; k < 5; k++) {
				total+= grades[k];
			}
			System.out.println("Class average is: " + total / 5);
			
			
System.out.println("*********************************************");
			
String[] cities = {"Fairfax", "Kiev", "Tampa", "Washington", "Arlington", 
					"NyC", "Lorton", "Chicago"};
			
			System.out.println("I live in " + cities[2]);
			
			int i = 1;
			System.out.println("I live in " + cities[1]);
			
			i += 2;
			System.out.println("I moved to " + cities[i]);
			
			int cityLength = cities.length;		
			System.out.println("Total number of cities is " + cityLength);

			System.out.println("The last city on the list is " + cities[4]);

			System.out.println("The last city on the list is " + cities[cityLength - 1]);

			System.out.println("********************************");
			
			//i want to print all the cities

			for(int j = 0; j < 8; j++) {// when using <= use one less/can use cities.length/cityLength
				System.out.println(cities[j]);
			
			}


}
}