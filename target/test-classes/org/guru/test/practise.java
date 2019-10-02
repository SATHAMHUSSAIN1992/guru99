package org.guru.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class practise {
public static void main(String[] args) {
	
	@Given("User want to be in home page,click Add customer")
	public void user_want_to_be_in_home_page_click_Add_customer() {
	    System.setProperty("www.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\CucumPrac\\driver\\chromedriver.exe");
	    WebDriver driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/index.html");
	    driver.findElement(By.xpath("http://demo.guru99.com/telecom/index.html"));
	    throw new cucumber.api.PendingException();
	}

	@When("Enter the details in Add customer page<{string}>{string}Hussain{string}satham{int}all@gmail.com{string}Nagercoil{string}{int}\",")
	public void enter_the_details_in_Add_customer_page_Hussain_satham_all_gmail_com_Nagercoil(String string, String string2, String string3, Integer int1, String string4, String string5, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@Then("Navigate to customer Id Creation page")
	public void navigate_to_customer_Id_Creation_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}

	@When("Enter the details in Add customer page<{string}>{string}kandan{string}mani{int}@gmail.com{string}Chennai{string}{int}\",")
	public void enter_the_details_in_Add_customer_page_kandan_mani_gmail_com_Chennai(String string, String string2, String string3, Integer int1, String string4, String string5, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
}
