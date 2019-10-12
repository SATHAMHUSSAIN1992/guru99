package org.cucum.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Final {
	static WebDriver driver;
	@Given("User want to homepage")
	public void user_want_to_homepage() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\CucumPrac\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/index.html");
	    WebElement element1 = driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]"));
	    element1.click();
	
	}

	@When("user want to fill details {string},{string},{string},{string},{string}")
	public void user_want_to_fill_details(String first, String last, String email, String add, String phno) {
		WebElement click = driver.findElement(By.xpath("//label[text()='Done']"));
		click.click();
		WebElement firstname = driver.findElement(By.xpath("//input[@id='fname']"));
		firstname.sendKeys(first);
		WebElement lastname = driver.findElement(By.xpath("//input[@id='lname']"));
		lastname.sendKeys(last);
		WebElement mail = driver.findElement(By.xpath("//input[@id='email']"));
		mail.sendKeys(email);
		WebElement address = driver.findElement(By.xpath("//textarea[@id='message']"));
		address.sendKeys(add);
		WebElement mobno = driver.findElement(By.xpath("//input[@id='telephoneno']"));
		mobno.sendKeys(phno);
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();	}

	@Then("user filled the details")
	public void user_filled_the_details() {
		String url = driver.getCurrentUrl();
		if(url.contains("telecom")){
		System.out.println("completed");
	}
		else {
			System.out.println("Failed");
		}
	}
	
		

	
}
