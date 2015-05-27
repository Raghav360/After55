package test;


import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utils.custom_util;

public class search_test extends custom_util{
//Description:Verify Vanity URL for all the account types
/*	@Test (alwaysRun=true)
	public void testvanityurls() throws Exception
	{
		try {
			utils.login_util.login(csuser, csuserpass);
			getWebDriver().navigate().to(URL+"/admin/accountdetails/index/id/"+siteid);
			String rand = JavaScriptExecute1();
			String Vanity = "ankit"+rand;
			sendKeys(locators.backend_loc.ACCDETAIL_VANITYURL, Vanity);
			sendKeys(locators.backend_loc.ACCDETAIL_FIRSTNAME, "testankit");
			Thread.sleep(5000);
			clickOn(locators.backend_loc.SAVECHANGESBTN);
			WaitForElementPresent(locators.backend_loc.SAVECHANGEMSG, timeout);
			Thread.sleep(3000);
			getWebDriver().navigate().to(URL+":8080/solr/listingdetails/dataimport?command=delta-import");
			Thread.sleep(3000);
			getWebDriver().navigate().to(URL+"/"+Vanity);
					}
			
			catch (Error e) {					
				captureScreenshot("testvanityURL");	
				throw e;
			}
		
	}*/
	//Description: This script covers executing keyword search selecting Housing Communities
	@Test (alwaysRun=true)
	public void testhousingcommsearch() throws Exception
	{
		try {
		//Perform keyword search Housing communities from drop down
			utils.search_util.ExecuteSearch("Virginia Beach, VA", "Housing Communities");
			utils.search_util.ExecuteSearch("23456", "Housing Communities");
			}
		catch (Error e) {					
			captureScreenshot("testhousingcommunitysearch");	
			throw e;
		}
	}
	//Description: This script covers executing keyword search selecting Care Communities
	@Test (alwaysRun=true)
	public void testcarecommsearch() throws Exception
	{
		try {
		//Perform keyword search selecting Care communities check box
			utils.search_util.ExecuteSearch("Phoenix, AZ", "Care Communities");
			utils.search_util.ExecuteSearch("23456", "Care Communities");
			}
		catch (Error e) {					
			captureScreenshot("testcarecommsearch");	
			throw e;
		}
	}

	//Description: This script covers executing keyword search selecting RV Living
	@Test (alwaysRun=true)
	public void testrvlivingsearch() throws Exception
	{
		try {
		//Perform keyword search selecting RV Living
	    	utils.search_util.ExecuteSearch("Phoenix, AZ", "RV Living");
	    	utils.search_util.ExecuteSearch("23456", "RV Living");
		}
		catch (Error e) {					
			captureScreenshot("testrvlivingsearch");	
			throw e;
		}
	}
	
	
	//Verify contact details of any property displayed after executing care communities search
	/*@Test(alwaysRun=true)
	public void testverifycarepropertycontactdetails() throws Exception
	{
		   try{
			   utils.search_util.ExecuteSearch("23456", "care");
			   //Checking if pagination links are present
			   if(isElementPresent("//div[@id='list-container']//a[text()='2']")){
				   int y = getWebDriver().findElements(ByLocator("//div[@id='list-container']//div[@id='jpage-holder']/a")).size();
				   int paginationcount = y-2;
				   int rand = new Random().nextInt(paginationcount);
				   //Click on any random pagination link
				   clickOn("//div[@id='list-container']//a[text()='"+rand+"']");
				   WaitForElementPresent("//div[@id='list-container']//a[text()='"+rand+"' and contains(@class, 'jp-current')]", timeout);}
			   int count = utils.search_util.SearchResultsCount();
			   int random = new Random().nextInt(count);
			   //Get profile id
			   String profileid = utils.search_util.GetProfileId(random);
			   //Get contact no.
			   String contact = getText("//*[@id='itemContainer']/li[contains(@class, 'fadeInUp')]["+random+"]//span[@class='item-phone'][1]");
			   //Login and verify contact details
			   utils.login_util.login(csuser, csuserpass);
			   //Go to Lead management page
			   getWebDriver().navigate().to(URL+"/admin/leadmanagement/index/id/"+profileid);
			   WaitForElementPresent(locators.backend_loc.LEADMGMT_INTERNETLOCALTOLLCHCKBOX, timeout);
			   if(isChecked(locators.backend_loc.LEADMGMT_INTERNETTOLLCHCKBOX)==true){	
				  Assert.assertEquals(getValue(locators.backend_loc.LEADMGMT_INTERNETTOLLTXTBOX), contact);}
			   else{
				   //Go to Account details page
				   getWebDriver().navigate().to(URL+"/admin/accountdetails/index/id/"+profileid);
				   WaitForElementPresent(locators.backend_loc.ACC_PROPERTY_PHONETXTBOX, timeout);
				   Assert.assertEquals(getValue(locators.backend_loc.ACC_PROPERTY_PHONETXTBOX), contact);}
		   }
	catch (Error e) {					
		captureScreenshot("testverifycarepropertycontactdetails");	
		throw e;}}	*/
	
