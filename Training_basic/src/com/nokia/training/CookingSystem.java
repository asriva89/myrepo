package com.nokia.training;

public class CookingSystem  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CookingService x= new CookRice();
		
		
		CookChicken a=new CookChicken();
		
		
		//x=a;
		
		CookChicken b=new CookChicken();
		if (x instanceof CookChicken )
			System.out.println("X is instance of cook chicken");
		if (x instanceof CookingService)
			System.out.println("x is instance of Coooking service");
		
		//b=(CookChicken)x; to simulate class cast exception
		
		
		a.cookReceipe();
		a.cookReceipe();
		a.startCookingDevice();
		a.startCookingDevice();
		System.out.println(a.getCount());
		
		
	
		CookChicken.CookAnything();

	}

}
