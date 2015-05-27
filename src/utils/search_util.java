package utils;

import org.openqa.selenium.remote.server.handler.GetPageSource;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.Reporter;

public class search_util extends custom_util {
	
	//Description: This is method to execute search result for entered keyword for Housing Communities, Care Communities and RV Living from Homepage
	public static void ExecuteSearch(String keyword, String type)
	{
		getWebDriver().navigate().to(URL);
		Reporter.log("Open application Homepage", true);
		WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
		sendKeys(locators.Search_loc.SEARCHTXTBOX, keyword);
		switch(type)
		{
		case "Housing Communities":
			selectDropDown(locators.Search_loc.SENIORHOUSINGDROPDOWN, "Housing Communities");
			clickOn(locators.Search_loc.SEARCHBTN);
			WaitForElementPresent(locators.Search_loc.SEARCHTEXTBOX, timeout);
			getWebDriver().getCurrentUrl().contains("/senior-housing");
			break;
		case "Care Communities":
			selectDropDown(locators.Search_loc.SENIORHOUSINGDROPDOWN, "Care Communities");
			clickOn(locators.Search_loc.SEARCHBTN);
			WaitForElementPresent(locators.Search_loc.SEARCHTEXTBOX, timeout);
			getWebDriver().getCurrentUrl().contains("/care-providers");
			break;	
		case "RV Living":
			selectDropDown(locators.Search_loc.SENIORHOUSINGDROPDOWN, "RV Living");
			clickOn(locators.Search_loc.SEARCHBTN);
			WaitForElementPresent(locators.Search_loc.SEARCHTEXTBOX, timeout);
			getWebDriver().getCurrentUrl().contains("/rv-living");
			break;		
		}	
	}

	//Desc: This is the method to execute search from the entered keyword on Housing Community Sub Search page using all three types
	public static void Executesubsearch(String keyword, String type)
	{
		getWebDriver().navigate().to(URL+"/senior-housing");
		WaitForElementPresent("//*[@id='subtypes']", timeout);
		sendKeys(locators.Subsearch_loc.HOUSINGSUBSEARCH, keyword);
		switch(type)
		{
		case "All Housing":
			selectDropDown(locators.Subsearch_loc.SUBTYPEHOUSING, "All Housing");
			clickOn(locators.Subsearch_loc.SEARCHBTNHSUB);
			WaitForElementPresent(locators.Search_loc.SEARCHTEXTBOX, timeout);
			getWebDriver().getCurrentUrl().contains("/senior-housing");
			break;
		case "For Rent":
			selectDropDown(locators.Subsearch_loc.SUBTYPEHOUSING, "For Rent");
			clickOn(locators.Subsearch_loc.SEARCHBTNHSUB);
			WaitForElementPresent(locators.Search_loc.SEARCHTEXTBOX, timeout);
			getWebDriver().getCurrentUrl().contains("/senior-housing");
			isTextPresent("Apartments, Homes for Rent, and Manufactured Homes for Rent");
			break;
		case "For Sale":
			selectDropDown(locators.Subsearch_loc.SUBTYPEHOUSING, "For Sale");
			clickOn(locators.Subsearch_loc.SEARCHBTNHSUB);
			WaitForElementPresent(locators.Search_loc.SEARCHTEXTBOX, timeout);
			getWebDriver().getCurrentUrl().contains("/senior-housing");
			isTextPresent("Homes for Sale and Manufactured Homes for Sale");
			break;
		}
	}

