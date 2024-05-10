package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition {
RemoteWebDriver driver;
//	@Given("User enter the Emailid as {string}")
//	public void user_enter_the_emailid_as(String string) {
//         driver=new ChromeDriver();
//	    driver.manage().window().maximize();
//	    driver.get("https://oto.seppam.in/");
//	    driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("jeevimoni@toolfe.com");
//       /*driver.findElement(By.xpath("//input[@type='emailAddress']")).sendKeys("pritom@scandexbd.com");*/
//	   
//	}
//
//	@And("User enter the password as {string}")
//	public void user_enter_the_password_as(String string) {
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Otomate@123");
//	}
//
//	@When("User click on the login button")
//	public void user_click_on_the_login_button() {
//		driver.findElement(By.xpath("//button[@type='submit']")).click();
//	}
//	@Then("click on check-in button")
//	public void click_on_check_in_button() throws Exception {
//		Thread.sleep(5000);
//		WebElement clockInButton =driver.findElement(By.xpath("//span[text()='Check In']"));
//	        if (clockInButton.isDisplayed()) {
//	            // Click clock-in button
//	            clockInButton.click();
//	        } else {
//	        	Thread.sleep(2000);
//	            // If clock-in button is not available, click clock-out button
//	            WebElement clockOutButton = driver.findElement(By.xpath("//span[text()='Check Out']"));
//	            clockOutButton.click();
//	        }
//		System.out.println("Success");	}
//
//	@Then("click on project icon")
//	public void click_on_project_icon() throws Exception {
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//div[contains(@class,'flex justify-center items-center gap-3')]//*[contains(@class,'bg-[#DCD6FA] rounded-full')]")).click();
//		//div[@class='flex justify-center items-center gap-3']//button//*[name()='svg']
//		//driver.findElement(By.xpath("(//h1[@class='font-semibold text-heading']/following-sibling::span)[1]")).click();
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[contains(@class,'text-black font-bold')]")).sendKeys("TestingImportant");
//		driver.findElement(By.cssSelector("input[name='projectCode']")).sendKeys("1611");
//		driver.findElement(By.name("businessUnit")).click();
//		driver.findElement(By.xpath("(//select[contains(@class,'text-black ')]//option)[2]")).click();
//		driver.findElement(By.xpath("//select[@name='brandContacts']")).click();
//		driver.findElement(By.xpath("(//option[text()='Select Business Partner']/following-sibling::option)[2]")).click();
//		driver.findElement(By.xpath("(//span[text()='ACC']/following::input)[3]")).sendKeys("1611");   
//	        WebElement element = driver.findElement(By.xpath("//div[contains(@class,'multiselect-container multiSelectContainer')]//div[1]"));
//	        element.click();
//
//	     driver.findElement(By.xpath("//li[text()='Recycle Activities']")).click();
//	     Thread.sleep(1000);	      
//	     driver.findElement(By.xpath("//button[text()='Project']")).click();
//		
//	}
//
//	@And("click on order icon")
//	public void click_on_order_icon() throws Exception {
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("(//h1[@class='font-semibold text-heading']/following-sibling::button)[2]")).click();
//		//driver.findElement(By.xpath("(//h1[@class='font-semibold text-heading']/following-sibling::button)[1]")).click();
//		driver.findElement(By.tagName("select")).sendKeys("testing");
//		driver.findElement(By.name("orderNo")).sendKeys("1611");
//		driver.findElement(By.name("orderDetails")).sendKeys("Testingphase");
//		driver.findElement(By.xpath("//button[text()='Save']")).click();
//	}
//
////	@Then("Orderno created successfully")
////	public void orderno_created_successfully() {
////	   driver.close();
////	}
////	
//		
////		@Then("Orderno created successfully")
////		public void orderno_created_successfully() {
////		   
////		}
//		@And("click on create task icon")
//			public void click_on_create_task_icon() throws Exception {
//			    
//			    Thread.sleep(1000);
//				driver.findElement(By.xpath("//p[text()='Create task']")).click();
//				driver.findElement(By.name("taskTitle")).sendKeys("provide good quality product");
//				driver.findElement(By.name("projectId")).click();
//				driver.findElement(By.xpath("(//option[text()='Select Project']/following-sibling::option)[3]")).click();
//				driver.findElement(By.name("priorityId")).click();
//				driver.findElement(By.xpath("//option[text()='Subjective']")).click();
//				  WebElement sedate=driver.findElement(By.id("myDateInput"));
//				    sedate.sendKeys("15-05-2024");
//				//driver.findElement(By.xpath("//input[@type='date']")).click();
//				//driver.findElement(By.name("targetDate")).sendKeys("30-04-1998");
//			//	driver.findElement(By.cssSelector("#myDateInput")).sendKeys("30-04-1998");
//				driver.findElement(By.name("taskDescription")).sendKeys("testing on going");
//				driver.findElement(By.xpath("//button[text()='Create Task']")).click();
//				//filter
//				//driver.findElement(By.xpath("//input[@placeholder='Search for any task']")).sendKeys("cloud");
//				// WebElement requiredText = driver.findElement(By.xpath("//a[contains(text(),'Required Text')]"));
//			        // Click on the required text
//			   //     requiredText.click();
//
//			}
//
//		@Then("Task created success")
//			public void task_created_success()
//			{
//	driver.close();
//			}


