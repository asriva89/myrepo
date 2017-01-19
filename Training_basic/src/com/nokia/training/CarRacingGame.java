package com.nokia.training;

public class CarRacingGame implements Car,Vehicle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car v=new CarRacingGame();
		v.getColour();
		v.getEngine();
		v.carType();
		v.getC();

	}

	@Override
	public String getColour() {
		// TODO Auto-generated method stub
		System.out.println("My Car Has blue Color");
		return null;
	}

	@Override
	public String getEngine() {
		// TODO Auto-generated method stub
		System.out.println("My Car Has good engine");
		return null;
	}
	public void carType() {
		// TODO Auto-generated method stub
		System.out.println("Get my Car Type");
		
	}

	@Override
	public void getC() {
		// TODO Auto-generated method stub
		System.out.println("Get my GetC");
		
	}
	
	

}
