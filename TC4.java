package org.testing.TestScripts;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testing.Base.BaseClass;
import org.testing.Pages.LogOutPage;
import org.testing.Pages.LoginPage;
import org.testing.Pages.VideoPlay;
import org.testng.annotations.Test;

public class TC4 extends BaseClass {
	

	@Test
    public void  Subscribechannel() throws InterruptedException
        {
		 Thread.sleep(2500);
		LoginPage login = new LoginPage(driver,pr);
		login.signin("FatherDad52@gmail.com","#FatherDad52@");
		Thread.sleep(3000);
		VideoPlay vd = new VideoPlay(driver,pr);
		vd.video();
		WebDriverWait wait = new WebDriverWait(driver,15);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath(pr.getProperty("Subscribe"))));
		
		   WebElement Subscribe = driver.findElement(By.xpath(pr.getProperty("Subscribe")));
		    Subscribe.click();
		    Thread.sleep(3000);
		    LogOutPage logout = new LogOutPage(driver,pr);
			logout.logedout();
		    //Thread.sleep(3000);}
			
}
}


