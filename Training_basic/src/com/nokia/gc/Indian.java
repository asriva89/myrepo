package com.nokia.gc;

public class Indian {
	private String country;
	static private int count=0;
	@Override
	protected void finalize() throws Throwable	{
		count=count+1;
		System.out.println("Invoking finalize " + count);
		throw new RuntimeException();
	//	Runtime.getRuntime().
	}

}
