package cucumberTraining;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import cucumber.api.java.en.Given;
	import cucumber.api.java.en.Then;
	import cucumber.api.java.en.When;

public class Stepdefinitionfordropdown
{
    WebDriver driver;
 @Given("^open facebook website$")
public void open_facebook_website() throws Throwable {
System.setProperty("webdriver.chrome.driver","C:/prasanna/chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("http://www.facebook.com");
		}
@When("^search for month$")
		public void month() throws Throwable 
           {
			driver.findElement(By.xpath("//select[@id='month']")).sendKeys("jan");
			}
@Then("^click on month$")
		public void click() throws Throwable 
     {
		
		//driver.findElement(By.xpath("//input[@type='submit']")).click();}
	}


}
