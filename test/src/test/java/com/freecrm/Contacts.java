package com.freecrm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Contacts {
	public static WebDriver driver=null;
	public static Actions a;
	
	@Before
	public void first() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		
		
	}
	
	@Before("first")
	@Given("^user is in contact page$")
	public void user_in_login_page() {
		driver.get("https://ui.freecrm.com/contacts");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("sai.p342@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8125900610");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		
	}
	
	@Then("^click on new option$")
	public void click_new_option() {
		
	WebElement ele=	driver.findElement(By.xpath("(//button[@class='ui linkedin button'])[3]"));
	a=new Actions(driver);
	a.moveToElement(ele).click().build().perform();
	
		
	}
	@Then("^enter Firstname \"([^\"]*)\"$")
	public void enter_Firstname(String arg1) throws Throwable {
	   
		driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(arg1);
	}
		
	
	@Then("^enter lastname \"(.*)\"$")
	public void enter_lastname(String name) {
		driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(name);
	}
	@Then("^click on save button$")
	public void click_save_button() {
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
	}
	
	@Then("^click on contacts button$")
	public void click_on_contacts_button() {
		WebElement d=driver.findElement(By.xpath("//span[text()='Contacts']"));
		a.moveToElement(d).click().build().perform();
	}
	
	@After
	public void down() {
		driver.quit();
	}

}
