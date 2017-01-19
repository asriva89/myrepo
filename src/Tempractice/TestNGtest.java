package Tempractice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGtest {
	
	 @BeforeMethod
	 public void setUp() {
	   // code that will be invoked when this test is instantiated
		 System.out.println("Before Method");
	 }
	 
	 
	/* @DataProvider(name = "test1")
	 public static Object[][] testDataProvider()
	 {
		 BufferedReader i = new BufferedReader(new FileReader("D:\\Userdata\\a34sriva\\Desktop\\passwd.txt"));
		 while(  (b = i.readLine())!= null)
		 {
			 System.out.println(b);
			 StringTokenizer st = new StringTokenizer(b,",");
			 u=st.nextToken();
			 p=st.nextToken();
			 
		 return new Object[][] {{"u"} ,{"y"}};
		 
	 }
	 */
	 
	 @BeforeTest
	 public void beforeTest()
	 {
		 System.out.println("Before Test");
	 }
	 
	 @AfterMethod
	 public void afterMethod()
	 {
		 System.out.println("After Method");
	 }
	 
	 @AfterTest
	 public void afterTest()
	 {
		 System.out.println("After Test");
	 }
	 
	 @Test(groups = { "fast" })
	 public void aFastTest() {
	   System.out.println("Fast test");
	 }
	 
	 @Test(groups = { "slow" })
	 public void aSlowTest() {
	    System.out.println("Slow test");
	 }
	 @Test(groups = {"fast" , "slow"})
		public void aFStest()
		//, alwaysRun=true)
		{
			System.out.println("FS Test");
		}
	 @Test(groups = { "slow"})
		public void test2()
		//, alwaysRun=true)
		{
			System.out.println("Slow Part2");
		}
	 
	 @Test(groups = { "slow"}, dataProvider = "test1")
	 
		public void test3(String x)
		//, alwaysRun=true)
		{
			System.out.println(x);
		}
	 
	 
	
	 
	 
	 
	 

}
