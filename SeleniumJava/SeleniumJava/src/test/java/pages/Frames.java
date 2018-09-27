package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Frames {
private WebDriver driver;

public Frames(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
}

@FindBy(css="a[href='/iframe']")
WebElement iFrameLink;

public void clickIFrameLink() {
	iFrameLink.click();
}


}
