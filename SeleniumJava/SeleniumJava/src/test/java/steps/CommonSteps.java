package steps;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import pages.WelcomeToInternet;

public class CommonSteps extends BaseSteps {

	@Given("^I launch the test automation website$")
	public void i_launch_the_test_automation_website() throws Throwable {
		driver.get("http://the-internet.herokuapp.com/");
	}
}
