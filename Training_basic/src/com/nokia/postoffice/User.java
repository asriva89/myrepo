package com.nokia.postoffice;

public class User extends Thread {

	private PostOfficeDemo p;

	public User(PostOfficeDemo p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			p.addMessage("Message posted for " + i);
			//System.out.println("Message posted for " + i);

		}

	}

	
}
