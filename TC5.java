package org.testing.TestScripts;

//import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.Base.BaseClass;
import org.testing.Pages.LogOutPage;
import org.testing.Pages.LoginPage;

public class TC5 extends BaseClass
{
	
	public void Histories() throws InterruptedException
	{
		Thread.sleep(1000);
		LoginPage login = new LoginPage(driver,pr);
		login.signin("testerselinium@gmail.com","Tester@selinium");
		Thread.sleep(3000);
		WebElement History = driver.findElement(By.xpath(pr.getProperty("History")));
		History.click();
		Thread.sleep(3000);
		LogOutPage logout = new LogOutPage(driver,pr);
		logout.logedout();
		//Thread.sleep(3000);
	  	
	}


}
