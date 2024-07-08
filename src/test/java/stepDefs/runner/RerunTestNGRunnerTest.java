package stepDefs.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(

        features = "@target/failed.txt",
        glue={"stepDefs","hooks"},
        dryRun = false,
        plugin={"pretty","html:target/cucumber-reports/index.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
)

public class RerunTestNGRunnerTest extends AbstractTestNGCucumberTests {

}
