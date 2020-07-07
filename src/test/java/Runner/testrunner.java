package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
features = "src/test/javaFeatures",
glue = {"seleniumcode"},
monochrome = true
,plugin =  {"pretty","html:target/html", "json:cucumber.json"}
)

public class testrunner{
	
}