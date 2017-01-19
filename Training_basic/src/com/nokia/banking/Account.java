package com.nokia.banking;

public class Account {
	private long balance = 0;
	private Object lock=new Object();

	public void deposit(long amount) {
		synchronized(this){
		balance = balance + amount;

	}
	}

	public long withdraw(long amount) {
		synchronized (this) {
			
		
		if (balance >= amount) {
			balance = balance - amount;
		}
		}return balance;
	}

	public long getBalance() {
		return balance;
	}

}
