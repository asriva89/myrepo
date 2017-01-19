package basic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class HtmlTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirefoxProfile prof=new FirefoxProfile();
		prof.setAcceptUntrustedCertificates(false);
		
		WebDriver driver = new FirefoxDriver(prof);
		driver.get("http://www.espncricinfo.com/ci/engine/match/1014847.html");
		WebElement e=driver.findElement(By.xpath(".//*[@id='full-scorecard']/div[2]/div/table[1]"));
		//Get Number of Rows in any Webelement
		List<WebElement>l1=e.findElements(By.tagName("tr"));
		System.out.println("No of rows is "+l1.size());
		
		Actions a1= new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath(".//*[@id='full-scorecard']/div[2]/div/table[1]/tbody/tr[1]/th[7]"))).build().perform();
		
		System.out.println(driver.findElement(By.xpath(".//*[@id='full-scorecard']/div[2]/div/table[1]/tbody/tr[1]/th[7]")).getAttribute("title"));
		int i=0;
		//get number of columns
		for(WebElement a:l1)
					{
			
			List<WebElement>l2=a.findElements(By.tagName("td"));
			i++;
			System.out.println("number of columns in "+i+" th row is "+l2.size());
			//get cell values
			for (WebElement x:l2)
			{
				System.out.println(x.getText());
			}
			
		}
		
		
		driver.close();
		
		

	}

}
