package com.syntax.class27;

public class TrustableTest {
public static void main(String[] args) {
	
	Bank b = new PNC();
	b.deposit();
	b.trust();
	b.withdraw();
	b.transferMoney();
	System.out.println();
	
	Mortgage p = new BOA();
	p.giveMortgage();
	System.out.println();
	
	PNC n = new PNC();
	n.deposit();
	n.doInvestments();
	n.giveMortgage();
	n.trust();
	n.withdraw();
	n.transferMoney();
	System.out.println();
	
	BOA a = new BOA();
	a.deposit();
	a.doInvestments();
	a.giveMortgage();
	a.trust();
	a.withdraw();
	a.transferMoney();
}
}
