/**
 * 
 */
package com.nokia.day4;

import java.util.Comparator;

/**
 * @author a34sriva
 *
 */
public class ProdComparatorName implements Comparator<Product> {
	
	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	

}
