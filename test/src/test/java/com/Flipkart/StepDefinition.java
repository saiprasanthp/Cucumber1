package com.Flipkart;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class StepDefinition {
	WebDriver driver;
	@Before
	public void in() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");

	}
	@Given("^user is in log-in page$")
	public void user_In_Log_In(){
		
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	@Then("^enter username and password$")
	public void enter_Username_password() {
		WebElement element=driver.findElement(By.xpath("//input[@id='email']"));
		element.sendKeys("sai");
		WebElement element1=driver.findElement(By.xpath("//input[@id='pass']"));
		element1.sendKeys("123");
	}
	@And("^click on login button$")
	public void click_On_Login_Button() throws AWTException {
		Robot ar=new Robot();
		ar.keyPress(KeyEvent.VK_ENTER);
		ar.keyRelease(KeyEvent.VK_ENTER);
		String name="sai";
		
	}
	@After
	public void cl() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
}