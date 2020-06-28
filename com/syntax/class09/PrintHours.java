package com.syntax.class09;

public class PrintHours {
public static void main(String[] args) {
	// nested loop
for(int h = 0; h< 24; h++) {
	for(int m = 0; m<60; m++) {
		for(int s = 0; s <60; s++) {
			if(s < 10) {
				System.out.println(h + ":0" + m + ":0" + s);
			}else {
			System.out.println(h + ":" + m + ":" + s);	
			}
		}
	if(m < 10) {
		System.out.println(h + ":0" + m);
	}else {
		System.out.println(h + ":" + m);
	}
	
	}
}

System.out.println("--------------------------------------");
// silly way to do this not nested
//this is pattern
for(int i2 = 1; i2<=4; i2++) {
	System.out.println("*****");
}

System.out.println("------------------------------");
//1st way
//	for(int i1 = 1; i1<=4; i1++) {
//	
//		for(int j = 1; j<= 5; j++) {
//	System.out.println("*");
//}
//System.out.println();
//	}
System.out.println("--------------------------");

for(int im = 1; im<=10; im++) {
	
	for(int jm = 1; jm<= 10; jm++) {
System.out.print("$");
}
System.out.println();//move to new line
}

System.out.println("--------------------------------");

for(int r = 1; r <= 3; r++) {
	
	for(int s = 1; s<= 5; s++) {
		System.out.print(s);
	}
	System.out.println();
	}

System.out.println("----------------------------");

for(int row = 1; row <= 4; row++) {
	
	for(int col = 1; col<= 4; col++) {
		System.out.print(row);
	}
	System.out.println();
	}

System.out.println("------------------------------");


for(int r = 5 ; r >=1 ; --r) {
	
	for(int col = r - 1 ; col >= 1  ; --col) {
		System.out.print(col);
	
	}
	System.out.println();
	}

}
}

