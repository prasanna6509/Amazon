package takingscreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

public class Listner_1
{
@BeforeTest()
	public void login()
	{
		System.out.println("asdf");
	}
@AfterTest
	public void exit()
	{
		System.out.println("kjh");
	}
@Test(invocationCount=2)
public void open()
{
		 System.setProperty("webdriver.chrome.driver","C:/prasanna/chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 driver.get("http://google.com");
		 driver.quit();
}

	
	  
}	


