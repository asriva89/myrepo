package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FormMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new FirefoxDriver();
driver.get("http://www.makemytrip.com/");
System.out.println("Before clicking on Multi City");
System.out.println((driver.findElement(By.xpath("//*[id='return_date_sec']")).isDisplayed()));
driver.findElement(By.xpath("//*[@id='multi_city_button']/span")).click();
System.out.println((driver.findElement(By.xpath("//*[id='return_date_sec']")).isDisplayed()));
		
	}

}
