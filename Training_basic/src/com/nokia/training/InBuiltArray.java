package com.nokia.training;

import java.awt.DisplayMode;
import java.util.Arrays;
import java.util.Scanner;

public class InBuiltArray {

	public static void main(String[] args) {
		
		int ids[]={20,23,28,76,29,30,45};
		Arrays.sort(ids);
		Scanner in = new Scanner(System.in);
		ArraysDemo.display1DArray(ids);
		System.out.println(" Enter Value to seach : ");
		int j=in.nextInt();
		int i = Arrays.binarySearch(ids, j);
		//System.out.println(i);
		if (i < 0)
			System.out.println("Value not found!!!");
		else
			System.out.println("Value found at index "+i+" and value is "+ids[i]);
	}

}
