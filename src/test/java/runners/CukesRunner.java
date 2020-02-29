package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:/Users/Arif-Busra/IdeaProjects/Brite_ERP_Expenses_Cucumber/src/test/resources/features/arif.feature",
        glue = "step_definitions",
        plugin ="json:target/Destination/cucumber.json",
        dryRun = false,
        tags = "@Arif"
)
public class CukesRunner {

}
