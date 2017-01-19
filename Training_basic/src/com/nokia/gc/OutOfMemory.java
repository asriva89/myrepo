package com.nokia.gc;

import java.util.ArrayList;
import java.util.List;

public class OutOfMemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub// TODO Auto-generated method stub
		Runtime a = Runtime.getRuntime();
		long initialMemory = a.freeMemory();
		List<String> humans = new ArrayList<>();
		humans.add("Ankur");
		humans.add("XX");
		humans.remove(1);
		System.out.println("Used Memory :" + (initialMemory - a.freeMemory()));
		List<HumanBeing> humansb = new ArrayList<>();
		HumanBeing b = new HumanBeing("aa");
		HumanBeing c = new HumanBeing("bb");
		humansb.add(b);
		humansb.add(c);
		System.gc();
		System.out.println("Used Memory :" + (initialMemory - a.freeMemory()));

		// System.out.println(a.freeMemory());
		// System.out.println(humansb);

		for (int i = 0; i < 100000000; i++)
			humansb.add(new HumanBeing("XYZ " + i));
		System.out.println("After for loop Used Memory :" + (initialMemory - a.freeMemory()));
		humansb = null;
		//Thread.sleep(10000);
		System.out.println("before for GC : " + (initialMemory - a.freeMemory()));

		System.gc();
		System.out.println("After for GC : " + (initialMemory - a.freeMemory()));

		// Iterator<E>r
		System.out.println(humans);
		System.out.println(a.availableProcessors());
		System.out.println((a.freeMemory() / 1024));

	}

}
