import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class guru {
	static WebDriver driver;
	@Given("User want to be in home page,click Add customer")
	public void user_want_to_be_in_home_page_click_Add_customer() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\CucumPrac\\driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/index.html");
	    WebElement element = driver.findElement(By.xpath("http://demo.guru99.com/telecom/index.html"));
	    element.click();
	}

	@When("Enter the details in Add customer page<{string}>{string}Hussain{string}satham{int}all@gmail.com{string}Nagercoil{string}{int}\",")
	public void enter_the_details_in_Add_customer_page_Hussain_satham_all_gmail_com_Nagercoil(String string, String string2, String string3, Integer int1, String string4, String string5, Integer int2) {
		WebElement click = driver.findElement(By.id("//input[@id='done']"));
		click.sendKeys(string);
		WebElement firstname = driver.findElement(By.id("//input[@id='fname']"));
		firstname.sendKeys(string2);
		WebElement lastname = driver.findElement(By.id("//input[@id='lname']"));
		lastname.sendKeys(string3);
		WebElement email = driver.findElement(By.id("//input[@id='email']"));
		email.sendKeys(string3);
		WebElement address = driver.findElement(By.id("//textarea[@id='message']"));
		address.sendKeys(string4);
		WebElement mobno = driver.findElement(By.id("//input[@id='telephoneno']"));
		mobno.sendKeys(string5);
		WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
	}

	@Then("Navigate to customer Id Creation page")
	public void navigate_to_customer_Id_Creation_page() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("Enter the details in Add customer page<{string}>{string}kandan{string}mani{int}@gmail.com{string}Chennai{string}{int}\",")
	public void enter_the_details_in_Add_customer_page_kandan_mani_gmail_com_Chennai(String string, String string2, String string3, Integer int1, String string4, String string5, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	}


}
