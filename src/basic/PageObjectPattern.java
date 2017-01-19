package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PageObjectPattern {
public static void main(String... args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\userdata\\a34sriva\\Downloads\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
//WebDriver driver = new FirefoxDriver();
// Login to Admin portal
driver.get("http://pageobjectpattern.wordpress.com/wp-admin");
WebElement email = driver.findElement(By.id("user_login"));
WebElement pwd = driver.findElement(By.id("user_pass"));
WebElement submit = driver.findElement(By.id("wp-submit"));
email.sendKeys("ankuritplus");
pwd.sendKeys("webdriver");
submit.click();
// Go to AllPosts page
driver.get("https://wordpress.com/post/test98054.wordpress.com/4");
// Add New Post
WebElement addNewPost = driver.findElement(By.linkText("Add New"));
addNewPost.click();
// Add New Post's Content
driver.switchTo().frame("content_ifr");
WebElement postBody = driver.findElement(By.id("tinymce"));
postBody.sendKeys("This is description");
driver.switchTo().defaultContent();
WebElement title = driver.findElement(By.id("title"));
title.click();
title.sendKeys("My First Post");
// Publish the Post
WebElement publish = driver.findElement(By.id("publish"));
publish.click();
}
}