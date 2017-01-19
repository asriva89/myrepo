package Tempractice;


import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 
public class temp {
 
 public static void main(String[] args) 
 {
 WebDriver driver=new FirefoxDriver();
 
 driver.manage().window().maximize();
 
 driver.get("http://www.google.co.in/");
 
 List<WebElement> links=driver.findElements(By.tagName("a"));
 
 System.out.println("Total links are "+links.size());
 
 for(int i=0;i<links.size();i++)
 {
 
 WebElement ele= links.get(i);
 
 String url=ele.getAttribute("href");
 
 verifyLinkActive(url);
 
 }
 
 }
 
 public static void verifyLinkActive(String linkUrl)
 {
        try 
        {
           URL url = new URL(linkUrl);
           
           HttpsURLConnection httpURLConnect=(HttpsURLConnection)url.openConnection();
           
          // url.openConnection();
           //System.out.println("COnnection opened");
           //url.get
           httpURLConnect.setConnectTimeout(3000);
           System.out.println("Timeout Set");
           httpURLConnect.setRequestMethod("GET");
       httpURLConnect.connect();
           
           if(httpURLConnect.getResponseCode()==200)
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage());
            }
          if(httpURLConnect.getResponseCode()==HttpsURLConnection.HTTP_NOT_FOUND)  
           {
               System.out.println(linkUrl+" - "+httpURLConnect.getResponseMessage() + " - "+ HttpsURLConnection.HTTP_NOT_FOUND);
            }
        } catch (Exception e) {
           e.printStackTrace();
        }
    } 
 
 
 
 
}