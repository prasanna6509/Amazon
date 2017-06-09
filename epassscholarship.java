package webdriverProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class epassscholarship {

	public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:/prasanna/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='q'])")).sendKeys("epass kapu login");
        driver.findElement(By.xpath("//button[@class='sbico-c']")).click();
        Thread.sleep(5000);
        WebElement x=driver.findElement(By.xpath("//*[text()='ePASS Home Page']"));
        x.click();
        Thread.sleep(5000);
        driver.findElement(By.linkText("//img[@src=https://apepass.cgg.gov.in:443/images/overseaskapu.jpg']")).click();
        driver.quit();
        
	}
	
}

