package com.simplilearn.bddtest.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartSteps {

	@Given("^User search for a product \"([^\"]*)\"$")
	public void user_search_for_a_product(String string) {
	   System.out.println("User search for a product {string}");
	}

	@When("^Add the first laptop that apears in the search results to the basket$")
	public void add_the_first_laptop_that_apears_in_the_search_results_to_the_basket() {
		System.out.println("Add the first laptop that apears in the search results to the basket");
	}

	@When("^User clicks on \"([^\"]*)\" link$")
	public void user_clicks_on_link(String string) {
		System.out.println("User clicks on {string} link");
	}

	@Then("^User basket should display added \"([^\"]*)\" items$")
	public void user_basket_should_display_added_items(Integer int1) {
		System.out.println("User basket should display added {int} items");
	}
}
