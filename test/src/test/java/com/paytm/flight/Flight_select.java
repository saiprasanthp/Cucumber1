package com.paytm.flight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Flight_select {
	WebDriver driver;
	@Given("^the user is in login page$")
	public void user_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@Then("^click on flight option$")
	public void click_on_flight_option()  {
		WebElement flight=driver.findElement(By.xpath("(//img[@class='_1s60'])[2]"));
		flight.click();
		
	}
	@After
	public void cl() {
		driver.quit();
	}
	
	@Then("^user is home page$")
	public void user_is_home_page()  {
		String title=driver.getCurrentUrl();
		Assert.assertEquals("https://paytm.com/flights", title);
	    
	}

	@Then("^click on roundtrip$")
	public void click_on_roundtrip() {
		WebElement radiobutton=driver.findElement(By.xpath("//label[@for='roundTrip']"));
		radiobutton.click();
	   
	}

	@Then("^enter \"([^\"]*)\" in input and select nellore$")
	public void enter_in_input_and_select_nellore(String city)  {
		WebElement element=driver.findElement(By.xpath("(//input[@class='fl-input'])[1]"));
		element.sendKeys(city);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement drop=driver.findElement(By.xpath("//span[text()='Tirupati']"));
		drop.click();
	    
	}

	@Then("^enter \"([^\"]*)\" in anothe check box and select hyderabad$")
	public void enter_in_anothe_check_box_and_select_hyderabad(String city)  {
		WebElement input=driver.findElement(By.xpath("//input[@class='fl-input']"));
		input.sendKeys(city);
		WebElement to=driver.findElement(By.xpath("(//span[text()='Hyderabad'])[1]"));
		to.click();
	
	}

	@Then("^click on calender select date$")
	public void click_on_calender_select_date() {
		WebElement calender=driver.findElement(By.xpath("(//img[@role='presentation'])[2]"));
		calender.click();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement click=driver.findElement(By.xpath("(//div[@class='G2sL'])[30]"));
		click.click();
		

	}

	@Then("^click on return date$")
	public void click_on_return_date()  {
		WebElement last=driver.findElement(By.xpath("(//div[@class='_2JMZ'])[50]"));
		last.click();
	    
	}

	@Then("^click proceed$")
	public void click_proceed()  {
		WebElement button=driver.findElement(By.xpath("//button[@class='button button--default button--bold _3LRd']"));
		button.click();
	    
	}
	@Given("^user is on homepage$")
	public void user() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://paytm.com/");
		driver.manage().window().maximize();
		
	}
	@Then("^click on movies$")
	public void click_on_movies() {
	WebElement movie=	driver.findElement(By.xpath("(//a[@class='_1tnO'])[1]"));
	movie.click();
		
	}

	
	
	
}
