package Tempractice;

public class OuterClass {
	
	static String a = "Withaker";
	String b="aaa";
	public static class NestedStaticClass{
		void printMsg()
		{
			System.out.println("NEsted static class "+a);
		}
	}

	public class InnerClass{
		void display()
		{
			System.out.println("Inner Class "+a+b);
		}
	}
}

