package com.nokia.gc;

public class HumanBeing {
	private String name;

	HumanBeing(String name) {
		this.name = name;
		//this.name.intern();
	}
	@Override
	public String toString(){
		return "Name is : "+name;
		
	}

}
