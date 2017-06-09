package webdriverProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukriappli {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:/prasanna/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://naukri.com");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//input[@value='Register with us']"));
		element.click();
	  driver.findElement(By.xpath("//button[@title='I am a Fresher']")).click();
		driver.quit();

	}

}
