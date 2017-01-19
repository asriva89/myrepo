package com.nokia.postoffice;

public class PostMan extends Thread {
	private PostOfficeDemo p;

	public PostMan(PostOfficeDemo p) {
		super();
		this.p = p;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("Messsage Received"+p.deliverMessage());
			//System.out.println("Message posted for " + i);
			try {
				Thread.sleep(5000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	

}
