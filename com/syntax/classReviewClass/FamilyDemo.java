package com.syntax.classReviewClass;

public class FamilyDemo {
	public static void main(String[] args) {

		// The lastName does not need an object
		SmithMember.lastName = "Smith";

		SmithMember member1 = new SmithMember();
		member1.firstName = "Adam";
		member1.age = 45;

		member1.printInfo();

		SmithMember member2 = new SmithMember();
		member2.firstName = "Mary";
		member2.age = 42;

		member2.printInfo();

		System.out.println("Re-assinging the lastname of the family");
		SmithMember.lastName = "Jordan";

		member1.printInfo();
		member2.printInfo();

		System.out.println("Baby is comming");

		SmithMember baby = new SmithMember();
		baby.firstName = "Ali";
		// I don't need to assing the lastname of the baby
		baby.age = 0;

		baby.printInfo();
	}

	// HW: Create another class called JamesFamily
	// Create a couple of people

//	JamesFamily.lastName = "James";
//
//	JamesFamily member1 = new JamesFamily();
//	member1.firstName = "Lebrum";
//	member1.age = 21;
//
//	member1.printInfo();
//
//	JamesFamily member2 = new JamesFamily();
//	member2.firstName = "May";
//	member2.age = 21;
//
//	member2.printInfo();
}

