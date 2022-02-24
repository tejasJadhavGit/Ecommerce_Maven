package page_Object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Category {

	public WebDriver driver;
	
	public Category(WebDriver driver)
	
	{
		
		
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(how= How.XPATH, using="//div[@Class=\"product-image-container\"]/a[1]/img")
	public WebElement Image;
	
	
}
