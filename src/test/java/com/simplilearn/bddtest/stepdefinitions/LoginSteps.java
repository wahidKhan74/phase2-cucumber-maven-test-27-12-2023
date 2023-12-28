package com.simplilearn.bddtest.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

	@Given("^user should be on the login page$")
	public void user_should_be_on_the_login_page() {
		System.out.println("This step : user should be on the login page.");
	}

	@Given("^user enters email adress$")
	public void user_enters_email_adress() {
		System.out.println("This step : user enters email adress.");
	}

	@Given("^user clicks login in button")
	public void user_clicks_login_in_button() {
		System.out.println("This step : user clicks login button");
	}

	@Then("^user should navigate to My Account$")
	public void user_should_navigate_to_my_account() {
		System.out.println("This step : user should navigate to My Account");
	}

	@Given("^User want to enter valid ceredntials$")
	public void user_want_to_enter_valid_ceredntials() {
		System.out.println("This step : User want to enter valid ceredntials");
	}

	@When("^user check for email and password fields$")
	public void user_check_for_email_and_password_fields() {
		System.out.println("This step : user check for email and password fields");
	}

	@When("^user enters following details$")
	public void user_enters_following_details(io.cucumber.datatable.DataTable dataTable) {
		System.out.println("This step : user enters following details");
	}

	@Given("^user enters password$")
	public void user_enters_password() {
		System.out.println("This step : user enters password");
	}

	@Then("^error message displayed with wrong credentials$")
	public void error_message_displayed_with_wrong_credentials() {
		System.out.println("This step : error message displayed with wrong credentials");
	}

	@Then("^user returns back on the login page$")
	public void user_returns_back_on_the_login_page() {
		System.out.println("This step : user returns back on the login page");
	}

}
