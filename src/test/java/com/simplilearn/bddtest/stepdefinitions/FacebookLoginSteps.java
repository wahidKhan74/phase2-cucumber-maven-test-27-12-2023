package com.simplilearn.bddtest.stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class FacebookLoginSteps {

	String driverPath ="C:\\WaheedTraining\\phase2-cucumber-maven-test-27-12-2023\\src\\test\\resources\\drivers\\windows\\chromedriver.exe";
	String siteUrl = "https://www.facebook.com/";
	WebDriver driver;
	
	@Before(value = "@FbTest")
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", driverPath);
	    driver = new ChromeDriver();
	    driver.get(siteUrl);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	
	@After(value = "@FbTest")
	public void cleanUp() {
		if(driver!=null)
			driver.quit();
	}
	
	@Given("^I should be on the facebook login page$")
	public void i_should_be_on_the_facebook_login_page() {
	   driver.get(siteUrl+"login");
	}

	@Given("^I enters email adress \"([^\"]*)\"$")
	public void i_enters_email_adress(String username) {
	   driver.findElement(By.id("email")).sendKeys(username);
	}

	@Given("^I enters password \"([^\"]*)\"$")
	public void i_enters_password(String password) {
		driver.findElement(By.id("pass")).sendKeys(password);
	}

	@Given("I clicked on login button")
	public void i_clicked_on_login_button() {
		driver.findElement(By.name("login")).click();
	}

	@Then("I returns back on the facebook login page")
	public void i_returns_back_on_the_facebook_login_page() throws InterruptedException {
		Thread.sleep(3000);
		WebElement errorEm = driver.findElement(By.cssSelector("#loginform > div:nth-child(12) > div._9ay7"));
	    assertEquals("The password that you've entered is incorrect. Forgotten password?", errorEm.getText());
	}
}
