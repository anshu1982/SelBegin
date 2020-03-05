package pac1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class MwindowHandle {
	
	public static void main (String[]args)
{
	System.setProperty("webdriver.chrome.driver","C://Users//Phonato -Shuchi//Desktop//chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	WebElement login = driver.findElement(By.id("loginbutton"));
	Actions ac = new Actions(driver);
	ac.keyDown(Keys.CONTROL).click(login).keyUp(Keys.CONTROL).build().perform();
	String current_window_address = driver.getWindowHandle();
	//System.out.println(" Current window address is " + current_window_address );
	Set<String>all_window = driver.getWindowHandles();
	 System.out.println("Before switching current address is " + driver.getCurrentUrl());	
	 System.out.println("Total tabs opened are " + all_window.size());
		
		for(String s :all_window)
		
		{
			driver.switchTo().window(s);
		}
		
	    System.out.println("After switching url is "+driver.getCurrentUrl());
}

}
