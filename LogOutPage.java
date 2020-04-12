package org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testing.Utilities.Assert;

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
			Thread.sleep(3000);
			 WebElement image = driver.findElement(By.xpath(pr.getProperty("image")));
				image.click();
				Thread.sleep(3000);
				
//			String actualEmail = driver.findElement(By.xpath(pr.getProperty("myEmail"))).getText();
//			Thread.sleep(3000);
//				
//				Assert.Assert_email("FatherDad52@gmail.com",actualEmail);
//				Thread.sleep(6000);
				
				WebElement Signout = driver.findElement(By.xpath((pr.getProperty("Signout"))));
				Signout.click();
				Thread.sleep(3000);
			
				

}
		
}


