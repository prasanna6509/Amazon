package cucumberTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepdefinitioforAmazon {
	WebDriver driver;
	@Given("^open amazon website$")
	public void open_amazon_website() throws Throwable {
	    driver = new ChromeDriver();
	    driver.get("http://www.amazon.com");
	}

	@When("^search for \"([^\"]*)\"$")
	public void search_for_girls_shoes(String text) throws Throwable {
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("girls shoes");
		
	   
	}

	@Then("^click on search$")
	public void click_on_search() throws Throwable {
	driver.findElement(By.xpath("//input[@type='submit']")).click();}


}
