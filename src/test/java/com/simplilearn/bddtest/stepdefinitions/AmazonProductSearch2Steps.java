package com.simplilearn.bddtest.stepdefinitions;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.cucumber.listener.Reporter;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonProductSearch2Steps {

	String driverPath ="C:\\WaheedTraining\\phase2-cucumber-maven-test-27-12-2023\\src\\test\\resources\\drivers\\windows\\chromedriver.exe";
	String siteUrl = "https://www.amazon.in/";
	WebDriver driver;
	WebElement searchBox;
	
	@Before(value = "@AmazonSearchTest")
	public void setUp() {
	    driver = new ChromeDriver();
	}
	
	@After(value = "@AmazonSearchTest")
	public void cleanUp() {
		if(driver!=null)
			driver.quit();
	}
	
	@Given("^Launch amazon application on chrome$")
	public void launch_amazon_application_on_chrome() {
		 driver.get(siteUrl);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}

	@When("^Enter Product Search input \"([^\"]*)\"$")
	public void enter_product_search_input(String productName) throws InterruptedException {
		Thread.sleep(2000);
		searchBox = driver.findElement(By.id("twotabsearchtextbox"));
		searchBox.sendKeys(productName);
		Thread.sleep(2000);
	}

	@Then("^Submit Product Search$")
	public void submit_product_search() throws InterruptedException {
		searchBox.submit();
		Thread.sleep(2000);
	}

	@And("^Verify page title \"([^\"]*)\"$")
	public void verify_page_title(String pageTitle) {
	   assertEquals(pageTitle, driver.getTitle());
	}
}
