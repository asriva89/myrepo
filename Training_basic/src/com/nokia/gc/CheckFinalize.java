package com.nokia.gc;

import java.util.ArrayList;
import java.util.List;

public class CheckFinalize {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Runtime a= Runtime.getRuntime();
		long initialMemory= a.freeMemory();
		List<String> humans=new ArrayList<>();
		humans.add("Ankur");
		humans.add("XX");
		humans.remove(1);
		System.out.println("Used Memory :"+( initialMemory-a.freeMemory()));
		List<Indian> humansb=new ArrayList<>();
		
		
		System.out.println("Used Memory. :"+( initialMemory-a.freeMemory()));
		
		//System.out.println(a.freeMemory());
		//System.out.println(humansb);
		humansb.add(new Indian());
		humansb.add(new Indian());
		humansb=null;
		System.gc();
		List<Indian> humansc=new ArrayList<>();
		
		
		for (int i=0;i<100000000;i++)
			humansc.add(new Indian());
		System.out.println("After for loop Used Memory :"+( initialMemory-a.freeMemory()));
			humansc=null;
			//Thread.sleep(10000);
			System.out.println("before for GC : "+( initialMemory-a.freeMemory()));

			System.gc();
			System.out.println("After for GC : "+( initialMemory-a.freeMemory()));

		
		

	}


}
