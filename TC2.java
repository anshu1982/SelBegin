package org.testing.TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.BaseClass;
import org.testing.Pages.LogOutPage;
import org.testing.Pages.LoginPage;
import org.testing.Utilities.ScreenShotCapture;
import org.testng.annotations.Test;

public class TC2 extends BaseClass{

	@Test
	public void  Subscriptioned() throws InterruptedException, IOException
	{

		Thread.sleep(1000);
		 LoginPage login = new LoginPage(driver,pr);
		login.signin("testerselinium@gmail.com","Tester@selinium");
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
