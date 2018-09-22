package steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class BaseSteps {
	public static WebDriver driver;

	public void initiateDriver() {
		// initiating driver
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver (2).exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void tearDown() {
		// destroy driver
		driver.quit();
	}

}
