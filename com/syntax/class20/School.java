package com.syntax.class20;

public class School {
public static String schoolName = "Annandale";
int popSize;
String color, sports;

public void displayDetails() {
	System.out.println("I go to "+ schoolName + " high school color is "+ color+ " theres many sports like "+ sports+" and there is "+popSize+ " students here ");
}

School(String schoolColor, String schoolSports, int schoolPopSize){
	color = schoolColor;
	sports  = schoolSports;
	popSize = schoolPopSize;
}

public School() {
	// TODO Auto-generated constructor stub
}

public static void main(String[] args) {
	
	School ss = new School();
	ss.popSize = 20000;
	ss.color = "Red";
	ss.sports = "Football";
	ss.displayDetails();
}

}
