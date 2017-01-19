package basic;
import org.openqa.selenium.By;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerDriverService;


public class WebApp2 {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "D:\\userdata\\a34sriva\\Downloads\\chromedriver.exe");
		
WebDriver driver= new FirefoxDriver();
driver.get("http://facebook.com");
driver.findElement(By.id("email")).sendKeys("ankur.itplus");
driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("ankur");

driver.findElement(By.partialLinkText("Forgotten")).click();



System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());
//System.out.print(driver.getPageSource());
//System.out.println("Hello World\n");
driver.close();
	}

}
