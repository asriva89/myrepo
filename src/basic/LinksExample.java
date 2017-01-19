package basic;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.setProperties(arg0);
		WebDriver driver = new FirefoxDriver();
		driver.get("http://ebay.com");
		//Count of total link in page
		System.out.println(driver.findElements(By.tagName("a")).size());
		//Count of total link in footer section
		System.out.println(driver.findElement(By.xpath(".//*[@id='glbfooter']")).findElements(By.tagName("a")).size());
		//Counr of link in 1 Section of footer section
		System.out.println(driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul")).findElements(By.tagName("a")).size());
		//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul
		String txt = null,id1,id2,temp;
		
		WebElement as= driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		
		for (int i=0;i<driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul")).findElements(By.tagName("a")).size();i++)
		{
			//Find SiteMap element in footer section
			txt = as.findElements(By.tagName("a")).get(i).getText();
			if(txt.contentEquals("Site map"))
			{
				//Click on SiteMap
				txt = driver.getTitle();
				as.findElements(By.tagName("a")).get(i).click();
				break;				
			}
		}
		id1=driver.getTitle();
		System.out.print(txt+id1);
		if(txt!= id1)
		{
			//Check for new Title and check wheter new XPath is present
			boolean abc=driver.findElement(By.xpath("html/body/div[2]/div[1]/h1")).isDisplayed();
			if (abc==true)
			{
				System.out.println("Pass");
				
			}
		}
		else
		{
			System.out.println("Fail");
			
			}
			
		}

	}

