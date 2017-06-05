package com.FirstExam;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Yashu.Task1;


public class pathforHome {

	public WebDriver driver;
		public void xpath()
		{
	    this.driver=new Task1().getdriver();
	    driver.findElement(By.xpath("//input[@id='headerSearch']")).sendKeys("hammer");
	    driver.findElement(By.xpath("//button[@title='Submit Search']")).click();
	    driver.findElement(By.xpath("//div[@id='layout']/div[2]/div/div[3]/div[1]")).click();
	  String  p=driver.findElement(By.xpath("//div[@id='products']/div/div[6]/div/div/span")).getAttribute("innerHTML");
	  System.out.println(p);
	  driver.findElement(By.xpath("//div[@id='products']/div/div[6]/div/div[10]/div/a/span")).click();

}
}
