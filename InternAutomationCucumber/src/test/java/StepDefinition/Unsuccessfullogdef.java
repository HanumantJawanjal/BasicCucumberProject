
  package StepDefinition;
  
  import org.junit.Assert; 
  import org.openqa.selenium.WebDriver;
  
  import Main.BaseClass; 
  import Page.LoginPage; 
  import io.cucumber.java.en.Given; 
  import io.cucumber.java.en.Then; 
  import io.cucumber.java.en.When;
  
  public class Unsuccessfullogdef {
  
  
  private WebDriver driver; 
  private LoginPage obj1;
  
  
  public Unsuccessfullogdef() 
  { this.driver = BaseClass.getdriver(); 
  obj1 = new LoginPage(driver); }
  
  
  
  @Given("User is on Login Page of website")
  public void userIsOnLoginPageofwebsiteaa() {
  
  obj1=new LoginPage(driver);
  
  }
  
  @When("user enter invalid credentials in mobile_number field") 
  public void userEntersInvalidCredentialsInMobileNumberField() {
  
  obj1.unsuccessfullogin();
  
  }
  
  @When("click on Request OTP button") 
  public void clickOnRequestOTPButton() {
  obj1.clickSubmit(); }
  
  @Then("Error message should appear on screen and account access denied")
  public void errorMessageShouldAppear() {
  
  String a=obj1.errortext.getText();
  
  Assert.assertEquals("Login Unsuccessful","Authentication failed.",a);
  
  
  }
  
  }
 