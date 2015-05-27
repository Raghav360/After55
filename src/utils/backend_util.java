package utils;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.testng.Assert;
import org.testng.Reporter;

public class backend_util extends custom_util {
	//This method will verify the Profile tab integration with Property Profile page
	public static void profiletabintegration() throws Exception
	{
	utils.login_util.login(csuser, csuserpass);
	//String profileid="99767";
	getWebDriver().navigate().to(URL+"/admin/profile/index/id/"+userprofileid2);
	WaitForElementPresent(locators.Backend_loc.PROFILE_TAGLINE, timeout);
	sendKeys(locators.Backend_loc.PROFILE_TAGLINE, tagline);
	Reporter.log("Enter Profile Tagline", true);
	sendKeys(locators.Backend_loc.PROFILE_LONGDESCRIPTION, longdesc);
	Reporter.log("Enter Profile Long Description", true);
	sendKeys(locators.Backend_loc.PROFILE_PETPOLICY, petpolicy);
	Reporter.log("Enter Pet policy", true);
	sendKeys(locators.Backend_loc.PROFILE_BP1, bp1);
	Reporter.log("Enter Bullet Point 1", true);
	if(isChecked(locators.Backend_loc.PROFILE_BP1CHECKBOX)==false)
	{
	clickOn(locators.Backend_loc.PROFILE_BP1CHECKBOX);
	}
	else if(isChecked(locators.Backend_loc.PROFILE_BP1CHECKBOX)==true);
	sendKeys(locators.Backend_loc.PROFILE_BP2, bp2);
	Reporter.log("Enter Bullet Point 2", true);
	if(isChecked(locators.Backend_loc.PROFILE_BP2CHECKBOX)==false)
	{
	clickOn(locators.Backend_loc.PROFILE_BP2CHECKBOX);
	}
	else if(isChecked(locators.Backend_loc.PROFILE_BP2CHECKBOX)==true);
	sendKeys(locators.Backend_loc.PROFILE_BP3, bp3);
	Reporter.log("Enter Bullet Point 3", true);
	if(isChecked(locators.Backend_loc.PROFILE_BP3CHECKBOX)==false)
	{
	clickOn(locators.Backend_loc.PROFILE_BP3CHECKBOX);
	}
	else if(isChecked(locators.Backend_loc.PROFILE_BP3CHECKBOX)==true);
	sendKeys(locators.Backend_loc.PROFILE_BP4, bp4);
	Reporter.log("Enter Bullet Point 4", true);
	if(isChecked(locators.Backend_loc.PROFILE_BP4CHECKBOX)==false)
	{
	clickOn(locators.Backend_loc.PROFILE_BP4CHECKBOX);
	}
	else if(isChecked(locators.Backend_loc.PROFILE_BP4CHECKBOX)==true);
	sendKeys(locators.Backend_loc.PROFILE_BP5, bp5);
	Reporter.log("Enter Bullet Point 5", true);
	if(isChecked(locators.Backend_loc.PROFILE_BP5CHECKBOX)==false)
	{
	clickOn(locators.Backend_loc.PROFILE_BP5CHECKBOX);
	}
	else if(isChecked(locators.Backend_loc.PROFILE_BP5CHECKBOX)==true);
	sendKeys(locators.Backend_loc.PROFILE_BP6, bp6);
	Reporter.log("Enter Bullet Point 6", true);
	if(isChecked(locators.Backend_loc.PROFILE_BP6CHECKBOX)==false)
	{
	clickOn(locators.Backend_loc.PROFILE_BP6CHECKBOX);
	}
	else if(isChecked(locators.Backend_loc.PROFILE_BP6CHECKBOX)==true);
	sendKeys(locators.Backend_loc.PROFILE_BP7, bp7);
	Reporter.log("Enter Bullet Point 7", true);
	if(isChecked(locators.Backend_loc.PROFILE_BP7CHECKBOX)==false)
	{
	clickOn(locators.Backend_loc.PROFILE_BP7CHECKBOX);
	}
	else if(isChecked(locators.Backend_loc.PROFILE_BP7CHECKBOX)==true);
	sendKeys(locators.Backend_loc.PROFILE_BP8, bp8);
	Reporter.log("Enter Bullet Point 8", true);
	if(isChecked(locators.Backend_loc.PROFILE_BP8CHECKBOX)==false)
	{
	clickOn(locators.Backend_loc.PROFILE_BP8CHECKBOX);
	}
	else if(isChecked(locators.Backend_loc.PROFILE_BP8CHECKBOX)==true);
	sendKeys(locators.Backend_loc.PROFILE_BP9, bp9);
	Reporter.log("Enter Bullet Point 9", true);
	if(isChecked(locators.Backend_loc.PROFILE_BP9CHECKBOX)==false)
	{
	clickOn(locators.Backend_loc.PROFILE_BP9CHECKBOX);
	}
	else if(isChecked(locators.Backend_loc.PROFILE_BP9CHECKBOX)==true);
	sendKeys(locators.Backend_loc.PROFILE_BP10, bp10);
	Reporter.log("Enter Bullet Point 10", true);
	if(isChecked(locators.Backend_loc.PROFILE_BP10CHECKBOX)==false)
	{
	clickOn(locators.Backend_loc.PROFILE_BP10CHECKBOX);
	}
	else if(isChecked(locators.Backend_loc.PROFILE_BP10CHECKBOX)==true);
	sendKeys(locators.Backend_loc.PROFILE_BP11, bp11);
	Reporter.log("Enter Bullet Point 11", true);
	if(isChecked(locators.Backend_loc.PROFILE_BP11CHECKBOX)==false)
	{
	clickOn(locators.Backend_loc.PROFILE_BP11CHECKBOX);
	}
	else if(isChecked(locators.Backend_loc.PROFILE_BP11CHECKBOX)==true);
	Thread.sleep(1000);
	sendKeys(locators.Backend_loc.PROFILE_PROMOTION, "Ankit Promo text");
	clickOn(locators.Backend_loc.PROFILE_PROMOSTARTDATE);
	clickOn(locators.Backend_loc.SELECTPROMOSTARTDATE);
	clickOn(locators.Backend_loc.PROFILE_PROMOENDDATE);
	clickOn(locators.Backend_loc.PROFILE_NXTICON);
	clickOn(locators.Backend_loc.SELECTPROMOENDDATE);
	//Office Hours
		sendKeys(locators.Backend_loc.MONDAYSTART, starttime);
		sendKeys(locators.Backend_loc.MONDAYEND, endtime);
		sendKeys(locators.Backend_loc.TUESDAYSTART, starttime);
		sendKeys(locators.Backend_loc.TUESDAYEND, endtime);
		sendKeys(locators.Backend_loc.WEDNESDAYSTART, starttime);
		sendKeys(locators.Backend_loc.WEDNESDAYEND, endtime);
		sendKeys(locators.Backend_loc.THURSDAYSTART, starttime);
		sendKeys(locators.Backend_loc.THURSDAYEND, endtime);
		sendKeys(locators.Backend_loc.FRIDAYSTART, starttime);
		sendKeys(locators.Backend_loc.FRIDAYEND, endtime);
		sendKeys(locators.Backend_loc.SATURDAYSTART, "12 Noon");
		sendKeys(locators.Backend_loc.SATURDAYEND, "05 Noon");
		sendKeys(locators.Backend_loc.SUNDAYSTART, "CLOSED");
	clickOn(locators.Backend_loc.SAVECHANGESBTN);
	WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
	Thread.sleep(1000);
	utils.login_util.logout();
	getWebDriver().navigate().to(URL+":8080/solr/listingdetails/dataimport?command=delta-import");
	Thread.sleep(2000);
	getWebDriver().navigate().to(URL+"/listing/"+userprofileid2);
	getWebDriver().getPageSource().contains(tagline);
	Reporter.log("Verify the tagline entered by the user at backend", true);
	getWebDriver().getPageSource().contains(shortdesc);
	Reporter.log("Verify the short description entered by the user at backend", true);
	getWebDriver().getPageSource().contains(longdesc);
	Reporter.log("Verify the long description entered by the user at backend", true);
	getWebDriver().getPageSource().contains(petpolicy);
	Reporter.log("Verify the Pet policy entered by the user at backend", true);
	getWebDriver().getPageSource().contains(bp1);
	Reporter.log("Verify first bullet point", true);
	getWebDriver().getPageSource().contains(bp2);
	Reporter.log("Verify second bullet point", true);
	getWebDriver().getPageSource().contains(bp3);
	Reporter.log("Verify third bullet point", true);
	getWebDriver().getPageSource().contains(bp4);
	Reporter.log("Verify fourth bullet point", true);
	getWebDriver().getPageSource().contains(bp5);
	Reporter.log("Verify fifth bullet point", true);
	getWebDriver().getPageSource().contains(bp6);
	Reporter.log("Verify sixth bullet point", true);
	getWebDriver().getPageSource().contains(bp7);
	Reporter.log("Verify seventh bullet point", true);
	getWebDriver().getPageSource().contains(bp8);
	Reporter.log("Verify eigth bullet point", true);
	getWebDriver().getPageSource().contains(bp9);
	Reporter.log("Verify nineth bullet point", true);
	getWebDriver().getPageSource().contains(bp10);
	getWebDriver().getPageSource().contains(bp11);
	getWebDriver().getPageSource().contains("Ankit Promo text");
	Assert.assertTrue(isElementPresent(locators.Backend_loc.MONDAYOFFHRS));
	Assert.assertTrue(isElementPresent(locators.Backend_loc.TUESOFFHRS));
	Assert.assertTrue(isElementPresent(locators.Backend_loc.WEDOFFHRS));
	Assert.assertTrue(isElementPresent(locators.Backend_loc.THUOFFHRS));
	Assert.assertTrue(isElementPresent(locators.Backend_loc.FRIOFFHRS));
	Assert.assertTrue(isElementPresent(locators.Backend_loc.SATOFFHRS));
	Assert.assertTrue(isElementPresent(locators.Backend_loc.SUNDAYOFFHRS));
	}
	//This method will verify the mail sending feature from Lead Management Community Emailer Section
		public static void communityemailer() throws Exception
		{
			utils.login_util.login(userid1, password);
			getWebDriver().navigate().to(URL+"/admin/leadmanagement/index/id/"+userprofileid1);
			WaitForElementPresent(locators.Backend_loc.SAVECHANGESBTN, timeout);
			sendKeys(locators.Backend_loc.SENDERNAME, sendername);
			sendKeys(locators.Backend_loc.SENDERMAIL, senderemail);
			sendKeys(locators.Backend_loc.CUSTOMGREETING, customgreeting);
			sendKeys(locators.Backend_loc.FIRSTEMAIL, email1);
			sendKeys(locators.Backend_loc.FIRSTNAME, name1);
			sendKeys(locators.Backend_loc.SECONDNAME, name2);
			sendKeys(locators.Backend_loc.SECONDEMAIL, email2);
			sendKeys(locators.Backend_loc.THIRDEMAIL, email3);
			sendKeys(locators.Backend_loc.THIRDNAME, name3);
			sendKeys(locators.Backend_loc.FOURTHEMAIL, email4);
			sendKeys(locators.Backend_loc.FOURTHNAME, name4);
			sendKeys(locators.Backend_loc.FIFTHEMAIL, email5);
			sendKeys(locators.Backend_loc.FIFTHNAME, name5);
			clickOn(locators.Backend_loc.SENDBTN);
			Thread.sleep(3000);
			WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
		}
		
