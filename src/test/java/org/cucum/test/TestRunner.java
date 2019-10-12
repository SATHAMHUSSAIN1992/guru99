package org.cucum.test;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\resources\\feature\\OneDMap.feature",glue="org.cucum.test",dryRun=false,monochrome=true,
plugin= {"pretty","html:target/cucumber-reports","junit:target/cucumber-reports/cucumber.xml","json:target/cucumber-reports/cucumber.json"})	


public class TestRunner {
	
	
	
} 