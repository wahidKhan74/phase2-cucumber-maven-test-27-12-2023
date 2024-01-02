package com.simplilearn.bddtest.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/Features", 
	glue = {"com/simplilearn/bddtest/stepdefinitions" },
	tags = "not @ignore",
	plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	)
public class TestRunner { }
