package com.syntax.class24;

public class CreditCardTest {
public static void main(String[] args) {
	
	CreditCard cc = new CreditCard(100);
	double ccInterestFee = cc.interestFee();
	System.out.println(ccInterestFee);
	
	Visa v = new Visa(1.50);
	 double vInterestFee = v.interestFee();
	System.out.println(vInterestFee);

	Ax a = new Ax(5000);
	double aInterestFee = a.interestFee();
	System.out.println(aInterestFee);
}
}
