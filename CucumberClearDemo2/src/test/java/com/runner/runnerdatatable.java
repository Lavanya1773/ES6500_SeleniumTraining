package com.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features/datatable.feature", glue = "com.cucumberdemo2", plugin = {"pretty","html:target/Cucumber-reports/Cucumber.html","pretty","json:target/Reports/Cucumber.jason","pretty","junit:target/Test-reports/Cucumber.xml"} , monochrome = true, dryRun = true)
public class runnerdatatable {

}
