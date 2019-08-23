package com.onedatadriven;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\user\\eclipse-workspace\\test\\src\\test\\resources\\login\\datadriven.feature",
glue="com.sai")
public class TestRunner {

}
