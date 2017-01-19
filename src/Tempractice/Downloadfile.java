package Tempractice;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Downloadfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\userdata\\a34sriva\\Downloads\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		
		Map<String, Object> prefs = new HashMap<String, Object>(); 
		prefs.put("safebrowsing.enabled", "true"); 
		co.setExperimentalOption("prefs", prefs);
		
		
		//co.addArguments("--browser.helperApps.neverAsk.openFile");
		WebDriver driver=new ChromeDriver(co);
		// Maximize window
		driver.manage().window().maximize();
		  
		// Open APP to download application
		driver.get("http://www.filehippo.com/download_adobe_reader");
		  
		
		// Click on download 
		driver.findElement(By.xpath(".//*[@id='program-header']/div[2]/a[1]")).click();
		 

	}

}
