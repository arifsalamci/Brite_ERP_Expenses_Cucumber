package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "step_definitions",
        plugin ="html:target/cucumber-reports, json:target/Destination/cucumber-report",
        dryRun = false,
        tags = "@login, @GoToReport,@CheckSubmittedList"

public class CukesRunner {

}
