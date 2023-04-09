package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "src/test/resources/loginSchema.feature",
        glue = {"stepDefinitions"}
)
public class Run  extends AbstractTestNGCucumberTests {

}