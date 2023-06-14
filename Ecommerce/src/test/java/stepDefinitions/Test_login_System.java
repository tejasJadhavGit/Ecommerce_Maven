package stepDefinitions;



import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import helpers.Base;
import page_Object.Home_Page;


public class Test_login_System extends Base
{


	public WebDriver driver;
	public Home_Page home;

	@Given("^launching ecommerce site$")
	public void launching_ecommerce_site() throws Throwable {
		driverSetup();
		driver.get("http://automationpractice.com/index.php");
		 driver.manage().window().maximize(); 
		 System.out.println(" Ecommerce site launched successfully");
		

	}

	@Then("^verifying home page is displayed$")
	public void verifying_home_page_is_displayed() throws Throwable {

		String Expected_Title = "my store";
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
	
		boolean verify = pageTitle.equalsIgnoreCase(Expected_Title);
		System.out.println("home page is displayed: " + verify);
		//Assert.assertTrue(verify);
		
		

	}

	@Then("^ckicked on login button$")
	public void ckicked_on_login_button() throws Throwable {

		 home= new Home_Page(driver);
		home.Sign_In_Button.click();
		System.out.println("clicked on SignIn button");
		
	}

	@Then("^Entered valid email id \"([^\"]*)\"$")
	public void entered_valid_email_id(String email) throws Throwable {
		
		
		home.Email_ID.sendKeys(email);
		System.out.println("Entered valid email id");

	}

	@Then("^entered valid password \"([^\"]*)\"$")
	public void entered_valid_password(String Password) throws Throwable {
		
		home.Password.sendKeys(Password);
		System.out.println("Entered valid Password id");
	}

	@Then("^clicked on sign in button$")
	public void clicked_on_sign_in_button() throws Throwable {

		home.Submit_Login.click();
		System.out.println("Clicked On Submit Login Button");
	}

}
