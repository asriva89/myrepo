package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://amazon.in");
		Actions abc = new Actions(driver);
		WebElement element=driver.findElement(By.xpath("//*[@id='nav-link-yourAccount']"));
		//Thread.sleep(2000L);
		abc.moveToElement(element).build().perform();
		WebElement element2=driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		abc.keyDown(Keys.SHIFT).moveToElement(element2).click().sendKeys("smalaaa").build().perform();
		abc.contextClick(element).build().perform();
		
		
 
 
 
	}

}
