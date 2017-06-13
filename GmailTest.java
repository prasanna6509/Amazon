package cucumberTraining;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class GmailTest {
	
	public static WebDriver driver;
	 
	
	@Before
	public void openbrowser(){
		
		System.setProperty("webdriver.chrome.driver","C:\\Softwares\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	@After
	public void closebrowser(){
//		driver.close();
		
	}
}
