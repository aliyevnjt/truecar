package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"json:target/cucumber.json" }, 
				features = "src/test/resources/features", 
				glue = { "stepDefs" },

				tags = {"@SellTrade"},

				dryRun = false)

public class TestRunner {

}
