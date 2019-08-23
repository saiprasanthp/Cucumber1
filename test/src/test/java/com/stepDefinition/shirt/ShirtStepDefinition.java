package com.stepDefinition.shirt;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ShirtStepDefinition {
	static WebDriver driver;
	Actions act;
	
	@Given("^user is in Amazon page$")
	public void user_in_Amazon_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	
	@Then("^clicks on shirts$")
	public void clicks_on_shirt() {
		WebElement element=driver.findElement(By.xpath("(//a[@class='a-link-normal quadrant-overlay'])[1]"));
		act=new Actions(driver);
		act.moveToElement(element).build().perform();
		element.click();
		
		
	}
	@Then("^clicks on another shirt$")
	public void clicks_on_another_shirt() {
		WebElement element1=driver.findElement(By.xpath("(//div[@class='bb-s-item-description-overlay'])[1]"));
		act=new Actions(driver);
		act.moveToElement(element1).build().perform();
		element1.click();
		
	}
	@Then("^click on payment$")
	public void click_on_payment() {
		WebElement buy=driver.findElement(By.xpath("//input[@id='buy-now-button']"));
		buy.click();
		
	}
	@And("^done the payment$")
	public void done_payment() {
		WebElement need=driver.findElement(By.xpath("//span[@class='a-expander-prompt']"));
		need.click();
		
		
	}
	@Then("^close browser$")
	public void close_browser() throws InterruptedException {
		Thread.sleep(3000);
		driver.quit();
	}
	

}
