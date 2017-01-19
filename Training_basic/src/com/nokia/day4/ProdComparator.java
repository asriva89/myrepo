/**
 * 
 */
package com.nokia.day4;

import java.util.Comparator;

/**
 * @author a34sriva
 *
 */
public class ProdComparator implements Comparator<Product> {
	
	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return Long.compare(o1.getId(), o2.getId());
	}
	

}
