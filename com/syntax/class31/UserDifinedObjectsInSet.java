package com.syntax.class31;

import java.util.Set;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class UserDifinedObjectsInSet {

	public static void main(String[] args) {
		//we need to store objects of health , pet , car
		Set<Insurance> lst = new LinkedHashSet<>();
		lst.add(new Pet("Cat", "Cigna"));
		lst.add(new Car("Tesla", "Geico"));
		lst.add(new Health("Blue Cross Shield"));
		
		//how to acces variable and methods?
		
		for(Insurance in:lst) {
			System.out.println(in.insuranceName);
		//calling methods
			in.getQuote();
			in.cancelInsurance();
		}
System.out.println("-------------------------");
		Iterator<Insurance> it = lst.iterator();
		while(it.hasNext());
		Insurance i = it.next();
		//accessing variables
	System.out.println(i.insuranceName);
	i.getQuote();
	i.cancelInsurance();
	}
}
