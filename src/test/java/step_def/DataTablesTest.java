package step_def;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class DataTablesTest extends LinkedinObjectMap {
	public WebDriver driver;
	public WebDriverWait wait;
	@Given("^navigate to Home Page$")
	public void User_is_on_Home_Page(){
		System.setProperty("webdriver.chrome.driver", "D:\\BrowserExeFiles\\chromedriver_win32\\chromedriver.exe");
		//interface refvar=new implementingclass();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wait=new WebDriverWait(driver,60);
		driver.get("https://www.linkedin.com/");
	}
	
	@When("^enter Credentials to LogIn$")
	public void User_enters_and(DataTable data){
		
		List<List<String>>dt=data.raw();
		
		driver.findElement(EMAIL_EDITBOX).sendKeys(dt.get(0).get(0));
		driver.findElement(PWD_EDITBOX).sendKeys(dt.get(0).get(1));
	}
	
	@When("^click login btn$")
	public void click_on_signin_button(){
		driver.findElement(SIGNIN_BTN).click();
	}
	@Then("^inbox page is shown$")
	public void linkedin_homepage_should_be_displayed() throws InterruptedException{
		wait.until(ExpectedConditions.titleContains("LinkedIn"));
		Thread.sleep(4000);
		driver.close();
	}
}
