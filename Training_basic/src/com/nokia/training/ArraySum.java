package com.nokia.training;

import java.util.Scanner;

public class ArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER THE ARRAY LENGTH ");
		Scanner in = new Scanner(System.in);
				int a=in.nextInt();
		int x[]= new int[a];
		int sum=0;
		for(int i=0;i<x.length;i++)
		{
			System.out.println("Enter " +i+ " array ");
			x[i]=in.nextInt();
			sum+=x[i];
		}
		in.close();
		System.out.println("Sum of array is :"+sum);
		
		

	}

}
