package com.syntax.class28;

public class BankTest {
public static void main(String[] args) {
	
	Bank b = new Bank();
	
	b.setAccountNumber(123456789);
	System.out.println(b.getAccountNumber());
	
	b.setBalance(9123456);
	System.out.println(b.getBalance());
}
}
