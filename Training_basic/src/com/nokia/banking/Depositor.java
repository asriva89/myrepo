package com.nokia.banking;

public class Depositor extends Thread {
	
	public Account acc;
	
	public Depositor(Account acc) {
		
		this.acc=acc;
	}
	
	@Override
	public void run()
	{
		for (int i = 0; i < 10000; i++) {
			acc.deposit(100);
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
