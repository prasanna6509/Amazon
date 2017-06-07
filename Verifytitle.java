package assertiondemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Verifytitle {
    @Test
	public void verifytitlename() {
    	System.setProperty("webdriver.chrome.driver","C:/prasanna/chromedriver.exe");
    	WebDriver driver= new ChromeDriver();
    	driver.manage().window().maximize();
    	driver.get("http://www.naukri.com");
    	String my_title=driver.getTitle();
    	System.out.println("title is "+my_title);
    	String expected_title="Jobs - Recruitment - Job Search - Employment - Job Vacancies - Naukri.com";
    	Assert.assertTrue(my_title.contains("Jobs - Recruitment - Job Search"));
    	System.out.println("test completed and verified");
    	driver.quit();


	}

}
