package Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AddressPage {

	private WebDriver driver;
	
	@FindBy(xpath="//a[@title='Add my first address']")
	private WebElement AddAddressButton;
	
	@FindBy(id="firstname")
	private WebElement FirstName;
	
	@FindBy(id="lastname")
	private WebElement LastName;
	
	@FindBy(id="company")
	private WebElement Company;
	
	@FindBy(id="address1")
	private WebElement Address;

	@FindBy(id="address2")
	private WebElement Address2;
	
	@FindBy(id="city")
	private WebElement City;
	
	@FindBy(id="postcode")
	private WebElement PostCode;
	
	@FindBy(id="phone")
	private WebElement HomePhone;
	
	@FindBy(id="phone_mobile")
	private WebElement PhoneNumber;
	
	@FindBy(id="other")
	private WebElement AdditionalInformation;
	
	@FindBy(id="alias")
	private WebElement Title;
	
	@FindBy(id="id_state")
	private WebElement State;
	
	@FindBy(id="id_country")
	private WebElement Country;
	
	@FindBy(id="submitAddress")
	private WebElement SubmitButton;
	
	public AddressPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void addaddress() throws Throwable {
		WebElement account = driver.findElement(By.xpath("//*[@title=\"My account\"]"));
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true);", account);
		account.click();
		Thread.sleep(3000);
		AddAddressButton.click();
	}
	
	public void addressdetail() {
		FirstName.sendKeys("Om");
		LastName.sendKeys("patel");
		Company.sendKeys("ProductSquads");
		Address.sendKeys("None");
		Address2.sendKeys("None2");
		City.sendKeys("City");
		
		Select state=new Select(State);
		state.selectByVisibleText("Alaska");
		
		Select country=new Select(Country);
		country.selectByVisibleText("United States");
		
		PostCode.sendKeys("546565");
		HomePhone.sendKeys("54658965855");
		PhoneNumber.sendKeys("5465236524");
		AdditionalInformation.sendKeys("Empty");
		Title.sendKeys("First Address");
	}
	
	public void submitaddress() {
		SubmitButton.click();
	}
}
