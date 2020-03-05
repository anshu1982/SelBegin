package pac1;
import org.openqa.selenium.chrome.ChromeDriver;



public class MTextBoxes {
	
	public static void main(String args[])
	{
		System.setProperty("webdriver.chrome.driver","C://Users//Phonato -Shuchi//Desktop//chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
	    driver.manage().window().maximize();

}
