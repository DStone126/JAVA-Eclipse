package com.syntax.class24;

public class CreditCard {
double balance, interest;

	public CreditCard(double balance) {
		this.balance = balance;
	}
		 double interestFee() {
			if(balance > 0) {
				return balance * 0.02;
			}else {
				return 0;
				
			}
		}
}
class Visa extends CreditCard{
	public Visa(double balance) {
		super(balance);
	}
}
class Ax extends CreditCard{
	public Ax(double balance) {
		super(balance);
	}
	
	 double interestFee() {
		if(balance > 0) {
			return balance * 0.5;
		}else {
			return 0;
		}
	}
}