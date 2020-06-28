package com.syntax.class08;

public class BreakAndContinue {
public static void main(String[] args) {
	System.out.println("---------Break--------");
	
	
//for(int i =1; i <= 10; i++) {
//	
//	if(i==4) {
//		break;
//}
//System.out.println(i);
//}
//System.out.println("Im outside the loop");
//}	
System.out.println("----------continue---------");	

for(int i =1; i <= 10; i++) {
		
		if(i==4) {
			System.out.println("Im skipping");
			continue;
}
System.out.println(i);
}
System.out.println("Im outside the loop");
}
}