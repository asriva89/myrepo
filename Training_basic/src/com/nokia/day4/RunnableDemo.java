package com.nokia.day4;

public class RunnableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberPrinter np = new NumberPrinter();
		Thread t = new Thread(np);
		System.out.println("BEFORE THREAD");
		t.setDaemon(true);

		t.start();
		try {
			Thread.sleep(1000L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("After THREAD");
//		Thread t2 = new Thread(np);
//		
//		System.out.println("Before THREAD2");
//		t2.start();
//		try {
//			t2.sleep(10000L);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("After THREAD2");

	}

}

class NumberPrinter implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 100; i++) {
			System.out.println(i);
			if(i==50)
				throw new RuntimeException();

		}

	}

}
