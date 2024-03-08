package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\hanumant.jawanjal\\Downloads\\AutomationCucumber\\AutomationCucumber\\src\\test\\resource\\FeatureFiles"},
		glue={"StepDefinition","hooks"},
		tags="@login"
		)

public class CRunner  {

	
	
}
