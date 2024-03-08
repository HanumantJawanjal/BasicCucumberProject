package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Main.BaseClass;
import Page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginDef {
	
	private WebDriver driver;
    private LoginPage obj;
   
	public LoginDef() {
        this.driver = BaseClass.getdriver();
        obj = new LoginPage(driver);
    }

	@Given("User on is on site")
	public void user_on_is_on_site() {
		obj=new LoginPage(driver);
	}
	@When("user enter valid details")
	public void user_enter_valid_details() {
		obj.performlogin(); 
	}
	@When("click submit")
	public void click_submit() {
		obj.clickSubmit(); 
	}
	@Then("user can access account")
	public void user_can_access_account() {		
		 String a=obj.accounttext.getText();		  
		 Assert.assertEquals("Login Unsuccessful","A a",a);	    
	}

	 

	   
	




}
