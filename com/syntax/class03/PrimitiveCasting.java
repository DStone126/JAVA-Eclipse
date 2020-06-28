package com.syntax.class03;

public class PrimitiveCasting {
						public static void main(String[] args) {
					// this is wideing, implicit casting, automatically
							double d = 7;
				System.out.println(d);	
					
				//narrowing explicit casting manually
				 int i = (int) 7.58;
					System.out.println(i);
					//copile time error -> type mismatch cannot convert from
					//double int
				byte b = (byte)	12385;
				System.out.println(b);
				
			long l1 = 45;
			int number1 = (int) l1;
			System.out.println("number1 = " + number1);
			long l2 = 23433333333l;
			int number2 =(int) l2;
			System.out.println("number2 = " + number2);
					
					double con1 =500.4444;
					long con = (long)con1;	
					System.out.println(con);
						}
}
