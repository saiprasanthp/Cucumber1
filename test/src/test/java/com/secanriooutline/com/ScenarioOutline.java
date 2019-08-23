package com.secanriooutline.com;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ScenarioOutline {
	@Given("^user is in login page$")
	public void user_is_in_login_page()  {
System.out.println("login page");
	}

	@Then("^user enter username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_enter_username_and_password(String user, String pwd) {
		System.out.println(user);
		System.out.println(pwd);
	}

	@Then("^click on login button$")
	public void click_on_login_button() {
		System.out.println("login");
	}
}
