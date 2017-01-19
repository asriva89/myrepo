package basic;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.os.WindowsUtils;



public class ScreenShotPractive {

	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		FirefoxProfile prof=new FirefoxProfile();
		prof.setAcceptUntrustedCertificates(false);
		WebDriver driver = new FirefoxDriver(prof);
		driver.navigate().to("SSS");
		driver.get("https://www.google.co.in");
		Set<Cookie>c1=driver.manage().getCookies();
		System.out.println(c1.size());
		driver.manage().deleteAllCookies();
		Set<Cookie>c2=driver.manage().getCookies();
		System.out.println(c2.size());
		
		File scrfile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scrfile, new File("D:\\screenshot.png"));
		
		WindowsUtils.killByName("firefox.exe");
		
		
		
		

	}

}
