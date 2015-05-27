package locators;

//locator class is public static final which means it can be accessed by all and cannot be changed.

public class Search_loc {
	public final static String SEARCHTXTBOX = "citystateorzipcode";
	public final static String SENIORHOUSINGDROPDOWN = "//*[@id='seniorHousing']";
	public final static String SEARCHBTN = "//*[@id='h-search']";
	//Search result Search field
	public final static String SEARCHTEXTBOX = "//*[@id='citystateorzipcodehead']";
	
	public final static String CARECHCKBOX = "//*[@id='assistedliving-label']/span";
	public final static String RETIREMENTCHCKBOX = "//*[@id='seniorHousing-label']/span";
	public final static String NEARBYCITIES = "nearcitieszipcode";
	public final static String FIRSTSEARCHRESULT = "//*[@id='itemContainer']/li[contains(@class, 'fadeInUp')]";
	public final static String UPDTSEARCHBTN = "currentSearchBtn-care";
	public final static String UPDTCURRENTSEARCHBTN = "currentSearchBtn";
	public final static String NOMATCHFOUND = "//div[contains(@class, 'alert-warning') and contains(text(), 'no exact matches found')]";
	public final static String ERRORMESSAGE = "//label[text()='Please enter a City and State, or Zip.']";
	//Search result page
	public final static String COMMONHEADER = "common-header";
	public final static String BREADCRUMB = "//*[@id='searchresults']/div[2]/div/ol";
	public final static String FEATURED = "featured";
	public final static String REFINEMENT = "list-container";
	public final static String PPRTYFOUNDTEXT = "legend2";
	public final static String SEARCHRESULTS = "itemContainer";
	
	//Search result housing type
	
	public final static String APARTMENTS = "//*[@id='property-99724-jptitle']/../../../div[3]//p[contains(text(),'Apartments')]";
	//public final static String SENNIORAPARTMENT = "//*[@id='property-99724-jptitle']/../../../div[3]//p[contains(text(),'Senior Apartments')]";
	public final static String HOMESFORRENT = "//*[@id='property-99724-jptitle']/../../../div[3]//p[contains(text(),'Homes for Rent')]";
	public final static String HOMESFORSALE = "//*[@id='property-99724-jptitle']/../../../div[3]//p[contains(text(),'Homes for Sale')]";
	//public final static String HOMESRESFORRENT = "//*[@id='property-99724-jptitle']/../../../div[3]//p[contains(text(),'Homes (55+) For Rent')]";
	//public final static String HOMESRESFORSALE = "//*[@id='property-99724-jptitle']/../../../div[3]//p[contains(text(),'Homes (55+) For Sale')]";
	//public final static String RETIREMENTFORRENT = "//*[@id='property-99724-jptitle']/../../../div[3]//p[contains(text(),'Retirement Communities For Rent')]";
	//public final static String RETIREMENTFORSALE = "//*[@id='property-99724-jptitle']/../../../div[3]//p[contains(text(),'Retirement Communities For Sale')]";
	public final static String MANUFACTUREDHOUSINGFORRENT = "//*[@id='property-99724-jptitle']/../../../div[3]//p[contains(text(),'Manufactured Homes for Rent')]";
	public final static String MANUFACTUREDHOUSINGFORSALE = "//*[@id='property-99724-jptitle']/../../../div[3]//p[contains(text(),'Manufactured Homes for Sale')]";
	public final static String RVPARKS = "//*[@id='property-99724-jptitle']/../../../div[3]//p[contains(text(),'RV Parks')]";
	//public final static String RVRETIREMENT = "//*[@id='property-99724-jptitle']/../../../div[3]//p[contains(text(),'RV Retirement Communities')]";
	//public final static String SENIORMANUFACTUREDFORSALE = "//*[@id='property-99724-jptitle']/../../../div[3]//p[contains(text(),'Senior Manufactured Housing Parks For Sale')]";
	//public final static String SENIORMANUFACTUREDFORRENT = "//*[@id='property-99724-jptitle']/../../../div[3]//p[contains(text(),'Senior Manufactured Housing Parks For Rent')]";
	public final static String INDEPENDENTLIVING = "//*[@id='property-99724-jptitle']/../../../div[3]//p[contains(text(),'Independent Living')]";
	public final static String ALZHEIMER = "//*[@id='property-99724-jptitle']/../../../div[3]//p[contains(text(),'Memory Care')]";
	public final static String ASSISTEDLIVING = "//*[@id='property-99724-jptitle']/../../../div[3]//p[contains(text(),'Assisted Living')]";
	public final static String CRCC = "//*[@id='property-99724-jptitle']/../../../div[3]//p[contains(text(),'Continuing Care (CCRC)')]";
	public final static String NURSINGHOMES = "//*[@id='property-99724-jptitle']/../../../div[3]//p[contains(text(),'Nursing Homes')]";
	public final static String PERSONALCAREHOMES = "//*[@id='property-99724-jptitle']/../../../div[3]//p[contains(text(),'Residential Care Homes')]";
	
