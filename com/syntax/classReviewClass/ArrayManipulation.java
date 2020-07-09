package com.syntax.classReviewClass;

public class ArrayManipulation {

	public int largest(int[] array) {
	
		int max = array[0];
	
for(int i =1; i < array.length; i++) {
	if (array[i]> max) {
		max = array[i];
	}
}
	return max;
	}
// will not return the sum
	public static void printSum(int[] array) {
	int total = sum(array);
System.out.println(total);
}
	//will return sum
	public static int sum(int[] array) {
		int total = 0;
		for(int element:array) {
			total = total + element;
		}
	return total;
}

	public static void printArray(int[] array) {
		for(int element:array) {
			System.out.print(element + " ");
		}	
	System.out.println();
	
	}	
}
