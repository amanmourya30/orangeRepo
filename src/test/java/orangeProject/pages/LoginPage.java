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
	
	@FindBy(linkText="Log out")
	WebElement logoutBtn;
	
	public void logout() {
		logoutBtn.click();
		}
	
	public void performLogin(String usr, String pwd) {
		username.sendKeys(usr);
		password.sendKeys(pwd);
		submitBtn.click();
	}

}