	//Nearby Cities and Other links on search results page
	public final static String SEARCHLINKS = "//*[@id='searchresults']/div[5]";
	//Phone Number track Locator
	public final static String PHONETRACK = "//*[@id='phonebutton' and contains(@onclick, 'trackPhoneGC')]";
	
	//Senior Housing by State links
	public final static String ARIZONA = "//a[contains(text(),'Arizona')]";
	public final static String ARIZONAHEADING = "//h1[contains(text(),'Senior Housing in Arizona')]";
	public final static String CALIFORNIA = "//a[contains(text(),'California')]";
	public final static String CALIFORNIAHEADING = "//h1[contains(text(),'Senior Housing in California')]";
	public final static String COLORADO = "//a[contains(text(),'Colorado')]";
	public final static String COLORADOHEADING = "//h1[contains(text(),'Senior Housing in Colorado')]";
	public final static String CONNECTICUT = "//a[contains(text(),'Connecticut')]";
	public final static String CONNECTICUTHEADING = "//h1[contains(text(),'Senior Housing in Connecticut')]";
	public final static String DELAWARE = "//a[contains(text(),'Delaware')]";
	public final static String DELAWAREHEADING = "//h1[contains(text(),'Senior Housing in Delaware')]";
	public final static String FLORIDA = "//a[contains(text(),'Florida')]";
	public final static String FLORIDAHEADING = "//h1[contains(text(),'Senior Housing in Florida')]";
	public final static String GEORGIA = "//a[contains(text(),'Georgia')]";
	public final static String GEORGIAHEADING = "//h1[contains(text(),'Senior Housing in Georgia')]";
	public final static String IDAHO = "//a[contains(text(),'Idaho')]";
	public final static String IDAHOHEADING = "//h1[contains(text(),'Senior Housing in Idaho')]";
	public final static String ILLINOIS = "//a[contains(text(),'Illinois')]";
	public final static String ILLINOISHEADING = "//h1[contains(text(),'Senior Housing in Illinois')]";
	public final static String INDIANA = "//a[contains(text(),'Indiana')]";
	public final static String INDIANAHEADING = "//h1[contains(text(),'Senior Housing in Indiana')]";
	public final static String IOWA = "//a[contains(text(),'Iowa')]";
	public final static String IOWAHEADING = "//h1[contains(text(),'Senior Housing in Iowa')]";
	public final static String KANSAS = "//a[contains(text(),'Kansas')]";
	public final static String KANSASHEADING = "//h1[contains(text(),'Senior Housing in Kansas')]";
	public final static String KENTUCY = "//a[contains(text(),'Kentucky')]";
	public final static String KENTUCYHEADING = "//h1[contains(text(),'Senior Housing in Kentucky')]";
	public final static String MAINE = "//a[contains(text(),'Maine')]";
	public final static String MAINEHEADING = "//h1[contains(text(),'Senior Housing in Maine')]";
	public final static String MARYLAND = "//a[contains(text(),'Maryland')]";
	public final static String MARYLANDHEADING = "//h1[contains(text(),'Senior Housing in Maryland')]";
	public final static String MASSACHUSETTS = "//a[contains(text(),'Massachusetts')]";
	public final static String MASSACHUSETTSHEADING = "//h1[contains(text(),'Senior Housing in Massachusetts')]";
	public final static String MICHIGAN = "//a[contains(text(),'Michigan')]";
	public final static String MICHIGANHEADING = "//h1[contains(text(),'Senior Housing in Michigan')]";
	public final static String MINNESOTA = "//a[contains(text(),'Minnesota')]";
	public final static String MINNESOTAHEADING = "//h1[contains(text(),'Senior Housing in Minnesota')]";
	public final static String MISSISSIPPI = "//a[contains(text(),'Mississippi')]";
	public final static String MISSISSIPPIHEADING = "//h1[contains(text(),'Senior Housing in Mississippi')]";
	public final static String MISSOURI = "//a[contains(text(),'Missouri')]";
	public final static String MISSOURIHEADING = "//h1[contains(text(),'Senior Housing in Missouri')]";
	public final static String NEBRASKA = "//a[contains(text(),'Nebraska')]";
	public final static String NEBRASKAHEADING = "//h1[contains(text(),'Senior Housing in Nebraska')]";
	public final static String NEVADA = "//a[contains(text(),'Nevada')]";
	public final static String NEVADAHEADING = "//h1[contains(text(),'Senior Housing in Nevada')]";
	public final static String NEWHAMISHPHIRE = "//a[contains(text(),'New Hampshire')]";
	public final static String NEWHAMISHPHIREHEADING = "//h1[contains(text(),'Senior Housing in New Hampshire')]";
	public final static String NEWJERSY = "//a[contains(text(),'New Jersey')]";
	public final static String NEWJERSYHEADING = "//h1[contains(text(),'Senior Housing in New Jersey')]";
	public final static String NEWMEXICO = "//a[contains(text(),'New Mexico')]";
	public final static String NEWMEXICOHEADING = "//h1[contains(text(),'Senior Housing in New Mexico')]";
	public final static String NEWYORK = "//a[contains(text(),'New York')]";
	public final static String NEWYORKHEADING = "//h1[contains(text(),'Senior Housing in New York')]";
	public final static String NORTHCAROLINA = "//a[contains(text(),'North Carolina')]";
	public final static String NORTHCAROLINAHEADING = "//h1[contains(text(),'Senior Housing in North Carolina')]";
	public final static String OHIO = "//a[contains(text(),'Ohio')]";
	public final static String OHIOHEADING = "//h1[contains(text(),'Senior Housing in Ohio')]";
	public final static String OKLAHOMA = "//a[contains(text(),'Oklahoma')]";
	public final static String OKLAHOMAHEADING = "//h1[contains(text(),'Senior Housing in Oklahoma')]";
	public final static String OREGON = "//a[contains(text(),'Oregon')]";
	public final static String OREGONHEADING = "//h1[contains(text(),'Senior Housing in Oregon')]";
	public final static String PENNSYLVANIA = "//a[contains(text(),'Pennsylvania')]";
	public final static String PENNSYLVANIAHEADING = "//h1[contains(text(),'Senior Housing in Pennsylvania')]";
	public final static String TENNESSEE = "//a[contains(text(),'Tennessee')]";
	public final static String TENNESSEEHEADING = "//h1[contains(text(),'Senior Housing in Tennessee')]";
	public final static String TEXAS = "//a[contains(text(),'Texas')]";
	public final static String TEXASHEADING = "//h1[contains(text(),'Senior Housing in Texas')]";
	public final static String UTAH = "//a[contains(text(),'Utah')]";
	public final static String UTAHHEADING = "//h1[contains(text(),'Senior Housing in Utah')]";
	public final static String VIRGINIA = "//a[contains(text(),'Virginia')]";
	public final static String VIRGINIAHEADING = "//h1[contains(text(),'Senior Housing in Virginia')]";
	public final static String WASHINGTON = "//a[contains(text(),'Washington')]";
	public final static String WASHINGTONHEADING = "//h1[contains(text(),'Senior Housing in Washington')]";
	public final static String WESTVIRGINIA = "//a[contains(text(),'West Virginia')]";
	public final static String WESTVIRGINIAHEADING = "//h1[contains(text(),'Senior Housing in West Virginia')]";
	public final static String WISCONSIN = "//a[contains(text(),'Wisconsin')]";
	public final static String WISCONSINHEADING = "//h1[contains(text(),'Senior Housing in Wisconsin')]";
	
