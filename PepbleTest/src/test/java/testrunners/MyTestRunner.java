package testrunners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\\\Iltea alam\\eclipse-workspace\\PepbleTest\\src\\test\\resources\\AppFeatures"
		,glue = {"stepDefinations","AppHooks"},
		plugin = {"pretty","html:target/MyReports/reports.html","junit:target/MyReports/reports.xml",
				"json:target/MyReports/reports.json"},
		monochrome = true,
		dryRun=false
		
         )
public class MyTestRunner {

}
