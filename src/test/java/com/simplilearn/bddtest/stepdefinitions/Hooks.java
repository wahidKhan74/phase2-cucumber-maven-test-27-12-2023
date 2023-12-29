package com.simplilearn.bddtest.stepdefinitions;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Hooks {

//	@Before
//	public void beforeScenario() {
//		System.out.println("-- This will run before the Scenario --");
//	}
//	
//	@After
//	public void afterScenario() {
//		System.out.println("-- This will run after the Scenario --");
//	}
//	
//	@BeforeStep
//	public void beforeStep() {
//		System.out.println("-- Before step --");
//	}
//	
//	@AfterStep
//	public void afterStep() {
//		System.out.println("-- After step --");
//	}
	
	
	@Before(value = "@tag1")
	public void beforeTag1Scenario() {
		System.out.println("-- Before Tag1 Scenario --");
	}
	
	@After(value = "@tag1")
	public void afterTag1Scenario() {
		System.out.println("-- After Tag1 Scenario --");
	}
	
//	@Before(value = "@tag2 or @tag3")
//	public void beforeTag23Scenario() {
//		System.out.println("-- Before Tag 2 or 3 Scenario --");
//	}
//	
//	@After(value = "@tag2 or @tag3")
//	public void afterTag23Scenario() {
//		System.out.println("-- After Tag 2 or 3 Scenario --");
//	}
	
	@Before(value = "@tag2 and @tag3")
	public void beforeTag23Scenario() {
		System.out.println("-- Before Tag 2 and 3 Scenario --");
	}
	
	@After(value = "@tag2 and @tag3")
	public void afterTag23Scenario() {
		System.out.println("-- After Tag 2 and 3 Scenario --");
	}
}
