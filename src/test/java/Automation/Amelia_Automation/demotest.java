package Automation.Amelia_Automation;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class demotest {
	
	@Test
	void test()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Amelia\\Webdrivers\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://www.google.com/");
	}

}
