package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features = "src/test/java/features", 
				 glue = "steps",
				 monochrome = true,
				 publish = true,
				// tags = "@regression" //to execute regression testcases alone
				// tags = "@smoke or @regression" //to execute scenarios contain @smoke or @regression
				// tags = "@functional and @regression" //to execute test scenarios contain both @functional and @regression
				// tags = "not @regression" //to execute all the test scenarios except regression
				 tags = "@leads"
		)
public class CucumberRunner extends BaseClass  {

}
