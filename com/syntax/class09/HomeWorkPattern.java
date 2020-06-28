package com.syntax.class09;

public class HomeWorkPattern {
public static void main(String[] args) {
	//3.Print the following pattern:***************
	//1.Print the following pattern:54321543215432154321
	//2.Print the following pattern:5555544444333332222211111
	
	for(int r = 1; r <= 4; r++) {
		
		for(int s = 5; s>= 1; s--) {
			System.out.print(s);
		}
		System.out.println();
		}

System.out.println("------------------------");
	
for(int row = 5; row >= 1; row--) {
	
	for(int col = 5; col >= 1; col--) {
		System.out.print(row);
	}
	System.out.println();
	}

System.out.println("--------------------");

for(int r = 5 ; r >=1 ; --r) {
	
	for(int col = r - 1 ; col >= 1  ; --col) {
		System.out.print("*");
	
	}
	System.out.println();
	}

System.out.println("--------------------");

for(int q =1; q<=3; q++) {
	
	for(int b = 1; b<=5;b++) {
System.out.print(b);

}
System.out.println();
}

System.out.println("-----------------------------");

for(int ro = 1 ; ro <=5 ; ++ro) {
	
	for(int col = 1 ; col <= ro  ; ++col) {
				System.out.print("*");
			
			}
	System.out.println();
	}



for(int row = 4 ; row >=1 ; --row) {
	
	for(int colm = 1 ; colm <= row  ; ++colm) {
		System.out.print("*");
	}
	System.out.println();
}

System.out.println("-------------------");

for(int re = 5; re >= 1; re--) {
	
	for(int se = re; se>= 1; se--) {
		System.out.print(se);
	}
	System.out.println();
	}

System.out.println("------------------");

for(int r = 1; r <= 5; r++) {
	
	for(int s = r; s>= 1; s--) {
		System.out.print(s);
	}
	System.out.println();
	}
for(int r = 4; r >= 1; r--) {
	
	for(int s = r; s>= 1; s--) {
		System.out.print(s);
	}
	System.out.println();
	}

System.out.println("-----------------");

for (int r = 1; r <= 5; r++) { // The outer loop controls the rows

	for (int c = 1; c <= 4; c++) { // The inner loop controls the columns

		if (r == 1 || r == 5) { // in the first or last row print every $
			
			System.out.print("$");
			
		} else { // in the other rows

			if (c == 1 || c == 4) { // in the first or last column print $
				System.out.print("$");
			} else { // in the other columns print " "
				System.out.print(" ");
			}
		}
	}

	System.out.println();
}
}
}

