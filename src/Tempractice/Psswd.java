package Tempractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.StringTokenizer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Psswd {

	public static void main(String[] args) throws IOException {
		WebDriver driver=new FirefoxDriver();
		
		
		// TODO Auto-generated method stub
		File a=new File("D:\\Userdata\\a34sriva\\Desktop\\passwd.txt");
		try {
			//InputStream f = new FileInputStream(a);
			 BufferedReader i = new BufferedReader(new FileReader("D:\\Userdata\\a34sriva\\Desktop\\passwd.txt"));
			 //System.out.println(i.readLine());
			 String b,p,u;
			 //System.out.println(b);
			 while(  (b = i.readLine())!= null)
			 {
				 System.out.println(b);
				 StringTokenizer st = new StringTokenizer(b,",");
				 u=st.nextToken();
				 p=st.nextToken();
				// System.out.println("Password :"+st.nextToken());
				 driver.get("https://www.facebook.com");
				 driver.findElement(By.id("email")).sendKeys(u);
				 driver.findElement(By.id("pass")).sendKeys(p);
				 
				 
			 }
			
					 
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
