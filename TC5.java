package org.testing.TestScripts;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testing.Base.BaseClass;
//import org.testing.Pages.LogOutPage;
//import org.testing.Pages.LoginPage;
//import org.testing.Pages.VideoPlay;
import org.testng.annotations.Test;




public class TC5 extends BaseClass {
	
	
	

	public void History() throws InterruptedException
	{
		Thread.sleep(3000);
		//LoginPage login = new LoginPage(driver,pr);
		//login.signin("dramatest18@gmail.com","Dramatest@2012");
		WebElement History = driver.findElement(By.xpath(pr.getProperty("History")));
		History.click();
		// LogOutPage logout = new LogOutPage(driver,pr);
			//logout.logedout();
		    Thread.sleep(2000);
	  	
	}

}
