package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/expencesReportToTable.feature",
        glue = "step_definitions",
        plugin ="json:target/Destination/cucumber.json",
        tags = "@login,@GoToReport,@CheckSubmittedList"
)
public class CukesRunnerMAX {

}
