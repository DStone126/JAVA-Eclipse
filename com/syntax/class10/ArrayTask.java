package com.syntax.class10;

public class ArrayTask {
public static void main(String[] args) {
	
	char[] grades = new char[6];
	grades[0] = 'A';
	grades[1] = 'B';
	grades[2] = 'C';
	grades[3] = 'D';
	grades[4] = 'E';
	grades[5] = 'F';
System.out.println("The grade is " + grades[1]);
	
char[] grade = {'A', 'B', 'C', 'D'};
System.out.println("grade is " + grade[1]);

System.out.println("**************************");

String[] names = { "Damo", "Ans", "Irrr", "Le", "Lu" };
System.out.println("One of the names from my group is " + names[0]);

String[] name = new String[5];
name[0] = "Damo";
name[1] = "Ans";
name[2] = "Irrr";
name[3] = "Le";
name[4] = "Lu";
 System.out.println("name is " + name[1]);
 
 System.out.println("****************************");
 
 String[] words = {"Java", "Saturday", "day", "coding", "is"};
System.out.println(words[1] + " " + words[4] + " " 
 + words[0] + " " + words[3] + " " + words[2]);




}
}
