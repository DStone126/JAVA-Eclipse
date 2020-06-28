package com.syntax.class11;

public class RetrieveElements {
public static void main(String [] args) {
	
	
	char[] grades = {'A', 'B', 'C', 'D', 'F'};
	
	for(int g = 0; g < grades.length; g++) {
		System.out.print(grades[g] + ",");
	}
	System.out.println();
	
	System.out.println("-----print using advanced loop-----");
	
	for(char element : grades) {
		System.out.print(element + ",");
	}
	System.out.println();
	System.out.println("----------------------------");

	String[] fruits = {"Apple", "Orange", "Grapes", "Banana", "Cucumber", "Tomato"};
	
	
	
	for(String element : fruits) {//2nd way
		System.out.print(element + ",");
	}
	System.out.println();
	//1st way
	for (int i = 0; i < fruits.length; i++) {

		if (fruits[i].equals("Grapes")) {
			System.out.println(fruits[i] + " is my favorite fruit");
		} else {
			System.out.println(fruits[i]);
		}	
	
	}	

System.out.println("**************************");

String[] cars = {"Ford", "Dodge","Toyota", "Honda", "Nissan", "Gmc"};
for(String c : cars) {
	System.out.println(c);
}



System.out.println("*****************************");

int[] money = new int[5];		

int dollars = money.length;
System.out.println(dollars);

money[4] = 20;
money[3] = 15;
money[2] =	29;
money[1] = 50;
money[0] = 10;

int total = 0;
for(int m = 0; m < 5; m++) {
	total+= money[m];
}
System.out.println(" Average money i have in my pocket is is: " + total / 5);

System.out.println("*************************");

int[] numbers = {23, 56, 73, 16, 80, 70, 39};
int sum = 0;
 for(int num : numbers) {
	 sum+=num;
	 }
System.out.println("The sum of all numbers is: " + sum);

System.out.println("-----------using for loop----------");

int total1 = 0;
for (int i =0; i < numbers.length; i++) {
	int num = numbers[1];
	total1 += num;
}	
System.out.println("The total of all the numbers is: " + total1);

System.out.println("*************************");

String[] countries= { "Taj", "Bra", "Gam", "Us"};

for(String c:countries) {
	if(c.equals("Alb")) {
		System.out.println("Tira");
	}else if(c.equals("Bra")) {
		System.out.println("Bra");
	}else if (c.equals("Us")) {
		System.out.println("DC");
	}else {
		System.out.println("The country " + c + " is not in my list");
	}
}
  
System.out.println("--------------2nd way------------");

for( int s = 0; s< countries.length; s++) {
	switch(countries[s]) {
	case "Taj":
		System.out.println("Dus");
		break;
	case "Us":
		System.out.println("Dc");
		break;
	case "Bra":
		System.out.println("Bra");
		break;
		default:
			System.out.println("Not on my list");
	}
}
	
	
}

}
	



