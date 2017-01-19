package com.nokia.training;

import java.util.Scanner;

public class ScanDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Please input");
		Scanner a=new Scanner(System.in);
		//String ab=a.nextLine();
		int x = a.nextInt();
		int y= a.nextInt();
		
		//System.out.println(ab);
		a.close();
		ScanDemo b = new ScanDemo();
		System.out.println("ADDITION IS : " +b.addInt(x, y));
		
		System.currentTimeMillis();
}
	
	private int addInt(int x,int y)
	{
		return x+y;
	}
}

