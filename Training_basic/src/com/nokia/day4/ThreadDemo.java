package com.nokia.day4;

import java.lang.Thread.UncaughtExceptionHandler;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenNumberPrinet ep=new EvenNumberPrinet();
		ep.setUncaughtExceptionHandler(new UnCaughtExceptionHandler2());
		ep.setName("GOOD");
		ep.start();
		
		
		//ep.stop();
		
		

	}

}
class UnCaughtExceptionHandler2 implements UncaughtExceptionHandler
{

	@Override
	public void uncaughtException(Thread t, Throwable e) {
		// TODO Auto-generated method stub
		e.printStackTrace();
		t.getStackTrace();
		//t.setName("FAILED THREAD");
		System.out.println(e);
		System.out.println(t);
		
		
	}
	
}
class EvenNumberPrinet extends Thread{
	
	@Override
	public void run(){
		for (int i = 0; i < 10; i++) {
			if(i%2==0)
				System.out.println("EVEN NUMBER :"+i);
			//throw new RuntimeException();
			try {
				Thread.sleep(1000L);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
	
	
}