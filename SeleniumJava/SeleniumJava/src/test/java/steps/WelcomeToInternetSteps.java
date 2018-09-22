package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.WelcomeToInternet;

public class WelcomeToInternetSteps extends BaseSteps{

	
	WelcomeToInternet welcomePage = new WelcomeToInternet(driver);
	@When("^I login with valid credentials$")
	public void i_login_with_valid_credentials() throws Throwable {
	   welcomePage.clickOnBasicAuth();
	}

	@Then("^I should be navigated to the login page$")
	public void i_should_be_navigated_to_the_login_page() throws Throwable {
	   
	}
	
	@When("^I login with invalid credentials$")
	public void i_login_with_invalid_credentials() throws Throwable {
	   
	}

	@Then("^I should be given a worng credentials message$")
	public void i_should_be_given_a_worng_credentials_message() throws Throwable {
	   
	}
}
