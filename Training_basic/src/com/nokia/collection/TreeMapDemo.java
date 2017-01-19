package com.nokia.collection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.*;

public class TreeMapDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		System.out.println("Enter the string");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
			String a1=br.readLine();
		String str[]=a1.split(" ");
		Map<Integer,String> m= new TreeMap<>();
		
		for (int i=0;i < str.length;i++)
		{
			m.put(str[i].length(), str[i]);
						
		}
		List<Integer> l= new ArrayList<>(m.keySet());
		//m.entrySet()
		System.out.println(m.keySet());
		
		System.out.println(m.get(l.get(0)));
		
		
		
		
	
			
		}

	}

