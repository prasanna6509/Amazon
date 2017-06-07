package assertiondemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hardassertion {
	WebDriver driver = new ChromeDriver();
    @Test
	public void test1(){
		
		Assert.assertEquals(4, 4,"error you will get ");
		driver.quit();

	}

}
