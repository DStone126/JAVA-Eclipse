package com.syntax.class03;

public class ModulusOperator {
			public static void main(String[] args) {
				double d1 = 12.5;
				double d2 = 4.7;
				double result = d1 / d2;
		System.out.println(result);
				int i = 15;
				int j = 4;
				int result1 = i/j;// 3.5 java cut .5 it will not roundup
		System.out.println(result1);
				double result3 = i/j;
		System.out.println("The divison is " + result3);	// it does int 1st then does double
			int mod = i % j;
			System.out.println("The remainder is " + mod);
				double num1 = 14;
				double num2 = 4;
				System.out.println(num1);
				System.out.println(num2);
				double div = num1 / num2;
				System.out.println(div);
				System.out.println("If we divide doubles the result is " + mod);
			System.out.println("************************************");
			i = 20;
			j = 4;
			mod = i%j;
			System.out.println(mod);
			float f1 = 12.5f;
			float f2 = 4.7f;
			float  fresult = f1 / f2;
			System.out.println("floatresult is " + fresult);
			
			
			
			
			
			
			}
}
