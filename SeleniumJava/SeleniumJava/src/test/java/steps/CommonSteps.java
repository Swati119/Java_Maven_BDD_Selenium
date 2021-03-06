package steps;

import cucumber.api.java.en.Given;
import pages.WelcomeToInternet;

public class CommonSteps extends BaseSteps {
	WelcomeToInternet welcomePage = new WelcomeToInternet(driver);

	@Given("^I launch the test automation website$")
	public void i_launch_the_test_automation_website() throws Throwable {
		welcomePage.launchURL();
	}
}