	//Care Type checkboxes when checked
	public final static String CARECHECKED_ASSISTLVNG = "//*[@id='collapseThree']//input[@value='assisted-living' and @checked='checked']";
	public final static String CARECHECKED_NRSNGHOMES = "//*[@id='collapseThree']//input[@value='nursing-homes' and @checked='checked']";
	public final static String CARECHECKED_RESCAREHOMES = "//*[@id='collapseThree']//input[@value='residential-care-homes' and @checked='checked']";
	public final static String CARECHECKED_ALZMEMCARE = "//*[@id='collapseThree']//input[@value='alzheimers-memory-care' and @checked='checked']";
	public final static String CARECHECKED_CCRC = "//*[@id='collapseThree']//input[@value='continuing-care' and @checked='checked']";
	public final static String CARECHECKED_INDEPLVNG = "//*[@id='collapseThree']//input[@value='independent-living' and @checked='checked']";
	
	//Retirement Type checkboxes when checked
	public final static String RETCHECKED_APARTMENTS = "//*[@id='collapseTwo']//input[@value='apartments' and @checked='checked']";
	public final static String RETCHECKED_HOMESFORRENT = "//*[@id='collapseTwo']//input[@value='homes-for-rent' and @checked='checked']";
	public final static String RETCHECKED_HOMESFORSALE = "//*[@id='collapseTwo']//input[@value='homes-for-sale' and @checked='checked']";
	public final static String RETCHECKED_MANUFACTURED_HOMESFORRENT = "//*[@id='collapseTwo']//input[@value='manufactured-homes-for-rent' and @checked='checked']";
	public final static String RETCHECKED_MANUFACTURED_HOMESFORSALE = "//*[@id='collapseTwo']//input[@value='manufactured-homes-for-sale' and @checked='checked']";
	public final static String RETCHECKED_RVPARKS = "//*[@id='collapseFour']//input[@value='rv-parks' and @checked='checked']";
    
