package stepDefs.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(

        features = "src/test/resources/parallelfeatures",
        glue={"stepDefs"},
        dryRun = false,
        plugin={"pretty","html:target/cucumber-reports/index.html",
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}


)

public class JunitTestRunnerTest {


}