	//This method will give the count of search results
	/*public static int SearchResultsCount(){
		int count = getWebDriver().findElements(ByLocator(locators.Search_loc.FIRSTSEARCHRESULT)).size();
		System.out.println(count);
		return count;
	}
	/*
	//This method will give the profile id of the selected property
	/*public static String GetProfileId(int number){
		String x = getWebDriver().findElement(ByLocator("//*[@id='itemContainer']/li[contains(@class, 'fadeInUp')]["+number+"]/div[@class='searchItem']/div/h5")).getAttribute("id");
		String y[] = x.split("property-");
		String z[] = y[1].split("-");
		String profileid = z[0];
		System.out.println(profileid);
		return profileid;
	}
	*/
	/*//This method will verify search results for Care communities
	public static void VerifyCareSearch(int count, String keyword, String url, String zipcode){
		boolean status = false;
		String[] arrayText = {"CCRC", "Assisted", "Nursing", "Residential", "Alzheimer", "Memory"};
		if(count>=1){
			for(int i=1; i<count; i++)
			{
				if(zipcode.equals("no"))
				{
					String result = getText("//*[@id='itemContainer']/li["+i+"]");
					if(!result.contains(keyword))
					{Assert.fail("Results are not displayed as per the entered keyword");}	
				}
				Assert.assertTrue(isElementPresent(locators.Search_loc.CARECHECKED_ASSISTLVNG));
				Assert.assertTrue(isElementPresent(locators.Search_loc.CARECHECKED_NRSNGHOMES));
				Assert.assertTrue(isElementPresent(locators.Search_loc.CARECHECKED_RESCAREHOMES));
				Assert.assertTrue(isElementPresent(locators.Search_loc.CARECHECKED_ALZMEMCARE));
				Assert.assertTrue(isElementPresent(locators.Search_loc.CARECHECKED_CCRC));
				Assert.assertTrue(isElementPresent(locators.Search_loc.CARECHECKED_INDEPLVNG));
				clickOn("//*[@id='itemContainer']/li["+i+"]//a[contains(text(), 'More Info')]");
				WaitForElementPresent(locators.Search_loc.HOUSINGTYPECONTENT, timeout);
				String text = getText(locators.Search_loc.HOUSINGTYPECONTENT);
				for (String searchtext : arrayText) {
					if (text.contains(searchtext)) {
						status = true;
					}
				}
				Assert.assertTrue(status);
				getWebDriver().navigate().to(url);
				WaitForElementPresent(locators.Search_loc.NEARBYCITIES, timeout);
			}
	}
		
}		*/
	//This method will verify search results for Retirement communities
/*	public static void VerifyRetirementSearch(int count, String keyword, String url, String zipcode){
		boolean status = false;
		String[] arrayText = {"Apartments", "Homes for Rent", "Homes for Sale", "Manufactured Homes for Rent", "Manufactured Homes for Sale", "RV Parks"};
		if(count>=1){
			for(int i=1; i<count; i++)
			{
				if(zipcode.equals("no"))
				{
					String result = getText("//*[@id='itemContainer']/li["+i+"]");
					if(!result.contains(keyword))
					{Assert.fail("Results are not displayed as per the entered keyword");}	
				}
				Assert.assertTrue(isElementPresent(locators.Search_loc.RETCHECKED_APARTMENTS));
				Assert.assertTrue(isElementPresent(locators.Search_loc.RETCHECKED_HOMESFORRENT));
				Assert.assertTrue(isElementPresent(locators.Search_loc.RETCHECKED_HOMESFORSALE));
				Assert.assertTrue(isElementPresent(locators.Search_loc.RETCHECKED_MANUFACTURED_HOMESFORRENT));
				Assert.assertTrue(isElementPresent(locators.Search_loc.RETCHECKED_MANUFACTURED_HOMESFORSALE));
				Assert.assertTrue(isElementPresent(locators.Search_loc.RETCHECKED_RVPARKS));
				
				clickOn("//*[@id='itemContainer']/li["+i+"]//a[contains(text(), 'More Info')]");
				WaitForElementPresent(locators.Search_loc.HOUSINGTYPECONTENT, timeout);
				String text = getText(locators.Search_loc.HOUSINGTYPECONTENT);
				System.out.println(text+"\n");
				for (String searchtext : arrayText) {
					if (text.contains(searchtext)) {
						status = true;
					}
				}
				Assert.assertTrue(status);
				getWebDriver().navigate().to(url);
				WaitForElementPresent(locators.Search_loc.NEARBYCITIES, timeout);
			}
	
		}
	}
}*/
	

	
	   //Description: This method verifies that correct search results are displayed corresponding to Care/Retirement communities depending on the option selected in Needs Assessment section
	/*	public static void NeedsAssesment(String keyword, String type)
		{
			//Go to application URL
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
			//Click on Needs Assesment link
			clickOn(locators.Homepage_loc.NEEDSASSESSMENTLINK);
			WaitForElementPresent(locators.Assessment_loc.RECNEXTBTN, timeout);
			//Click on 'Yourself' radio button
			clickOn(locators.Assessment_loc.RECSELFRADIO);
			clickOn(locators.Assessment_loc.RECNEXTBTN);
			switch(type)
			{
			case "care":
				WaitForElementPresent(locators.Assessment_loc.SAFETYNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.SAFETYTHIRDRADIO);
				clickOn(locators.Assessment_loc.SAFETYNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.MOBNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.MOBTHIRDRADIO);
				clickOn(locators.Assessment_loc.MOBNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.TRANSNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.TRANSFOURTHRADIO);
				clickOn(locators.Assessment_loc.TRANSNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.HSKPNGNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.HSKPNGFOURTHRADIO);
				clickOn(locators.Assessment_loc.HSKPNGNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.NUTNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.NUTTHIRDRADIO);
				clickOn(locators.Assessment_loc.NUTNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.GROOMHYGNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.GROOMHYGTHIRDRADIO);
				clickOn(locators.Assessment_loc.GROOMHYGNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.TOINEXTBTN, timeout);
				clickOn(locators.Assessment_loc.TOITHIRDRADIO);
				clickOn(locators.Assessment_loc.TOINEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.MEDNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.MEDFOURTHRADIO);
				clickOn(locators.Assessment_loc.MEDNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.MEMNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.MEMTHIRDRADIO);
				clickOn(locators.Assessment_loc.MEMNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.EMBNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.EMBFOURTHRADIO);
				clickOn(locators.Assessment_loc.EMBNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.SEARCHBTN, timeout);
				sendKeys(locators.Search_loc.SEARCHTXTBOX, keyword);
				clickOn(locators.Assessment_loc.SEARCHBTN);
				WaitForElementPresent(locators.Search_loc.SEARCHTYPEDRPDWN, timeout);
				String selectedOption = new Select(getWebDriver().findElement(ByLocator(locators.Search_loc.SEARCHTYPEDRPDWN))).getFirstSelectedOption().getText();
				if (!selectedOption.contains("Care Communities"))
				 {
					Assert.fail("Care communities should be displayed selected");
				 }
				Assert.assertEquals(keyword, getValue(locators.Search_loc.SEARCHTXTBOX));
				break;
			case "retirement":
				WaitForElementPresent(locators.Assessment_loc.SAFETYNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.SAFETYFIRSTRADIO);
				clickOn(locators.Assessment_loc.SAFETYNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.MOBNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.MOBFIRSTRADIO);
				clickOn(locators.Assessment_loc.MOBNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.TRANSNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.TRANSFIRSTRADIO);
				clickOn(locators.Assessment_loc.TRANSNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.HSKPNGNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.HSKPNGFIRSTRADIO);
				clickOn(locators.Assessment_loc.HSKPNGNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.NUTNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.NUTFIRSTRADIO);
				clickOn(locators.Assessment_loc.NUTNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.GROOMHYGNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.GROOMHYGFIRSTRADIO);
				clickOn(locators.Assessment_loc.GROOMHYGNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.TOINEXTBTN, timeout);
				clickOn(locators.Assessment_loc.TOISECONDRADIO);
				clickOn(locators.Assessment_loc.TOINEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.MEDNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.MEDFIRSTRADIO);
				clickOn(locators.Assessment_loc.MEDNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.MEMNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.MEMSECONDRADIO);
				clickOn(locators.Assessment_loc.MEMNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.EMBNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.EMBFIRSTRADIO);
				clickOn(locators.Assessment_loc.EMBNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.SEARCHBTN, timeout);
				sendKeys(locators.Search_loc.SEARCHTXTBOX, keyword);
				clickOn(locators.Assessment_loc.SEARCHBTN);
				WaitForElementPresent(locators.Search_loc.SEARCHTYPEDRPDWN, timeout);
				String selectedOption1 = new Select(getWebDriver().findElement(ByLocator(locators.Search_loc.SEARCHTYPEDRPDWN))).getFirstSelectedOption().getText();
				if (!selectedOption1.contains("Housing Communities"))
				 {
					Assert.fail("Housing communities should be displayed selected");
				 }
				Assert.assertEquals(keyword, getValue(locators.Search_loc.SEARCHTXTBOX));
				break;	
			case "both":
				WaitForElementPresent(locators.Assessment_loc.SAFETYNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.SAFETYTHIRDRADIO);
				clickOn(locators.Assessment_loc.SAFETYNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.MOBNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.MOBFIRSTRADIO);
				clickOn(locators.Assessment_loc.MOBNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.TRANSNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.TRANSFIRSTRADIO);
				clickOn(locators.Assessment_loc.TRANSNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.HSKPNGNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.HSKPNGFOURTHRADIO);
				clickOn(locators.Assessment_loc.HSKPNGNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.NUTNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.NUTFIRSTRADIO);
				clickOn(locators.Assessment_loc.NUTNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.GROOMHYGNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.GROOMHYGTHIRDRADIO);
				clickOn(locators.Assessment_loc.GROOMHYGNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.TOINEXTBTN, timeout);
				clickOn(locators.Assessment_loc.TOIFOURTHRADIO);
				clickOn(locators.Assessment_loc.TOINEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.MEDNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.MEDFIRSTRADIO);
				clickOn(locators.Assessment_loc.MEDNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.MEMNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.MEMTHIRDRADIO);
				clickOn(locators.Assessment_loc.MEMNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.EMBNEXTBTN, timeout);
				clickOn(locators.Assessment_loc.EMBFIRSTRADIO);
				clickOn(locators.Assessment_loc.EMBNEXTBTN);
				WaitForElementPresent(locators.Assessment_loc.SEARCHBTN, timeout);
				sendKeys(locators.Search_loc.SEARCHTXTBOX, keyword);
				clickOn(locators.Assessment_loc.SEARCHBTN);
				WaitForElementPresent(locators.Search_loc.SEARCHTYPEDRPDWN, timeout);
				String selectedOption2 = new Select(getWebDriver().findElement(ByLocator(locators.Search_loc.SEARCHTYPEDRPDWN))).getFirstSelectedOption().getText();
				if (!selectedOption2.contains("Care Communities"))
				 {
					Assert.fail("Care communities should be displayed selected");
				 }
				Assert.assertEquals(keyword, getValue(locators.Search_loc.SEARCHTXTBOX));
				break;		
			}	
		}
		*/
		//This method will submit the check availability form from any property profile page
		/*public static void CheckAvailability(){
			WaitForElementPresent(locators.Search_loc.CHECKAVAILABILITY_SUBMIT, timeout);
			sendKeys(locators.Search_loc.CHECKAVAILABILITY_FNAME, "TEST");
			sendKeys(locators.Search_loc.CHECKAVAILABILITY_LNAME, "USER");
			sendKeys(locators.Search_loc.CHECKAVAILABILITY_EMAIL, "test@test.com");
			selectDropDown(locators.Search_loc.CHECKAVAILABILITY_SEARCHINGFORDRPDWN, "Self");
			sleep(1000);
			sendKeys(locators.Search_loc.CHECKAVAILABILITY_COMMENTS, "Test Comment");
			clickOn(locators.Search_loc.CHECKAVAILABILITY_SUBMIT);
			WaitForElementPresent(locators.Search_loc.CHECKAVAILABILITY_CONF, timeout);
		}	*/
			//This method is for the user to Go to Senior Housing Sub Search Page
			public static void housingsubsearchpage(){
				getWebDriver().navigate().to(URL+"/senior-housing");	
			}
		}

	
