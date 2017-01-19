package basic;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SeleniumGrid {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		DesiredCapabilities c= DesiredCapabilities.firefox();
		c.setPlatform(Platform.LINUX);
		//c.setBrowserName("Firefox");
		//c.setCapability(, value);
		WebDriver driver= new RemoteWebDriver(new URL("http://192.168.1.102:4444/wd/hub"),c);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		

	}

}
