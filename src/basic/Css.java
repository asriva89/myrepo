package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver= new FirefoxDriver();
		driver.get("https://login.salesforce.com");
		driver.findElement(By.cssSelector("[id='username']")).sendKeys("ankur");
		driver.findElement(By.cssSelector("[id='password']")).sendKeys("aaahha");
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	}

}
