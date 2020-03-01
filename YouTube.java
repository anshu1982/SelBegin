package pac1;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class YouTube {
	

	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C://Users//Phonato -Shuchi//Desktop//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
	    driver.manage().window().maximize();	
	    
	    List<WebElement>ls = driver.findElements(By.id("video-title"));
	    System.out.println("Totral number of Videos are " +ls.size());
	    ls.get(3).click();
	    
	
	
	
	}	

}
