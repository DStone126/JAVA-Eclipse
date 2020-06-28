package com.syntax.class12;
import java.util.Arrays;
import java.util.Scanner;

public class RepelNestedForLoop {
public static void main(String[] args) {

	for(int i = 1; i <= 10; i++){
		  System.out.print(i);
		}
		System.out.println();

		for(int w = 2; w <= 20 ; w++){
		 if(w % 2 == 0){
		  System.out.print(w);
		}
		 } 
		 System.out.println(); 
		 
		 for(int e = 3; e <= 30 ; e++){
		 if(e % 3 == 0){
		  System.out.print(e);
		}
		 } 
		  
		System.out.println();
		    
		    for(int q = 4; q <= 40 ; q++){
		 if(q % 4 == 0){
		  System.out.print(q);
		}
		 } 
		 
		 System.out.println();
		  
		    for(int p = 5; p <= 50 ; p++){
		 if(p % 5 == 0){
		  System.out.print(p);
		}
		 } 
		    
	  
System.out.println();
System.out.println("---------------------------------");

for(int r = 1; r <= 8; r++) {
	
	for(int s = 1; s <= 8 - r; s++) {
		System.out.print(s + " ");
}	
System.out.println();
	}
	for(int e = 2; e <= 7; e++) {

		for(int c = 0; c < e; c++) {
		System.out.print(c + 1 + " ");

	
	
	
	}
	System.out.println();
	
	}

System.out.println("-----------------");

int[] a2 = {(int)45,(int)78,(int)12,(int)67,(int)55};
for(int n = 0; n < 5; n++)
System.out.print(a2[n] + " ");

System.out.println();
System.out.println("------------------");

int[] number = new int[9]; 
	
number[0] = 45;
number[1] = 78;
number[2] = 12;
number[3] = 67;
number[4] = 55;
number[5] = 89;
number[6] = 23;
number[7] = 77;	
number[8] = 88;
	
	for(int ns = 0; ns < number.length; ns += 2)
	
	
	System.out.print(number[ns] + " ");

	System.out.println();
System.out.println("---------------------------");

char[] letters = {'s','a','y','b','n','c',
		't','d','a','e','x'};
for(char l = 0; l < letters.length; l+=2)

System.out.print(letters[l]);

System.out.println();
System.out.println("----------------------");


String[] words = {"This","is","array","of",
		"strings",};
for(int w = 0; w < words.length; w++)
System.out.print(words[w] + " ");

System.out.println();
System.out.println("--------------");

int[] years = new int[11];

years[0] = 2010;
years[1] = 2011;
years[2] = 2012;
years[3] = 2013;
years[4] = 2014;
years[5] = 2015;
years[6] = 2016;
years[7] = 2017;
years[8] = 2018;
years[9] = 2019;
years[10] = 2020;

for(int y = 0; y < years.length; y++) {
	System.out.println(years[y]);
}

System.out.println("--------------------");

int[] numbe = {45, 78, 12,  67, 55, 89, 23,
		77, 88};

for(int nu = 1; nu < numbe.length; nu+= 3) {
	
	System.out.print(numbe[nu] + " ");
}

System.out.println();
System.out.println("--------------------");

//Scanner scan = new Scanner(System.in);
//
//String[] days = new String[7];
//days[0] = "Sunday";
//days[1] = "Monday";
//days[2] = "Tuesday";
//days[3] = "Wednesday";
//days[4] = "Thursday";
//days[5] = "Friday";
//days[6] = "Saturday";   
//
//System.out.println("Please enter day 1 of the week");
//scan.nextLine();
//
//System.out.println("Please enter day 2 of the week");
//scan.nextLine();
//
//System.out.println("Please enter day 3 of the week");
//scan.nextLine();
//
//System.out.println("Please enter day 4 of the week");
//scan.nextLine();
//
//System.out.println("Please enter day 5 of the week");
//scan.nextLine();
//
//System.out.println("Please enter day 6 of the week");
//scan.nextLine();
//
//System.out.println("Please enter day 7 of the week");
//scan.nextLine();
//
//for(int week = 0; week < days.length; week++ )
//
//System.out.println(days[week]);
//
//System.out.println("------------------------------");
//
//System.out.println();
//int i = scan.nextInt();
//
//int[] num = {1,2,3,4,5};
//
//for(int h = 1; h <= num.length  ; h++) {
//	System.out.println(num[num.length - h]);
//
//}
//
System.out.println("-------------------");

double[][] a = {
		{1.4,2.0,3.3,2},
		{4,1.5,6.1,1},
		{1.2,3.1,4,1.6}
	};
	//prints array

  for(int g = 0; g < a.length; g++){
	  for(int v = 0; v < a[g].length; v++) {
		  double aa = a[g][v];
		  System.out.print(aa);
	  }
  
  System.out.println();
  
  } 

System.out.println("--------------------");
  
double[][] b = {
		{1.4,2.0,3.3,2},
		{4,1.5,6.1,1},
		{1.2,3.1,4,1.6}
	};
	
	

for(int j = 0; j < b.length; j++) {
	for(int q = 0; q < b[j].length; q++) {
double bb = b[j][q] * 2;
System.out.print(bb + " ");
}	
System.out.println();
}    

System.out.println("----------------");

int[][] x = {
		{5,2,3,7},
		{1,5,1,1},
		{8,3,1,2}
	};

for(int g = 0; g < x.length - 2;g++) {
	
		int f = x[2][0];
		System.out.println(f);
	}

System.out.println("----------------------");

int[][] a1 = {// how to get the sum of 2d arrays
		{-5,-2,-3,7},
		{1,-5,-2, 2},
		{1,-2, 3,-4}
	};
int arrayTotal = 0;
for(int s = 0; s < a1.length; s++) {
	for(int y = 0; y < a1[s].length; y++)
	
	arrayTotal += a1[s][y];
}
System.out.println(arrayTotal);
	
System.out.println("--------------------");

int[][] nums1 = {
		{1,1,2}, //sum = 4
		{3,1,2}, //sum = 6
		{3,5,3}, //sum = 11
		{0,1,2}  //sum = 3
	};
//int rowTotal = 0;
//int rowTotal1 = 0;
//int rowTotal2 = 0;
//int rowTotal3 = 0;
// 
//	for(int q = 0; q < a12[q].length; q++) {
//		rowTotal=  a12[0][0] + a12[0][1] + a12[0][2];
//			System.out.println(rowTotal);
//		break;
//		}
//	for(int t = 0; t < a12[t].length; t++) {
//		rowTotal1 = a12[1][0] + a12[1][1] + a12[1][2];
//			System.out.println(rowTotal1);	
//		break;
//	}
//	for(int c = 0; c < a12[c].length; c++) {
//		rowTotal2 = a12[2][0] + a12[2][1] + a12[2][2];
//			System.out.println(rowTotal2);
//		break;
//	}	
//	for(int w = 0; w < a12[w].length; w++) {
//		rowTotal3 = a12[3][0] + a12[3][1] + a12[3][2];					
//			System.out.println(rowTotal3);					
//		break;
//	}				
	int sums[] = new int[nums1.length];
	
	for (int i = 0; i < nums1.length; i++) {
		int rowSum = 0;
		for (int j = 0; j < nums1[i].length; j++) {
			rowSum += nums1[i][j];
		}
		sums[i] = rowSum;
	}

for(int sum : sums) {
		System.out.println(sum);
}
System.out.println("--------------------------");
//Write a program that prints the 
//total number of elements 
//that are negative AND odd
	int[][] numbers1 = {
			{-5,-2,-3,7},
			{1,-5,-2,2},
			{1,-2,3,-4}// answer is 3
		};

//for(int i = 0; i < a13.length; i++) {
//	i = i + 3 ;
//	System.out.println(i);
//
//}

int countNegative = 0;
for (int j = 0; j < numbers1.length; j++) {
	for (int i = 0; i < numbers1[j].length; i++) {
		if (numbers1[j][i] < 0 && numbers1[j][i] % 2!=0) {
			countNegative = countNegative+i;
		
		}
	}
}
System.out.println(countNegative);
System.out.println("-----------------");
int[][] a1234 = {
		{-5,-2,-3,7},
		{1,-5,-2,2},
		{1,-2,3,-4}// answer is -4
	};
//for(int i = 0-6; i < a111.length; i++) {// same answer but Not the right way
//	i= i + 2;
//	System.out.println(i);
//    	break;
//    }
 
int sum = 0;

for (int i = 0; i < a1234.length; i++) {

	for (int j = 0; j < a1234[i].length; j++) {
		if (i % 2 == 0 && j % 2 == 0) {
			sum = sum + a1234[i][j];
		
		}   
     }  
}
System.out.println(sum);  
	
System.out.println("-------------------");
//String name;
//int roll_no;
//
//public static void main(String [] args){
//   Main main  =  new Main();
//  main.name = "John";
//  main.roll_no = 2;
//  
//  System.out.println("Name is " + main.name + " and roll number is "
//  + main.roll_no);
}
}







