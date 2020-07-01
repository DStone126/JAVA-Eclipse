package com.syntax.class16;

public class DifferentMethods {
//lets create methods that says hello 10*s
	
	
	void sayHello(int times) {
		for(int i = 0; i <10;i++) {
	System.out.println("Hello");
		}
}
//create that will print any word any number of times

void printAnyWord(String word, int times) {
	for(int i = 0; i < times;i++) {
		System.out.println(word);
	}
}
//create method isHungry that will accept boolean value
	//and prints, if passed value is true --> go cook otherwise go study

	void isHungry(boolean areYouHungry) {
		System.out.println("Go ahead and study");
	
	if(areYouHungry) {
		System.out.println("Please cook for youself");
	}else {
		System.out.println("Go ahead and study");
	}
}


}
