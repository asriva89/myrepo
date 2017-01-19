/**
 * 
 */
package com.nokia.day4;

/**
 * @author a34sriva
 *
 */
public class Product  /*implements Comparable<Product>*/ {
	private long id;
	private String name;
 	private String comments;
 	
 	//A child object cannot be created without parent object

	public Product(long id, String name, String comments) {
		super();
		this.id = id;
		this.name = name;
		this.comments = comments;
	}

	public Product(long id, String name) {
		//super();
		this(id,name," NO comments ");
	}
	
	public Product(long id) {
		//super();
		this(id," No Name ");
	}
	

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", comments=" + comments + "]";
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (id ^ (id >>> 32));
		return result;
	}
//If two objects are equal there hashcode must also be equal..
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (this.id != other.id)
			return false;
		return true;
	}

	public long getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}

	public void setId(long id) {
		this.id = id;
	}

//	@Override
//	private int compareTo(Product o) {
//		// TODO Auto-generated method stub
//		if (o==null)
//			return -1;
//		
//		return Long.compare(this.id, o.id);
//	}
//	

}
