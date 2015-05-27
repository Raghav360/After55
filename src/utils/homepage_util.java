package utils;


public class homepage_util extends custom_util {
	
	//Description: This is method to execute search result for entered keyword for Retirement Communities, Care Communities or both
	public static void gotoseniorhousingstate()
	{
		getWebDriver().navigate().to(URL);
		WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
		clickOn(locators.Homepage_loc.SENIORHOUSINGBYSTATELINK);
		WaitForElementPresent(locators.Search_loc.SEARCHBYSTATEHEADING, timeout);
	}
	
	
}
	
