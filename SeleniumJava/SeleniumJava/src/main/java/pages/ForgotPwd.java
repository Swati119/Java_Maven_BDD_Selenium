package pages;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.xml.sax.SAXException;

import utils.XmlUtils;

public class ForgotPwd {
	private WebDriver driver;
	XmlUtils xUtils = new XmlUtils();

	public ForgotPwd(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "input[name='email']")
	WebElement emailBox;

	public void fillEmail() throws IOException, ParserConfigurationException, SAXException, InterruptedException {
		emailBox.sendKeys(xUtils.getXmlKeyValue("email"));
	}
}
