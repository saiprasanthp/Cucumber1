package com.practise.demo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\user\\eclipse-workspace\\test\\src\\test\\resources\\Practise.feature",glue= {"com.practise.demo"},
//tags= {"@RegressionTesting" ,"@smoke"},
strict=true , 
format="html:target\\sai",
dryRun=false,
monochrome=true
)
public class RunnerTest {
	
}
