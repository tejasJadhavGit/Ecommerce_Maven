package setup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver_Setup {
	
	public static WebDriver driver;
	String path= "C:\\Users\\Admin\\Software\\chromedriver.exe";
	
	public WebDriver launch ()
	{
		
		System.setProperty("webdriver.chrome.driver", path);
		
		 driver=new ChromeDriver();
		 driver.get("http://automationpractice.com/index.php");
		 driver.manage().window().maximize();
		 System.out.println(" Ecommerce site launched successfully");
		
		return driver;}

}
