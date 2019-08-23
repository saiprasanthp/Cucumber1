package com.CucumberDemo;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"C:\\Users\\user\\eclipse-workspace\\test\\src\\test\\resources\\File.Feature"},glue= {"com.CucumberDemo"},plugin= {"html:test-output"})

public class CucumberRunner {
	

}
