package com.nokia.banking.copythread;

public class BankingSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Account a= new Account();
		Thread d=new Depositor(a);
		Thread w=new Withdrawer(a);
		d.start();
		w.start();
		try {
			d.join();
			w.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(a.getBalance());

	}

}
