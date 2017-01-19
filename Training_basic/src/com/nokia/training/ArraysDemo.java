package com.nokia.training;

import java.util.Scanner;

public class ArraysDemo {
	static int x[]={};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// int a[] = { 1, 3, 4, 6 };
		// System.out.println("ENter size of array ");
		//staticInit();
		//dynamicInit();
		/*
		 */
		/*Scanner in = new Scanner(System.in); 
		x[]
		int i = in.nextInt(); 
		
		  for(int z=0;z<i;z++) {
			  System.out.println("ENter "+ z+ "number");
			  x[z]=0;
		  x[z]=in.nextInt();
		 }
		  
		  for(int z=0;z<i;z++) {
			  System.out.println("x["+z+"]"+x[z]);
		  
		 }
		 */
		  
		twoDArrayInit();

	}

	public static void staticInit() {
		int num[] = { 1, 3, 4, 5 };
		/*
		 * for(int z=0;z<num.length;z++) { System.out.println(z);
		 * 
		 * }
		 */
		display1DArray(num);
		int z=0;
		while(z<num.length)
		{
			System.out.println(num[z]);
			z++;
		}
		String a[] ={"Today","is",null,"training","day1"};
		
		for (String d:a)
			System.out.println(d);
	}

public static void display1DArray(int[] num) {
		for (int z : num) {
			System.out.println(z);
		}
	}
	public static void dynamicInit()
	{
		System.out.println("ENter size of array");
		Scanner in = new Scanner(System.in); 
		int z = in.nextInt();
		int t[]=new int[z];
		for(int l=0;l<t.length;l++) {
			  System.out.println("ENter "+ l+ " number");
			 
		  t[l]=in.nextInt();
		 }
		display1DArray(t);
		System.out.println("Max value :"+maxValue(t));
		in.close();
	}
	
	public static int maxValue(int num[])
	{
		int max=num[0];
		for (int i=0;i<num.length-1;i++)
		{
			if(num[i]<num[i+1])
				max=num[i+1];
		}
		return max;
	}
	
	public static void twoDArrayInit()
	{
		int num[][]=new int[2][2];
		int num2[][]= {{1,2},{2,3},{2,4}};
		
		//display2DArray(num2);
		Scanner in = new Scanner(System.in);
		
		System.out.println("length" + num[0].length);
		for (int i=0;i<num.length;i++)
			for(int j=0;j<num[i].length;j++)
			{
				System.out.println("Enter the number in row "+i +" column "+j);
				num[i][j]=in.nextInt();
			}
		in.close();
		display2DArray(num);
				
	}

	private static void display2DArray(int[][] num2) {
		for (int i=0;i<num2.length;i++){
			for(int j=0;j<num2[i].length;j++)
				System.out.println(num2[i][j]);
		}
	}
	}


