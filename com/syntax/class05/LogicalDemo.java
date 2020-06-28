package com.syntax.class05;

public class LogicalDemo {
	public static void main(String[] args) {
			/*and (&&)
			 * if (true && true)--->true
			 * if (true && false)--->false
			 * if (false && false)--->false
			 * if (false && true )--->false
			 * or (||)
			 * if (true || true)-->true
			 * if (true || false)-->true
			 * if (false || true)-->true
			 * if (false || false)-->false
			 * not(!) reverse the condition (boolean value)
			 * 1. to assign the reverse of a boolean 
			 * boolean b1 = !true;
			 * System.not.println(b1);-->false
			 */
			//("*****************************************"); 
			
			int num = 20;
			
			if (num >= 1 && num <= 10) {
				System.out.println(num + " is a small number");
			}else if (num >= 10 && num <= 100) {
			System.out.println(num + " is a medium number");
			}else if (num >= 100 && num <= 1000) {
			System.out.println(num + " is a large number");
			}else {
			System.out.println(num + " is invalid");
}
			System.out.println("************************************");
			//OR(||)
			
			int num2 = 100;
			if (num2 >= 1 || num2 <= 10) {
				System.out.println(num2 + " is a small number");
			}else if (num2 >= 10 || num2 <= 100) {
			System.out.println(num2 + " is a medium number");
			}else if (num2 >= 100 || num2 <= 1000) {
			System.out.println(num2 + " is a large number");
			}else {
			System.out.println(num2 + " is invalid");
}
			System.out.println("*******************************************8");
			//NOT(!)
			
			int num3 = 1000;
			if (num3 >= 1 && num3 <= 10) {
				System.out.println(num3 + " is a small number");
			}else if (num3 >= 10 && num3 <= 100) {
			System.out.println(num3 + " is a medium number");
			}else if (num3 >= 100 && num3 <= 1000) {
			System.out.println(num3 + " is a large number");
			}else {
			System.out.println(num3 + " is invalid");
}
	}
}
