package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Resources.BaseClass;

public class SignInApp extends BaseClass {
	public SignInApp() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Sign In']")
	private WebElement SignIn;
	@FindBy(name = "username")
	private WebElement username;
	@FindBy(name = "password")
	private WebElement password;
	@FindBy(xpath = "//input[@value='Login']")
	private WebElement login;
	
	

}
