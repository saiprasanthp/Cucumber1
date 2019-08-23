package com.sai;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class one_user_pwd {
	@Given("^user is in homepage$")
	public void user_is_in_homepage()  {
		System.out.println("home page");
	   
	}

	@Then("^user entered username \"([^\"]*)\"$")
	public void user_entered_username(String user)  {
		System.out.println(user);

	   
	}

	@Then("^password \"([^\"]*)\"$")
	public void password(String pwd) {
		System.out.println(pwd);

	  
	}

	@Then("^click on login button$")
	public void click_on_login_button()  {
		System.out.println("log in");

	    
	} 

}
