package cucumberTraining;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinitionTest {

	WebElement element;
	WebDriver driver = GmailTest.driver;
	String url = "http://www.gmail.com/";
	
	@Given("^I have the current google url$")
	public void i_have_the_current_google_url() throws Throwable {
	  
		System.out.println("my current url is: " + url);
	}

	@When("^I open the google url$")
	public void i_open_the_google_url() throws Throwable {
		driver.get(url);
	   
	}

	@Then("^google should be displayed$")
	public void google_should_be_displayed() throws Throwable {
		  String currentUrl = driver.getCurrentUrl();
		  System.out.println(currentUrl);
		  Assert.assertEquals(url, url);
		  Reporter.log(" i have the correct url for test google");
		  
	}
	
	@Then("^google should be displayed1$")
	public void google_should_be_displayed1() throws Throwable {
		  String currentUrl = driver.getCurrentUrl();
		  System.out.println(currentUrl);
		  Assert.assertEquals(url, currentUrl);
		  Reporter.log(" i have the correct url for test google");
		  
	}
	
	@Given("^I am at the Login screen$")
	public void i_am_at_the_Login_screen(){
		driver.get(url);
	}

	@And("I enter EmailID as (.*)$")
	public void  i_enter_EmailID_as(String email){
		element =driver.findElement(By.name("Email"));
		element.sendKeys(email);
	}
	
}
