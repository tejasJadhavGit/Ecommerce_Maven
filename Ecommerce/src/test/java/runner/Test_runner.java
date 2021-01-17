package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\Admin\\eclipse-workspace\\Ecommerce\\features\\login.feature",
		tags= "@Test_001",
		dryRun= false,
		glue= "stepDefinitions", monochrome =true, strict=true
		)

public class Test_runner {

}
