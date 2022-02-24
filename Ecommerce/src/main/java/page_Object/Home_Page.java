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
	
	@FindBy(how= How.XPATH, using="//*[@id='email']")        
	public WebElement Email_ID;
	
	@FindBy(how= How.XPATH, using="//*[@id='passwd']")        
	public WebElement Password;
	
	@FindBy(how= How.XPATH, using="//*[@id='SubmitLogin']")        
	public WebElement Submit_Login;
	
	
	@FindBy(how= How.XPATH, using="//ul[@Class=\"sf-menu clearfix menu-content sf-js-enabled sf-arrows\"]/li[1]/ul/li/ul/li[1]/a[text()=\"T-shirts\"]")        
	public WebElement Tshirt;
	
	@FindBy(how= How.XPATH, using="//ul[@Class=\"sf-menu clearfix menu-content sf-js-enabled sf-arrows\"]/li[1]/a")        
	public WebElement Women;
	
	
}
