package test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.os.WindowsUtils;
import org.testng.annotations.AfterMethod;

public class WindowsCheck {
  @Test
  public void f() {
	  
	  System.out.println(WindowsUtils.readStringRegistryValue("HKEY_CURRENT_USER\\Software\\Skype\\Phone\\UI\\General\\Language"));
	  
  }
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
