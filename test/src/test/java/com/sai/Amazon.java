package com.sai;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Amazon {
	WebDriver driver;
	@Given("^user is in amazon page$")
	public void user_Amazon_Page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@Then("^move to Hello,sign up$")
	public void move_Hello_up() {
		WebElement element=driver.findElement(By.xpath("//span[text()='Hello, Sign in']"));
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
	}
	@Then("^click on login$")
	public void click_Login() {
		WebElement element=driver.findElement(By.xpath("(//span[text()='Sign in'])[1]"));
		WebDriverWait wait1=new WebDriverWait(driver, 40);
		wait1.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	@Then("^user is on homepage$")
	public void user_Homepage() {
		String url=driver.getCurrentUrl();
		System.out.println(url);
	
	}
	@Then("^enter mobile number$")
	public void enter_Mobile_number() {
		WebElement element=driver.findElement(By.xpath("//input[@id='ap_email']"));
		element.sendKeys("sai");
		
	}
	@And("^click continue$")
	public void click_Continue() throws InterruptedException {
		WebElement element=driver.findElement(By.xpath("//input[@id='continue']"));
		element.click();
		Thread.sleep(3000);
		driver.quit();
	}
	
}
