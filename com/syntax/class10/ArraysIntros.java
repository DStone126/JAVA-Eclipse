package com.syntax.class10;

public class ArraysIntros {
public static void main(String[] args) {
	// Array is a tray of tea cups
	// a big container that stores multiple values of the same type
	//is one of the data structures of Java
	//values inside the array are called elements
	//elements are store based on index (starting from 0)
	//are fixed in size
	
	
	
	
	
	
			int num1 = 10;
			int num2 = 15;
			int num3 = 20;
			int num4 = 25;

			// declare and initialize one array of integers
			// Scanner sc = new Scanner();
			int[] numbers = new int[4]; // index from 0 to 3
			numbers[0] = 10;
			numbers[1] = 15;
			numbers[2] = 20;
			numbers[3] = 25;
			// this is worng --> numbers[4]

			// access elements from the array
			System.out.println(numbers[3]);

			// if the array is storing integers
			// when I get one element I will get one int
			int element0 = numbers[0];

			System.out.println("----------------------");

			// Are are just declaring, not initializing
			String[] carArray; // preferred way
			String carArray1[];// works but not preferred

			// we are creating/initializing the array
			carArray = new String[3]; // The size is 3 --> with index 0, 1, 2
			// storing cars
			carArray[0] = "BMW";
			carArray[1] = "Toyota";
			carArray[2] = "Benz";
			// carArray[3] = "Tesla"; // Will give an runtime-error

			String car = carArray[2];
			System.out.println(car);

			System.out.println("----------------------");

			char[] letters = new char[4];
			letters[0] = 'A';
			letters[3] = 'B';
			letters[2] = 'G';
			letters[1] = 'Z';

			System.out.println("printing before re-assigning " + letters[2]);

			// re-assigning another letter into spot with index 2
			letters[2] = 'K';

			System.out.println("printing after re-assigning " + letters[2]);
		
			System.out.println("----------------");
			// we created an array and stored the initial values
			String[] weekdays = { "Monday", "Tuesday", "Wednesday", "Thursda", "Friday" };

			// Let us print the element with index 3
			System.out.println(weekdays[3]);
			weekdays[3] = "Thursday";
			System.out.println(weekdays[3]);

			// we cannot add elements to the array
			// weekdays[5] = "Saturday"; //runtime error

			// 1st way
			double[] balances = { 10000, 23.50, 5540.5 };
			System.out.println("total money is: " + (balances[0] + balances[1] + balances[2]));

			// 2nd way
			int total1 = (int) balances[0] + (int) balances[1] + (int) balances[2];
			System.out.println("total1 is: " + total1);

			// 3rd way
			int total2 = (int) (balances[0] + balances[1] + balances[2]);
			System.out.println("total2 is: " + total2);

			// Don't ever create an array with 0 elements
			// because you cannot add elements later
//			int[] numbers1 = new int[0];
//
//			int[] numbers2 = {};
//			numbers2[5] = 5;
//			System.out.println(numbers2[5]);
//		}

	
}
}
