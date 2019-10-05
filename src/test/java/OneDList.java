import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OneDList {
public static WebDriver driver;
	@Given("User is in home page,Click Add to customer")
	public void user_is_in_home_page_Click_Add_to_customer() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\CucumPrac\\drivers\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.get("http://demo.guru99.com/telecom/index.html");
	    driver.manage().window().maximize();
	    WebElement element1 = driver.findElement(By.xpath("(//a[text()='Add Customer'])[1]"));
	    element1.click();
	}

	@When("User want enter details in add customer field")
	public void user_want_enter_details_in_add_customer_field(io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
	    List<String> cuslist = dataTable.asList(String.class);
	    driver.findElement(By.xpath("//label[text()='Done']")).click();
		
		driver.findElement(By.xpath("//input[@id='fname']")).sendKeys(cuslist.get(0));
	
		driver.findElement(By.xpath("//input[@id='lname']")).sendKeys(cuslist.get(1));
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(cuslist.get(2));
		
		driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys(cuslist.get(3));
		
		driver.findElement(By.xpath("//input[@id='telephoneno']")).sendKeys(cuslist.get(4));
		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
	}
	@Then("Navigate to customer id creation page")
	public void navigate_to_customer_id_creation_page() {
	    String url = driver.getCurrentUrl();
	    if(url.contains("telecom")) {
	    System.out.println("completed succesfully");
}

	else {
		System.out.println("Failed");
		
	}

	driver.quit();
}
}