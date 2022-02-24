package helpers;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base 
{
	public WebDriver  driver ;
	
	@Test
	
	public WebDriver getDriver()
	{
		 WebDriverManager.chromedriver().setup();
	       driver=new ChromeDriver();
	       
	       driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   	
	   	return driver;
		
	}
@Test
	public WebDriver driverSetup() throws IOException
	{
	Properties prop= new Properties();
	String path = "D:\\My Projects\\SBIMF\\Ecommerce_Maven\\Ecommerce\\src\\main\\java\\utility.properties";
	FileInputStream fis= new FileInputStream(path);

	prop.load(fis);
	String browserName= prop.getProperty("browser");
	System.out.println(browserName + "Opening Base class driver setup method");
	
	if (browserName.equals("chrome"))
	{
		
		 WebDriverManager.chromedriver().setup();
	       driver=new ChromeDriver();
		
		
	}
	
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	return driver;
}
}

