package tests;

//import the cucumber packages
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

//Tell Junit that it will be running a Cucumber test
@RunWith(Cucumber.class)
//Tell Junit what options to use when running Cucumber (where to find the Cucumber Feature File)
@CucumberOptions(
        monochrome=true,
        features = "src/feature",
        glue = {"stepdefinition"}
        )
public class TestRun{
}