	//Free Property
	public final static String FREE_PROPERTY = "css=div[class='searchItem free-package']";
	
	//Paid property
	public final static String PAID_PROPERTY = "css=div[class='searchItem']";
	
	//Retirement Type checkboxes 
	public final static String RET_APARTMENTS = "//*[@id='collapseTwo']//input[@value='apartments']";
	public final static String RET_HOMESFORRENT = "//*[@id='collapseTwo']//input[@value='homes-for-rent']";
	public final static String RET_HOMESFORSALE = "//*[@id='collapseTwo']//input[@value='homes-for-sale']";
	public final static String RET_MANUFACTURED_HOMESFORRENT = "//*[@id='collapseTwo']//input[@value='manufactured-homes-for-rent']";
	public final static String RET_MANUFACTURED_HOMESFORSALE = "//*[@id='collapseTwo']//input[@value='manufactured-homes-for-sale']";
	public final static String RET_RVPARKS = "//*[@id='collapseFour']//input[@value='rv-parks']";
	
	//Care type checkboxes
	public final static String CARE_ALZHEIMER = "//*[@id='housingcarecheck6' and @value='alzheimers-memory-care']";
	public final static String CARE_ASSISTED = "//*[@id='housingcarecheck7' and @value='assisted-living']";
	public final static String CARE_CRCC = "//*[@id='housingcarecheck8' and @value='continuing-care']";
	public final static String CARE_INDEPENDENT = "//*[@id='housingcarecheck9' and @value='independent-living']";
	public final static String CARE_NURSING = "//*[@id='housingcarecheck10' and @value='nursing-homes']";
	public final static String CARE_RESIDENTIALCARE = "//*[@id='housingcarecheck11' and @value='residential-care-homes']";
	
	//Search Results Profile page
	public final static String SEARCHTYPEDRPDWN = "searchType";
	public final static String SHAREICONS = "class=share";
	public final static String HOUSINGTYPECONTENT = "//*[@id='profile-container']//div[@class='row profile-right-section']//div[@class='right-content']";
	public final static String MOREINFOBTN = "//*[@id='itemContainer']/li//a[contains(text(), 'More Info')]";
	//Footer Locator
	public final static String FOOTERONE = "footer";
	//Search Senior Housing by State
	public final static String SEARCHBYSTATEHEADING = "//h1[contains(text(),'Search for Senior Housing by State')]";
	
	//Search results and Print page
	public final static String MOREINFO = "//*[@id='itemContainer']//a[contains(text(),'More Info')]";
	public final static String PRINTBTN = "//*[@id='profilePrint']";
	public final static String ACTUALPRINTBTN = "//*[@id='print']";
	
