package cucumberTraining;

import cucumber.api.CucumberOptions;

import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions (
		monochrome = true,
		features = "src/test/java/features", 
		plugin = {"pretty", "html:target/cucumber-html-report"}
		//glue = " ",
//		tags = "@GmailLogin"
		)
public class CukesRunnerTest extends AbstractTestNGCucumberTests {

}
