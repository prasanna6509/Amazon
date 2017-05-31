package Yashu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Task2 
{ 
	public WebDriver driver;
	public void xpath()
	{
    this.driver=new Task1().getdriver();
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("i pad air 2 case");
	driver.findElement(By.xpath("//input[@value='Go']")).click();
	driver.findElement(By.xpath("//div[@id='refinements']/ul[@class='forExpando']/li[1]/a")).click();
	driver.findElement(By.xpath("//input[@id='low-price']")).sendKeys("20");
	driver.findElement(By.xpath("//input[@id='high-price']")).sendKeys("100");
	driver.findElement(By.xpath("//input[@class='leftNavGoBtn']")).click();
}
}
