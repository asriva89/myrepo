package com.nokia.collection;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> name=new ArrayList<>(1);
		for(int i=0;i<1000;i++)
		name.add("Aa");
		//name.toString();
		//System.out.println(name.lastIndexOf("YY"));
		System.out.println(name);
		for (String string : name) {
			System.out.println(string);
			//name.add("ff");
			
			
		}
		List<String> name2=new ArrayList<>(1);
		name2.add("zz");
		name.removeAll(name2);
		
		Iterator<String> it=name.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
			//name.add("ff");
		}
		
		
	}

}
