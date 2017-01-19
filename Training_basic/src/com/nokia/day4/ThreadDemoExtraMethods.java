package com.nokia.day4;

public class ThreadDemoExtraMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenNumberPrinet e=new EvenNumberPrinet();
		//e.set
		e.setPriority(8);
		e.start();
		System.out.println(e.getState());
		//e.y
		
		System.out.println("Main JOin");
//		try {
//			//e.join();
//		} catch (InterruptedException e1) {
//			// TODO Auto-generated catch block
//			e1.printStackTrace();
//		}
//		System.out.println(e.getPriority());
		
		System.out.println("Exit Join");
		

	}

}

