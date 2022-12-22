package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="./src/main/resources/featurefiles/login.feature",
		glue={"./src/test/java/stepdefination","AppHooks"},
		dryRun=false)

public class MyFirstTestRunner //extends AbstractTestNGCucumberTests 
{
	

}
