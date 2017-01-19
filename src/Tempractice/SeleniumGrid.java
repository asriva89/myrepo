package Tempractice;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities c= DesiredCapabilities.firefox();
		c.setPlatform(Platform.WINDOWS);
		
		//c.setCapability(, value);
		WebDriver driver= new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),c);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		

	}

}
