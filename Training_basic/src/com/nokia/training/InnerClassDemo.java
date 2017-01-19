package com.nokia.training;

import java.awt.DisplayMode;

import com.nokia.training.Outer.Inner2;

class InnerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer a=new Outer();
		a.display();
		
		
		Outer.Inner2 j= (new Outer()).new Inner2();
		j.displayInner();
		
		
		
		

	}
	
	private class Inner{
		
	}
	public class Inner3{
		
	}
	

}
class Outer{
	public void display()
	{
		System.out.println("We are in Outer Class!!! ");
		Inner2 n= new Inner2();
		n.displayInner();
		
		
		
		
		
	}
	public  class Inner2{
		public   void displayInner(){
			System.out.println("Outer.Inner");
			//display();
		}
		
	}
	public  static class InnerS{
		public    void displayInner(){
			System.out.println("Outer.InnerS");
			//display();
		}
		
	}
}