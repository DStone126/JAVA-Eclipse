package com.syntax.class31;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class InterviewQuestion {
public static void main(String[] args) {
	
	List<String> aList = new ArrayList<>();
	
	aList.add("John");
	aList.add("joe");
	aList.add("johnny");
	aList.add("John");
	aList.add("james");
	aList.add("jane");
	
	Set<String> set = new LinkedHashSet<>(aList);
	System.out.println(set);
	
	Set<String> countries = new LinkedHashSet<>(aList);
	countries.add("Turkey");
	countries.add("Spain");
	countries.add("France");
	countries.add("USA");
	countries.add("England");
	countries.add("Germany");
	countries.add("Zimbabwe");
	System.out.println(countries);

	LinkedHashSet<String> cities = new LinkedHashSet<>();
	cities.add("New York");
	cities.add("Alexandria");
	cities.add("Dallas");
	cities.add("Richmond");
	cities.add("Annandale");
	cities.add("Arlington");
	System.out.println(cities);



	
	
}
}
