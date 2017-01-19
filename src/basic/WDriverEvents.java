package basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WDriverEvents {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "D:\\userdata\\a34sriva\\Downloads\\chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--browser.helperApps.neverAsk.openFile");
	
		//ChromeProfile n= new ChromeProfile();
		//ChromeDriverService cs =new ChromeDriverService(executable, port, args, environment)
		
		WebDriver driver = new ChromeDriver();
		EventFiringWebDriver d=new EventFiringWebDriver(driver);
		EvenListner listner= new EvenListner();
		d.register(listner);
		d.get("http://google.com");
		WebElement a =d.findElement(By.xpath(".//*[@id='gs_htif0']"));
		Actions ac= new Actions(d);
		ac.contextClick(a).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).perform();
		
		//d.navigate().back();
		//d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//WebDriverWait wt = new WebDriverWait(d,1000L);
	
		
		
	
		
		

	}

}
