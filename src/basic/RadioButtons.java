package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.echoecho.com/htmlforms10.htm");
		//driver.findElement(By.xpath("//input[@value='Cheese']")).click();
		//System.out.print(driver.findElements(By.xpath("//input[@type='radio' and @name='group1']")).size());
		int count=driver.findElements(By.xpath("//input[@type='radio' and @name='group1']")).size();
		System.out.print(count);
		for (int i =0;i<count;i++)
		{
			System.out.println(i+"Times");
			String txt=driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
			System.out.println(txt);

			//driver.findElements(By.xpath("//input[@type='radio' and @name='group1']")).get(i).click();
			if(txt.equals("Cheese"))
			{
				System.out.print("HI");
				driver.findElements(By.xpath("//input[@type='radio' and @name='group1']")).get(i).click();
			}
		}
			

	}

}
