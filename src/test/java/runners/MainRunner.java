package runners;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = "stepDefinitions",
        tags = "@Login",
        plugin = {"pretty","html:target/cucumber-reports/cucumber"})

public class MainRunner {

}
