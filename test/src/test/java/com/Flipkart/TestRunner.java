package com.Flipkart;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\user\\eclipse-workspace\\test\\src\\test\\resources\\AmazonFile.feature"},glue="com.Flipkart",
dryRun=false,
strict=true,
monochrome=true
)

public class TestRunner {

}
