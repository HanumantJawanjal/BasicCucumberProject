package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	private WebDriver driver;
	
	@FindBy(id="search_query_top")
	private WebElement SearchBox;
	
	@FindBy(name = "submit_search")
	private WebElement SearchButton;
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void SearchProcess() {	
		SearchBox.sendKeys("T-Shirt");
	}
	
	public void SearchClick() {
		SearchButton.click();
	}
}
