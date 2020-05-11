package scenarios;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"@rerun/failed_scenarios.txt"},
        glue={"stepdefinitions"},
        plugin= {"pretty", "html:target/cucumber-report/single",
                "json:target/cucumber-report/single/rerun_cucumber.json"},
        monochrome = true
)

public class ReRunRunner extends AbstractTestNGCucumberTests {
}
