package Steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Stepdefinition {
	RemoteWebDriver driver;
@Given("user should enter the URL")
public void user_should_enter_the_url() {
	 driver=new ChromeDriver();
//	 WebDriverWait wait= new WebDriverWait(driver, 10);
	 
	    driver.manage().window().maximize();
	    driver.get("https://www.qafox.com/selenium/selenium-practice/");
	    System.out.println(driver.getTitle()) ;
}

@And("user should click demo site one")
public void user_should_click_demo_site_one() throws Throwable {
	driver.findElement(By.xpath("//a[text()='Click Here']")).click();
	Thread.sleep(3000);
	driver.findElement(By.partialLinkText("Search Terms")).click();
	driver.quit();
}


	
/*@When("user click on what's new")
public void user_click_on_what_s_new() throws Throwable {
	Thread.sleep(3000);
	driver.findElement(By.xpath("//span[text()='Sale']")).click();
	FluentWait<WebDriver> wait;
//	wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//span[text()='Sale']"));
 //Wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//a[@class='level-top ui-corner-all']//span)[1]")));
	//driver.findElement(By.xpath("(//a[@class='level-top ui-corner-all']//span)[1]")).click();
}
*/
/*@And("user selects product")
public void user_selects_product() {
	driver.findElement(By.xpath("(//strong[@class='product-item-name'])[1]")).click();
}

@Then("user should select  {string} and click Add to the cart")
public void user_should_select_and_click_add_to_the_cart(String size) {
	
		WebElement length = driver.findElement(By.xpath("(//div[@data-rendered='true'])[1]"));
		
		 length .sendKeys(size);
		 length .click();*/
		 
}





