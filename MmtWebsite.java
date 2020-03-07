package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MmtWebsite {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C://Users//Phonato -Shuchi//Desktop//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
	    driver.manage().window().maximize();
	    
	    Actions ac = new Actions(driver);
	   WebElement From = driver.findElement(By.id("fromCity"));
	   ac.click(From);
	   ac.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
       WebElement To = driver.findElement(By.cssSelector("label[for='toCity']"));
       ac.click(To);
       for(int i=0;i<=4;i++)
       {
    	   ac.sendKeys(Keys.ARROW_DOWN).perform();
       }
       ac.sendKeys(Keys.ENTER).perform();
	}
}