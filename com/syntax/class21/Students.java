package com.syntax.class21;

public class Students {

	String studentName, streetName;
	int houseNumber;
	
	
	Students(String aStudentName, String aStreetName, int aHouseNumber){
		studentName = aStudentName;
		streetName = aStreetName;
		houseNumber = aHouseNumber;
	}
	
	void displayStudentName() {
		System.out.println("Name of student is "+ studentName);
	}
void displayStreetName() {
	System.out.println("Street the student lives on is "+ streetName);
}
void displayHouseNumber() {
	System.out.println("House number is "+ houseNumber);
}
void displayInfo() {
	displayStudentName();
	displayStreetName();
	displayHouseNumber();
}
public static void main(String[] args) {
	Students obj = new Students("Damo","the end", 1111);
			obj.displayInfo();
}
	
	//this is the right way to do it
//String name, address;
//
//Students(String name, String address) {
//	this.name = name;
//	this.address = address;
//}
//
//void displayInfoo() {
//	System.out.println(name + address);
//}
//
//public static void main(String[] args) {
//	
//	
//	Students obj = new Students("Damo", " 1111 Annandale Va, 22003");
//	obj.displayInfoo();
//}

}
