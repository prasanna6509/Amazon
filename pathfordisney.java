package com.Disney;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Yashu.Task1;

public class pathfordisney {
	public WebDriver driver;
	public void xpath() throws InterruptedException
	{
    this.driver=new Task1().getdriver();
    driver.findElement(By.xpath(".//*[@id='radioRateCarouselid-base']/div/div/div/span/div")).click();
    driver.findElement(By.xpath(".//*[@id='radioRateCarouselid-base']/div/div/div/div/span/div")).click();
    driver.findElement(By.xpath("//*[@id='radioRateCarouselid-base']/div/div/div/span/div")).click();
	driver.findElement(By.xpath(".//*[@id='pepDayScroller_numDays']/div[6]/a/div[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='numberOfTicketsModule']/div/div[2]/div[1]/div/button[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='numberOfTicketsModule']/div/div[2]/div[1]/div/button[2]")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(".//*[@id='numberOfTicketsModule']/div/div[2]/div[2]/div/button[2]")).click();
	driver.findElement(By.xpath(".//*[@id='numberOfTicketsModule']/div/div[2]/div[2]/div/button[2]")).click();
	Actions abc=new Actions(driver);
	WebElement element=driver.findElement(By.xpath(".//*[@id='selectThemeParkTicketModule']/div/div[2]/button[1]"));
	abc.moveToElement(element).build().perform();
	WebElement element1=driver.findElement(By.xpath(".//*[@id='selectThemeParkTicketModule']/div/div[2]/button[2]"));
	abc.moveToElement(element1).build().perform();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='selectThemeParkTicketModule']/div/div[2]/button[1]/div[2]")).click();
	Thread.sleep(5000L);
	driver.findElement(By.xpath("//*[@id='addToCart']")).click();

	} 
}



