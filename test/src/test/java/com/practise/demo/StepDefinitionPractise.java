package com.practise.demo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinitionPractise {
	
	@Given("^user is in login page$")
	public void user_login_page() {
		System.out.println("user is in login page");
	}
	@Then("^click on button$")
	public void click_on_button() {
		System.out.println("click on button");
	}
	@Then("^click on another button$")
	public void click_on_another_button() {
		System.out.println("click on another button");
	}
	/*@Then("^click on login button$")
	public void click_login_button() {
		System.out.println("click on login button");
	}*/
	
	@Then("^login page$")
	public void login_page() {
		System.out.println("smoke testing");
	}
	
	@Given("^user is in login page1$")
	public void user_is_in() {
		
	}
	@Then("^enter username \"(.*)\" password \"(.*)\"$")
	public void enter_name_pass(String name,String pwd) {
		System.out.println(name);
		System.out.println(pwd);
	}
	
	@Given("^user ma$")
	public void user() {
		System.out.println("user");
	}
	@Then("^enter username \"(.*)\" and password \"(.*)\"$")
	public void user(String name,String pass) {
		System.out.println(name);
		System.out.println(pass);
	}
	@Then("^click on login button$")
	public void click_login_button() {
		System.out.println("click on login button");
	}
	
	 
	
	
	
	
	
	
	

}
