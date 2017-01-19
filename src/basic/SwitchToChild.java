package basic;

import java.util.Iterator;
import java.util.Set;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwitchToChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp");
		driver.findElement(By.xpath(".//*[@id='TosLink']")).click();
		System.out.println(driver.getTitle());
		Set<String> ids=driver.getWindowHandles();
		Iterator<String> it=ids.iterator();
		String id1=it.next();
		String id2=it.next();
		driver.switchTo().window(id2);
		System.out.println(driver.getTitle());
		driver.switchTo().window(id1);
		System.out.println(driver.getTitle());
		
		
		
		

	}

}
