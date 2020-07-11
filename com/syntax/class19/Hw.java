package com.syntax.class19;

public class Hw {
//			//print array in string method add all sum
//	protected int printSum(int[] array) {
//		int total = 0;
//		for (int element : array) {
//			total = total + element;
//		}
//		System.out.println(total);
//		return total;
//	}
//	
//	
//	
//	public static void main(String[] args) {
//		Hw numbers = new Hw();
//		int[] arr = { 5, 5, 5, 5 };
//		numbers.printSum(arr);
//	}
//			// write program in string print reversed
//	public static String reverse(String a) {
//		String reverseString="";
//		
//		for(int i=a.length()-1;i>=0;i--) {
//			reverseString=reverseString+a.charAt(i);
//		}
//		return reverseString;
//	}
//	
//	
//	public static void main(String []args) {
//		Hw str = new Hw();
//		String word= str.reverse("Hello");
//		System.out.println(word);
//	}
//	public static String reversed(String a) {
//		String reversed = "";
//		for(int i = a.length()-1; i >=0; i--) {
//			reversed += a.charAt(i);
//		}
//		return reversed;
//	}
public static void main(String[] args) {
	System.out.println(reverse("AnA Stone"));

}
	public static StringBuffer reverse(String a) {
	StringBuffer strb = new StringBuffer(a);
	return strb.reverse();
}
public static String displayVowels(String value) {
	return value.replaceAll("[^aAeEiIoOuU]", "");
}

}


