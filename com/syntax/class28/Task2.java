package com.syntax.class28;

public class Task2 {
		/*
		 * We have to calculate the average of marks obtained
		 *  in three subjects by student A and by student B. 
		 *  Create class 'Marks' with an abstract method 'getPercentage' 
		 *  that will be returning the average percentage of marks. 
		 *  Provide implementation of abstract method in 
		 *  classes 'A' and 'B'. The constructor of student A takes 
		 *  the marks in three subjects as its parameters and the marks
		 *   in four subjects as its parameters for student B. Test your code
		 */
	public abstract class Marks {
		public abstract int getPercentage();
	}
	class A extends Marks {
		int a, b, c;
		public A(int a, int b, int c) {
			this.a = a;
			this.b = b;
			this.c = c;
		}
		public int getPercentage() {
			int average = (a + b + c) / 3;
			return average;
		}
	}
	class B extends Marks {
		int a, b, c, d;
		public B(int a, int b, int c, int d) {
			this.a = a;
			this.b = b;
			this.c = c;
			this.d = d;
		}
		public int getPercentage() {
			int average = (a + b + c + d) / 4;
			return average;
		}
	}
	public static void main(String[] args) {
		A studentA = new A(70, 90, 80);
		int averageA = studentA.getPercentage();
		System.out.println("The average of marks student A is: " + averageA + "%");
		B studentB = new B(100, 77, 86, 97);
		int averageB = studentB.getPercentage();
		System.out.println("The average of marks student B is: " + averageB + "%");
	}
}