@Given("click on add subtask")
public void click_on_add_subtask() throws Exception {
	
	 driver=new ChromeDriver();
	   driver.manage().window().maximize();
	    driver.get("https://scandex.seppam.in/");
		    driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("jeevimoni@toolfe.com");
	    driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Otomate@123");
		    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(5000);
		WebElement clockInButton =driver.findElement(By.xpath("//span[text()='Check In']"));
	        if (clockInButton.isDisplayed()) {
		            // Click clock-in button
		            clockInButton.click();
		        } else {
		        	Thread.sleep(2000);
		            // If clock-in button is not available, click clock-out button
		            WebElement clockOutButton = driver.findElement(By.xpath("//span[text()='Check Out']"));
		            clockOutButton.click();
		        }
	        JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//p[text()='Create task']")) );
	        WebElement requiredText =driver.findElement(By.xpath("//input[@placeholder='Search for any task']"));
			Thread.sleep(3000);
	   requiredText.sendKeys("test");
	   Thread.sleep(1000);
	   Thread.sleep(1000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
	    js2.executeScript("arguments[0].scrollIntoView();",
	    		driver.findElement(By.xpath("//h2[text()='Jeevi tester task']")) );
		//WebElement task = driver.findElement(By.xpath("//h2[text()='Jeevi tester task']"));
	  //driver.findElement(By.xpath("//div[@class='flex justify-between h-full items-center px-5 py-7 border-b border-[#F2F2F2] bg-[#EDEFFF]']")).click();
	driver.findElement(By.xpath("//h2[normalize-space()='Jeevi tester task']")).click();
		  driver.findElement(By.xpath("//textarea[@placeholder='Type a message']")).sendKeys("hi developer");
		 driver.findElement(By.xpath("//img[@alt='composeIcon']")).click();
	        JavascriptExecutor js1= (JavascriptExecutor) driver;
		    //js.executeScript("arguments[0].scrollIntoView();",
		    	//	driver.findElement(By.xpath("//input[@placeholder='Search for projects']")));
	    	JavascriptExecutor js3 = (JavascriptExecutor) driver;
		    js3.executeScript("arguments[0].scrollIntoView();",
		    		driver.findElement(By.xpath("//input[@placeholder='Search for projects']")));
		    Thread.sleep(2000);
		    js1.executeScript("window.scrollBy(0, 100);",
		    driver.findElement(By.xpath("(//img[@alt='plusIconBlue'])[2]")));
		    driver.findElement(By.xpath("(//img[@alt='plusIconBlue'])[2]")).click();
		    Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class=\"flex items-center gap-2\"]")).click();
		   // driver.findElement(By.xpath("//body/div[@id='root']/div/div/div[contains(@class,'h-screen w-full bg-white text-neutral-50')]/div/div[contains(@class,'scroll flex flex-row grow-0 p-12 overflow-scroll')]/div[1]/div[2]")).click();		Thread.sleep(2000);
		    
	driver.findElement(By.xpath("//p[text()='Add New Subtask']")).click();
	//driver.findElement(By.xpath("//p[text()='Subtask']")).click();
	driver.findElement(By.xpath("//input[@placeholder='Sub Task Heading']")).sendKeys("Automation processing");
	 WebElement s = driver.findElement(By.name("assigneeId"));
	// driver.findElement(By.xpath("//select[@name='assigneeId']")).click();
			s .click();
//	
			driver.findElement(By.xpath("//option[text()='pritom@scandexbd.com']")).click();
WebElement s1 = driver.findElement(By.name("orderId"));
s1  .click();
//driver.findElement(By.xpath("//option[text()='22']")).click();
//driver.findElement(By.xpath("(//select[@name='orderId']//option)[2]")).click();
Thread.sleep(1000);
driver.findElement(By.xpath("//option[text()='No Order No']/following-sibling::option")).click();
//driver
//Select b1=new Select(s1);
//b1.selectByVisibleText("22");
//driver.findElement(By.xpath("(//select[contains(@class,'w-full h-full')])[2]")).click();

WebElement s2 = driver.findElement(By.name("taskTypeId"));
s2.click();
//Select b1=new Select(s1);
driver.findElement(By.xpath("//option[text()='Recycle Waste - Physical review']")).click();
//driver.findElement(By.xpath("(//select[contains(@class,'w-full h-full')])[3]")).click();
WebElement sedate=driver.findElement(By.id("myDateInput"));
sedate.sendKeys("15-05-2024");
WebElement setdate=  driver.findElement(By.xpath("(//input[@id='myDateInput'])[1]"));
setdate.sendKeys("15-05-2024");
WebElement setdate1=  driver.findElement(By.xpath("(//input[@id='myDateInput'])[2]"));
setdate1.sendKeys("30-05-2035");
WebElement s3=  driver.findElement(By.name("subtaskPriorityId"));
s3.click();
driver.findElement(By.xpath("//option[text()='Overriding']")).click();

