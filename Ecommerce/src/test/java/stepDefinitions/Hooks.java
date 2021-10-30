package stepDefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import setup.driver_Setup;

public class Hooks {
	
	@Before
    public void beforeScenario() throws Throwable {



  System.out.println(" <------------- Run before the Scenario ------------------------->");
    }

    @After
    public void afterScenario(Scenario scenario) throws Throwable {


        Thread.sleep(2000);

     //   driver_Setup.driver.quit();

        System.out.println(" <------------------ Run After the Scenario ------------------------->");
    }



}
