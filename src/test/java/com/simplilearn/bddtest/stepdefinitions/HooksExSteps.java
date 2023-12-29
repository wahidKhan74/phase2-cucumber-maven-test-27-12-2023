package com.simplilearn.bddtest.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HooksExSteps {

	@Given("^I want to write a step with precondition$")
	public void i_want_to_write_a_step_with_precondition() {
	    System.out.println("Steps : 1");
	}

	@Given("^some other precondition$")
	public void some_other_precondition() {
		 System.out.println("Steps : 2");
	}

	@When("^I complete action$")
	public void i_complete_action() {
		 System.out.println("Steps : 3");
	}

	@Then("^I validate the outcomes$")
	public void i_validate_the_outcomes() {
		 System.out.println("Steps : 4");
	}

	@Then("^check more outcomes$")
	public void check_more_outcomes() {
		 System.out.println("Steps : 5");
	}

}