//driver.findElement(By.xpath("//*[@id="root"]/div[2]/div/div/div/div[2]/section/div/div[3]/table/tbody/tr[6]/td[2]/div/select/option[4]"))));
WebElement s4= driver.findElement(By.xpath("(//div[@class='search-wrapper searchWrapper ']//input)[1]"));
s4.click();

driver.findElement(By.xpath("//li[text()='Finance Shuvro kumar']")).click();
Thread.sleep(3000);
Actions a=new Actions(driver);
a.moveToElement(driver.findElement(By.xpath("//td[text()='Collaborators']")));

//driver.findElement(By.xpath("//li[text()='important']")).click();
driver.findElement(By.name("subtaskDescription")).sendKeys("Automate");
Thread.sleep(3000);
driver.findElement(By.xpath("//button[text()='Create Subtask']")).click();
}
@Given("drag the subtask to inprocess task and done")
public void drag_the_subtask_to_inprocess_task_and_done() throws Exception {
	Thread.sleep(2000);
	//driver.findElement(By.xpath("//body/div[@id='root']/div/div/div[@class='h-screen w-full bg-white text-neutral-50']/div[@class='w-full']/div[@class='flex flex-row grow-0 p-12 overflow-y-auto']/div[1]/div[1]")).click();
	//driver.findElements(By.xpath("//body/div[@id='root']/div/div/div[@class='h-screen w-full bg-white text-neutral-50']/div[@class='w-full']/div[@class='flex flex-row grow-0 p-12 overflow-y-auto']/div[1]/div[1]")).click();
	  WebElement sourceElement = driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2)"));
      
      // Locate the element where you want to drop
      WebElement targetElement = driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2)"));
      
      // Perform the drag and drop action
      Actions actions = new Actions(driver);
      actions.dragAndDrop(sourceElement, targetElement).build().perform();
      
//	driver.findElement(By.xpath("//div[@class='h-fit p-2']")).click();
//	Actions builder = new Actions(driver);
//
//	//Building a drag and drop action
//	Actions dragAndDrop = builder.clickAndHold(driver.findElement(By.xpath("//body/div[@id='root']/div/div/div[contains(@class,'h-screen w-full bg-white text-neutral-50')]/div/div[contains(@class,'scroll flex flex-row grow-0 p-12 overflow-scroll')]/div[1]/div[2]")));
//	dragAndDrop.moveToElement(driver.findElement(By.xpath("//body/div[@id='root']/div/div/div[contains(@class,'h-screen w-full bg-white text-neutral-50')]/div/div[contains(@class,'scroll flex flex-row grow-0 p-12 overflow-scroll')]/div[1]/div[2]")));
//	dragAndDrop.release(driver.findElement(By.xpath("//div[contains(@class,'cursor-grab active:cursor-grabbing')]")));
//	
//	dragAndDrop.build();
//
//	//Performing the drag and drop action
//	dragAndDrop.perform();
////	Actions action = new Actions(driver);
////	action.dragAndDrop(Sourcelocator, Destinationlocator).build().perform();
}
@When("task in done and give rating")
public void task_in_done_and_give_rating() throws Exception {
	Thread.sleep(3000);
	WebElement sourceElement = driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2) > div:nth-child(2)"));
    
    // Locate the element where you want to drop
    WebElement targetElement = driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2)"));
    
    // Perform the drag and drop action
    Actions actions = new Actions(driver);
    actions.dragAndDrop(sourceElement, targetElement).build().perform();
    Thread.sleep(1000);
    driver.findElement(By.cssSelector("svg")).click();
   // driver.findElement(By.xpath("//body/div[@id='root']/div/div/div[contains(@class,'h-screen w-full bg-white text-neutral-50')]/div[contains(@class,'w-full')]/div[contains(@class,'flex flex-row grow-0 p-12 overflow-y-auto')]/div[2]/div[2]")).click();
	//driver.findElement(By.xpath("//body/div[@id='root']/div/div/div[contains(@class,'h-screen w-full bg-white text-neutral-50')]/div/div[contains(@class,'scroll flex flex-row grow-0 p-12 overflow-scroll')]/div[1]/div[2]")).click();
	JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("arguments[0].scrollIntoView();",
    		driver.findElement(By.cssSelector("body > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > section:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(6) > div:nth-child(1) > div:nth-child(2) > button:nth-child(1)")));
    		//driver.findElement(By.xpath("//button[text()='Good']")));
    driver.findElement(By.xpath("//button[text()='Good']")).click();
    driver.findElement(By.xpath("//div[@role='combobox']")).click();
    driver.findElement(By.xpath("//li[text()='N1']")).click();
    driver.findElement(By.xpath("//button[text()='Save']")).click();
}
@When("click on home page")
public void click_on_home_page() {
	driver.findElement(By.xpath("(//p[text()='Home'])[2]")).click();
}
@Then("click on my task tab and click create task icon")
public void click_on_my_task_tab_and_click_create_task_icon() {
	driver.findElement(By.xpath("//p[text()='Time Sheet']")).click();
	driver.close();
}
		}





	
