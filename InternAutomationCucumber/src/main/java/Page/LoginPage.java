package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Main.BaseClass;

public class LoginPage extends BaseClass {
	
	private WebDriver driver;
	
	@FindBy(className="login")
	private  WebElement SignInButton;
	
	@FindBy(id="email")
	private  WebElement EmailInput;
	
	@FindBy(id="passwd")
	private  WebElement PasswdInput;
	
	@FindBy(id="SubmitLogin")
	private  WebElement SubmitButton;
	
	@FindBy(xpath="//span[contains(text(),'A a')]")
	public WebElement accounttext;
	
	@FindBy(xpath="//li[contains(text(),'Authentication failed.')]")
	public WebElement errortext;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	    PageFactory.initElements(driver, this);
	}

public void performlogin() {
			SignInButton.click();
	        EmailInput.clear();
	        EmailInput.sendKeys("feboxe7203@minhlun.com");
	        PasswdInput.clear();
	        PasswdInput.sendKeys("hello123");
}

public void clickSubmit() {
	 	SubmitButton.click();
}

public void unsuccessfullogin() {
	SignInButton.click();
    EmailInput.clear();
    EmailInput.sendKeys("feboe7203@minhlun.com");
    PasswdInput.clear();
    PasswdInput.sendKeys("hello13");
}
}
