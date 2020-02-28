package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "step_definitions",
        plugin ={"pretty:target/Destination/cucumber.json","html:target/Destination/cucumber-reports"},
        dryRun = false,
        tags="@smoke  "
)
public class CukesRunnerMAX {

}
