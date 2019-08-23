package com.stepDefinition.shirt;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\user\\eclipse-workspace\\test\\src\\test\\resources\\amazon.feature"},
glue= {"com.stepDefinition.shirt"},
monochrome=true,
dryRun=false,
plugin="html:target",
strict=true,
tags= {"@Regression"}

		)

public class RunnerAmazon {



}
