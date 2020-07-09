package com.syntax.classReviewClass;

public class ArrayDemo {
public static void main(String[] args) {
	int[]arr = {5,9,2,6,1};
	
	ArrayManipulation a = new ArrayManipulation();
	int biggest = a.largest(arr);
	System.out.println("largest is: " + biggest);

	ArrayManipulation.printSum(arr);//will not print
	ArrayManipulation.sum(arr);
	int result = ArrayManipulation.sum(arr);
	System.out.println("the sum of the array is: " + result);
		//System.out.println("the sum of the array is: " +ArrayManipulation.sum(arr));
		//this how you print everything in 1line
	ArrayManipulation.printArray(arr);

	int[]arr1 = {5,2,6,9,1};
	int[]arr2 = {6,2,4,7,1};
	int[]arr3 = {1,0,2,8,3};

	
////this print a1
//	for(int element:arr1) {
//		System.out.print(element + " ");
//	}	
//	System.out.println();
//	//this print a2
//	for(int element:arr2) {
//		System.out.print(element + " ");
//	}	
//	System.out.println();
//	//this print a2
//	for(int element:arr3) {
//		System.out.print(element + " ");
//	}	
//System.out.println();

//best way to print all 3
ArrayManipulation.printArray(arr1);
ArrayManipulation.printArray(arr2);
ArrayManipulation.printArray(arr3);

}
}
