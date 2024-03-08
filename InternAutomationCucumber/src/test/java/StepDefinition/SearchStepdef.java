package StepDefinition;

import org.openqa.selenium.WebDriver;

import Main.BaseClass;
import Page.SearchPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchStepdef {
	private WebDriver driver;
	private SearchPage sp;

	public SearchStepdef() {
		this.driver=BaseClass.getdriver();
		//sp=new SearchPage(driver);
	}
	@Given("user is on homepage")
	public void user_is_on_homepage() {
		sp=new SearchPage(driver);
	}
	@When("enter text in search bar")
	public void enter_text_in_search_bar() {
		sp.SearchProcess();
	}
	@When("click on search")
	public void click_on_search() {
		sp.SearchClick();
	}
	@Then("user get list of product matching that keyword")
	public void user_get_list_of_product_matching_that_keyword() {
		System.out.println();
	}
}
