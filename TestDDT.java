package DDF;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDDT {
	WebDriver driver= new ChromeDriver();
	
@Test(dataProvider="testdata")
	public void TestChromeDriver(String searchdata) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver","C:/prasanna/chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    String name="https://www.youtube.com";
		driver.get(name);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='masthead-search-term']")).sendKeys(searchdata);
		driver.findElement(By.xpath("//span[contains(@class,'yt-uix-button-content')]//following::button[@type='submit']")).click();	
	}
	@DataProvider(name="testdata")
   public Object[] TestDataFeed(){
   
   Object [] youtubedata = new Object[2];
   youtubedata[0]="telugu movies";
   youtubedata[1]="hindi movies";
   youtubedata[2]="english movies";
   return youtubedata;
   
   }
   
}
