package Tempractice;

import Tempractice.OuterClass.InnerClass;

public class Main {

	public static void main(String args[]){
		OuterClass.NestedStaticClass a2= new OuterClass.NestedStaticClass();
		a2.printMsg();
		OuterClass outer=new OuterClass();
		OuterClass.InnerClass a4= outer.new InnerClass();
		a4.display();
		
	}

}
