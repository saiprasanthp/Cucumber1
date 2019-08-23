package com.freecrm;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\user\\eclipse-workspace\\test\\src\\test\\resources\\Freecrm.feature",
glue="com.freecrm",
monochrome=true,
dryRun=false,
strict=true)

public class TestRunner {
	
	
}
