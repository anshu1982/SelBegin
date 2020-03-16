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
		Thread.sleep(2000);
		WebElement Signin = driver.findElement(By.xpath	(pr.getProperty("Signin")));
		Signin.click();
		WebElement Email = driver.findElement(By.id(pr.getProperty("Email")));
		Email.sendKeys("dramatest18@gmail.com");
		WebElement Next = driver.findElement(By.xpath(pr.getProperty("Next")));
		Next.click();
		Thread.sleep(3000);
		WebElement Password = driver.findElement(By.name(pr.getProperty("Password")));
		Password.sendKeys("Dramatest@2012");
		WebElement Next1 = driver.findElement(By.xpath(pr.getProperty("Next1")));
		Next1.click();
		Thread.sleep(3000);
		List <WebElement> video = driver.findElements(By.id(pr.getProperty("video")));
		video.get(1).click();
	    Thread.sleep(3000);
	    WebElement Like = driver.findElement(By.xpath(pr.getProperty("Like")));
	    Like.click();
	    Thread.sleep(3000);
	    
	}

}
