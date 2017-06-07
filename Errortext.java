package assertiondemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Errortext {

	public static void main(String[] args)  throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/prasanna/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.gmail.com");
		driver.findElement(By.xpath("//input[@id='next']")).click();
		Thread.sleep(5000);
     String actual_error= driver.findElement(By.xpath("//*[text()='Please enter your email. ']")).getText();
     String expected_error="please enter your email.";
     Assert.assertTrue(actual_error.contains("please enter your email"));
     System.out.println("fail case print me");
     driver.quit();
	}

}
