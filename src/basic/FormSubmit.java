package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FormSubmit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\userdata\\a34sriva\\Downloads\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://spicejet.com");
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='GOI']")).click();
		Select dropdown= new Select(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));
		dropdown.selectByIndex(1);
		dropdown.selectByValue("9");
		dropdown.selectByVisibleText("8 Adults");
		//driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_IndArm']")).click();
		driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_IndArm']")).clear();
		System.out.print(driver.findElement(By.xpath("//*[@id='ctl00_mainContent_chk_IndArm']")).isSelected());
				
		
		driver.close();
		

	}

}
