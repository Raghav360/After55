package test;

import java.util.Random;

import org.testng.annotations.Test;

import utils.custom_util;








import org.testng.Assert;
import org.testng.Reporter;
public class backend_test extends custom_util{
//Description: This script verifies that user reports are displaying in correct order
	@Test (alwaysRun=true)
	
	public void testreports() throws Exception
	{
		try {
			//Login
			utils.login_util.login(userid1, password);
			//Go to Reports section
			getWebDriver().navigate().to(URL+"/admin/reports/index/id/"+userprofileid1);
			WaitForElementPresent(locators.Backend_loc.PDFICON, timeout);
			//Verify Leads Dashboard Report and its contents
			Assert.assertTrue(isElementPresent(locators.Backend_loc.LEADSDASHBOARD));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.DATESELECTOR));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.EXCELICON));
			//Go to Phone call Lead detail report
			getWebDriver().navigate().to(URL+"/admin/reports/phonecallleads/id/"+userprofileid1);
			WaitForElementPresent(locators.Backend_loc.EXCELICON, timeout);
			Assert.assertTrue(isElementPresent(locators.Backend_loc.DATESELECTOR));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.PDFICON));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.CALLBYHRDAYHEADING));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.CALLBYDAYOFWEEKHEADING));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.SUMMARYCALLS));
			//Go to Guest card leads detail report
			getWebDriver().navigate().to(URL+"/admin/reports/guestcards/id/"+userprofileid1);
			WaitForElementPresent(locators.Backend_loc.PDFICON, timeout);
			Assert.assertTrue(isElementPresent(locators.Backend_loc.DATESELECTOR));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.EXCELICON));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.GUESTCARDLABEL));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.GUESTCARDBREAKDOWN));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.GUESTCARDDETAIL));
			//Go to Monthly traffic statistics report
			getWebDriver().navigate().to(URL+"/admin/reports/monthlystatistic/id/"+userprofileid1);
			WaitForElementPresent(locators.Backend_loc.PDFICON, timeout);
			Assert.assertTrue(isElementPresent(locators.Backend_loc.EXCELICON));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.MONTHLYTRAFFICLABEL));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.LEADBREAKDOWN));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.ADDITIONALTOUCHPOINTS));
			//12 month site performance
			getWebDriver().navigate().to(URL+"/admin/reports/siteperformance/id/"+userprofileid1);
			WaitForElementPresent(locators.Backend_loc.PDFICON, timeout);
			Assert.assertTrue(isElementPresent(locators.Backend_loc.EXCELICON));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.TWELVEMONTHSTATICREPORTLABEL));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.PROFILEPAGEVIEWS));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.GUESTCARDS));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.PHONELEADS));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.VANITYURLPROFILEVIEWS));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.CUSTOMERWEBSITECLICKS));
			//Community Emailer Report
			getWebDriver().navigate().to(URL+"/admin/reports/communitymailer/id/"+userprofileid1);
			WaitForElementPresent(locators.Backend_loc.PDFICON, timeout);
			Assert.assertTrue(isElementPresent(locators.Backend_loc.EXCELICON));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.COMMUNITYLABEL));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.COMMUNITYEMAILERBREAKDOWN));
			Assert.assertTrue(isElementPresent(locators.Backend_loc.COMMUNITYEMAILERDETAIL));
		}
			catch (Error e) {					
				captureScreenshot("testaddfloorplans");	
					throw e;
			}
		}
	//Description: This script verifies that user is able to add a floor plan successfully from backend
	@Test (alwaysRun=true)
	public void testaddfloorplans() throws Exception
	{
	try {
			//Login
			utils.login_util.login(csuser, csuserpass);
			//Go to Floor plans page
			getWebDriver().navigate().to(URL+"/admin/floorplan/index/id/"+"99790");
			WaitForElementPresent(locators.Backend_loc.ADDFLOORPLANBTN, timeout);
			//Click on Add a Floor Plan button
			clickOn(locators.Backend_loc.ADDFLOORPLANBTN);
			WaitForElementPresent(locators.Backend_loc.FLOORPLAN_SAVECHANGESBTN, timeout);
			String temp = JavaScriptExecute1();;
			String FP = "FP"+temp;
			sendKeys(locators.Backend_loc.FLOORPLAN_NAMETXTBOX, FP);
			sendKeys(locators.Backend_loc.FLOORPLAN_PRICEFROMTXTBOX, "500");
			sendKeys(locators.Backend_loc.FLOORPLAN_PRICETOTXTBOX, "1000");
			clickOn(locators.Backend_loc.FLOORPLAN_DISPLAYONSITECHCKBOX);
			//Selecting any random value except 'studio'
			int random = new Random().nextInt(5);
			selectDropDown(locators.Backend_loc.FLOORPLAN_BEDROOMSDRPDWN, String.valueOf(random));
			selectDropDown(locators.Backend_loc.FLOORPLAN_BATHROOMSDRPDWN, String.valueOf(random));
			clickOn("floorplandiagram");
			utils.backend_util.imageupload();
			clickOn(locators.Backend_loc.FLOORPLAN_SAVECHANGESBTN);
			WaitForElementPresent(locators.Backend_loc.ADDFLOORPLANBTN, timeout);
			utils.login_util.logout();
		}
		catch (Error e) {					
			captureScreenshot("testaddfloorplans");	
			throw e;
		}
	}
	//Description: This script verifies the View Our Website link
	@Test (alwaysRun=true)
	public void testcompanywebsiteurl() throws Exception
	{
		try {
			//Login with user credentials
			utils.login_util.login(userid2, password);
			Reporter.log("Login with User credentials", true);
			getWebDriver().navigate().to(URL+"/admin/leadmanagement/index/id/"+userprofileid2);
			Reporter.log("go to LEAD MANAGEMENT tab", true);
			WaitForElementPresent(locators.Backend_loc.COMPANYWEBSITEURL, timeout);
			sendKeys(locators.Backend_loc.COMPANYWEBSITEURL, websitevisiturl);
			Reporter.log("enter the URL www.corporatehousing.com", true);
			clickOn(locators.Backend_loc.SAVECHANGESBTN);
			Reporter.log("Click on save changes button", true);
			WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
			utils.login_util.logout();
			Reporter.log("Logout from application", true);
			getWebDriver().navigate().to(URL+":8080/solr/listingdetails/dataimport?command=delta-import");
			Reporter.log("Run Delta Import", true);
			Thread.sleep(2000);
			getWebDriver().navigate().to(URL+"/listing/"+userprofileid2);
			Reporter.log("Go to Property profile page for which the URL was added", true);
			WaitForElementPresent(locators.Backend_loc.VISTOURWEBSITE, timeout);
			Thread.sleep(2000);
			clickOn(locators.Backend_loc.VISTOURWEBSITE);
			Reporter.log("Click on View Our Website Link", true);
			windowhandle(locators.Backend_loc.VISTOURWEBSITE, websitevisiturl);
			Reporter.log("Go to the new tab", true);
			Assert.assertTrue(isElementPresent("//*[@id='menu-item-463']"));
			
		}
		catch (Error e) {					
			captureScreenshot("testaddfloorplans");	
			throw e;
		}
	}
	//Description: This script verifies that user is able to add a floor plan successfully from backend
		@Test (alwaysRun=true)
		public void testhousingtypeintegration() throws Exception
		{
			try {	
				utils.backend_util.checkhousingtypes();
				
			}
			catch (Error e) {					
				captureScreenshot("testaddfloorplans");	
				throw e;
			}
		}
	//Description: In this script we are verifying the Guest card lead report when user sends a guest card from 'Contact for rates' and 'Check availability' in floor plan sections
	@Test (alwaysRun=true)
	public void testgclead() throws Exception
	{
		try {
			//Login
			utils.login_util.login(csuser, csuserpass);
			String profileid = "99790";
			//Go to Guest card leads page
			getWebDriver().navigate().to(URL+"/admin/reports/guestcards/id/"+profileid);
			WaitForElementPresent(locators.Backend_loc.COUNT_GUESTCARDS, timeout);
			//Getting count of guest card leads 
			String count1 = getText(locators.Backend_loc.COUNT_GUESTCARDS);
			//Logout
			utils.login_util.logout();
			//Going to the profile page corresponding to the profile id where we have verified number of guest card leads
			getWebDriver().navigate().to(URL+"/listing/"+profileid);
			WaitForElementPresent(locators.Search_loc.PROFILE_CHECKAVAILABILITY,timeout);
			//Send Guest card
			sendKeys(locators.Search_loc.PROFILE_FNAME, "test test test test");
			sendKeys(locators.Search_loc.PROFILE_LNAME, "test test");
			sendKeys(locators.Search_loc.PROFILE_EMAIL, "test@test.com");
			sendKeys(locators.Search_loc.PROFILE_PHONE, "(555) 555-5555");
			sendKeys(locators.Search_loc.PROFILE_COMMENTS, desc);
			selectDropDown(locators.Search_loc.PROFILE_SEARCHINGFORDRPDWN, "Self");
			clickOn(locators.Search_loc.PROFILE_MOVEINDATE);
			WaitForElementPresent(locators.Search_loc.PROFILE_MOVEINDATE_NEXTARROW, timeout);
			clickOn(locators.Search_loc.PROFILE_MOVEINDATE_NEXTARROW);
			WaitForElementPresent(locators.Search_loc.PROFILE_MOVEINDATE15, timeout);
			clickOn(locators.Search_loc.PROFILE_MOVEINDATE15);
			sleep(3000);
			clickOn(locators.Search_loc.PROFILE_CHCKAVAILABILITYBTN);
			WaitForElementPresent(locators.Search_loc.PROFILE_THANKYOUMESSAGE, timeout);
			//Login
			utils.login_util.login(csuser, csuserpass);
			//Go to Guest card leads page
			getWebDriver().navigate().to(URL+"/admin/reports/guestcards/id/"+profileid);
			WaitForElementPresent(locators.Backend_loc.COUNT_GUESTCARDS, timeout);
			//Getting count of guest card leads 
			String count2 = getText(locators.Backend_loc.COUNT_GUESTCARDS);
			if(Integer.parseInt(count2)<=Integer.parseInt(count1)){
				Assert.fail("Number of guest cards should be correct");}
		}
		catch (Error e) {					
			captureScreenshot("testgclead");	
			throw e;
		}
	}
	//Description: This script will verify the Site Performance report
		@Test (alwaysRun=true)
		public void testsiteperformance() throws Exception{
			try{
				utils.login_util.login(csuser, csuserpass);
				Reporter.log("Login with Superadmin", true);
				clickOn(locators.Backend_loc.REPORTING);
				Reporter.log("click on Reporting from top header", true);
				WaitForElementPresent(locators.Backend_loc.REPORTINGSECTION, timeout);
				clickOn(locators.Backend_loc.SITEPERFORMANCEREPORT);
				Reporter.log("Click on Site performance Link", true);
				WaitForElementPresent(locators.Backend_loc.SITEPERFORMANCEHEADING, timeout);
				sendKeys(locators.Backend_loc.CITYTEXTFIELD, "Denver, CO");
				Reporter.log("Enter Denver, CO in the City text field", true);
				Thread.sleep(1000);
				clickOn(locators.Backend_loc.GETREPORTCITY);
				Reporter.log("click on Get Report button", true);
				Thread.sleep(10000);
				Assert.assertTrue(isElementPresent(locators.Backend_loc.RESULTLIST));
				Reporter.log("Verify the result list", true);
				Assert.assertTrue(isElementPresent(locators.Backend_loc.PERFORMANCEEXCELICON));
				Reporter.log("verify the excel icon");
				Thread.sleep(1000);
				//BY METRO SITE PERFORMANCE REPORT
				clickOn(locators.Backend_loc.BYMETROLINK);
				Reporter.log("Click on By Metro Link", true);
				WaitForElementPresent(locators.Backend_loc.BYMETROHEADING, timeout);
				selectDropDown(locators.Backend_loc.STATEDROPDOWN, "Virginia");
				Reporter.log("Select Virginia State from State Drop Down", true);
				Thread.sleep(5000);
				selectDropDown(locators.Backend_loc.METRODROPDOWN, "Hampton Roads");
				Reporter.log("Select Hampton Roads from Metro Drop down", true);
				clickOn(locators.Backend_loc.GETREPORTMETRO);
				Thread.sleep(10000);
				Assert.assertTrue(isElementPresent(locators.Backend_loc.METRORESULTHEADING));
				Reporter.log("Verify result heading", true);
				Assert.assertTrue(isElementPresent(locators.Backend_loc.RESULTLIST));
				Reporter.log("Verify results displayed", true);
				Assert.assertTrue(isElementPresent(locators.Backend_loc.PERFORMANCEEXCELICON));
				Reporter.log("verify Excel icon on the page", true);
				Thread.sleep(1000);
				//BY PMC SITE PERFORMANCE REPORT
				clickOn(locators.Backend_loc.BYPMC);
				Reporter.log("Click on By PMC", true);
				WaitForElementPresent(locators.Backend_loc.BYPMCHEADING, timeout);
				sendKeys(locators.Backend_loc.PMCTEXTFIELD, "FPI Management, Inc");
				Reporter.log("Enter FPI Management, Inc in PMC text field", true);
				clickOn(locators.Backend_loc.GETREPORTPMC);
				Reporter.log("Click on Get report button for By PMC", true);
				Thread.sleep(10000);
				Assert.assertTrue(isElementPresent(locators.Backend_loc.BYPMCRESULTHEADING));
				Reporter.log("Verify the By PMC result heading", true);
				Assert.assertTrue(isElementPresent(locators.Backend_loc.RESULTLIST));
				Reporter.log("Verify the results displayed for By PMC", true);
				Assert.assertTrue(isElementPresent(locators.Backend_loc.PERFORMANCEEXCELICON));
				Reporter.log("Verify the Excel Icon on By PMC page", true);
				//FOR ALL SITE PERFORMANCE REPORT
				clickOn(locators.Backend_loc.FORALLSITELINK);
				Reporter.log("Click on For All State Link in Site Performance report", true);
				WaitForElementPresent(locators.Backend_loc.FORALLSITEHEADING, timeout);
				clickOn(locators.Backend_loc.GETREPORTALLSITE);
				Reporter.log("Click on Get Report for All site", true);
				Thread.sleep(10000);
				Assert.assertTrue(isElementPresent(locators.Backend_loc.FORALLSITERESULTHEADING));
				Reporter.log("Verify the By All Site result heading", true);
				Assert.assertTrue(isElementPresent(locators.Backend_loc.RESULTLIST));
				Reporter.log("Verify the By All Site results displayed", true);
				Assert.assertTrue(isElementPresent(locators.Backend_loc.PERFORMANCEEXCELICON));
				Reporter.log("Verify the Excel Icon on By All sites", true);
			}
catch (Error e) {					
	captureScreenshot("testgclead");	
	throw e;
}
}
		//Description: This script will verify the Site Performance report
				@Test (alwaysRun=true)
				public void testcreategroupadmin() throws Exception{
					try{
utils.login_util.login(csuser, csuserpass);
clickOn(locators.Backend_loc.ADMINBTN);
WaitForElementPresent(locators.Backend_loc.GRPADMINLINK, timeout);
clickOn(locators.Backend_loc.GRPADMINLINK);
String temp = JavaScriptExecute1();;
String testinggroupmanager = "GROUPADMIN"+temp;
String NAME = testinggroupmanager;
sendKeys(locators.Backend_loc.GROUPADMIN_USERNAME, testinggroupmanager);
sendKeys(locators.Backend_loc.GROUPADMIN_PASSWORD, "360logica");
sendKeys(locators.Backend_loc.SITEID, "98064,5650,10074");
selectDropDown(locators.Backend_loc.ACTIVEDROPDOWN, "Yes");
clickOn(locators.Backend_loc.ADDBTN);
Thread.sleep(1000);
utils.login_util.logout();
sendKeys(locators.Login_loc.USRNAMETXTBOX, NAME);
sendKeys(locators.Login_loc.PASSWORDTXTBOX, "360logica");
clickOn(locators.Login_loc.SIGNINBTN);
}
catch (Error e) {					
captureScreenshot("testgclead");	
throw e;
}
}
				//Description: This script will verify the Profile tab integration with Profile page
				@Test (alwaysRun=true)
				public void testprofiletabintegration() throws Exception{
					try{
						utils.backend_util.profiletabintegration();
						utils.backend_util.amenitiesintegrate();
				}
				catch (Error e) {					
				captureScreenshot("testgclead");	
				throw e;
				}
}
				//Description: This script will verify the Profile tab integration with Profile page
				@Test (alwaysRun=true)
				public void testcommunityemailer() throws Exception{
					try{
						utils.backend_util.communityemailer();
				}
				catch (Error e) {					
				captureScreenshot("testgclead");	
				throw e;
				}
}
}
