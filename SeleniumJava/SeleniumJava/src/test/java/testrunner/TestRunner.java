package testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/features", 
					glue = { "steps" },					
					tags = {"@BasicAuth"},
					plugin= {"pretty", "html:target/cucumber"},
					monochrome = false)
public class TestRunner {

}