	//Verify the Print view present at Profile page of a property.
	/*@Test(alwaysRun=true)
	public void testprintview () throws Exception
	{
		try{
			getWebDriver().navigate().to(URL+"/listing/99747");
			//utils.search_util.ExecuteSearch("Virginia Beach, VA", "both");
			//clickOn(locators.search_loc.MOREINFO);
			//WaitForElementPresent(locators.search_loc.PRINTBTN, timeout);
			clickOn(locators.Search_loc.PRINTBTN);
			windowhandle(locators.Search_loc.ACTUALPRINTBTN, "http://www.evokebigdata.com/profileprint/99747/test-property1425279076966");
			Assert.assertTrue(isElementPresent(locators.Search_loc.ACTUALPRINTBTN));
	}
	catch (Error e) {					
		captureScreenshot("testverifycarepropertycontactdetails");	
		throw e;}}	
		*/
	//Verify that validations are displaying proper when user doesn't enter the search values
/*	@Test(alwaysRun=true)
	public void testvalidations() throws Exception
	{
		   try{
			   getWebDriver().navigate().to(URL);
				WaitForElementPresent(locators.search_loc.SEARCHBTN, timeout);
				clickOn(locators.search_loc.RETIREMENTCHCKBOX);
				clickOn(locators.search_loc.CARECHCKBOX);
				clickOn(locators.search_loc.SEARCHBTN);
				Assert.assertTrue(isElementPresent(locators.search_loc.ERRORMESSAGE));
					   
		   }
			catch (Error e) {					
				captureScreenshot("testverifycarepropertycontactdetails");	
				throw e;}
		}
		   
	//verify the phone tracking on Search results page
	 @Test(alwaysRun=true)
	public void testphonetrack() throws Exception
	{
		try{
			utils.search_util.ExecuteSearch("Virginia Beach, VA", "Housing" );
			Assert.assertTrue(isElementPresent(locators.search_loc.PHONETRACK));
	}

	catch (Error e) {					
		captureScreenshot("testphonetrack");	
		throw e;}
	}
	*/
	//Verify contact details of any property displayed after executing care & retirement communities search
	/*@Test(alwaysRun=true)
	public void testverifycareretpropertycontactdetails() throws Exception
	{
		   try{
			   utils.search_util.ExecuteSearch("08201", "both");
			   //Checking if pagination links are present
			   if(isElementPresent("//div[@id='list-container']//a[text()='2']")){
				   int y = getWebDriver().findElements(ByLocator("//div[@id='list-container']//div[@id='jpage-holder']/a")).size();
				   int paginationcount = y-2;
				   int rand = new Random().nextInt(paginationcount);
				   //Click on any random pagination link
				   clickOn("//div[@id='list-container']//a[text()='"+rand+"']");
				   WaitForElementPresent("//div[@id='list-container']//a[text()='"+rand+"' and contains(@class, 'jp-current')]", timeout);}
			   int count = utils.search_util.SearchResultsCount();
			   int random = new Random().nextInt(count);
			   //Get profile id
			   String profileid = utils.search_util.GetProfileId(random);
			   //Get contact no.
			   String contact = getText("//*[@id='itemContainer']/li[contains(@class, 'fadeInUp')]["+random+"]//span[@class='item-phone'][1]");
			   //Login and verify contact details
			   utils.login_util.login(csuser, csuserpass);
			   //Go to Lead management page
			   getWebDriver().navigate().to(URL+"/admin/leadmanagement/index/id/"+profileid);
			   WaitForElementPresent(locators.backend_loc.LEADMGMT_INTERNETLOCALTOLLCHCKBOX, timeout);
			   if(isChecked(locators.backend_loc.LEADMGMT_INTERNETTOLLCHCKBOX)==true){	
				  Assert.assertEquals(getValue(locators.backend_loc.LEADMGMT_INTERNETTOLLTXTBOX), contact);}
			   else{
				   //Go to Account details page
				   getWebDriver().navigate().to(URL+"/admin/accountdetails/index/id/"+profileid);
				   WaitForElementPresent(locators.backend_loc.ACC_PROPERTY_PHONETXTBOX, timeout);
				Assert.assertEquals(getValue(locators.backend_loc.ACC_PROPERTY_PHONETXTBOX), contact);}
		   }
		   
	catch (Error e) {					
		captureScreenshot("testverifycarepropertycontactdetails");	
		throw e;}} */
}