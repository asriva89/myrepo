package Tempractice;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class PrintTemp extends PrintStream {


	
	public PrintTemp(String paramString) throws FileNotFoundException {
		super(paramString);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void println(String a)
	  {
	    print(a);
	  }
	

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		PrintTemp a = new PrintTemp("Abcd");
		a.println("aaaaaaaa");
		a.println("xxxxxxxx");
		
		

	}

}
