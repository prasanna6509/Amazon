package webdriverProject;
	

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:/prasanna/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ladies shoes");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		int size=driver.findElements(By.tagName("iframe")).size();
		System.out.println("frames in todays deal are "+size);
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//img[@id='staticImage']")).click();
		driver.switchTo().defaultContent();
		driver.quit();
		
	  
	}	
	
}