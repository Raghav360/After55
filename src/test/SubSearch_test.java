package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utils.custom_util;

//This script will verify the popular locations from Senior housing Sub Search page

public class SubSearch_test extends custom_util {
	@Test (alwaysRun=true)
	
	public void testhousingcommsubsearchpopcities () throws Exception
	{
		try{
			getWebDriver().navigate().to(URL);
			Reporter.log("1. Open Homepage", true);
			clickOn(locators.Homepage_loc.SENIORHOUSINGLINKHONE);
			Reporter.log("2. Click on 'Senior Housing Link from Header", true);
			WaitForElementPresent(locators.Subsearch_loc.SUBTYPEHOUSING, timeout);
			clickOn(locators.Subsearch_loc.ATLANTASH);
			Reporter.log("3. Click on Atlanta from Popular Cities", true);
			WaitForElementPresent(locators.Search_loc.ATLANTAPOP, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/senior-housing/ga/metro-atlanta/atlanta");
			Reporter.log("4. Verify the page URL for Atlanta", true);
			
			utils.search_util.housingsubsearchpage();
			Reporter.log("5. Go back to Senior Housing Sub Search page", true);
			//Click Denver
			clickOn(locators.Subsearch_loc.DENVERSH);
			Reporter.log("6. Click on the Denver Link", true);
			WaitForElementPresent(locators.Search_loc.DENVERPOP, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/senior-housing/co/metro-denver/denver");
			Reporter.log("7. Verify the page URL for Denver", true);
			
			utils.search_util.housingsubsearchpage();
			Reporter.log("8. Go to Senior Housing Sub Search page", true);
			//Click Las Vegas
			clickOn(locators.Subsearch_loc.LASVEGASSH);
			Reporter.log("9. Click on Las Vegas", true);
			WaitForElementPresent(locators.Search_loc.LASVEGASPOP, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/senior-housing/nv/metro-las-vegas/las-vegas");
			Reporter.log("10. Verify the page URL for Las Vegas", true);
			
			utils.search_util.housingsubsearchpage();
			Reporter.log("11. Go to Senior Housing Sub Search page", true);
			
			//Click on Los Angeles
			clickOn(locators.Subsearch_loc.LOSANGELES);
			Reporter.log("12. Click on Los Angeles", true);
			WaitForElementPresent(locators.Search_loc.LOSANGELESPOP, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/senior-housing/ca/metro-los-angeles/los-angeles");
			Reporter.log("13. Verify the Page URL for Los Angeles");
			
			utils.search_util.housingsubsearchpage();
			Reporter.log("14. Go to Senior Housing Sub Search page", true);
			
			//Click on Miami
			clickOn(locators.Subsearch_loc.MIAMISH);
			WaitForElementPresent(locators.Search_loc.MIAMIPOP, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/senior-housing/fl/metro-miami/miami");
			Reporter.log("15. Verify the Page URL for Miami", true);
			
			utils.search_util.housingsubsearchpage();
			Reporter.log("16. Go to Senior Housing Sub Search page", true);
			
			//Click on Minneapolis
			clickOn(locators.Subsearch_loc.MINNEAPOLISSH);
			WaitForElementPresent(locators.Search_loc.MINNEAPOLISPOP, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/senior-housing/mn/metro-minneapolis/minneapolis");
			Reporter.log("17. Verify the Page URL for Minneapolis", true);
			
			utils.search_util.housingsubsearchpage();
			Reporter.log("18. Go to Senior Housing Sub Search page", true);
			
			//Click on Orlando
			clickOn(locators.Subsearch_loc.ORLANDOSH);
			WaitForElementPresent(locators.Search_loc.ORLANDOPOP, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/senior-housing/fl/metro-orlando/orlando");
			Reporter.log("19. Verify the Page URL for Orlando", true);
			
			utils.search_util.housingsubsearchpage();
			Reporter.log("20. Go to Senior Housing Sub Search page", true);
			
			//Click on Phoenix
			clickOn(locators.Subsearch_loc.PHOENIXSH);
			WaitForElementPresent(locators.Search_loc.PHOENIXPOP, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/senior-housing/az/metro-phoenix/phoenix");
			Reporter.log("21. Verify the Page URL for Phoenix", true);
			
			utils.search_util.housingsubsearchpage();
			Reporter.log("22. Go to Senior Housing Sub Search page", true);
			
			//Click on Riverside
			clickOn(locators.Subsearch_loc.RIVERSIDESH);
			WaitForElementPresent(locators.Search_loc.RIVERSIDEPOP, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/senior-housing/ca/metro-inland-empire/riverside");
			Reporter.log("23. Verify the Page URL for Riverside", true);
			
			utils.search_util.housingsubsearchpage();
			Reporter.log("24. Go to Senior Housing Sub Search page", true);
			
			//Click on Sacramento
			clickOn(locators.Subsearch_loc.SACRAMENTOSH);
			WaitForElementPresent(locators.Search_loc.SACRAMENTOPOP, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/senior-housing/ca/metro-sacramento/sacramento");
			Reporter.log("25. Verify the Page URL for Sacramento", true);
			
			utils.search_util.housingsubsearchpage();
			Reporter.log("26. Go to Senior Housing Sub Search page", true);
			
			//Click on San Diego
			clickOn(locators.Subsearch_loc.SANDIEGOSH);
			WaitForElementPresent(locators.Search_loc.SANDIEGOPOP, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/senior-housing/ca/metro-san-diego/san-diego");
			Reporter.log("27. Verify the Page URL for San Diego", true);
			
			utils.search_util.housingsubsearchpage();
			Reporter.log("28. Go to Senior Housing Sub Search page", true);
			
			//Click on Tampa
			clickOn(locators.Subsearch_loc.TAMPASH);
			WaitForElementPresent(locators.Search_loc.TAMPAPOP, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/senior-housing/fl/metro-tampa-bay/tampa");
			Reporter.log("29. Verify the Page URL for Tampa", true);
			{	
		}
	}
	catch (Error e) {					
	captureScreenshot("testsubsearchseniorhousing");	
	throw e;
	}
	}	
	@Test (alwaysRun=true)
public void testcarecommsubsearchpopcities () throws Exception
{
			try{
	//Open Home page
	getWebDriver().navigate().to(URL);
	WaitForElementPresent(locators.Homepage_loc.CARECOMMUNIIESLINKHONE, timeout);
	//Go to Care Community Sub Search Page
	clickOn(locators.Homepage_loc.CARECOMMUNIIESLINKHONE);
	WaitForElementPresent(locators.Subsearch_loc.CARESEARCHBOXES, timeout);
	//Click on the Atlanta
	clickOn(locators.Subsearch_loc.ATLANTASH);
	WaitForElementPresent("//h1[contains(text(), 'Care Communities in Atlanta, GA')]", timeout);
	Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/care-providers/ga/metro-atlanta/atlanta");
	//Go back to Care Community Sub Search page
	getWebDriver().navigate().to(URL+"/care-providers");
	WaitForElementPresent(locators.Subsearch_loc.CARESEARCHBOXES, timeout);
	//Click Denver
	clickOn(locators.Subsearch_loc.DENVERSH);
	WaitForElementPresent("//h1[contains(text(), 'Care Communities in Denver, CO')]", timeout);
	Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/care-providers/co/metro-denver/denver");
	
	//Go to Sub Search page for Care
	getWebDriver().navigate().to(URL+"/care-providers");
	WaitForElementPresent(locators.Subsearch_loc.CARESEARCHBOXES, timeout);
	//Click Las Vegas
	clickOn(locators.Subsearch_loc.LASVEGASSH);
	WaitForElementPresent("//h1[contains(text(), 'Care Communities in Las Vegas, NV')]", timeout);
	Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/care-providers/nv/metro-las-vegas/las-vegas");
	
	//Go to Sub Search page for Care
	getWebDriver().navigate().to(URL+"/care-providers");
	WaitForElementPresent(locators.Subsearch_loc.CARESEARCHBOXES, timeout);
		
	//Click  Los Angeles
	clickOn(locators.Subsearch_loc.LOSANGELES);
	WaitForElementPresent("//h1[contains(text(), 'Care Communities in Los Angeles, CA')]", timeout);
	Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/care-providers/ca/metro-los-angeles/los-angeles");
		
//Go to Sub Search page for Care
getWebDriver().navigate().to(URL+"/care-providers");
WaitForElementPresent(locators.Subsearch_loc.CARESEARCHBOXES, timeout);
				
//Click Miami
clickOn(locators.Subsearch_loc.MIAMISH);
WaitForElementPresent("//h1[contains(text(), 'Care Communities in Miami, FL')]", timeout);
Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/care-providers/fl/metro-miami/miami");
//Go to Sub Search page for Care
getWebDriver().navigate().to(URL+"/care-providers");
WaitForElementPresent(locators.Subsearch_loc.CARESEARCHBOXES, timeout);
				
					
//Click  Minneapolis
clickOn(locators.Subsearch_loc.MINNEAPOLISSH);
WaitForElementPresent("//h1[contains(text(), 'Care Communities in Minneapolis, MN')]", timeout);
Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/care-providers/mn/metro-minneapolis/minneapolis");

//Go to Sub Search page for Care
getWebDriver().navigate().to(URL+"/care-providers");
WaitForElementPresent(locators.Subsearch_loc.CARESEARCHBOXES, timeout);
					
//Click  orlando
clickOn(locators.Subsearch_loc.ORLANDOSH);
WaitForElementPresent("//h1[contains(text(), 'Care Communities in Orlando, FL')]", timeout);
Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/care-providers/fl/metro-orlando/orlando");

//Go to Sub Search page for Care
getWebDriver().navigate().to(URL+"/care-providers");
WaitForElementPresent(locators.Subsearch_loc.CARESEARCHBOXES, timeout);
								
//Click  Phoenix
clickOn(locators.Subsearch_loc.PHOENIXSH);
WaitForElementPresent("//h1[contains(text(), 'Care Communities in Phoenix, AZ')]", timeout);
Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/care-providers/az/metro-phoenix/phoenix");

//Go to Sub Search page for Care
getWebDriver().navigate().to(URL+"/care-providers");
WaitForElementPresent(locators.Subsearch_loc.CARESEARCHBOXES, timeout);
								
//Click  Riverside
clickOn(locators.Subsearch_loc.RIVERSIDESH);
WaitForElementPresent("//h1[contains(text(), 'Care Communities in Riverside, CA')]", timeout);
Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/care-providers/ca/metro-inland-empire/riverside");

//Go to Sub Search page for Care
getWebDriver().navigate().to(URL+"/care-providers");
WaitForElementPresent(locators.Subsearch_loc.CARESEARCHBOXES, timeout);
								
//Click  Sacramento
clickOn(locators.Subsearch_loc.SACRAMENTOSH);
WaitForElementPresent("//h1[contains(text(), 'Care Communities in Sacramento, CA')]", timeout);
Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/care-providers/ca/metro-sacramento/sacramento");

//Go to Sub Search page
getWebDriver().navigate().to(URL+"/care-providers");
WaitForElementPresent(locators.Subsearch_loc.CARESEARCHBOXES, timeout);

//Click  San Diego
clickOn(locators.Subsearch_loc.SANDIEGOSH);
WaitForElementPresent("//h1[contains(text(), 'Care Communities in San Diego, CA')]", timeout);
Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/care-providers/ca/metro-san-diego/san-diego");

//Go to Sub Search page
getWebDriver().navigate().to(URL+"/care-providers");
WaitForElementPresent(locators.Subsearch_loc.CARESEARCHBOXES, timeout);

//Click  Tampa
clickOn(locators.Subsearch_loc.TAMPASH);
WaitForElementPresent("//h1[contains(text(), 'Care Communities in Tampa, FL')]", timeout);
Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/care-providers/fl/metro-tampa-bay/tampa");
	
}
catch (Error e) {					
captureScreenshot("testcarecommunitiessubsearch");	
throw e;
			
}
		
}

	//Description: This script verifies that correct search results are displayed corresponding to Care/Retirement communities depending on the option selected in Needs Assessment section
		/*@Test (alwaysRun=true)
		public void testneedassessment() throws Exception
		{
			try {
			    //Verifying that results are displayed corresponding to care communities on selecting last two radio buttons
				utils.search_util.NeedsAssesment("08201", "care");
				//Verifying that results are displayed corresponding to retirement communities on selecting first two radio buttons
				utils.search_util.NeedsAssesment("08201", "retirement");
				//Verifying that results are displayed corresponding to care communities when user selects last two radio buttons for even 1 assessment question
			    utils.search_util.NeedsAssesment("08201", "both");
			}
			catch (Error e) {					
				captureScreenshot("testneedassessment");	
				throw e;
			}
			}*/
		//Desc: This script will execute the search from Housing Community Sub Search page for all three types using entered keyword 
		@Test(alwaysRun=true)
		public void testhousingsubsearch() throws Exception
		{
			try{
				utils.search_util.Executesubsearch("Virginia Beach,  VA", "All Housing");
				utils.search_util.Executesubsearch("23456", "All Housing");
				utils.search_util.Executesubsearch("Virginia Beach, VA", "For Rent");
				utils.search_util.Executesubsearch("23456", "For Rent");
				utils.search_util.Executesubsearch("Virginia Beach, VA", "For Sale");
				utils.search_util.Executesubsearch("23456", "For Sale");
			}
		catch (Error e) {					
			captureScreenshot("testrvlivingsearch");	
			throw e;
		}
	}
}