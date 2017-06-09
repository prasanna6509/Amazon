package webdriverProject;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import practice.Item;

public class Y 
{

	public static void main(String[] args ) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:/prasanna/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("i pad air 2 case");
		driver.findElement(By.xpath("//input[@value='Go']")).click();
		driver.findElement(By.xpath("//div[@id='refinements']/ul[@class='forExpando']/li[1]/a")).click();
		driver.findElement(By.xpath("//input[@id='low-price']")).sendKeys("20");
		driver.findElement(By.xpath("//input[@id='high-price']")).sendKeys("100");
		driver.findElement(By.xpath("//input[@class='leftNavGoBtn']")).click();
		List<Float> pras = new ArrayList<Float>();
		List<Float> ratingList = new ArrayList<Float>();
		List<Item> Items = new ArrayList<Item>();
		Item Item = new Item();
		
	for(int i=1;i<=5;i++)
	{
		Item.Name=driver.findElement(By.xpath("//div[@id='atfResults']/ul/li["+i+"]//a[@class='a-link-normal s-access-detail-page  s-color-twister-title-link a-text-normal']")).getAttribute("title");
		System.out.println(Item.Name);
		String p1= driver.findElement(By.xpath("//div[@id='atfResults']/ul/li["+i+"]//span[@class='a-color-base sx-zero-spacing']")).getAttribute("aria-label");
		System.out.println(p1);
		Item.Price = Float.parseFloat(p1.substring(1));
		pras.add(Item.Price);
		Thread.sleep(5000);
		String p2=driver.findElement(By.xpath("//div[@id='atfResults']/ul/li["+i+"]//div[6]//span[@class='a-icon-alt']")).getAttribute("innerHTML");
		System.out.println(p2);
		
		Item.Rating= Float.parseFloat(p2.substring(0,3));
		ratingList.add(Item.Rating);
		System.out.println(ratingList);
		Assert.assertTrue(Item.Price<100);
		System.out.println("result is between 20-100");
		Collections.sort(pras);
		System.out.println(pras);
		Collections.sort(ratingList);
		System.out.println(ratingList);
		Items.add(Item);
	}
	int i,j;
	for(i=0;i<5;i++)
		for(j=0;j<5;j++)
	if(Items.get(i).Price<Items.get(j).Price&&Items.get(i).Rating>Items.get(j).Rating){
		System.out.println("The Best Item is:"+Items.get(i).Name);
	}
	}

}



	


