package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasicAuth;
import pages.Checkboxes;
import pages.WelcomeToInternet;

public class WelcomeToInternetSteps extends BaseSteps {
	WelcomeToInternet welcomePage = new WelcomeToInternet(driver);
	BasicAuth basicAuth = new BasicAuth(driver);
	Checkboxes check = new Checkboxes(driver);
	
	@When("^I login with valid credentials$")
	public void i_login_with_valid_credentials() throws Throwable {
		// Using the credentials in the URL
		welcomePage.loginParams();
	}

	@Then("^I should see the correct message on page$")
	public void i_should_see_correct_message_on_page() throws Throwable {
		basicAuth.verifyLoginMessage();
	}

	@When("^I navigate to the checkbox page$")
	public void i_navigate_checkbox_page() throws Throwable {
		welcomePage.clickCheckboxesLink();
	}

	@Then("^I should check both the checkboxes$")
	public void i_should_check_both_checkboxes() throws Throwable {
		check.checkAndClick();
	}
}
