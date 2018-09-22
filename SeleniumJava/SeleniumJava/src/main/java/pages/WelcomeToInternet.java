package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomeToInternet {
	private WebDriver driver;

	public WelcomeToInternet(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css ="a[href='/abtest']")
	WebElement abTestingLink;
	
	@FindBy(css ="a[href='/basic_auth']")
	WebElement basicAuthLink;
	
	@FindBy(css ="a[href='/broken_images']")
	WebElement brokenImageLink;
	
	@FindBy(css ="a[href='/challenging_dom']")
	WebElement challengingDomLink;
	
	public void clickOnBasicAuth() {
		basicAuthLink.click();
	}
	
	
	
}
