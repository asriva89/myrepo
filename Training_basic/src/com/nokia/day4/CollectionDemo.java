package com.nokia.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.*;

public class CollectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product prod=new Product(1,"ankur");
		List<Integer> a1= new ArrayList<>();
		
		String ab=new String("Ankur");
		String gc="Ankur";
		
		if(ab==gc){
			System.out.println("=== is working");
		}
		
		
		
		if(ab.equals(gc))
		{
			System.out.println("equals is working");
		}
		
		System.out.println(ab.toString());
		//prod.toString()
		System.out.println("HILLO" +prod);
		
		Product prod2=new Product(1,"ankur2");
		Product prod3=new Product(2,"aankur3");
		Product prod4=new Product(1,"ankur");
		
		if(prod.equals(prod2))
			System.out.println(prod);
		else
			System.out.println("BYE");
		if(prod==prod2)//reference check..always it will be different since it is two different object
			System.out.println("==");
		//******Bound type generic..open generic
		//Linked hash map -->
		Map<Product, String> a= new LinkedHashMap<>();
		
		
		a.put(prod2, "Prod2");
		a.put(prod3, "Prod3");
		a.put(prod4, "Prod4");
		
		System.out.println(prod2.hashCode()+" "+prod3.hashCode()+" "+prod4.hashCode());
		System.out.println("TESTS"+a);
		a.remove(prod2);
		
		
		
		LinkedHashMap<Product, String> b=(LinkedHashMap<Product, String>)a;
		//b.
		
//		WebDriver a= new FireFoxDriver();
//		WebDriver b= 
//		
		
		Set<Product> prodset=new HashSet<>();
		//if wedirectly add product into set ,it will store all the objects since every object is different
		//to implement proper behaviour of Set that is to avoid duplicate, we need to implement hashCode funtion
		prodset.add(prod);
		prodset.add(prod2);
		prodset.add(prod3);
		
		//System.out.println(prodset);
		
		for (Product product : prodset) {
			//System.out.println(product);
			
		}
		
		///To see kind of bugs we may get
		
		List<String> dataList=new ArrayList<>();
		dataList.add("Training1");
		dataList.add("Training2");
		
	 
		dataList.add(null);
		
		//Collections.sort(dataList);
		
		List<Product> dList=new ArrayList<>();
		dList.add(prod3);
		dList.add(prod);
		
		//Collections.sort(dList);
		
		System.out.println("UNSORTED LIST"+dList);
		
		//Collections.sort(dList);
//		System.out.println("SORTED LIST"+dList);
		
		Collections.sort(dList,new ProdComparator());
		//Collections.sort(
		
		System.out.println("SORTED LIST"+dList);
		
		Collections.sort(dList,new ProdComparatorName());
		
		System.out.println("Name Sorted List" + dList);

	}

}
