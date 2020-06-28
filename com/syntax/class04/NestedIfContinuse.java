package com.syntax.class04;

public class NestedIfContinuse {
public static void main(String[] args) {
	/*check if patient has allergies
	 * if no allergies--> you're healthy
	 * otherwise:
	 * if peanut allergy:dont eat peanut
	 * Lactose allergy:dont drink milk
	 * bee allergy: dont mess with bees
	 */
						boolean allergies = true;
						boolean peanut = true;
						boolean lactose = false;
						boolean bee = true;
				if(!allergies)  {
					//no allergy
					System.out.println("Your healthy!");
				}else {
					//we have to check
					
					if (peanut) {
						System.out.println("Dont eat peanut!");
					}
						if(lactose) {
						System.out.println("Dont drink milk!");
					}
						if (bee) {
						System.out.println("Dont mess with bees!");
					
}
}
}
}
