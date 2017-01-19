package com.nokia.banking;

import javax.net.ssl.ExtendedSSLSession;

public class TestingInstanceOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		B b=new B();
		C c=new C();
		//Factory a=new Maruti();
		
		
//		Factory x= new Factorey()
//				Maruti swift=Nre
//				x=swift;
//		
//		Maruti celerio=(Maruti)x;
//		
		a=c;
		 if (a instanceof C) {
			 //after this you can cast it ...this helps to avoid class cast exception
			 C temp= (C)a;
			 
			 System.out.println("YEs");
			
			
		}

	}
	
	

}
class A{
	
}
class B extends A{
	
}
class C extends B{
	
}