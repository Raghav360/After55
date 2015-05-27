package utils;

public class login_util extends custom_util {
	
	//This method perform login for the entered user credentials
	public static void login(String username, String password)
	{
		getWebDriver().navigate().to(URL+"/admin/auth/index/");
		WaitForElementPresent(locators.Login_loc.SIGNINBTN, timeout);
		sendKeys(locators.Login_loc.USRNAMETXTBOX, username);
		sendKeys(locators.Login_loc.PASSWORDTXTBOX, password);
		clickOn(locators.Login_loc.SIGNINBTN);
		WaitForElementPresent(locators.Homepage_loc.LOGOUTLINK, timeout);
	}
	
	//This method performs logout function
	public static void logout()
	{
		WaitForElementPresent(locators.Homepage_loc.LOGOUTLINK, timeout);
		clickOn(locators.Homepage_loc.LOGOUTLINK);
		WaitForElementPresent(locators.Login_loc.SIGNINBTN, timeout);
		getWebDriver().manage().deleteAllCookies();
	}
	
}
