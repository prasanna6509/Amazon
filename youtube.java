package takingscreenshot;

import library.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class youtube {
		public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.gecko.driver","C:/prasanna/geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.youtube.com");
		Utility.captureScreenshot(driver,"browserstarted");
		
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys("telugu movies");
        Utility.captureScreenshot(driver,"website search");	
        driver.quit();

		
	}
}
