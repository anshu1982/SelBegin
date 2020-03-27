package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogOutPage {
	
	ChromeDriver driver;
	Properties pr;
	
		public  LogOutPage(ChromeDriver driver,Properties pr)
		{
			this.driver = driver;
			this.pr = pr;
		}
		
		public void logedout() throws InterruptedException
		{
			 //WebElement image = driver.findElement(By.xpath(pr.getProperty("image")));
				//image.click();
				Thread.sleep(1000);
				WebElement Signout = driver.findElement(By.xpath((pr.getProperty("Signout"))));
				Signout.click();
				Thread.sleep(2000);
				driver.close();
	}
	

}
