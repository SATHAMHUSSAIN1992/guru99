	import java.awt.AWTException;
	import java.awt.Robot;
	import java.awt.event.KeyEvent;
	import java.io.File;

	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.TakesScreenshot;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.support.ui.Select;

public class Base {

	   //Launching Browser
		public static WebDriver driver;
		public static WebDriver getbrowser() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\CucumPrac\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			return driver;
			}

		//Load link
		public static void loadurl(String url) {
			driver.get(url);
			}

		//Finding Locators
		public static  WebElement findelementById(String value){
			WebElement findElement2 = driver.findElement(By.id(value));
			return findElement2;
		}
		
		public static  WebElement findelementByxpath(String value){
			WebElement findElement3 = driver.findElement(By.xpath(value));
			return findElement3;
		}
		
		//Quit browser
		public static void quitpage() {
			driver.quit();
		}

		//Send Keys
		public static void typetext(WebElement element,String value) {
			element.sendKeys(value);
		}
		//Button Click
		public static void btnclick(WebElement btn) {
			btn.click();
		}

		//Robot TAB
		public static void robotab() throws AWTException {
			Robot r = new Robot();
			
			r.keyPress(KeyEvent.VK_TAB);
			r.keyRelease(KeyEvent.VK_TAB);
		}
		
		//Robot Enter
		public static void robotenter() throws AWTException {
			Robot r = new Robot();
			
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
		}
		
		//Robot Key Up
		public static void robokeyup() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_UP);
			r.keyRelease(KeyEvent.VK_UP);
		}
		
		//Robot Key Down
		public static void robokeydown() throws AWTException {
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_DOWN);
			r.keyRelease(KeyEvent.VK_DOWN);
		}

		//Taking ScreenShot
		public static void screenshot(String path) {
			TakesScreenshot tk = (TakesScreenshot)driver;
		File f= tk.getScreenshotAs(OutputType.FILE);
		}
		
		//DropDown select By index
		public Select selectindex(WebElement e) {
			Select s = new Select(e);
			return s;
			
		}
	     //Select by value
		public void selectvalue() {
			Select s = new Select(null);
			s.selectByValue("arg0");
		}
	}





