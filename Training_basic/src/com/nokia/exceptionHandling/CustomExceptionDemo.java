package com.nokia.exceptionHandling;
//checked and unchecked
//Compile time and run time
//run time not mandatory to put in try catch...Errors..Out of memory...
//extend Exception class for custom checked exception
//extend RunTime Exception  class for unchecked exception..
//When do we write custom exception??
//In case we are using 3rd party api's in our software it may throw its own exception ...
//It may throws its own execption ...Invalid intialisation not found..tomcat not started...
//3rd party software exception will be displayed in the logs..
//Wrapper custom exception class..and whenever we use native function we will wrap..and then we will rethrow our custome exception
//

public class CustomExceptionDemo {

	public static void main(String[] args) throws JBossCacheException, InvalidDataException {
		// TODO Auto-generated method stub
		
			try{
			createEntry();
			}
			catch(InvalidDataException e)
			{
				e.printStackTrace();
				
			}
			finally{
			System.out.println("MY NAME IS ANTHONY GONSALVES");
			}
		

	}

	private static void createEntry() throws InvalidDataException, JBossCacheException {
		try{
			createEntryInCache(null);
			
		}
		catch(JBossCacheException e)
		{
			//e.printStackTrace();
			//int c=9/0;
			
			throw new InvalidDataException(/*"HI   ......."*/);
			//System.out.println("XYZ");
			
		}
		
		finally
		{
			System.out.println("THank YOu");
		}
		
		System.out.println("MY NAME IS ANTHONY GONSO");
		
		
		
	}

	private static void createEntryInCache(Object object) throws JBossCacheException {
		// TODO Auto-generated method stub
		if(object==null)
			throw new JBossCacheException("JBOSS ANKUR", null);
		System.out.println("");
		
	}
	

}


//Custom exception
class InvalidDataException extends Exception{
	
	public InvalidDataException(String message)
	{
		super(message);
	}
	
	public InvalidDataException(String message,Throwable parent){
		super(message,parent);
	}
	public  InvalidDataException() {
		super();
		
	}
	
	
}

//3rd party application's custom exception
class JBossCacheException extends Exception{
	
	public JBossCacheException(String Message,Throwable parent)
	{
		super(Message,parent);
	}
	
}
