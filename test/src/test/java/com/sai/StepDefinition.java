package com.sai;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition {
	@Given("^user is in login page$")
	public void user_is_in_login_page() throws Throwable {
		System.out.println("login page");
	  
	}

	@Then("^user enter login username$")
	public void user_enter_login_username() throws Throwable {
		System.out.println("enter name");
	    
	}

	@Then("^enter password$")
	public void enter_password() throws Throwable {
		System.out.println("password");

	}

	@Then("^user click on login button$")
	public void user_click_on_login_button() throws Throwable {
		System.out.println("login button");
	    
	}

}
