package steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import utils.PropertiesUtils;

public class BaseSteps {
	public static WebDriver driver;
	PropertiesUtils propUtil = new PropertiesUtils();

	public void initiateDriver() throws IOException {
		// initiating driver
		if (propUtil.getPropValue("browser").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver (2).exe");
			driver = new ChromeDriver();
		} 
		else if (propUtil.getPropValue("browser").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\geckodriver-v0.22.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	public void tearDown() {
		// destroy driver
		driver.quit();
	}

}
