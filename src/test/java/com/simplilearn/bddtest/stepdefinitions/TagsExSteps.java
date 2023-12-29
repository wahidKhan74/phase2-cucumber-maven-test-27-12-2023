package com.simplilearn.bddtest.stepdefinitions;

import io.cucumber.java.en.Given;

public class TagsExSteps {

	@Given("This is a blank test")
	public void this_is_a_blank_test() {
	   System.out.println("-- Test logic --");
	}
}
