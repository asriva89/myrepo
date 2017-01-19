package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProblemStatement {
	//Problem is to identify and navigate to Dynamically generated IFRAME 
	//find frame method is used to identify frame id by given element locator
	
	
	//Find IFRAME ID where webelement specified by by exist in Webdriver
	public int findFrame(WebDriver dd,By by)
	{
	int count =dd.findElements(By.tagName("iframe")).size();
	int i;	
	for(i=0;i<count;i++)
		{
			dd.switchTo().frame(i);
			int cc=dd.findElements(by).size();
			System.out.println(cc+"kjlsjdlsjdl"+count);
			if(cc>0)
			{
				//dd.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
				break;
			}
			else
			{
				System.out.println("Looping in Again");
			}
		}
	dd.switchTo().defaultContent();
	return i;
	
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com/accounts/recovery/forgotusername");
		ProblemStatement tt= new ProblemStatement();
		int x=tt.findFrame(driver,By.xpath(".//*[@id='recaptcha-anchor']/div[5]"));
		driver.switchTo().frame(x);
		driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
		
		WebDriverWait w=new WebDriverWait(driver,10);
		driver.switchTo().defaultContent();
		int x1=tt.findFrame(driver,By.xpath("//div[@id='recaptcha-verify-button']"));
		//w.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(x1));
		Thread.sleep(20000L);
		driver.switchTo().frame(x1);
		driver.findElement(By.xpath("//div[@id='recaptcha-verify-button']")).click();
		
		
		
		/*switchtoFrame(driver);
		
		WebElement abc=driver.findElement(By.xpath("//iframe[@title='recaptcha widget']"));
		driver.switchTo().frame(abc);
		driver.findElement(By.xpath(".//*[@id='recaptcha-anchor']/div[5]")).click();
		*/

	}
	
	

}
