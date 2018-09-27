package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	private WebDriver driver;

	public Dropdown(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#dropdown")
	WebElement dropdown;
	
	public void selectOption() throws InterruptedException {
		Select sel = new Select(dropdown);
		sel.selectByVisibleText("Option 1");
		Thread.sleep(3000);
	}

}
