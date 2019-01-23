package step_def;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PeopleSearch extends LinkedinObjectMap{
	WebDriver driver=null;

	WebDriverWait wait=null;

	@Given("^User is on linkedin login Page$")
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
				driver.get("http://linkedin.com");
				wait.until(ExpectedConditions.titleContains("LinkedIn: Log In or Sign Up"));
	}

	@When("^User enters \"([^\"]*)\" and \"([^\"]*)\" credentials$")
	public void User_enters_and(String username,String password){
		driver.findElement(EMAIL_EDITBOX).sendKeys(username);
		driver.findElement(PWD_EDITBOX).sendKeys(password);
	}

	@When("^user clicks on login button$")
	public void click_on_signin_btn() {
		driver.findElement(SIGNIN_BTN).click();
	}
		
	@Then("^Login Home page is displayed$")
	public void validate_login_Home_page() {
		wait.until(ExpectedConditions.presenceOfElementLocated(PROFILE_CARD_SECTION));
	}
	
	@When("^enter the search \"([^\"]*)\" in search editbox$")
	public void enter_search_keyword(String keyword) {
		driver.findElement(SEARCH_EDITBOX).clear();
		driver.findElement(SEARCH_EDITBOX).sendKeys(keyword);
		
	}
	@When("^click on search button$")
	public void click_search_btn() throws InterruptedException {
		
		driver.findElement(SEARCH_BTN).click();
		Thread.sleep(3000);
		
	}
	
	@Then("^search results should be displayed$")
	public void validate_search_results_page() {wait.until(ExpectedConditions.titleContains("Search | LinkedIn"));
	wait.until(ExpectedConditions.presenceOfElementLocated(SEARCH_RESULTS_HEADER));
	
	String results_txt=driver.findElement(SEARCH_RESULTS_HEADER).getText();
	System.out.println("results count text is-->"+results_txt);
	//String results_txt="Showing 206,351 results";
	String[] str=results_txt.split("\\s");
	System.out.println("results count in string format-->"+str[1]);
	int resultsCount=Integer.parseInt(str[1].replace(",",""));
	System.out.println("results count is-->"+resultsCount);
		
	}
	@Then("^do logout$")
	public void logoutTest() throws InterruptedException {
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(PROFILE_CARD_SECTION));
		
		driver.findElement(PROFILE_IMAGE).click();
		
		WebElement signout_link=driver.findElement(SIGNOUT_LINK);
		wait.until(ExpectedConditions.visibilityOf(signout_link));
		
		signout_link.click();
		wait.until(ExpectedConditions.titleContains("LinkedIn: Log In or Sign Up"));
		org.junit.Assert.assertEquals(driver.getTitle(), "LinkedIn: Log In or Sign Up");
		Thread.sleep(4000);
		driver.close();
	}	
}
