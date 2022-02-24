package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="D:\\My Projects\\SBIMF\\Ecommerce_Maven\\Ecommerce\\features",
		tags= "@Test_01",
		dryRun= false,
		glue= "stepDefinitions", monochrome =true, strict=true
		)

public class Test_runner {
	
	

}
