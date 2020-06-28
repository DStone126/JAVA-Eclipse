package com.syntax.class02;

public class ArithmeticOperatorsDemo {
		public static void main(String[] args) {
			int num1 =10;
			int num2 =5;
			int num3 = num1;
			System.out.println(num3);
			
			int sum = num1 + num2;
			int sub = num1 - num2;
			int div = num1 / num2;
			int multi = num1 * num2;
			
			
			System.out.println(" addition ->" + sum);
			System.out.println("subtraction ->" + sub);
			System.out.println("division ->" + div);
			System.out.println("multiplication ->" + multi);
			
			double d1 = 3.4;
			double d2 = 5.73;
			double dSum = num1 + num2;
			System.out.println(d1);
			System.out.println(d2);
			System.out.println("Double addition ->" + dSum);
			double dSum2 = num1 + num2;
			System.out.println("dsum2 ->" + dSum2);
			//order of operations
			System.out.println( "Ahmet_" + 10 + 30);
			System.out.println("Ahmet_" + (10 + 30));
			System.out.println("Ahmet_" + (10 * 30));
			
			
		}
}
