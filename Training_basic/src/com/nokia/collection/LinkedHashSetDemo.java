package com.nokia.collection;
import java.util.*;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new LinkedHashSet<>();
		s.add("aaa");
		s.add("bbb");
		s.add("aaa");
		s.add("Cat");
		s.add("Dog");
		
		System.out.println(s);
		Iterator<String> it=s.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
	}

}
