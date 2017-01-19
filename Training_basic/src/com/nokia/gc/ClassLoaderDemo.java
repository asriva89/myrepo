package com.nokia.gc;

public class ClassLoaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=new String("Testing");
		
		TestingClassLoader load=new TestingClassLoader();
		System.out.println(String.class.getClassLoader());
		System.out.println(System.class.getClassLoader());
		System.out.println(TestingClassLoader.class.getClassLoader());
		

	}

}
class TestingClassLoader{
	
}