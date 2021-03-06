package org.cucum.test;
import java.sql.Driver;
import java.util.List;
import java.util.Map;

import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;


public class OneDMap {
public static WebDriver driver;
	@Given("User is in home page, click Add to customer")
	public void user_is_in_home_page_click_Add_to_customer() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\CucumPrac\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/index.html");
	    driver.manage().window().maximize();
	    WebElement element1 = driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]"));
	    element1.click();
	}

	@When("User should enters details in add customer field")
	public void user_should_enters_details_in_add_customer_field(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
		Map<String, String> custlist=dataTable.asMap(String.class, String.class);
        driver.findElement(By.xpath("//label[text()='Done']")).click();
		
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(custlist.get("Firstname"));
	
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(custlist.get("Lastname"));
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(custlist.get("email"));
		
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(custlist.get("Address"));
		
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(custlist.get("Mobilenumber"));
		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	
	
	}

	@Then("Navigates to customer id page")
	public void navigates_to_customer_id_page() {
		String url = driver.getCurrentUrl();
	    if(url.contains("telecom")) {
	    	System.out.println("completed successfully");
	    }
	    else {
	    	System.out.println("Failed");
	    }
	driver.quit();
	}

	}


