package com.nokia.gc;

public class GCSimulator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanBeing a=new HumanBeing("XYZ");
		String str=new String("ankur");
		String str2="ankur";
		//str2.equals(anObject)
		System.out.println(str.hashCode());
		System.out.println(str.hashCode());
		//HumanBeing =new HumanBeing("XYZ");
		
		//System.out.println(b.hashCode());
		
		System.out.println(a.hashCode());
		System.out.println(a);
		a=null;
		
		System.gc();

	}

}
