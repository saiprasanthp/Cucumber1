package com.sai;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:login\\logintest.feature",glue="com.sai")

public class TestRunner {

}
