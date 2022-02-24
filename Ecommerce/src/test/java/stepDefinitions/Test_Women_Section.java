package stepDefinitions;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import helpers.Base;
import page_Object.Category;
import page_Object.Home_Page;

public class Test_Women_Section extends Base
{
	

	public WebDriver driver;
	public Home_Page home;
   public Category cat;
	
	
	
	@Then("^Mouse Hover on Women Section$")
	public void mouse_Hover_on_Women_Section() throws Throwable {
		
//		driver=getDriver();
//		driver.get("http://automationpractice.com/index.php");
//		 driver.manage().window().maximize(); 
//		 System.out.println(" Ecommerce site launched successfully");
//		

		String Expected_Title = "my store";
		String pageTitle = driver.getTitle();
				System.out.println(pageTitle);
	
		boolean verify = pageTitle.equalsIgnoreCase(Expected_Title);
		System.out.println("home page is displayed: " + verify);
	//	Assert.assertTrue(verify);
		
		 home= new Home_Page(driver);
	
		
	   
		
	}

	@Then("^Click on Tshirt$")
	public void click_on_Tshirt() throws Throwable {
		
		 
		Actions action= new Actions(driver);
		
		action.moveToElement(home.Women).build().perform();
		
		home.Tshirt.click();
		System.out.println("clicked on tshirt");
		
		System.out.println(driver.getTitle());
			  
	}

	
	
	@Then("^I am on T shirt category page$")
	public void i_am_on_T_shirt_category_page() throws Throwable {
		
		System.out.println("Category Page title " + driver.getTitle());
		
		Category cat= new Category(driver);
	   
	}

	@Then("^I change quatity size and colour of t-shirt$")
	public void i_change_quatity_size_and_colour_of_t_shirt() throws Throwable {
	   
	}
	@Then("^I close browser$")
	public void i_close_browser() throws Throwable {
	    
		//driver.close();
		System.out.println("closed browser");
	}
	
	}

