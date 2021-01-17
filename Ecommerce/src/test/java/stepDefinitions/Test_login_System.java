package stepDefinitions;


import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import page_Object.Home_Page;
import setup.driver_Setup;


public class Test_login_System {

	public driver_Setup setup;
	public WebDriver driver;
	public static Home_Page home;

	@Given("^launching ecommerce site$")
	public void launching_ecommerce_site() throws Throwable {
		setup = new driver_Setup();
		driver = setup.launch();

		home = new Home_Page(driver);

	}

	@Then("^verifying home page is displayed$")
	public void verifying_home_page_is_displayed() throws Throwable {

		String Expected_Title = "my store";
		String Expected_Title1 = "my store";
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		System.out.println(Expected_Title1);
		boolean verify = pageTitle.equalsIgnoreCase(Expected_Title);
		System.out.println("home page is displayed: " + verify);
		Assert.assertTrue(verify);
		
		

	}

	@Then("^ckicked on login button$")
	public void ckicked_on_login_button() throws Throwable {

		home.Sign_In_Button.click();
		System.out.println("ckicked on login button");
		System.out.println("ckicked on login button");

	}

	@Then("^Entered valid email id \"([^\"]*)\"$")
	public void entered_valid_email_id(String arg1) throws Throwable {
		System.out.println("Entered valid email id");

	}

	@Then("^entered valid password \"([^\"]*)\"$")
	public void entered_valid_password(String arg1) throws Throwable {

	}

	@Then("^clicked on sign in button$")
	public void clicked_on_sign_in_button() throws Throwable {

	}

}
