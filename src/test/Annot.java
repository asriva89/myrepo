package test;

import java.util.logging.Logger;

import org.apache.commons.logging.Log;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.w3c.dom.DOMConfiguration;

public class Annot {
	
	private static Logger Log = Logger.getLogger(Log.class.getName());
	
  @Test(dataProvider = "dp")
  public void f(Integer n, String s) {
	  
	   Log.info("Inside Test");
	   Reporter.log("Successfully Tested");
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { 1, "a" },
      new Object[] { 2, "b" },
    };
  }
  
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }
  @Test(dataProvider = "dp")
  public void sampleTest(Integer x, String y)
  {
	  System.out.println(x+y);
  }

}
