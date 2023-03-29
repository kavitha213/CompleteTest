package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;

import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/functionalTests",glue =  "stepDefinitions" ,

		plugin = { "json:target/cucumber.json" }
//		"io.qameta.allure.cucumber4jvm.AllureCucumber4Jvm" tags="@smoke",
)
public class TestRunner {

}
