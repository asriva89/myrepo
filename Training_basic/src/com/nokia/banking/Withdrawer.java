package com.nokia.banking;

public class Withdrawer extends Thread {
	
	public Account acc;
	
	public Withdrawer(Account acc) {
		
		this.acc=acc;
	}
	
	@Override
	public void run()
	{
		for (int i = 0; i < 10000; i++) {
			acc.withdraw(100);
		}
		
	}

}
