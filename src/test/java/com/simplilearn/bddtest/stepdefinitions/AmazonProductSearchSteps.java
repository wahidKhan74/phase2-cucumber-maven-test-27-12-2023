package com.simplilearn.bddtest.stepdefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AmazonProductSearchSteps {

	String driverPath ="C:\\WaheedTraining\\phase2-cucumber-maven-test-27-12-2023\\src\\test\\resources\\drivers\\windows\\chromedriver.exe";
	String siteUrl = "https://www.amazon.in/";
	WebDriver driver;
	
	@Given("^Open the Chrome and launch amazon application$")
	public void open_the_chrome_and_launch_amazon_application() {
		System.setProperty("webdriver.chrome.driver", driverPath);
	    driver = new ChromeDriver();
	    driver.get(siteUrl);
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	}
	
	@When("^Enter the Product search$")
	public void enter_the_product_search(DataTable dataTable) throws InterruptedException {
		List<Map<String, String>> dataList = dataTable.asMaps(String.class, String.class);
		 System.out.println(">>>>>>>>>>>>"+ dataList);
		for(Map<String, String> data : dataList) {
			WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
			searchBox.sendKeys(data.get("name"));
			searchBox.submit();
			Thread.sleep(2000);
			// searchBox.clear();
		}
		// add delay
		Thread.sleep(2000);
	}

	@Then("^Submit Search for the product$")
	public void submit_search_for_the_product() {
	   
	}

	@Then("^Clear search$")
	public void clear_search() {
	   
	}
}
