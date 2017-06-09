package webdriverProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookDOB {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/prasanna/chromedriver.exeC:/prasanna/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://facebook.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Jan");
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys("14");
		Thread.sleep(5000);
		
		FacebookDOB.prasanna();
	
		
		//*****DROPDOWN LIST BY MUKESH VERY IMPORTANT*****//
	
		
	}
	
	public static void prasanna(){
		System.setProperty("webdriver.chrome.driver","C:/prasanna/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebElement dropdown= driver.findElement(By.id("year"));
		
		Select year_a= new Select(dropdown);
			year_a.selectByValue("1992");
			driver.quit();
	}
		
}

		


