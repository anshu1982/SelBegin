package org.testing.Testscripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.BaseClass;
import org.testng.annotations.Test;

public class TC3 extends BaseClass {
	
	@Test
	public void loginPlayLike() throws InterruptedException
	{
		WebElement Signin = driver.findElement(By.xpath("//ytd-button-renderer[@class='style-scope ytd-masthead style-suggestive size-small']"));
	  	Signin.click();
	  	WebElement Email = driver.findElement(By.xpath("//div[@class='Xb9hP'] //input[@id='identifierId' and @type='email']"));
	  	Email.sendKeys("dramatest18@gmail.com");
	  	Thread.sleep(2000);
	  	WebElement Next = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	  	Next.click();
	  	Thread.sleep(3000);
	  	WebElement Password = driver.findElement(By.xpath("//div[@class='Xb9hP']//input[@class='whsOnd zHQkBf'or @name='password']"));        
	  	Password.sendKeys("Dramatest@2012");
	  	Thread.sleep(1000);
	  	WebElement Next1 = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	  	Next1.click();
	  	Thread.sleep(3000);
	  	List <WebElement> as = driver.findElements (By.id("video-title"));
	    as.get(1).click();
	    Thread.sleep(3000);
	    WebElement Like = driver.findElement(By.xpath("//yt-icon[@class='style-scope ytd-toggle-button-renderer']"));
	    Like.click();
	    Thread.sleep(3000);
	}
}
