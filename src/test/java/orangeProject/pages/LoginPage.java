package orangeProject.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[contains(text(),'Test Login Page')]")
	WebElement loginPageLinkText;
	
	@FindBy(id="username")
	WebElement username;
	@FindBy(id="password")
	WebElement password;
	@FindBy(id="submit")
	WebElement submitBtn;
	
	public void performLogin(String usr, String pwd) {
		loginPageLinkText.click();
		username.sendKeys(usr);
		password.sendKeys(pwd);
		submitBtn.click();
	}

}