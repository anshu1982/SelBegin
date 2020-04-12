package org.testing.TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Assertion.Assert;
import org.testing.Base.BaseClass;
import org.testing.Pages.LogOutPage;
import org.testing.Pages.LoginPage;

import org.testing.Utilities.ScreenShotCapture;
import org.testng.annotations.Test;

public class TC2 extends BaseClass{

	@Test
	public void  Subscriptioned() throws InterruptedException, IOException
	{

		   String expectedUrl ="https://www.youtube.com/";
		   Thread.sleep(2000);
		Assert.Assert_Url(expectedUrl, driver.getCurrentUrl());
		 LoginPage login = new LoginPage(driver,pr);
		login.signin("FatherDad52@gmail.com","#FatherDad52@");
		Thread.sleep(3000);
		
		WebElement Subscriptions = driver. findElement(By.xpath(pr.getProperty("Subscriptions")));
		Subscriptions.click();
		Thread.sleep(3000);
		
		ScreenShotCapture.TakeScreenShot(driver,"C:\\Users\\Phonato -Shuchi\\Desktop\\subscriptions.jpg");
        Thread.sleep(3000);
		LogOutPage logout = new LogOutPage(driver,pr);
		logout.logedout();
		//Thread.sleep(3000);}
}
}

