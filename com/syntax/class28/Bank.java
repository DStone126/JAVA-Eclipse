package com.syntax.class28;

public class Bank {

	private long accountNumber;
	private double balance;
	


public long getAccountNumber() {
	return accountNumber;

}

public double getBalance() {
	return balance;

}

public void setAccountNumber(long accountNumber) {
	
	//if(accountNumber > 9 ) { here can be validation point
	
	this.accountNumber = accountNumber;
//}
}

public void setBalance(double balance) {
	
	//if(balance > 1) { here can be extra validation point
	
	this.balance = balance;
//}
}


}