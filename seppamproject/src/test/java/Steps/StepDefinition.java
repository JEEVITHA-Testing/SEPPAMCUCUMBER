package Steps;

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
	@Given("User enter the Emailid as {string}")
	public void user_enter_the_emailid_as(String string) throws Exception {
	         driver=new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.get("https://scandex.seppam.in/");
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("jeevimoni@toolfe.com");
	       /*driver.findElement(By.xpath("//input[@type='emailAddress']")).sendKeys("pritom@scandexbd.com");*/
		   
		}

	@Given("User enter the password as {string}")
	public void user_enter_the_password_as(String string) {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Otomate@123");
	}

	@When("User click on the login button")
	public void user_click_on_the_login_button() throws Exception {
		 Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("click on check-in button")
	public void click_on_check_in_button() throws Exception {
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
		System.out.println("Success");	}
	

	@Then("click on project icon")
	public void click_on_project_icon() throws Exception {
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//h1[text()=' Projects']/following-sibling::button)[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("projectName")).sendKeys("WEDIDIT");
		driver.findElement(By.name("projectCode")).sendKeys("601");
		driver.findElement(By.xpath("//input[@id='search_input']")).click();
		driver.findElement(By.xpath("//li[text()='Banking Activities']")).click();
		Actions action = new Actions(driver);
		   action.moveToElement(driver.findElement(By.name("projectOrderNo")));
		   driver.findElement(By.name("projectOrderNo")).sendKeys("16982");
		   driver.findElement(By.name("businessUnit")).click();
		   driver.findElement(By.xpath("//option[text()='Gouripur-1']")).click();
		   driver.findElement(By.name("brandContacts")).click();
		   driver.findElement(By.xpath("//option[text()='Supplier']")).click();
		   driver.findElement(By.xpath("//button[text()='Create']")).click();
	}

	@Then("click on order icon")
	public void click_on_order_icon() throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//h1[@class='font-semibold text-heading']/following-sibling::button)[2]")).click();
		driver.findElement(By.tagName("select")).sendKeys("testing");
		driver.findElement(By.name("orderNo")).sendKeys("63");
		driver.findElement(By.name("orderDetails")).sendKeys("Testingphase");
		driver.findElement(By.xpath("//button[text()='Create']")).click();
	}

	@Then("click on create task icon")
	public void click_on_create_task_icon() throws Exception {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//p[text()='Create task']")).click();
		driver.findElement(By.name("taskTitle")).sendKeys("provide good quality product");
		driver.findElement(By.tagName("textarea")).sendKeys("6751");
		driver.findElement(By.name("projectId")).click();
		driver.findElement(By.xpath("//option[text()='Customs Activities']")).click();
		driver.findElement(By.name("priorityId")).click();
		driver.findElement(By.xpath("//option[text()='OverWhelming']")).click();
	  WebElement sedate=driver.findElement(By.xpath("//input[@type='date']"));
		    sedate.sendKeys("15-05-2024");
		    driver.findElement(By.xpath("//button[text()='Create Task']")).click();
	}

	@Given("Click on search box display required text")
	public void click_on_search_box_display_required_text() throws Exception {
		
	WebElement requiredText =driver.findElement(By.xpath("//input[@placeholder='Search for any task']"));
	Thread.sleep(3000);
requiredText.sendKeys("test");
Thread.sleep(1000);
	}

	@Given("click certain task")
	public void click_certain_task() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//p[text()='Create task']")) );
	    driver.findElement(By.xpath("//p[text()='Create task']")).click();
		driver.findElement(By.name("taskTitle")).sendKeys("provide good quality product");
		driver.findElement(By.tagName("textarea")).sendKeys("1605");
		driver.findElement(By.name("projectId")).click();
		driver.findElement(By.xpath("//option[text()='Customs Activities']")).click();
		driver.findElement(By.name("priorityId")).click();
		driver.findElement(By.xpath("//option[text()='OverWhelming']")).click();
	  WebElement sedate=driver.findElement(By.xpath("//input[@type='date']"));
		    sedate.sendKeys("15-05-2024");
		    driver.findElement(By.xpath("//button[text()='Create Task']")).click();
	}

	@Then("chat with certain task chat box")
	public void chat_with_certain_task_chat_box() throws Exception {
	    	Thread.sleep(1000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("arguments[0].scrollIntoView();",
		    		driver.findElement(By.xpath("//h2[text()='Jeevi tester task']")) );
					driver.findElement(By.xpath("//h2[normalize-space()='Jeevi tester task']")).click();
			  driver.findElement(By.xpath("//textarea[@placeholder='Type a message']")).sendKeys("hi toolfe");
			 driver.findElement(By.xpath("//img[@alt='composeIcon']")).click();
	}

	@Then("click on kebab Menu and select create subtask")
	public void click_on_kebab_menu_and_select_create_subtask() throws Exception {
				JavascriptExecutor js = (JavascriptExecutor) driver;
			    js.executeScript("arguments[0].scrollIntoView();",
			    		driver.findElement(By.xpath("//input[@placeholder='Search for projects']")));
			    Thread.sleep(2000);
			    js.executeScript("window.scrollBy(0, 100);");
			    driver.findElement(By.xpath("(//img[@alt='plusIconBlue'])[2]")).click();
	}

	@Then("click on view subtask")
	public void click_on_view_subtask() throws Exception {
Thread.sleep(1000);
	driver.findElement(By.xpath("//a[@class=\"flex items-center gap-2\"]")).click();
	}

	@Given("click on add subtask")
	public void click_on_add_subtask() throws Exception {
		driver.findElement(By.xpath("//p[text()='Add New Subtask']")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("subtaskTitle")).sendKeys("Automation processing");
		//driver.findElement(By.xpath("//input[@placeholder='Sub Task Heading']")).sendKeys("Automation processing");
		 WebElement s = driver.findElement(By.name("assigneeId"));
		 driver.findElement(By.name("assigneeId")).click();
		 driver.findElement(By.xpath("//option[text()='khaled@scandexbd.com']")).click();
		 driver.findElement(By.name("orderId")).click();
		 driver.findElement(By.name("taskTypeId")).click();
		 driver.findElement(By.xpath("//option[text()='SUC-Monthly Activities']")).click();
   WebElement setdate=  driver.findElement(By.xpath("(//input[@id='myDateInput'])[1]"));
   setdate.sendKeys("15-05-2024");
   WebElement setdate1= driver.findElement(By.xpath("(//input[@id='myDateInput'])[2]"));
   setdate1.sendKeys("30-05-2035");
   driver.findElement(By.name("subtaskPriorityId")).click();
   driver.findElement(By.xpath("//option[text()='Priority']")).click();
   Thread.sleep(1000);
   driver.findElement(By.xpath("(//div[@id='multiselectContainerReact']//div)[1]")).click();
    driver.findElement(By.xpath("//li[text()='Finance Shuvro kumar']")).click();
	Actions action = new Actions(driver);
	   action.moveToElement(  driver.findElement(By.xpath("//button[text()='Create']")));
	 
   driver.findElement(By.xpath("//button[text()='Create']")).click();
	}

	@Given("drag the subtask to inprocess task and done")
	public void drag_the_subtask_to_inprocess_task_and_done() {
		driver.findElement(By.xpath("//div[@class='h-fit p-2']")).click();
		Actions builder = new Actions(driver);

		//Building a drag and drop action
		Actions dragAndDrop = builder.clickAndHold(driver.findElement(By.xpath("//body/div[@id='root']/div/div/div[contains(@class,'h-screen w-full bg-white text-neutral-50')]/div/div[contains(@class,'scroll flex flex-row grow-0 p-12 overflow-scroll')]/div[1]/div[2]")));
		dragAndDrop.moveToElement(driver.findElement(By.xpath("//body/div[@id='root']/div/div/div[contains(@class,'h-screen w-full bg-white text-neutral-50')]/div/div[contains(@class,'scroll flex flex-row grow-0 p-12 overflow-scroll')]/div[1]/div[2]")));
		dragAndDrop.release(driver.findElement(By.xpath("//div[contains(@class,'cursor-grab active:cursor-grabbing')]")));
		dragAndDrop.build();

		//Performing the drag and drop action
		dragAndDrop.perform();
	}

	@When("task in done and give rating")
	public void task_in_done_and_give_rating() {
		driver.findElement(By.xpath("//body/div[@id='root']/div/div/div[contains(@class,'h-screen w-full bg-white text-neutral-50')]/div/div[contains(@class,'scroll flex flex-row grow-0 p-12 overflow-scroll')]/div[1]/div[2]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView();",
	    		driver.findElement(By.xpath("//button[text()='Good']")));
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
