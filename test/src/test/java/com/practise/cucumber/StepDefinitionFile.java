package com.practise.cucumber;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;

public class StepDefinitionFile {
	static WebDriver driver;
	
	@Given("^user is in landing page$")
	public void user_in_landing_page() {
		System.out.println("hai");
		
	}

}
