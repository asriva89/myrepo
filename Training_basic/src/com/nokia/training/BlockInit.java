package com.nokia.training;

public class BlockInit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Block z=new Block();
		

	}

}

class Block{
	{
		int i=1;
		String a="Hello";
		System.out.println(a);
	}
	
	void disp()
	{
		Block x=new Block();
		//System.out.println(x.a);
	}
}