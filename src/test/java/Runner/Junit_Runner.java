package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		dryRun =true,
		features = {"src/test/java/Features/amazon.feature"},
		glue ="Step_Definitions",
		plugin = {"pretty","html:target/htmlreport/cucumberReport.html","Json:target/jsoncucumberReport/json"},
		monochrome = true
		)

public class Junit_Runner {

}
