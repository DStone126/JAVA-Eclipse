package com.syntax.class17;

public class MoreMethods {
	
	public static void main(String[] args) {
		
		MoreMethods obj = new MoreMethods();
		
		int[] array = {56, 46, 23, 90};
	int	large = obj.largestFromArray(array);
	System.out.println(large);
	
	String[] words = obj.getWords("good night friends");
	for(String word: words) {
		System.out.println(word);
	}
	
	}

	//creat a method that should return largest number from a array
	
	int largestFromArray(int[] array ) {
		
		int largest = array[0];
		
		for(int i = 0; i <array.length; i++ ) {
			if(array[i] > largest) {
				largest = array[i];
			}
		
		}
		return largest;
	}

// creat a method that will accept a string and return words from that string
	//"Hello World", "Good night friends"

	String[] getWords(String str) {
	return str.split(" ");
	
}

	
}
