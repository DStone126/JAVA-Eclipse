package com.syntax.class21;

public class AnimalTest {
public static void main(String[] args) {
	
	// object of parent class has an access to all variable and methods of it 
	Animal a = new Animal();
	a.breed = "Something";
	a.color = "Grey";
	a.paws = 4;
	
	a.sleep();
	a.eat();
	
	Dog dog = new Dog();
	dog.breed = "Husky";
	dog.color = "Yellow";
	dog.paws = 4;
	dog.tail = true;
	
	dog.bark();
	dog.eat();
	dog.sleep();
	
	Cat cat = new Cat();
	cat.breed = "Bengal";
	cat.color = "Black";
	cat.paws = 4;
	cat.tail = true;
	cat.fur = "Short";
	
	cat.purr();
	cat.eat();
	cat.sleep();

	Monkey monkey = new Monkey();
	monkey.breed = "Bamboo";
	monkey.color = "White";
	monkey.paws = 0;
	monkey.tail = true;
	
	monkey.thumbs();
	monkey.eat();
	monkey.sleep();
	
	Kittens baby = new Kittens();
	baby.breed = "Lion";
	baby.color = "Black";
	baby.paws = 4;
	baby.tail = true;
	baby.fur = "Short";
	baby.cry = true;
	
	baby.notIndapendent();
	baby.eat();
	baby.sleep();
	
	NewBornKitten newBorn = new NewBornKitten();
	newBorn.breed = "Tiger";
	newBorn.color = "White";
	newBorn.cry = true;
	newBorn.fur = "Long";
	newBorn.paws = 4;
	newBorn.tail = false;
	newBorn.walk = false;
	
	newBorn.cant();
	newBorn.eat();
	newBorn.sleep();
	
	
	
	
	
	
	
}
}
