package com.syntax.class27;

abstract class Mortgage{
	
public abstract void giveMortgage();

}

interface Investments{
	public void doInvestments();
	
}

public interface Trustable {

	void trust();
}
	
interface Bank extends Trustable{
	
	boolean MONEY = true;
	
	void deposit();
	
	void withdraw();
	
	default void transferMoney() {
		System.out.println("All banks should be able to transfer money");
	}

	static void checkCreditScore() {
		System.out.println("All banks check credit score");
	}
	
}

class PNC extends Mortgage implements Bank, Investments {
	
	public void deposit() {
		System.out.println("Pnc bank takes deposite");
	}
	
	public void withdraw() {
		System.out.println("Pnc gives you money, YAY!");
	}
	
	public void trust() {
		System.out.println("You can't trust banks with your money!");
	}
	
	public void giveMortgage() {
		System.out.println("Pnc gives mortgage");
	}
	
	public void doInvestments() {
		System.out.println("Pnc do investments");
	}
}

class BOA extends Mortgage implements Bank, Investments{
	
	public void deposit() {
		System.out.println("BOA takes deposite after its closed at the ATMs");
	}
	
	public void withdraw() {
		System.out.println("BOA gives you money, YAY!");
	}
	
	public void trust() {
		System.out.println("You can't trust banks with your money!");
	}
	
	public void giveMortgage() {
		System.out.println("BOA gives mortgage, but you have to pay intrest");
	}
	
	public void doInvestments() {
		System.out.println("BOA do investments");
	}
}