package orangeProject.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import orangeProject.utility.BrowserFactory;
import orangeProject.utility.ConfigDataProvider;

public class BaseTest {
	public WebDriver driver;
	
	@BeforeClass
	public void setup() {
		driver = BrowserFactory.startApplication(driver, config.getBrowser(), config.getTestUrl());
	}
	
	@AfterClass
	public void tearDown() {
		BrowserFactory.quitBrowser(driver);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	ConfigDataProvider config= new ConfigDataProvider();
}
