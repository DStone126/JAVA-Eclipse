package com.syntax.class13;

class Dogs {
 String breed;
 int height;
 int weigth;
 String color;
 int age;

public static void main(String[] args) {
	
	Dogs dog1 = new Dogs();
	dog1.breed = "Husky";
	dog1.color  = "White";
	dog1.weigth = 50;
	dog1.height = 73;
	dog1.age = 1;
	
System.out.println(" This dog is a " + dog1.breed + " and its " + dog1.color + " it weight is about "
		 + dog1.weigth + " pounds and its " + dog1.height + " inches tall and just turned " + dog1.age );

dog1.good();
dog1.bad();

Dogs dog2 = new Dogs();
dog2.breed = "Bulldog";
dog2.color  = "Black";
dog2.weigth = 60;
dog2.height = 46;
dog2.age = 3;

System.out.println(" This dog is a " + dog2.breed + " and its " + dog2.color + " it weight is about "
	 + dog2.weigth + " pounds and its " + dog2.height + " inches tall and just turned " + dog2.age );

dog2.good();
dog2.bad();


Dogs dog3 = new Dogs();
dog3.breed = "Labrador";
dog3.color  = "Red";
dog3.weigth = 60;
dog3.height = 67;
dog3.age = 4;

System.out.println(" This dog is a " + dog3.breed + " and its " + dog3.color + " it weight is about "
	 + dog3.weigth + " pounds and its " + dog3.height + " inches tall and just turned " + dog3.age );

dog3.good();
dog3.bad();
}
void good() {
	System.out.println( breed + " its good behaved and friendly dog");
}
void bad() {
	System.out.println(breed + " stinks when wet but youll get use to it");
}


}
