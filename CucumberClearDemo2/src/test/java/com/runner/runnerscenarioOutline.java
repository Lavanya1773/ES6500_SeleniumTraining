package com.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@InvalidCredentials" , features = "src/test/resources/Features/scenarioOutline.feature", glue = "com.cucumberdemo2")
public class runnerscenarioOutline {

}
