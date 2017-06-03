package com.mounika;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Yashu.Task1;

public class Xpathforupload 
{
	public WebDriver driver;
	public void path(String userName,String passWord) throws InterruptedException
	{
    this.driver=new Task1().getdriver();
    driver.findElement(By.xpath("//input[@type='email']")).sendKeys(userName);
    driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
    Thread.sleep(5000);
    driver.findElement(By.xpath("//input[@type='password']")).sendKeys(passWord);
    driver.findElement(By.xpath("//span[@class='RveJvd snByac']")).click();
   // driver.findElement(By.xpath("//*[text()='COMPOSE']")).click();
   // driver.findElement(By.xpath("//div[@data-tooltip='Attach files']")).click();
    driver.findElement(By.xpath("//a[@title='Google apps']")).click();
	driver.findElement(By.xpath("//*[text()='Calendar']")).click();
	driver.findElement(By.xpath("//div[@id='calmaster']/div[8]/div[3]/div[2]/div/div[2]/div[1]/div[2]/div/div/div/div[2]")).click();
	
}
}

