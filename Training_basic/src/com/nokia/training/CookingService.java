package com.nokia.training;

public abstract class CookingService {
	private int count;

	public final void  startCookingDevice() {
		count++;
		System.out.println("Cooking started");
	}

	public abstract void cookReceipe();// {
		//System.out.println("Make Cofee/Tea");

	//}
	private  void cc(){
		System.out.println();
	}

	public void stopCookingDevice() {
		//cc();
		System.out.println("Cooking finished");
	}
	
	public static void CookAnything(){
		System.out.println("Cook anything");
	}
	
	public Integer getCount(){
		return count;
	}

	
}
