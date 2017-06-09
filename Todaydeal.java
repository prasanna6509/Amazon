package webdriverProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Todaydeal {
	 
	 public Todaydeal(String Xpath) throws InterruptedException{
		 System.setProperty("webdriver.chrome.driver","C:/prasanna/chromedriver.exe");
		 WebDriver driver= new ChromeDriver();
		 driver.get("http://amazon.com");
		 Thread.sleep(10000);
		 WebElement webElement =driver.findElement(By.xpath(Xpath));
		 webElement.click();
		 driver.quit();
		
}
	
}
	



	    
		
	       




