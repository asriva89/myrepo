package Tempractice;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrokenLinks {

	public static void verifyUrl(String x) throws IOException
	{
		try{
		URL url = new URL(x);
		HttpURLConnection t= (HttpURLConnection)url.openConnection();
		t.setConnectTimeout(3000);
		System.out.println("Timeout Set");
		t.setDoOutput(true);
		//t.setRequestMethod("POST");
		// OutputStreamWriter writer = new OutputStreamWriter(t.getOutputStream());
		 //writer.write("message")
		 
		t.connect();
		System.out.println("Connecting");
		if(t.getResponseCode()==200)
		{
			System.out.println("Not broken");
		}
		if(t.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND)
		{
			System.out.println("Broken Link");
		}
		}
		catch(Exception e)
		{
			System.out.println("In exception");
		}
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		try{
		WebDriver driver= new FirefoxDriver();
		driver.get("http://google.com");
		List<WebElement> we = driver.findElements(By.tagName("a"));
		System.out.println("Total links in page is "+ we.size());
		for(WebElement w : we)
		{
			String x = w.getAttribute("href");
			System.out.println(x);
			verifyUrl(x);
			
		}
		
		}
		catch(IOException e)
		{
			System.out.println("In exception");
		}

	}
	


}
