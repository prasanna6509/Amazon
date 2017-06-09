package webdriverProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoQatest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:/prasanna/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demoqa.com");
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.xpath("//a[text()='Registration']"));
		element.click();
		element = driver.findElement(By.xpath("//input[@name='first_name']"));
		element.sendKeys("PRASANNA");
	    element = driver.findElement(By.xpath("//input[@name='last_name']"));
	    element.sendKeys("KASARAM");
	    element = driver.findElement(By.xpath("//input[@value='single']"));
		element.click();
		element = driver.findElement(By.xpath("//input[@value='dance']"));
		element.click();
		element = driver.findElement(By.xpath("//select[@id='dropdown_7']/option[@value='United States']"));
		element.click();
		element = driver.findElement(By.xpath("//select[contains(@id,'mm_date')]/option[@value='1']"));
        element.click();
        element = driver.findElement(By.xpath("//select[contains(@id,'dd_date')]/option[@value='14']"));
        element.click();
        element = driver.findElement(By.xpath("//select[contains(@id,'yy_date')]/option[@value='1993']"));
        element.click();
        element = driver.findElement(By.xpath("//input[@id='phone_9']"));
        element.sendKeys("8162996509");
        element = driver.findElement(By.xpath("//input[@id='username']"));
        element.sendKeys("prasannakasaram");
        element = driver.findElement(By.xpath("//input[@id='email_1']"));
        element.sendKeys("prasannakasaram@gmail.com");
        element = driver.findElement(By.xpath("//textarea[@name='description']"));
        element.sendKeys("completed masters in computer science");
        element = driver.findElement(By.xpath("//input[@id='password_2']"));
        element.sendKeys("Kasaram.6509");
        element = driver.findElement(By.xpath("//input[@id='confirm_password_password_2']"));
        element.sendKeys("Kasaram.6509");
       driver.quit();
        
      
		
		
	}
	

}
