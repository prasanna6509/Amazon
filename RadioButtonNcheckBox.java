package webdriverProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonNcheckBox 
{

public static void main(String[] args) throws InterruptedException 
{
	System.setProperty("webdriver.chrome.driver","C:/prasanna/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://www.ironspider.ca/forms/checkradio.htm");
	//driver.findElement(By.xpath("//input[@value='blue']")).click();
	Thread.sleep(5000);
	List<WebElement> checkbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
	////////**********checkbox and radio**********//////////
	for(int i=0;i<checkbox.size();i++)
	{
		checkbox.get(i).click();
	}
	Thread.sleep(5000);
	List<WebElement> radio=driver.findElements(By.xpath("//input[@type='radio']"));
	radio.get(1).click();
	driver.quit();
	
}
}

