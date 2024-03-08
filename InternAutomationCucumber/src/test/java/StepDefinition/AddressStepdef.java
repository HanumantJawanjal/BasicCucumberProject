package StepDefinition;

import org.openqa.selenium.WebDriver;

import Main.BaseClass;
import Page.AddressPage;
import Page.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddressStepdef {
	
	
	private WebDriver driver;
	private AddressPage ap;
	//private LoginPage lp;
	
	public AddressStepdef() {
		
		this.driver=BaseClass.getdriver();
		
      //  this.lp = new LoginPage(driver);
	}
	

	@Given("user is on account page")
	public void user_is_on_account_page() {
		
		//lp=new LoginPage(driver);
		//lp.performlogin();
		//lp.clickSubmit();
		//ap=new AddressPage(driver);
		this.ap = new AddressPage(driver);
	}
	@When("user click on ADD MY firST ADDRESS button")
	public void user_click_on_add_my_fir_st_address_button() throws Throwable {
		ap.addaddress();
	}
	@When("provide valid Address details in address form")
	public void provide_valid_address_details_in_address_form() {
		ap.addressdetail();

	}
	@When("click on Save")
	public void click_on_save() {
		
		ap.submitaddress();


		
	}
	@Then("user can add a valid new address")
	public void user_can_add_a_valid_new_address() {
		
		System.out.println();


		
	}




}
