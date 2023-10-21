 package SAUCE_DEMO.cucumber.runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
         features="src/test/java/SAUCE_DEMO/cucumber/resources/features",
         glue="SAUCE_DEMO/cucumber/stepDef",
         plugin={"html:target/HTML_report.html"}
         )
 public class runLogin {
 }
