package webdriverProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sendmail {


	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/prasanna/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("prasanna.4318@gmail.com");
		driver.findElement(By.xpath("//input[@id='next']")).click();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("109e1a0227");
		driver.findElement(By.xpath("//input[@id='signIn']")).click();
		driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
		driver.findElement(By.xpath("//span[@data-tooltip='Select Contacts']//following::textarea[@name='to']")).sendKeys("tchandu.553@gmail.com");
        driver.findElement(By.xpath("//input[@name='subjectbox']")).sendKeys("yem chesthunav????----//sent by first selenium webdriver program//");
        driver.findElement(By.xpath("//*[text()='Send']")).click();
    driver.quit();
	
	}
	
	
	
}
