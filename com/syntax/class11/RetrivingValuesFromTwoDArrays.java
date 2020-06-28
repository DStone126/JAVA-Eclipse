package com.syntax.class11;

public class RetrivingValuesFromTwoDArrays {
public static void main(String[] args) {
	
	String[][] months = {
			{"Dec" , "Jan", "Feb"},
			{"Mar", "Apr", "May"} ,
			{"Jun", "Jul", "Aug"},
			{"Sep", "Oct", "Nov"},
	};
	
	 int rows =  months.length;//how many arrays are inside , how many row?
	 System.out.println(rows + " seasons");

int winterLength = months[0].length;// how many elements/columns are in rows with index 0?
System.out.println(winterLength + " month in winter/row 0");

int lastRowSize = months[rows - 1].length;

//nested loops are married (joke) to 2D arrays
for(int i = 0; i < months.length; i++) {// iterating over rows
	
	for(int j= 0; j < 3; j++) {// iterating over columns
	System.out.print(months[i][j] + " ");
		
	}
System.out.println();
}




}
}
