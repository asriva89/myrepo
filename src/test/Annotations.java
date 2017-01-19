package test;

import org.testng.annotations.Test;

public class Annotations {
	//@Test(timeOut=1,enabled=true)
	@Test
	public void testMethod()
	{
		try {
			Thread.sleep(5L);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Hello");
	}
	
	@Test(dependsOnMethods = "testMethod", alwaysRun = true)
	public void test2()
	//, alwaysRun=true)
	{
		System.out.println("temp");
	}
	

}
