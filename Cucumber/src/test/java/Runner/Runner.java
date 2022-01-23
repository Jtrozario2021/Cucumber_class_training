package Runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ={"src/test/java/feature"}
,glue= {"Stepdefination"}
,monochrome = true
, tags= "@Function")
public class Runner {

}
