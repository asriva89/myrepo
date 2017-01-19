package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Customxpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new FirefoxDriver();
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("wbc@gmail.com");
		

	}

}
