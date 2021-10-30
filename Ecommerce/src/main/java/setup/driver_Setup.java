package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driver_Setup {
	
	public static WebDriver driver;

	public WebDriver launch ()
	{
		
		
		  WebDriverManager.chromedriver().setup();
	       driver=new ChromeDriver();
		 driver.get("http://automationpractice.com/index.php");
		 driver.manage().window().maximize();
		 System.out.println(" Ecommerce site launched successfully");
		
		return driver;}

}
