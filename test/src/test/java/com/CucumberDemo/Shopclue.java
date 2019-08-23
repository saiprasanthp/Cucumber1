package com.CucumberDemo;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Shopclue {
public	static WebDriver driver=null;
static Set<String> se;
String child;
	
	@Given("^user is in user is in login page$")
	public void user_is_in_user_is_in_login_page()  {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\chromedriver_win32_74\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.shopclues.com/");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    
	}

	@Then("^move to men$")
	public void move_to_men()  {
	WebElement element=	driver.findElement(By.xpath("//a[text()='MEN']"));
	Actions a=new Actions(driver);
	a.moveToElement(element).build().perform();
	//element.click(); 
	}

	@Then("^click T-shirt$")
	public void click_T_shirt()  {

		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement element=	driver.findElement(By.xpath("//a[text()='T-shirt']"));
	Actions a=new Actions(driver);
	a.moveToElement(element).build().perform();
	element.click();
	
	
	   
	}

	@Then("^user is in page and click on Word play$")
	public void user_is_in_page_and_click_on_Word_play()  {
				
	
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	WebElement element=	driver.findElement(By.xpath("//img[@id='det_img_144877827']"));
	Actions a1=new Actions(driver);
	a1.moveToElement(element).build().perform();
	element.click();
		}
	
	   
	

	@Then("^click on sandle$")
	public void click_on_sandle()  {
	
		driver.findElement(By.xpath("//img[@title='Trilokani Boys Sandals TFC75BEIGE!']")).click();
	    
	}


	
	

	
	
	
	
	
	

}
