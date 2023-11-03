package com.runner;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = "@BlankCredentials or ~@InvalidCredentials or @ValidCredentials" , features = "src/test/resources/Features/tags.feature", glue = "com.cucumberdemo2")

public class runnertag {

}
