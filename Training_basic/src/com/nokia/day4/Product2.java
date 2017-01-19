/**
 * 
 */
package com.nokia.day4;



//import is used in case you want to instantiate any class..

/**
 * @author a34sriva
 *
 */
public class Product2 extends Product {
	private long id;
	private String name;
 	private String comments;

	public Product2(long id, String name, String comments) {
		//super(0);
		super(0);
		this.id = id;
		this.name = name;
		this.comments = comments;
	}

	public Product2(long id, String name) {
		//super();
		this(id,name," NO comments ");
	}
	
	public Product2(long id) {
		//super();
		this(id," No Name ");
	}
	

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", comments=" + comments + "]";
	}
	
	public long getId() {
		//super.getId();
		return id+1;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Product2 is child of product..
		//List<String> a=new ArrayList<>();
		Product2 b=new Product2(10);
		
		System.out.println(b.getId());
		
		Product a=new Product2(10);
		
		System.out.println(a.getId());
		
		//a.getId();
		
		
		
		
		//long i=
		

	}

}
