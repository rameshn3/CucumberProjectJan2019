package step_def;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LinkedinLoginTest extends LinkedinObjectMap{

WebDriver driver=null;

WebDriverWait wait=null;

@Given("^open the browser$")
public void open_the_browser() {
	//set the chromedriver.exe path
			System.setProperty("webdriver.chrome.driver", "D:\\BrowserExefiles\\chromedriver_win32\\chromedriver.exe");
			//interface refvar=new implemetingclass();
			driver=new ChromeDriver();
			wait=new WebDriverWait(driver,30);
			//implicitwait
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			//maximize the window
			driver.manage().window().maximize();
}

@Given("^open the linkedin url$")
public void open_the_linkedin_url() {
	driver.get("http://linkedin.com");
	wait.until(ExpectedConditions.titleContains("LinkedIn: Log In or Sign Up"));
}

@When("^type the username in username editbox$")
public void type_username_in_username_editbox() {
	driver.findElement(EMAIL_EDITBOX).sendKeys("rameshqaonline@gmail.com");
}

@When("^type the password in pwd editbox$")
public void type_pwd_in_pwd_editbox() {
	driver.findElement(PWD_EDITBOX).sendKeys("welcome123$");
}

@When("^click on sign in button$")
public void click_on_signin_btn() {
	driver.findElement(SIGNIN_BTN).click();
}
	
@Then("^Linkedin home page should be displayed$")
public void validate_linkedin_Home_page() throws InterruptedException {
	wait.until(ExpectedConditions.presenceOfElementLocated(PROFILE_CARD_SECTION));
	Thread.sleep(4000);
	driver.close();
}



}
