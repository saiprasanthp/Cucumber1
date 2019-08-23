package com.secanriooutline.com;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\user\\eclipse-workspace\\test\\src\\test\\resources\\login\\Scenariooutline.feature",
glue="com.secanriooutline.com",format="html:target")

public class TestRunner2 {
	
	

}
