package com.nokia.training;

import javax.crypto.spec.GCMParameterSpec;

public class StringDemo {

	public static void main(String args[]) {
		StringMem a = new StringMem();
		a.memCheck();
		a.stringModifier();
	

	}
}

class StringMem {

	public void memCheck() {
		String car = "Car";
		String raceCar = "raceCar";
		String currentCar = "Car";
		String tempCar = new String("Car");
		tempCar= tempCar.intern();
		

		if (car == currentCar) {
			System.out.println(" car and current car are Equal cars");
		}

		if (tempCar.equals(car)) {
			System.out.println("Equals tempcar and car ");
		}
		if (tempCar == car)
			System.out.println("Just check");

	}
	public void stringModifier()
	{
		String animal="horse";
		
		System.out.println(animal.length());
		System.out.println(animal.startsWith("h"));
	}

}