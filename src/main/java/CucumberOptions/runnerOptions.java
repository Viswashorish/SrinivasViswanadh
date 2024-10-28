package CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/main/java/Features",glue = "StepFileDefinations",monochrome = true, dryRun = true,tags = "@smoke",
plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class runnerOptions extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}

}
