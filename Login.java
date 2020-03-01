package pac1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Login {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C://Users//Phonato -Shuchi//Desktop//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	    driver.manage().window().maximize();
	    
	    Actions ac = new Actions(driver);
	    WebElement login = driver.findElement(By.id("loginbutton"));
	    ac.keyDown(Keys.CONTROL).click(login).keyUp(Keys.CONTROL).build().perform();
		
		
	}

}
