package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BasicAuth;
import pages.Checkboxes;
import pages.ContextMenu;
import pages.Dropdown;
import pages.WelcomeToInternet;

public class WelcomeToInternetSteps extends BaseSteps {
	WelcomeToInternet welcomePage = new WelcomeToInternet(driver);
	BasicAuth basicAuth = new BasicAuth(driver);
	Checkboxes check = new Checkboxes(driver);
	Dropdown drop = new Dropdown(driver);
	ContextMenu context = new ContextMenu(driver);
	
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
	
	@When("^I navigate to the dropdown page$")
	public void i_navigate_dropdown_page() throws Throwable {
		welcomePage.clickDropdownLink();
	}

	@Then("^I should select Option1 from the dropdown list$")
	public void i_should_select_option_from_dropdown() throws Throwable {
		drop.selectOption();
	}
	
	@Then("^I navigate to the context menu page$")
	public void i_navigate_to_context_menu_page() throws Throwable {
		welcomePage.clickContextLink();
	}
	
	@When("^I should right click and select option$")
	public void i_right_click_select_option() throws Throwable {
		context.rightClickContext();
	}

	@Then("^I should see a javascript pop messsage$")
	public void i_should_see_js_popup() throws Throwable {
		context.handleJSPopup();
	}
	
	
	
}
