package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Iframe {
	private WebDriver driver;

	public Iframe(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css="#tinymce")
	WebElement textInFrame;
	
	@FindBy(css="#mce_0_ifr")
	WebElement iframe;
	
	public void writeInFrame() throws InterruptedException {
		driver.switchTo().frame(iframe);
		textInFrame.sendKeys("Iframe is active");			
	}
}
