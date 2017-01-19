package Tempractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.io.FileHandler;

public class DownloadChromeFile {

	public static void main(String[] args) {
		
		FirefoxProfile fp = new FirefoxProfile();
		
		fp.setPreference("browser.helperApps.neverAsk.openFile", "application/octet-stream");
				
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver(fp);
		// Maximize window
		driver.manage().window().maximize();
		  
		// Open APP to download application
		driver.get("http://www.filehippo.com/download_adobe_reader");
		  
		
		// Click on download 
		driver.findElement(By.xpath(".//*[@id='program-header']/div[2]/a[1]")).click();
		File scr= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(scr, new File("D:\\scp.png"));
			FileHandler.delete(new File("D:\\scp.png"));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
