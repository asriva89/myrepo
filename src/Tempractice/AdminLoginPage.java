package Tempractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AdminLoginPage {
	
	WebDriver driver;
	
	@FindBy(how=How.ID,using="email")
	WebElement uname;
	
	@FindBy(how=How.ID,using="pass")
	WebElement pass;
	
	@FindBy(how=How.ID,using="u_0_m")
	WebElement submit;
	
	public AdminLoginPage(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		driver.get("http://facebook.com");
		
		
	}
	public void login()
	{
		uname.sendKeys("aaa@ankur.com");
		pass.sendKeys("aaaaa");
		submit.click();
	}
	
}
	
	


