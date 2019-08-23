package com.cucumber_with_testng;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(features="C:\\Users\\user\\eclipse-workspace\\test\\src\\test\\resources\\login\\logintest.feature",glue="com.sai")

public class TestRunnerWithTestng extends AbstractTestNGCucumberTests {
	
	

}
