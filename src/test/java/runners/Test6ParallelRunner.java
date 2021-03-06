package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/features/expencesReportToTable.feature",
        glue = "step_definitions",
        plugin ={"html:target/default-cucumber-reports",
                "json:target/parallel-cucumber4.json"},
        dryRun = false,

        tags = "@smoke"
)

public class Test6ParallelRunner {
}
