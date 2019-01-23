package step_def;

import org.openqa.selenium.By;

public class LinkedinObjectMap {

public static final By EMAIL_EDITBOX=By.id("login-email");

public static final By PWD_EDITBOX=By.name("session_password");

public static final By SIGNIN_BTN=By.id("login-submit");

public static final By PROFILE_CARD_SECTION=By.xpath("//*[contains(@class,'profile-rail-card container')]");

public static final By PROFILE_IMAGE=By.xpath("//img[@class='nav-item__profile-member-photo nav-item__icon']");

public static final By SIGNOUT_LINK=By.xpath("//*[@data-control-name='nav.settings_signout']");	

public static final By SEARCH_EDITBOX=By.xpath("//*[@role='combobox' and @placeholder='Search']");

public static final By SEARCH_BTN=By.xpath("//*[@data-control-name='nav.search_button']");
public static final By SEARCH_RESULTS_HEADER=By.xpath("//*[contains(@class,'search-results__total')]");
	
	
}
