package com.nokia.exceptionHandling;

import java.io.UncheckedIOException;

public class ExHandle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=0;
		
		
		meth(i);
		

	}

	private static void meth(int i) {
		// TODO Auto-generated method stub
		if(i==0)
		{
			try {
				meth2(i);
			} catch (checked e) {
				// TODO Auto-generated catch block
				throw new MyException();
			//	e.printStackTrace();
			}
		}
		
	}

	private static void meth2(int i) throws checked {
		// TODO Auto-generated method stub
		
		if (i==0)
		{
			throw new checked();
		}
		
	}

}

class MyException extends RuntimeException{
	
	MyException() {
		//throw new Unchecked();
		System.out.println("My EXCEPTION CLASS");
	}
	
}

class checked extends Exception{
	
}
