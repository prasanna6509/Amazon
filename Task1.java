package Yashu;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Task1 
{
static  WebDriver driver;

	public void open()
	{
		System.setProperty("webdriver.chrome.driver","C:/prasanna/chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
    }
	
	  public Task1(WebDriver driver)
	  {
		  Task1.driver=driver;
	  }
	  public Task1() {
		
	}
	  public WebDriver getdriver(){
		  return Task1.driver;
	  }
     }


