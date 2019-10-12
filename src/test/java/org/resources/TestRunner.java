package org.resources;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Dell\\eclipse-workspace\\CucumPrac\\src\\test\\resources\\Mac.feature",glue="org.resources",dryRun=true)

public class TestRunner {

}
