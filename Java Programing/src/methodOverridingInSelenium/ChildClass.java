package methodOverridingInSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildClass extends ParentClass{
	
	WebDriver driver;
	
	public void launchApp()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SinhaVai\\Desktop\\Selenium Jar\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.yatra.com/");
	}

}
