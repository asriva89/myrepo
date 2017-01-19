package Tempractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectPatternTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		AdminLoginPage alp= new AdminLoginPage(driver);
				//PageFactory.initElements(driver, AdminLoginPage.class);
		alp.login();
		
		
	}

}
