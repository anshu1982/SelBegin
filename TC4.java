package org.testing.Testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.BaseClass;
import org.testng.annotations.Test;

public class TC4 extends BaseClass {
	
	@Test
	public void  loginPlaySubscribe() throws InterruptedException
	{
		WebElement Signin = driver.findElement(By.xpath("//ytd-button-renderer[@class='style-scope ytd-masthead style-suggestive size-small']"));
	  	Signin.click();
	  	WebElement Email = driver.findElement(By.xpath("//div[@class='Xb9hP'] //input[@id='identifierId' and @type='email']"));
	  	Email.sendKeys("dramatest18@gmail.com");
	  	WebElement Next = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	  	Next.click();
	  	Thread.sleep(3000);
	  	WebElement Password = driver.findElement(By.xpath("//div[@class='Xb9hP']//input[@class='whsOnd zHQkBf'or @name='password']"));        
	  	Password.sendKeys("Dramatest@2012");
	  	WebElement Next1 = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	  	Next1.click();
	  	Thread.sleep(3000);
	  	List <WebElement> as = driver.findElements(By.id("video-title"));
	  	int videosize = as.size();
	    System.out.println("Size" + videosize);
	  	as.get(2).click();
	    Thread.sleep(3000);
	    WebElement Subscribe = driver.findElement(By.xpath("//paper-button[@class='style-scope ytd-subscribe-button-renderer']"));
	    Subscribe.click();
	    Thread.sleep(2000);
	}
}
