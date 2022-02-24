package stepDefinitions;


import org.openqa.selenium.WebDriver;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import helpers.Base;


public class Hooks extends Base {
	
	public WebDriver  driver ;
	
	@Before
    public void beforeScenario() throws Throwable {



  System.out.println(" <------------- Run before the Scenario ------------------------->");
    }

    @After
    public void afterScenario(Scenario scenario) throws Throwable {


        Thread.sleep(2000);
        
//        driver= getDriver();
//        driver.quit();
     

        System.out.println(" <------------------ Run After the Scenario ------------------------->");
    }



}
