package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
		System.out.print(driver.getPageSource());
		driver.switchTo().frame(1).findElement(By.cssSelector("input[name='fldLoginUserId']")).sendKeys("fff");
		//driver.findElement(By.cssSelector("input[name='fldLoginUserId']")).sendKeys("fff");
		

	}

}
