package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramePractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();
		driver.get("http://hindu.com");
		//iframe practice code
		//driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='si-iframe']")));//.findElement(By.xpath(".//*[@id='181081']/div[1]/div[1]")).click();
		driver.switchTo().frame("si-iframe");//.findElement(By.xpath(".//*[@id='181081']/div[1]/div[1]")).click();
		driver.findElement(By.xpath(".//*[@id='181081']/div[1]/div[2]/div[1]/div")).click();
		//driver.switchTo().
		driver.close();

	}

}
