package com.nokia.training;

import java.util.Scanner;

public class CarRaceController {
	void startRace() {
		System.out.println(getDisplayMessage());
		Scanner in = new Scanner(System.in);
		int i=0;
		do{
			i=in.nextInt();
			if(i==1)
			{
				System.out.println("You have selected Basic Car");
			}
			else if(i==2)
			{
				System.out.println("You have selected Race Car");
			}
			else if(i==3)
			{
				System.out.println("You have selected Start Game");
			}
				
		}while(i!=4);

	}

	public String getDisplayMessage() {
		String messg = "1. Choose basic car\n 2 Choose race car \n 3 Start Game \n 4. Exit";
		return messg;

	}

}