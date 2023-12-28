package com.simplilearn.bddtest.stepdefinitions;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ResetLoginFormSteps {

	String driverPath = "C:\\WaheedTraining\\phase2-cucumber-maven-test-27-12-2023\\src\\test\\resources\\drivers\\windows\\chromedriver.exe";
	String siteUrl = "file:///C:/WaheedTraining/phase2-cucumber-maven-test-27-12-2023/src/main/resources/static/login.html";
	WebDriver driver;

	@Given("^Open the Chrome and launch the application$")
	public void open_the_chrome_and_launch_the_application() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.get(siteUrl);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		Thread.sleep(3000);
	}

	@Given("^Maximize the Chrome browser window$")
	public void maximize_the_chrome_browser_window() {
		driver.manage().window().maximize();
	}

	@When("^Enter the Username and Password$")
	public void enter_the_username_and_password(DataTable dataTable) throws InterruptedException {
		
		System.out.println("Credentials Entered");
		List<Map<String, String>> data = dataTable.asMaps(String.class, String.class);
		// System.out.println(">>>>>>>>>>>>"+ data);
		for(Map<String, String> user : data) {
			String username = user.get("username");
			String password = user.get("password");
			driver.findElement(By.id("email")).sendKeys(username);
			driver.findElement(By.id("password")).sendKeys(password);
			Thread.sleep(1000);
			driver.findElement(By.name("Reset")).click();
		}
		
	}

	@Then("^Reset the credentials$")
	public void reset_the_credentials() {
		driver.findElement(By.name("Reset")).click();
	}

}
