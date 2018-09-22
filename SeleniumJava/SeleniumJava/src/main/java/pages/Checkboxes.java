package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class Checkboxes {
	private WebDriver driver;

	public Checkboxes(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBys(@FindBy(css = "#checkboxes>input"))
	List<WebElement> listCheckBoxes;
	
	public void checkAndClick() throws InterruptedException {
		for(WebElement ele : listCheckBoxes) {
			//check if the checkbox is already selected
			if(ele.isSelected()) {
				System.out.println("Already selected");
				continue;
			}
			else {
				System.out.println("new checked");
				ele.click();
			}
		}
	}
	
}