	//This method is to check the various housing type integration on Search results page.
		
		public static void checkhousingtypes() throws Exception
		{
			utils.login_util.login(csuser, csuserpass);
			getWebDriver().navigate().to(URL+"/admin/accountdetails/index/id/"+userprofileid2);
			WaitForElementPresent(locators.Backend_loc.ACCDETAIL_FIRSTNAME, timeout);
			if(isChecked(locators.Backend_loc.APARTMENTS)==false)
			{
			clickOn(locators.Backend_loc.APARTMENTS);
			}
			clickOn(locators.Backend_loc.SAVECHANGESBTN);
			WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
			utils.login_util.logout();
			getWebDriver().navigate().to(URL+":8080/solr/propertysearch/dataimport?command=delta-import");
			utils.search_util.ExecuteSearch(zipcode, "both");
			WaitForElementPresent(locators.Search_loc.SEARCHTXTBOX, timeout);
			Assert.assertTrue(isElementPresent(locators.Search_loc.APARTMENTS));
			//Homes for Rent
			utils.login_util.login(csuser, csuserpass);
			getWebDriver().navigate().to(URL+"/admin/accountdetails/index/id/"+userprofileid2);
			WaitForElementPresent(locators.Backend_loc.ACCDETAIL_FIRSTNAME, timeout);
			if(isChecked(locators.Backend_loc.HOMESFORRENT)==false)
			{
				clickOn(locators.Backend_loc.HOMESFORRENT);
			}
			clickOn(locators.Backend_loc.SAVECHANGESBTN);
			WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
			utils.login_util.logout();
			getWebDriver().navigate().to(URL+":8080/solr/propertysearch/dataimport?command=delta-import");
			utils.search_util.ExecuteSearch(zipcode, "both");
			WaitForElementPresent(locators.Search_loc.SEARCHTXTBOX, timeout);
			Assert.assertTrue(isElementPresent(locators.Search_loc.HOMESFORRENT));
			//Homes for Sale
			utils.login_util.login(csuser, csuserpass);
			getWebDriver().navigate().to(URL+"/admin/accountdetails/index/id/"+userprofileid2);
			WaitForElementPresent(locators.Backend_loc.ACCDETAIL_FIRSTNAME, timeout);
			if(isChecked(locators.Backend_loc.HOMESFORSALE)==false)
			{
				clickOn(locators.Backend_loc.HOMESFORSALE);
			}
			clickOn(locators.Backend_loc.SAVECHANGESBTN);
			WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
			utils.login_util.logout();
			getWebDriver().navigate().to(URL+":8080/solr/propertysearch/dataimport?command=delta-import");
			utils.search_util.ExecuteSearch(zipcode, "both");
			WaitForElementPresent(locators.Search_loc.SEARCHTXTBOX, timeout);
			Assert.assertTrue(isElementPresent(locators.Search_loc.HOMESFORSALE));
			//Manufacture Homes For rent
			utils.login_util.login(csuser, csuserpass);
			getWebDriver().navigate().to(URL+"/admin/accountdetails/index/id/"+userprofileid2);
			WaitForElementPresent(locators.Backend_loc.ACCDETAIL_FIRSTNAME, timeout);
			if(isChecked(locators.Backend_loc.MANUFACTUREDHOMESFORRENT)==false)
			{
				clickOn(locators.Backend_loc.MANUFACTUREDHOMESFORRENT);
			}
			clickOn(locators.Backend_loc.SAVECHANGESBTN);
			WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
			utils.login_util.logout();
			getWebDriver().navigate().to(URL+":8080/solr/propertysearch/dataimport?command=delta-import");
			utils.search_util.ExecuteSearch(zipcode, "both");
			WaitForElementPresent(locators.Search_loc.SEARCHTXTBOX, timeout);
			Assert.assertTrue(isElementPresent(locators.Search_loc.MANUFACTUREDHOUSINGFORRENT));
		//Manufactured Homes For Sale
			utils.login_util.login(csuser, csuserpass);
			getWebDriver().navigate().to(URL+"/admin/accountdetails/index/id/"+userprofileid2);
			WaitForElementPresent(locators.Backend_loc.ACCDETAIL_FIRSTNAME, timeout);
			if(isChecked(locators.Backend_loc.MANUFACTUREDHOMESFORSALE)==false)
			{
				clickOn(locators.Backend_loc.MANUFACTUREDHOMESFORSALE);
			}
			clickOn(locators.Backend_loc.SAVECHANGESBTN);
			WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
			utils.login_util.logout();
			getWebDriver().navigate().to(URL+":8080/solr/propertysearch/dataimport?command=delta-import");
			utils.search_util.ExecuteSearch(zipcode, "both");
			WaitForElementPresent(locators.Search_loc.SEARCHTXTBOX, timeout);
			Assert.assertTrue(isElementPresent(locators.Search_loc.MANUFACTUREDHOUSINGFORSALE));
			//RV Retirement Communities 
			utils.login_util.login(csuser, csuserpass);
			getWebDriver().navigate().to(URL+"/admin/accountdetails/index/id/"+userprofileid2);
			WaitForElementPresent(locators.Backend_loc.ACCDETAIL_FIRSTNAME, timeout);
			if(isChecked(locators.Backend_loc.RVPARKS)==false)
			{
				clickOn(locators.Backend_loc.RVPARKS);
			}
			clickOn(locators.Backend_loc.SAVECHANGESBTN);
			WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
			utils.login_util.logout();
			getWebDriver().navigate().to(URL+":8080/solr/propertysearch/dataimport?command=delta-import");
			utils.search_util.ExecuteSearch(zipcode, "both");
			WaitForElementPresent(locators.Search_loc.SEARCHTXTBOX, timeout);
			Assert.assertTrue(isElementPresent(locators.Search_loc.RVPARKS));
			//Independent Living With Services 
			utils.login_util.login(csuser, csuserpass);
			getWebDriver().navigate().to(URL+"/admin/accountdetails/index/id/"+userprofileid2);
			WaitForElementPresent(locators.Backend_loc.ACCDETAIL_FIRSTNAME, timeout);
			if(isChecked(locators.Backend_loc.INDEPENDENTLIVING)==false)
			{
				clickOn(locators.Backend_loc.INDEPENDENTLIVING);
			}
			clickOn(locators.Backend_loc.SAVECHANGESBTN);
			WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
			utils.login_util.logout();
			getWebDriver().navigate().to(URL+":8080/solr/propertysearch/dataimport?command=delta-import");
			utils.search_util.ExecuteSearch(zipcode, "both");
			WaitForElementPresent(locators.Search_loc.SEARCHTXTBOX, timeout);
			Assert.assertTrue(isElementPresent(locators.Search_loc.INDEPENDENTLIVING));
			//Alzheimer’s/Memory Care 
			utils.login_util.login(csuser, csuserpass);
			getWebDriver().navigate().to(URL+"/admin/accountdetails/index/id/"+userprofileid2);
			WaitForElementPresent(locators.Backend_loc.ACCDETAIL_FIRSTNAME, timeout);
			if(isChecked(locators.Backend_loc.ALZHEIMERCARE)==false)
			{
				clickOn(locators.Backend_loc.ALZHEIMERCARE);
			}
			clickOn(locators.Backend_loc.SAVECHANGESBTN);
			WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
			utils.login_util.logout();
			getWebDriver().navigate().to(URL+":8080/solr/propertysearch/dataimport?command=delta-import");
			utils.search_util.ExecuteSearch(zipcode, "both");
			WaitForElementPresent(locators.Search_loc.SEARCHTXTBOX, timeout);
			Assert.assertTrue(isElementPresent(locators.Search_loc.ALZHEIMER));
			//Assisted Living 
			utils.login_util.login(csuser, csuserpass);
			getWebDriver().navigate().to(URL+"/admin/accountdetails/index/id/"+userprofileid2);
			WaitForElementPresent(locators.Backend_loc.ACCDETAIL_FIRSTNAME, timeout);
			if(isChecked(locators.Backend_loc.ASSISTEDLIVING)==false)
			{
				clickOn(locators.Backend_loc.ASSISTEDLIVING);
			}
			clickOn(locators.Backend_loc.SAVECHANGESBTN);
			WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
			utils.login_util.logout();
			getWebDriver().navigate().to(URL+":8080/solr/propertysearch/dataimport?command=delta-import");
			utils.search_util.ExecuteSearch(zipcode, "both");
			WaitForElementPresent(locators.Search_loc.SEARCHTXTBOX, timeout);
			Assert.assertTrue(isElementPresent(locators.Search_loc.ASSISTEDLIVING));
			//Continuing Care Retirement Community (CCRC) 
			utils.login_util.login(csuser, csuserpass);
			getWebDriver().navigate().to(URL+"/admin/accountdetails/index/id/"+userprofileid2);
			WaitForElementPresent(locators.Backend_loc.ACCDETAIL_FIRSTNAME, timeout);
			if(isChecked(locators.Backend_loc.CCRC)==false)
			{
				clickOn(locators.Backend_loc.CCRC);
			}
			clickOn(locators.Backend_loc.SAVECHANGESBTN);
			WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
			utils.login_util.logout();
			getWebDriver().navigate().to(URL+":8080/solr/propertysearch/dataimport?command=delta-import");
			utils.search_util.ExecuteSearch(zipcode, "both");
			WaitForElementPresent(locators.Search_loc.SEARCHTXTBOX, timeout);
			Assert.assertTrue(isElementPresent(locators.Search_loc.CRCC));
			//Nursing Homes 
			utils.login_util.login(csuser, csuserpass);
			getWebDriver().navigate().to(URL+"/admin/accountdetails/index/id/"+userprofileid2);
			WaitForElementPresent(locators.Backend_loc.ACCDETAIL_FIRSTNAME, timeout);
			if(isChecked(locators.Backend_loc.NURSINGHOMES)==false)
			{
				clickOn(locators.Backend_loc.NURSINGHOMES);
			}
			clickOn(locators.Backend_loc.SAVECHANGESBTN);
			WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
			utils.login_util.logout();
			getWebDriver().navigate().to(URL+":8080/solr/propertysearch/dataimport?command=delta-import");
			utils.search_util.ExecuteSearch(zipcode, "both");
			WaitForElementPresent(locators.Search_loc.SEARCHTXTBOX, timeout);
			Assert.assertTrue(isElementPresent(locators.Search_loc.NURSINGHOMES));
			//Residential/Personal Care Home
			utils.login_util.login(csuser, csuserpass);
			getWebDriver().navigate().to(URL+"/admin/accountdetails/index/id/"+userprofileid2);
			WaitForElementPresent(locators.Backend_loc.ACCDETAIL_FIRSTNAME, timeout);
			if(isChecked(locators.Backend_loc.RESIDENTIALCAREHOMES)==false)
			{
				clickOn(locators.Backend_loc.RESIDENTIALCAREHOMES);
			}
			clickOn(locators.Backend_loc.SAVECHANGESBTN);
			WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
			utils.login_util.logout();
			getWebDriver().navigate().to(URL+":8080/solr/propertysearch/dataimport?command=delta-import");
			utils.search_util.ExecuteSearch(zipcode, "both");
			WaitForElementPresent(locators.Search_loc.SEARCHTXTBOX, timeout);
			Assert.assertTrue(isElementPresent(locators.Search_loc.PERSONALCAREHOMES));	
		}
		
		
	//This method is for image upload functionality
		public static void imageupload() throws Exception
		{
		Robot robot = new Robot();
		String filelocation = System.getProperty("user.dir")+"\\attachments\\1.jpg";
		Clipboard clip = Toolkit.getDefaultToolkit().getSystemClipboard();
		StringSelection str = new StringSelection(filelocation);
		clip.setContents(str, str);
		System.out.println(str);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_V);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_V);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.delay(1000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.delay(1000);
		robot.keyRelease(KeyEvent.VK_ENTER);
}
		
		//This is a method to Edit user in user adminstration
		public static void useradminedit() throws Exception
		{
			utils.createacc_util.createuseradmin("Customer Service");
			
		}
		
		//This method is to select all amenities from Amenity tab
		public static void amenitiesintegrate() throws Exception
		{
		utils.login_util.login(userid2, password);	
		//Go to Amenity Tab
		getWebDriver().navigate().to(URL+"/admin/amenities/index/id/"+userprofileid2);
		if(isChecked(locators.Backend_loc.TWENTYFOURHOUREMERGENCYCALL)==false);
		{
			clickOn(locators.Backend_loc.TWENTYFOURHOUREMERGENCYCALL);
		}
		
		if(isChecked(locators.Backend_loc.AIRCONDITIONING)==false);
		{
			clickOn(locators.Backend_loc.AIRCONDITIONING);
		}
		if(isChecked(locators.Backend_loc.APPLIANCEPACKAGE)==false);
		{
			clickOn(locators.Backend_loc.APPLIANCEPACKAGE);
		}
		if(isChecked(locators.Backend_loc.ATTACHEDONECARGARAGE)==false);
		{
			clickOn(locators.Backend_loc.ATTACHEDONECARGARAGE);
		}
		if(isChecked(locators.Backend_loc.ATTACHEDTWOCARGARAGE)==false);
		{
			clickOn(locators.Backend_loc.ATTACHEDTWOCARGARAGE);
		}
		if(isChecked(locators.Backend_loc.BALCONY)==false);
		{
			clickOn(locators.Backend_loc.BALCONY);
		}
		//Community Feature
		if(isChecked(locators.Backend_loc.ACTIVITYDIRECTOR)==false);
		{
			clickOn(locators.Backend_loc.ACTIVITYDIRECTOR);
		}
			if(isChecked(locators.Backend_loc.ELEVATOR)==false);
			{
				clickOn(locators.Backend_loc.ELEVATOR);
				if(isChecked(locators.Backend_loc.SPA)==false);
				{
					clickOn(locators.Backend_loc.SPA);
				}
		//Wellness Feature
				if(isChecked(locators.Backend_loc.RESPITECARE)==false);
				{
					clickOn(locators.Backend_loc.RESPITECARE);
				}
			clickOn(locators.Backend_loc.SAVECHANGESBTN);
			WaitForElementPresent(locators.Backend_loc.SAVECHANGEMSG, timeout);
			getWebDriver().navigate().to(URL+":8080/solr/listingdetails/dataimport?command=delta-import");
			Thread.sleep(2000);
			getWebDriver().navigate().to(URL+"/listing/"+userprofileid2);
			getWebDriver().getPageSource().contains("24-Hour Emergency Call System");
			getWebDriver().getPageSource().contains("Air Conditioning");
			getWebDriver().getPageSource().contains("Appliance Package Included");
			getWebDriver().getPageSource().contains("Attached One-Car Garage");
			getWebDriver().getPageSource().contains("Attached Two-Car Garage");
			getWebDriver().getPageSource().contains("Balcony");
			getWebDriver().getPageSource().contains("Activities Director");
			getWebDriver().getPageSource().contains("Elevators");
			getWebDriver().getPageSource().contains("Spa/Jacuzzi");
			getWebDriver().getPageSource().contains("Respite Care");
			
			
			}
			
			
			
		}
}


