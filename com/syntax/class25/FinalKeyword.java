package com.syntax.class25;

public class FinalKeyword {

	public static String str = "Hello";
	
	public static final String USERNAME = "Damien";
	
	public final String PASSWORD = "Stoney123";
	
	public static void main(String[] args) {
		
		System.out.println(str);
		str = "Hi";
		System.out.println(str);
		
		System.out.println(USERNAME);
		//userName = "Stone";CE: variable is final and we can not change its value
		
		
		FinalKeyword fk= new FinalKeyword();
		//fk.PASSWORD = "stoney123";CE : variable is final and we can not change its value
		System.out.println(fk.PASSWORD);
	}

	public final void hi() {
		System.out.println("Hello hi ");
	}
}
class FinalBaby extends FinalKeyword{
//	public void hi() { CE:final methods cannot be overridden final classes cannot be extended
//		System.out.println("Sorry no hi's or hello's");
//	}
}



