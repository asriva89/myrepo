package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.events.WebDriverEventListener;


public class EvenListner implements WebDriverEventListener{
@Override
public void afterChangeValueOf(WebElement arg0,
		org.openqa.selenium.WebDriver arg1) {
	// TODO Auto-generated method stub
	
}
@Override
public void afterClickOn(WebElement arg0, org.openqa.selenium.WebDriver arg1) {
	// TODO Auto-generated method stub
	
}
@Override
public void afterFindBy(By arg0, WebElement arg1,
		org.openqa.selenium.WebDriver arg2) {
	// TODO Auto-generated method stub
	
}
@Override
public void afterNavigateBack(org.openqa.selenium.WebDriver arg0) {
	// TODO Auto-generated method stub
	System.out.println("After Navigate back");
	
}
@Override
public void afterNavigateForward(org.openqa.selenium.WebDriver arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void afterNavigateRefresh(org.openqa.selenium.WebDriver arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void afterNavigateTo(String arg0, org.openqa.selenium.WebDriver arg1) {
	// TODO Auto-generated method stub
	
}
@Override
public void afterScript(String arg0, org.openqa.selenium.WebDriver arg1) {
	// TODO Auto-generated method stub
	
}
@Override
public void beforeChangeValueOf(WebElement arg0,
		org.openqa.selenium.WebDriver arg1) {
	// TODO Auto-generated method stub
	
}
@Override
public void beforeClickOn(WebElement arg0, org.openqa.selenium.WebDriver arg1) {
	// TODO Auto-generated method stub
	
}
@Override
public void beforeFindBy(By arg0, WebElement arg1,
		org.openqa.selenium.WebDriver arg2) {
	// TODO Auto-generated method stub
	
}
@Override
public void beforeNavigateBack(org.openqa.selenium.WebDriver arg0) {
	System.out.println("Before Navigate back ");
	
}
@Override
public void beforeNavigateForward(org.openqa.selenium.WebDriver arg0) {
	// TODO Auto-generated method stub
	
}
@Override
public void beforeNavigateRefresh(org.openqa.selenium.WebDriver arg0) {
	// TODO Auto-generated method stub
	//System.out.println();
	
}
@Override
public void beforeNavigateTo(String arg0, org.openqa.selenium.WebDriver arg1) {
	// TODO Auto-generated method stub
	System.out.println("Before Navigation to" + arg0);
	
	
}
@Override
public void beforeScript(String arg0, org.openqa.selenium.WebDriver arg1) {
	// TODO Auto-generated method stub
	
}
@Override
public void onException(Throwable arg0, org.openqa.selenium.WebDriver arg1) {
	// TODO Auto-generated method stub
	
}
}


