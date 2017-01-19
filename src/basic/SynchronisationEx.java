package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.log4testng.Logger;

public class SynchronisationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://fantasycricket.dream11.com/in/");
		driver.manage().window().maximize();
		//driver.manag
		WebDriverWait wt=new WebDriverWait(driver,10);
		driver.findElement(By.xpath("//*[@id='m_rtxtEmail1']")).sendKeys("aa");
		
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul/li[2]/p")));
		driver.findElement(By.xpath(".//*[@id='m_frmRegister']/div[1]/ul/li[2]/p")).click();
	//	DesiredCapabilities dc;
		
		//static Logger log=logger.getLogger("abc");
		
		
		

	}

}
