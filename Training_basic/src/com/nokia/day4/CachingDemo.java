/**
 * 
 */
package com.nokia.day4;

import java.util.HashMap;
import java.util.Map;

/**
 * @author a34sriva
 *
 */
public class CachingDemo {
	public static void main(String[] args)
	{
		Map<Key,Product> productCache=new HashMap<>();
	 Product prod1=new Product(123, "name ", "Good Bat");
	 Product prod2=new Product(124, "name ", "Good Bat");
	 Key p1Key= new Key(prod1.getId());
	 Key p2Key=new Key(prod1.getId());
	 
	 productCache.put(p1Key, prod1);
	 productCache.put(p2Key, prod2);
	 
	 System.out.println(productCache);
	 
	 Key p3Key= new Key(123);//since we have not implemented equals and hashcode method every key is different
	 //after implementation key id will be compared before inserting and based on hashcode it will identify if it is same or different
	 
	 System.out.println(productCache.get(p3Key));
	 
	 
		
	
	}

}
