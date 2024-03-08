package Main;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class JustPractise {
	static int count;
	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(1000);
		WebElement username= driver.findElement(By.xpath("//*[@name=\"username\"]"));
		Thread.sleep(1000);
		username.click();
		username.sendKeys("Admin");
		WebElement password = driver.findElement(By.xpath("//*[@name=\"password\"]"));
		password.click();
		password.sendKeys("admin123");
		driver.findElement(By.xpath("//*[@type=\"submit\"]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class=\"oxd-main-menu --fixed\"]//following::ul[1]/li[1]/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//*[text()=\"-- Select --\"])[1]")).click();
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//div[@role='listbox']//div"));
		for (WebElement webElement : list) {
			String options = webElement.getText(); 
			System.out.println(options);
			if(webElement.getText().equals("Admin")) {
				webElement.click();
				break;}
		
		
		
		
//		driver.get("https://generic-ui.com/demo");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//*[@class='gui-select-container']")).click();
//		Actions action = new Actions(driver);
//		Thread.sleep(1000);
////		driver.findElement(By.xpath("//*[@class='gui-options-list gui-downward gui-options-opened']/div[2]"));
//		((JavascriptExecutor)driver).executeScript("arguments[0].click();", driver.findElement(By.xpath("//*[@class='gui-options-list gui-downward gui-options-opened']/div[1]")));
//		
////		driver.findElement(By.xpath("//*[@placeholder='Project search']")).click();
////		action.moveToElement(driver.findElement(By.xpath("//*[@class='gui-options-list gui-downward gui-options-opened']/div[2]")));
////		action.moveToElement(element).click().build().perform();
////		 driver.findElement(By.xpath("//*[@class='gui-options-list gui-downward gui-options-opened']/div[2]")).click();
////		List<WebElement> droplist = driver.findElements(By.xpath("//*[@class='gui-options-list gui-upward gui-options-opened']/div"));
////		for (WebElement webElement : droplist) {
////			System.out.println(webElement);
////			if(webElement.getText().equals(" 1000 Rows")) {
////				Thread.sleep(1000);
////				webElement.click();
////				break;
////			}
////		}
//		//Get project name, project id and progress % where Project Status is Active
//		for (int i = 1; i <=100; i++) {
////			
//			Thread.sleep(1000);
//				WebElement row = driver.findElement(By.xpath("//*[@class='gui-structure-container gui-structure-content']/div/div/div/div["+i+"]/div[1]"));
////				for (int j = 1; j < args.length; j++) {
//				//*[@class='gui-structure-container gui-structure-content']/div/div/div/div[1]/div[1]				
//				WebElement checkbox = driver.findElement(By.xpath("//*[@class='gui-structure-container gui-structure-content']/div/div/div/div["+i+"]/div[1]"));
//					WebElement status = driver.findElement(By.xpath("//*[@class='gui-structure-container gui-structure-content']/div/div/div/div["+i+"]/div[6]"));
//					
//					  if(status.getText().equals("Active")) {
//						 System.out.println("Status is "+ status.getText());
//						 String projectName=  driver.findElement(By.xpath("//*[@class='gui-structure-container gui-structure-content']/div/div/div/div["+i+"]/div[3]")).getText();
//						 System.out.println("Status is "+ projectName);
//						 String projectId =driver.findElement(By.xpath("//*[@class='gui-structure-container gui-structure-content']/div/div/div/div["+i+"]/div[5]")).getText();
//						 System.out.println("Status is "+ projectId);
//						 String progress =driver.findElement(By.xpath("//*[@class='gui-structure-container gui-structure-content']/div/div/div/div["+i+"]/div[9]")).getText();
//						 System.out.println("Status is "+ progress);
//						 
////						 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));		   
////						 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(checkbox)); 
////						 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
////						 checkbox.click();
//						 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));		   
//						 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(status)); 
//						 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", status);
//						 count++;
//					  }
//					
//					
////				}
//               
//			
//			
//		}
//		driver.quit();
		

	 }

   }
}