	//Property profile page
	public final static String PROFILE_FNAME = "pro_firstName";
	public final static String PROFILE_LNAME = "pro_lastName";
	public final static String PROFILE_EMAIL = "pro_emailAddress";
	public final static String PROFILE_PHONE = "pro_phoneNumber";
	public final static String PROFILE_COMMENTS = "pro_comments";
	public final static String PROFILE_CHCKAVAILABILITYBTN = "//*[@id='profileFormContainer']//div[6]//*[@id='showProfileForm']";
	public final static String MODAL_CHECKAVAILABILITY = "//*[@id='profileMoreInfo']//a[@id='showProfileForm']";
	public final static String PROFILE_CONFMSG = "//div[@id='pro_msg_block']/strong[contains(text(), 'message has been sent')]";
	public final static String PROFILE_SEARCHINGFORDRPDWN = "pro_searchingFor";
	public final static String PROFILE_MOVEINDATE = "pro_moveDate";
	public final static String PROFILE_MOVEINDATE_NEXTARROW = "//th[@class='next']/i[contains(@class, 'glyphicon-arrow-right')]";
	public final static String PROFILE_MOVEINDATE15 = "//td[@class='day' and text()='15']";
	public final static String PROFILE_CHECKAVAILABILITY = "showProfileForm";
	public final static String PROFILE_CHECKAVAILABILITYLINK = "//*[@id='profileFloorPlan']/div//table/tbody/tr//a[contains(text(), 'Check Availability')]";
	public final static String PROFILE_THANKYOUMESSAGE = "//*[@id='pro_msg_block']/strong[text()='Thank you! Your message has been sent.']";
	
	
	//Check Availability pop up
	public final static String CHECKAVAILABILITY_SUBMIT = "//*[@id='msg_block']/button";
	public final static String CHECKAVAILABILITY_COMMENTS = "comments";
	public final static String CHECKAVAILABILITY_SEARCHINGFORDRPDWN = "searchingFor";
	public final static String CHECKAVAILABILITY_FNAME = "firstName";
	public final static String CHECKAVAILABILITY_LNAME = "lastName";
	public final static String CHECKAVAILABILITY_EMAIL = "emailAddress";
	public final static String CHECKAVAILABILITY_PHONE = "//*[@id='phoneNumber']";
	public final static String GUESTCARDSUGGESTMODAL = "//*[@id='gcSuggestedModal']";
	public final static String CHECKAVAILABILITY_CONF = "//*[@id='gcSuggestedModal']//h3[contains(text(), 'message has been sent')]";
	public final static String CHECKAVAILABILITY_CONFCLOSE = "//*[@id='gcSuggestedModal']//button[contains(@class,'close')]";
	public final static String CHECKAVAILABILITY_NOTHANKS = "//*[@id='jSugNoThanks']/a";	
	
	//Atlanta Search Result
	public final static String ATLANTAPOP = "//h1[contains(text(), 'Senior Housing Options in Atlanta, GA')]";
	//Denver Search Result
	public final static String DENVERPOP = "//h1[contains(text(), 'Senior Housing Options in Denver, CO')]";
	//Vegas Search Result
	public final static String LASVEGASPOP = "//h1[contains(text(), 'Senior Housing Options in Las Vegas, NV')]";
	//Los Angeles Search Result
	public final static String LOSANGELESPOP = "//h1[contains(text(), 'Senior Housing Options in Los Angeles, CA')]";
	//Miami Search Results
	public final static String MIAMIPOP = "//h1[contains(text(), 'Senior Housing Options in Miami, FL')]";
	//Minneapolis Search Result
	public final static String MINNEAPOLISPOP = "//h1[contains(text(), 'Senior Housing Options in Minneapolis, MN')]";
	//Orlando Search Result
	public final static String ORLANDOPOP = "//h1[contains(text(), 'Senior Housing Options in Orlando, FL')]";
	//Phoenix search result
	public final static String PHOENIXPOP = "//h1[contains(text(), 'Senior Housing Options in Phoenix, AZ')]";
	//RiverSide Search Result
	public final static String RIVERSIDEPOP = "//h1[contains(text(), 'Senior Housing Options in Riverside, CA')]";
	//Sacramento Search Results
	public final static String SACRAMENTOPOP = "//h1[contains(text(), 'Senior Housing Options in Sacramento, CA')]";	
	//San Diego Search Results
	public final static String SANDIEGOPOP = "//h1[contains(text(), 'Senior Housing Options in San Diego, CA')]";
//Tampa Search Results
	public final static String TAMPAPOP = "//h1[contains(text(), 'Senior Housing Options in Tampa, FL')]";

}


