package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	

	features="src/test/java/resources",
	glue= {"stepDefination","Hooks"},
	tags="@sanity1",
	dryRun= false,
	monochrome= false,
	//publish= true,
	plugin= {"pretty", "html:target/HtmlReport/index.html",
			"json:target/Cucumberreports/cucumber.json",
			"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
			
	}
	
	
	
	
)	
	
	
public class TestRunner {

}
