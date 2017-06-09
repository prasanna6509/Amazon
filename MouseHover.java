package webdriverProject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args)
	{

		
	}
	
	public MouseHover(String path, String address, String Xpath, String Driver) {
		
		System.setProperty(Driver,path);
		WebDriver driver = new ChromeDriver();
		driver.get(address);
	   WebElement mousehover=driver.findElement(By.xpath(Xpath));
	   try {
		Thread.sleep(7000);
	} catch (InterruptedException e) {
		
		e.getMessage();
	}
		Actions actions = new Actions(driver);
		actions.moveToElement(mousehover).perform();
		driver.quit();
	}

}
