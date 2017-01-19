/**
 * 
 */
package com.nokia.exceptionHandling;

import java.util.Scanner;

/**
 * @author a34sriva
 *
 */
public class RuntimeExceptionDemo {
	
	private static String message;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter 1 and 2 number");
		int i=in.nextInt();
		int j=in.nextInt();
		devide(i,j);
		
		int c=1/0;
		

	}

	private static void devide(int i, int j) {
		// TODO Auto-generated method stub
		 
		try{
			int x=i/j;
			System.out.println("VALUE is :" +x);
			message=message.toLowerCase();
		}
//		catch(ArithmeticException ex)
//		{
//			
//			System.out.println(ex);
//		}
//		catch (NullPointerException e) {
//			// TODO: handle exception
//			e.printStackTrace();
//			System.out.println("GREAT");
//			//System.out.println("Null POINTER!!!"+e.printStackTrace());
//		}
		catch (Exception e) {
			System.out.println(e.toString());
			
			switch(e.toString())
			{
			case "java.lang.ArithmeticException" : 
				System.out.println("Airthmetic Exception");
				break;
			case "java.lang.NullPointerException" :
				System.out.println("Null Pointer Exception");
				break;
			default:
					System.out.println("UNKOWN EXCEPTION");
				
			}
		}
			finally {
				
			
				System.out.println("program is over ");
			}
			// TODO: handle exception
		}
		
	

	private static void add(int i, int j) {
		// TODO Auto-generated method stub
		
			int sum=i+j;
			System.out.println("SUM IS "+sum);
		
		
	}

}
