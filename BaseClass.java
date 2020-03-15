package org.testing.Base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass
{
	public ChromeDriver driver;

	@BeforeMethod
	public void BrowserLaunch() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C://Users//Phonato -Shuchi//Desktop//chromedriver.exe");
	   driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
	}
		
		
	
	 @AfterMethod
	 public void BrowserClose() throws InterruptedException
	 {
		 WebElement image = driver.findElement(By.xpath("//img[@id='img']"));
			image.click();
			Thread.sleep(1000);
			WebElement Signout = driver.findElement(By.xpath("//a[@href='/logout']"));
			Signout.click();
			Thread.sleep(2000);
			driver.close();
	 }
}
	 