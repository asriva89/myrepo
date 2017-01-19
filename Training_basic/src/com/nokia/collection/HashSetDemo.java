package com.nokia.collection;


import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Unboxing and AutoBoxing
		Set<String> s = new HashSet<>();
		Map<String,Integer> m= new HashMap<>();
		Map<String,String> sw=new HashMap<>();
		//sw.put(key, value)
		
	
		
		//m.put(key, value)
		
		
		s.add("Hi");
		s.add("Hello");
		s.add("DDD");
		boolean a = s.add("Hi");

		System.out.println(s);
		System.out.println(a);

		Iterator<String> d1 = s.iterator();
		
		System.out.println(s);
		
		while (d1.hasNext()) {
			//d1.remove();
			System.out.println(d1.next());
			d1.remove();
			s.remove("Hi");
			//System.out.println(d1.next());

		}
		System.out.println(s);
		s.add("Hi");
		s.add("Hello");
		s.add("DDD");
		System.out.println(s.contains("Hello6"));
		
		List<String> val=new ArrayList<String>();
		
		val.add("Ankur5");
		val.add("Ankur3");
		val.add("Hi");
		val.add("Ankurss");
		//s.addAll(val);
		s.retainAll(val);
		System.out.println(val);
		Collections.sort(val);
		System.out.println(val);
		
		
		System.out.println(s);
		

	}

}
