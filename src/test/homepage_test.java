package test;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import utils.custom_util;

public class homepage_test extends custom_util{
//descr
	/*@Test(alwaysRun=true)
	
	public void teststatelinks() throws Exception
	{
		try {
			//
			utils.homepage_util.gotoseniorhousingstate();
			//
			clickOn(locators.Search_loc.ARIZONA);
			WaitForElementPresent(locators.Search_loc.ARIZONAHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.CALIFORNIA);
			WaitForElementPresent(locators.Search_loc.CALIFORNIAHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.COLORADO);
			WaitForElementPresent(locators.Search_loc.COLORADOHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.CONNECTICUT);
			WaitForElementPresent(locators.Search_loc.CONNECTICUTHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.DELAWARE);
			WaitForElementPresent(locators.Search_loc.DELAWAREHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.FLORIDA);
			WaitForElementPresent(locators.Search_loc.FLORIDAHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.GEORGIA);
			WaitForElementPresent(locators.Search_loc.GEORGIAHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.IDAHO);
			WaitForElementPresent(locators.Search_loc.IDAHOHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.ILLINOIS);
			WaitForElementPresent(locators.Search_loc.ILLINOISHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.INDIANA);
			WaitForElementPresent(locators.Search_loc.INDIANAHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.IOWA);
			WaitForElementPresent(locators.Search_loc.IOWAHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.KANSAS);
			WaitForElementPresent(locators.Search_loc.KANSASHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.KENTUCY);
			WaitForElementPresent(locators.Search_loc.KENTUCYHEADING, timeout);
			//utils.homepage_util.gotoseniorhousingstate();
			//clickOn(locators.search_loc.MAINE);
			//WaitForElementPresent(locators.search_loc.MAINEHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.MARYLAND);
			WaitForElementPresent(locators.Search_loc.MARYLANDHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.MASSACHUSETTS);
			WaitForElementPresent(locators.Search_loc.MASSACHUSETTSHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.MICHIGAN);
			WaitForElementPresent(locators.Search_loc.MICHIGANHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.MINNESOTA);
			WaitForElementPresent(locators.Search_loc.MINNESOTAHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.MISSISSIPPI);
			WaitForElementPresent(locators.Search_loc.MISSISSIPPIHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.MISSOURI);
			WaitForElementPresent(locators.Search_loc.MISSOURIHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.NEBRASKA);
			WaitForElementPresent(locators.Search_loc.NEBRASKAHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.NEVADA);
			WaitForElementPresent(locators.Search_loc.NEVADAHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.NEWHAMISHPHIRE);
			WaitForElementPresent(locators.Search_loc.NEWHAMISHPHIREHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.NEWJERSY);
			WaitForElementPresent(locators.Search_loc.NEWJERSYHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.NEWMEXICO);
			WaitForElementPresent(locators.Search_loc.NEWMEXICOHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.NEWYORK);
			WaitForElementPresent(locators.Search_loc.NEWYORKHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.NORTHCAROLINA);
			WaitForElementPresent(locators.Search_loc.NORTHCAROLINAHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.OHIO);
			WaitForElementPresent(locators.Search_loc.OHIOHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.OKLAHOMA);
			WaitForElementPresent(locators.Search_loc.OKLAHOMAHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.OREGON);
			WaitForElementPresent(locators.Search_loc.OREGONHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.PENNSYLVANIA);
			WaitForElementPresent(locators.Search_loc.PENNSYLVANIAHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.TENNESSEE);
			WaitForElementPresent(locators.Search_loc.TENNESSEEHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.TENNESSEE);
			WaitForElementPresent(locators.Search_loc.TENNESSEEHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.TEXAS);
			WaitForElementPresent(locators.Search_loc.TEXASHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.UTAH);
			WaitForElementPresent(locators.Search_loc.UTAHHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.VIRGINIA);
			WaitForElementPresent(locators.Search_loc.VIRGINIAHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.WASHINGTON);
			WaitForElementPresent(locators.Search_loc.WASHINGTONHEADING, timeout);
			//utils.homepage_util.gotoseniorhousingstate();
			//clickOn(locators.search_loc.WESTVIRGINIA);
			//WaitForElementPresent(locators.search_loc.WESTVIRGINIAHEADING, timeout);
			utils.homepage_util.gotoseniorhousingstate();
			clickOn(locators.Search_loc.WISCONSIN);
			WaitForElementPresent(locators.Search_loc.WISCONSINHEADING, timeout);
	
		}
			catch (Error e) {					
				captureScreenshot("testseniorhousingpopcities");	
				throw e;
			
			}
			
		
		}*/
	//Description: This script verifies that links under Senior housing popular cities redirect to correct page
	/*@Test (alwaysRun=true)
	public void testseniorhousingpopcities() throws Exception
	{
		try {
			//Go to home page
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
			clickOn(locators.Homepage_loc.SENIORHOUSINGLINKHONE);
			WaitForElementPresent(locators.Subsearch_loc.SUBTYPEHOUSING, timeout);
			//Click on Atlanta link
			clickOn(locators.Homepage_loc.POPCITIES_ATLANTA);
			WaitForElementPresent(locators.Search_loc.NEARBYCITIES, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), "http://www.evokebigdata.com/senior-housing/ga-atlanta");
			Assert.assertEquals(getWebDriver().getTitle(), "Atlanta Area Senior Retirement Communities - After55.com");
			//Go to home page
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
			//Click on Denver link
			clickOn(locators.Homepage_loc.POPCITIES_DENVER);
			WaitForElementPresent(locators.Search_loc.NEARBYCITIES, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), "http://www.evokebigdata.com/senior-housing/co-denver");
			Assert.assertEquals(getWebDriver().getTitle(), "Denver Area Senior Retirement Communities - After55.com");
			//Go to home page
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
			//Click on Las Vegas link
			clickOn(locators.Homepage_loc.POPCITIES_LASVEGAS);
			WaitForElementPresent(locators.Search_loc.NEARBYCITIES, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), "http://www.evokebigdata.com/senior-housing/nv-las-vegas");
			Assert.assertEquals(getWebDriver().getTitle(), "Las Vegas Area Senior Retirement Communities - After55.com");
			//Go to home page
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
			//Click on Los Angeles link
			clickOn(locators.Homepage_loc.POPCITIES_LOSANGELES);
			WaitForElementPresent(locators.Search_loc.NEARBYCITIES, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), "http://www.evokebigdata.com/senior-housing/ca-los-angeles");
			Assert.assertEquals(getWebDriver().getTitle(), "Los Angeles Area Senior Retirement Communities - After55.com");
			//Go to home page
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
			//Click on Miami link
			clickOn(locators.Homepage_loc.POPCITIES_MIAMI);
			WaitForElementPresent(locators.Search_loc.NEARBYCITIES, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), "http://www.evokebigdata.com/senior-housing/fl-miami");
			Assert.assertEquals(getWebDriver().getTitle(), "Miami Area Senior Retirement Communities - After55.com");
			//Go to home page
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
			//Click on Mineapolis link
			clickOn(locators.Homepage_loc.POPCITIES_MINNEAPOLIS);
			WaitForElementPresent(locators.Search_loc.NEARBYCITIES, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), "http://www.evokebigdata.com/senior-housing/mn-minneapolis");
			Assert.assertEquals(getWebDriver().getTitle(), "Minneapolis Area Senior Retirement Communities - After55.com");
			//Go to home page
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
			//Click on Orlando link
			clickOn(locators.Homepage_loc.POPCITIES_ORLANDO);
			WaitForElementPresent(locators.Search_loc.NEARBYCITIES, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), "http://www.evokebigdata.com/senior-housing/fl-orlando");
			Assert.assertEquals(getWebDriver().getTitle(), "Orlando Area Senior Retirement Communities - After55.com");
			//Go to home page
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
			//Click on Phoenix link
			clickOn(locators.Homepage_loc.POPCITIES_PHOENIX);
			WaitForElementPresent(locators.Search_loc.NEARBYCITIES, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), "http://www.evokebigdata.com/senior-housing/az-phoenix");
			Assert.assertEquals(getWebDriver().getTitle(), "Phoenix Area Senior Retirement Communities - After55.com");
			//Go to home page
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
			//Click on Riverside link
			clickOn(locators.Homepage_loc.POPCITIES_RIVERSIDE);
			WaitForElementPresent(locators.Search_loc.NEARBYCITIES, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), "http://www.evokebigdata.com/senior-housing/ca-riverside");
			Assert.assertEquals(getWebDriver().getTitle(), "Riverside Area Senior Retirement Communities - After55.com");
			//Go to home page
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
			//Click on Sacramento link
			clickOn(locators.Homepage_loc.POPCITIES_SACRAMENTO);
			WaitForElementPresent(locators.Search_loc.NEARBYCITIES, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), "http://www.evokebigdata.com/senior-housing/ca-sacramento");
			Assert.assertEquals(getWebDriver().getTitle(), "Sacramento Area Senior Retirement Communities - After55.com");
			//Go to home page
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
			//Click on San Diego link
			clickOn(locators.Homepage_loc.POPCITIES_SANDIEGO);
			WaitForElementPresent(locators.Search_loc.NEARBYCITIES, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), "http://www.evokebigdata.com/senior-housing/ca-san-diego");
			Assert.assertEquals(getWebDriver().getTitle(), "San Diego Area Senior Retirement Communities - After55.com");
			//Go to home page
			getWebDriver().navigate().to(URL);
			WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
			//Click on Tampa link
			clickOn(locators.Homepage_loc.POPCITIES_TAMPA);
			WaitForElementPresent(locators.Search_loc.NEARBYCITIES, timeout);
			Assert.assertEquals(getWebDriver().getCurrentUrl(), "http://www.evokebigdata.com/senior-housing/fl-tampa");
			Assert.assertEquals(getWebDriver().getTitle(), "Tampa Area Senior Retirement Communities - After55.com");
			
		}
		catch (Error e) {					
			captureScreenshot("testseniorhousingpopcities");	
			throw e;
		}
	}
	*/
	   //Description: This script will verify all the contents displays on the Homepage
	   /*@Test(alwaysRun=true)
	   public void testhomepage() throws Exception
	   {
		   try{
			   //Go to Homepage
			   getWebDriver().navigate().to(URL);
			   WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
			   //Verify the Homepage links and other contents
			   Assert.assertTrue(isElementPresent(locators.Homepage_loc.LOGO));
			   Assert.assertTrue(isElementPresent(locators.Homepage_loc.HOMELINK));
			   Assert.assertTrue(isElementPresent(locators.Homepage_loc.RESOURCESANDTIPSLINK));
			   Assert.assertTrue(isElementPresent(locators.Homepage_loc.NEEDSASSESSMENTLINK));
			   Assert.assertTrue(isElementPresent(locators.Homepage_loc.MAGAZINELINK));
			   Assert.assertTrue(isElementPresent(locators.Homepage_loc.ABOUTUSLINKHOMEPAGE));
			   Assert.assertTrue(isElementPresent(locators.Homepage_loc.HOMEPAGEIMAGES));
			   Assert.assertTrue(isElementPresent(locators.Homepage_loc.RESOURCESWIDGET));
			   Assert.assertTrue(isElementPresent(locators.Homepage_loc.VIDEOPLAYERHOME));
			   Assert.assertTrue(isElementPresent(locators.Homepage_loc.POPULARCITIESLINK));
			   Assert.assertTrue(isElementPresent(locators.Homepage_loc.HOUSINGBYSTATELINK));
			   Assert.assertTrue(isElementPresent(locators.Homepage_loc.FOOTERTWO));      
		   		}
		   	catch (Error e) {					
		   		captureScreenshot("testadvetisepage");	
		   		throw e;
		   	}
	   		}*/
	   //Description: This script will verify the footer links present on Homepage
	   @Test(alwaysRun=true)
	   public void testfooterlinks() throws Exception
	   {
		   try{
   getWebDriver().navigate().to(URL);
   WaitForElementPresent(locators.Homepage_loc.FTRHOME, timeout);
   clickOn(locators.Homepage_loc.FTRHOME);
   WaitForElementPresent(locators.Homepage_loc.FTRHOME, timeout);
   clickOn(locators.Homepage_loc.FTRABTUS);
   WaitForElementPresent(locators.Aboutus_loc.ABOUTDOMINIONENTERPRISES, timeout);
   clickOn(locators.Homepage_loc.FTRHOME);
  WaitForElementPresent(locators.Homepage_loc.FTRHOME, timeout);
   clickOn(locators.Homepage_loc.FTRADVERTISE);
   Assert.assertTrue(isElementPresent("//*[@id='lp-pom-box-424']"));
  getWebDriver().navigate().to(URL);
   WaitForElementPresent(locators.Homepage_loc.FTRHOME, timeout);
  clickOn(locators.Homepage_loc.FTRMAGAZINES);
   windowhandle("//*[@id='TopBanner']/div/h1", "http://ebook.frmsproduction.com/main/showAllPublications/A55");
   getWebDriver().navigate().to(URL);
   clickOn(locators.Homepage_loc.FTRMANAGEROWNER);
   WaitForElementPresent(locators.Login_loc.SIGNINBTN, timeout);
  getWebDriver().navigate().to(URL);
  clickOn(locators.Homepage_loc.FTRNEEDASSESSMENT);
  WaitForElementPresent(locators.Assessment_loc.RECNEXTBTN, timeout);
  getWebDriver().navigate().to(URL);
  clickOn(locators.Homepage_loc.FTRPRIVACY);
   windowhandle("//*[@id='logo']", "http://www.dominionenterprises.com/privacy/");
   getWebDriver().navigate().to(URL);
   clickOn(locators.Homepage_loc.FTRVISITORAGREEMENT);
   windowhandle("//*[@id='logo']", "http://www.dominionenterprises.com/terms-of-use/");
   getWebDriver().navigate().to(URL);
   clickOn(locators.Homepage_loc.FTRADCHOICE);
   windowhandle("//*[@id='logo']", "http://www.networkadvertising.org/choices/");
   getWebDriver().navigate().to(URL);
   clickOn(locators.Homepage_loc.FTRFORRENTSITE);
   windowhandle("//*[@id='txtHomepageSearch']", "http://www.forrent.com/");
   getWebDriver().navigate().to(URL);
   clickOn(locators.Homepage_loc.FTRFRUSITE);
   windowhandle("//*[@id='logo']", "http://www.forrentuniversity.com/");
   getWebDriver().navigate().to(URL);
   clickOn(locators.Homepage_loc.FTRCHCSITE);
   windowhandle("//*[@id='citystateorzipcode']", "http://www.corporatehousing.com/");
   getWebDriver().navigate().to(URL);
   clickOn(locators.Homepage_loc.FTRCOPYRIGHT);
   windowhandle("//*[@id='logo']", "http://www.dominionenterprises.com/copyright/");
	   }
	   catch (Error e) {					
			captureScreenshot("testadvetisepage");	
			throw e;
	   }	}
	
	   
	   //Description: This script verified the About Us page and links on that page
	   @Test(alwaysRun=true)
	   public void testaboutuspage() throws Exception
	   {
		   try{
			   //Go to Homepage
			   getWebDriver().navigate().to(URL);
			   WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
			   //Click on About Us link from Main Navigation
			   clickOn(locators.Homepage_loc.FTRABTUS);
			   WaitForElementPresent(locators.Aboutus_loc.ABOUTDOMINIONENTERPRISES, timeout);
			   Assert.assertTrue(isElementPresent(locators.Aboutus_loc.ABOUTUS));
			   Assert.assertTrue(isElementPresent(locators.Aboutus_loc.CUSTOMERSERVICE));
			   Assert.assertTrue(isElementPresent(locators.Aboutus_loc.ABOUTFORRENTMEDIASOLUTIONS));
			   Assert.assertTrue(isElementPresent(locators.Aboutus_loc.FORRENTWEBADDRESS));
			   Assert.assertTrue(isElementPresent(locators.Aboutus_loc.CORPORATEHOUSINGWEBADDRESS));
			   Assert.assertTrue(isElementPresent(locators.Aboutus_loc.FORRENTESPANOL));
			   Assert.assertTrue(isElementPresent(locators.Aboutus_loc.FORRENTUNIVERSITYADDRESS));
			   Assert.assertTrue(isElementPresent(locators.Aboutus_loc.FORRENTSITE));
			   Assert.assertTrue(isElementPresent(locators.Aboutus_loc.FACEBOOK));
			   Assert.assertTrue(isElementPresent(locators.Aboutus_loc.TWITTER));
			   Assert.assertTrue(isElementPresent(locators.Aboutus_loc.YOUTUBE));
			   Assert.assertTrue(isElementPresent(locators.Aboutus_loc.LINKEDIN));
			   Assert.assertTrue(isElementPresent(locators.Aboutus_loc.ABOUTDOMINIONENTERPRISES));
			   Assert.assertTrue(isElementPresent(locators.Aboutus_loc.DOMINIONWEBADDRESS));
			   
		   }
	   catch (Error e) {					
			captureScreenshot("testadvetisepage");	
			throw e;
		}
  }

	   
	//Description: This script verifies that links under Resources widget redirect to correct page
		/*@Test (alwaysRun=true)
		public void testresourceswidgetlinks() throws Exception
		{
			try {
				//Go to home page
				getWebDriver().navigate().to(URL);
				WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
				//Click on Needs Assessment link
				clickOn(locators.Homepage_loc.RESOURCES_NEEDASSESSMENT);
				WaitForElementPresent(locators.Homepage_loc.HEADER_NEEDASSESSMENT, timeout);
				Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/assessment");
				Assert.assertEquals(getWebDriver().getTitle(), "Assessment");
				//Go to home page
				getWebDriver().navigate().to(URL);
				WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
				//Click on Glossary link
				clickOn(locators.Homepage_loc.RESOURCES_GLOSSARY);
				WaitForElementPresent(locators.Homepage_loc.HEADER_GLOSSARY, timeout);
				Assert.assertEquals(getWebDriver().getCurrentUrl(), "http://www.after55.com/blog/senior-housing-glossary-2");
				Assert.assertEquals(getWebDriver().getTitle(), "Senior Housing Glossary : After55.com Blog");
				//Go to home page
				getWebDriver().navigate().to(URL);
				WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
				//Click on Free Moving Quotes link
				clickOn(locators.Homepage_loc.RESOURCES_FREEMOVINGQUOTES);
				WaitForElementPresent(locators.Homepage_loc.HEADER_FREEMOVINGQUOTES, timeout);
				Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/movingquotes");
				Assert.assertEquals(getWebDriver().getTitle(), "Moving Quotes");
				//Go to home page
				getWebDriver().navigate().to(URL);
				WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
				//Click on Your Life link
				clickOn(locators.Homepage_loc.RESOURCES_YOURLIFE);
				WaitForElementPresent(locators.Homepage_loc.HEADER_YOURLIFE, timeout);
				Assert.assertEquals(getWebDriver().getCurrentUrl(), "http://www.after55.com/blog/your-life");
				Assert.assertEquals(getWebDriver().getTitle(), "Your Life : After55.com Blog");
				//Go to home page
				getWebDriver().navigate().to(URL);
				WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
				//Click on Your Health link
				clickOn(locators.Homepage_loc.RESOURCES_YOURHEALTH);
				WaitForElementPresent(locators.Homepage_loc.HEADER_YOURHEALTH, timeout);
				Assert.assertEquals(getWebDriver().getCurrentUrl(), "http://www.after55.com/blog/your-health");
				Assert.assertEquals(getWebDriver().getTitle(), "Your Health : After55.com Blog");
				//Go to home page
				getWebDriver().navigate().to(URL);
				WaitForElementPresent(locators.Search_loc.SEARCHBTN, timeout);
				//Click on Your Finance link
				clickOn(locators.Homepage_loc.RESOURCES_YOURFINANCE);
				WaitForElementPresent(locators.Homepage_loc.HEADER_YOURFINANCE, timeout);
				Assert.assertEquals(getWebDriver().getCurrentUrl(), "http://www.after55.com/blog/your-finance");
				Assert.assertEquals(getWebDriver().getTitle(), "Your Finance : After55.com Blog");
								
			}
			catch (Error e) {					
				captureScreenshot("testresourceswidgetlinks");	
				throw e;
			}
		}*/
		@Test (alwaysRun=true)
		public void testsubsearchlinks() throws Exception
		{
			try 
			{
				getWebDriver().navigate().to(URL);
				WaitForElementPresent("//*[@id='home-logo']", timeout);
				//Clicking the LEARN MORE FOR HOUSING Community
				clickOn(locators.Homepage_loc.LEARNMOREHOUSING);
				Reporter.log("Click on the Learn More for Housing Community Definition");
				WaitForElementPresent(locators.Subsearch_loc.SUBTYPEHOUSING, timeout);
				Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/senior-housing");
				Reporter.log("Verify the URL on Housing Community Sub Search Page");
				getWebDriver().navigate().to(URL);
				
				//Clicking Learn More for Care Community
				
				clickOn(locators.Homepage_loc.LEARNMORECARE);
				Reporter.log("Click on Learn More for Care Community Definition");
				WaitForElementPresent(locators.Subsearch_loc.CARESEARCHBOXES, timeout);
				Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/care-providers");
				getWebDriver().navigate().to(URL);
				
				//Clicking Learn More for RV Parks
				
				clickOn(locators.Homepage_loc.LEARNMORERV);
				Reporter.log("Click on Learn More for RV Living Definition");
				WaitForElementPresent(locators.Subsearch_loc.RVHEADING, timeout);
				Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/rv-living");
				getWebDriver().navigate().to(URL);
				
				//Click Housing Community from Header H1
				
				clickOn(locators.Homepage_loc.SENIORHOUSINGLINKHONE);
				Reporter.log("Click on Housing Community Link from Header H1");
				WaitForElementPresent(locators.Subsearch_loc.SUBTYPEHOUSING, timeout);
				Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/senior-housing");
				getWebDriver().navigate().to(URL);
				
				//Clicking Care Community from H1
				
				clickOn(locators.Homepage_loc.CARECOMMUNIIESLINKHONE);
				Reporter.log("Click on Care Community Link from Header H1");
				WaitForElementPresent(locators.Subsearch_loc.CARESEARCHBOXES, timeout);
				Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/care-providers");
				getWebDriver().navigate().to(URL);
				
				//Clicking RV Living from H1
				
				clickOn(locators.Homepage_loc.RVPARKSLINKHONE);
				Reporter.log("Click on RV Living Link from Header H1");
				WaitForElementPresent(locators.Subsearch_loc.RVHEADING, timeout);
				Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/rv-living");
				getWebDriver().navigate().to(URL);
				
				//Click on Housing Heading from Definitions
				
				clickOn(locators.Homepage_loc.HOUSINGCOMMICON);
				Reporter.log("Click on Housing Definitions Heading link for housing Community");
				WaitForElementPresent(locators.Subsearch_loc.SUBTYPEHOUSING, timeout);
				Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/senior-housing");
				getWebDriver().navigate().to(URL);
				//Click on Care Community Definition icon
				clickOn(locators.Homepage_loc.CARECOMMICON);
				Reporter.log("Click on Care Community Definitions Heading link for Care Community");
				WaitForElementPresent(locators.Subsearch_loc.CARESEARCHBOXES, timeout);
				Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/care-providers");
				getWebDriver().navigate().to(URL);
				//Click on RV Living Resort icon
				clickOn(locators.Homepage_loc.RVLIVINGICON);
				Reporter.log("Click on RV licing Definition Heading link for RV Living");
				WaitForElementPresent(locators.Subsearch_loc.RVHEADING, timeout);
				Assert.assertEquals(getWebDriver().getCurrentUrl(), NURL+"/rv-living");
			}
			catch (Error e) {					
				captureScreenshot("testresourceswidgetlinks");	
				throw e;
			}
		}
}
