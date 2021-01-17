package page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	public WebDriver driver;
	
	public Home_Page(WebDriver driver)
	
	{
		
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	@FindBy(how= How.XPATH, using="//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a")
	public WebElement Sign_In_Button;
	
}
