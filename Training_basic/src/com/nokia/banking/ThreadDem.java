package com.nokia.banking;

class ThreadDem extends Thread {
	public void run() {
		syncLoop();
	}

	private synchronized void syncLoop() {
		for (int i = 1; i < 5; i++) {
			try {
				
				Thread.sleep(500);
				//notifyAll();
				
			} catch (InterruptedException e) {
				System.out.println(e);
				
				
			}
			System.out.println(i+Thread.currentThread().getName());
			//System.out.println(;
		}
	}
	
	private synchronized void syncLoop2() {
		for (int i = 1; i < 5; i++) {
			try {
				
				Thread.sleep(5000L);
				//notifyAll();
				
			} catch (InterruptedException e) {
				System.out.println(e);
				
				
			}
			System.out.println(i+Thread.currentThread().getName()+"I am in sync 2 method");
			//System.out.println(;
		}
	}

	public static void main(String args[]) {
		ThreadDem t1 = new ThreadDem();
		t1.setName(" I AM FIRST Thread");
		ThreadDem t2 = new ThreadDem();
		t2.setName(" I AM SECOND Thread");
		

		t1.start();
		t2.start();
		
		try {
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}