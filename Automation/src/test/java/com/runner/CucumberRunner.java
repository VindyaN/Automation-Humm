package com.runner;
import org.junit.runner.RunWith;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
					 glue = {"com.stepDefinitions"},
					 plugin = {"html:target/cucumber-html-report", "json:target/cucumber.json"},
					tags = "@Testcase2" 
)
public class CucumberRunner {

	


	}


