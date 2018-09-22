package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class BasicAuth {
	private WebDriver driver;

	public BasicAuth(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css=".example>p")
	WebElement basicAuthMessage;
	
	public void verifyLoginMessage() {
		Assert.assertEquals("Congratulations! You must have the proper credentials.", 
				basicAuthMessage.getText());
		
	}
	
}
