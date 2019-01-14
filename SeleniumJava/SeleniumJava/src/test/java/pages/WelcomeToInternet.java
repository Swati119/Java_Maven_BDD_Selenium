package pages;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Keyboard;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeToInternet {
	private WebDriver driver;

	public WelcomeToInternet(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "a[href='/abtest']")
	WebElement abTestingLink;

	@FindBy(css = "a[href='/basic_auth']")
	WebElement basicAuthLink;

	@FindBy(css = "a[href='/broken_images']")
	WebElement brokenImageLink;

	@FindBy(css = "a[href='/challenging_dom']")
	WebElement challengingDomLink;

	@FindBy(css = ".example>h3")
	WebElement abTestText;

	@FindBy(css = "a[href='/checkboxes']")
	WebElement checkboxesLink;
	
	@FindBy(css = "a[href='/dropdown']" )
	WebElement dropdownLink;
	
	@FindBy(css = "a[href='/context_menu']")
	WebElement contextLink;
	
	@FindBy(css = "a[href='/forgot_password']")
	WebElement forgotPwdLink;
	
	@FindBy(css = "a[href='/frames']")
	WebElement framesLink;
	
	@FindBy(xpath = "//input[@id='Vnd_Id']")
	WebElement test;
	
		 


	public void clickOnBasicAuth() {
		basicAuthLink.click();
	}

	public void clickOnabTestingLink() {
		abTestingLink.click();
	}

	public void clickCheckboxesLink() {
		checkboxesLink.click();
	}
	
	public void clickDropdownLink() {
		dropdownLink.click();
	}
	
	public void clickContextLink() {
		contextLink.click();
	}
	
	public void clickForgotPwdLink() {
		forgotPwdLink.click();
	}
	
	public void clickFramesLink() {
		framesLink.click();
	}

	public void getAbTestingText() {

		System.out.println(abTestText.getText());
	}

	public void launchURL() {
		driver.get("https://uat.webline.co.uk/WeblineUI/Account/LogOn");
		System.out.println("Launched");

	}
	
	public void test() {
		test.sendKeys("Ankur");
	}

	public void loginParams() {
		driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
		driver.manage().window().maximize();
	}

	
}
