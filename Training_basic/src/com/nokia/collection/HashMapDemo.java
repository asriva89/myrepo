package com.nokia.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.nokia.day4.Product;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> name=new HashMap<String,String>();
		//name.
		name.put("Name", "Ankur");
		name.put("RAM", "value");
		Set<Map.Entry<String, String>> z=name.entrySet();
		Iterator it=z.iterator();
		
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		String xx="Ankur";
		String yy="Ankur";
		Product a1= new Product(1);
		Product a2= new Product(1);
		
		
		if(xx.equals(yy))
			
			
		
		
		
		for ( Map.Entry<String, String> x : name.entrySet()) {
			System.out.println(x.getKey()+"  "+x.getValue());
			
		}
		
		System.out.println(name);

	}

}
