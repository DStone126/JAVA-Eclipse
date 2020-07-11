package com.syntax.class20;

public class StudentsTest {

public static void main(String[] args) {
		
		Students student1 = new Students("damien", 70, 80, 83);
		Students student2 = new Students("Irr", 49, 23, 94);
		Students student3 = new Students("Ana", 98, 53, 45);
		Students student4 = new Students("Lu", 78, 15, 0);
		Students student5 = new Students("Elias", 67, 89, 99);
		
		System.out.println(student1.calculateAvarageGrade());
		int grade2=student2.calculateAvarageGrade();
		System.out.println("Average grade of 2 student is "+grade2);
		
		student3.calculateAvarageGrade();
		student4.calculateAvarageGrade();
		student5.calculateAvarageGrade();
	}

}
