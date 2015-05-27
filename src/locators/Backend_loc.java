package locators;

//locator class is public static final which means it can be accessed by all and cannot be changed.

public class Backend_loc {
	//Reports section
	public final static String PDFICON = "pdf";
	public final static String EXCELICON = "report_excel";
	public final static String REPORTS_FNAMEDETAILS = "//*[@id='reports']//table[contains(@class,'table')]/tbody/tr[2]/td[2]";
	public final static String REPORTS_LNAMEDETAILS = "//*[@id='reports']//table[contains(@class,'table')]/tbody/tr[2]/td[3]";
	public final static String REPORTS_EMAILDETAILS = "//*[@id='reports']//table[contains(@class,'table')]/tbody/tr[2]/td[4]";
	public final static String REPORTS_PHONEDETAILS = "//*[@id='reports']//table[contains(@class,'table')]/tbody/tr[2]/td[5]";
	public final static String REPORTS_MOVEDATE = "//*[@id='reports']//table[contains(@class,'table')]/tbody/tr[2]/td[6]";
	public final static String REPORTS_VIEWLINK = "//*[@id='reports']//table[contains(@class,'table')]/tbody/tr[2]/td[starts-with(@id, 'questionview')]/a";
	public final static String REPORTS_COMMENTSTXT = "//*[@id='reports']//table[contains(@class,'table')]/tbody//tr[@rel='question']/td/p[2]";
	public final static String LEADSDASHBOARD = "//*[@id='reports']//label[contains(text(), 'Leads™ Dashboard')]";
	public final static String LEADSDASHHEADING = "//*[@id='reports']//h2[contains(text(), 'Leads™  Dashboard')]";
	public final static String DATESELECTOR = "date_range";
	public final static String GOBTN = "report_date";
	public final static String LEADSBREAKDOWN = "//*[@id='reports']//h4[contains(text(), 'Leads Breakdown')]";
	public final static String PHONECALLLEADDETAIL = "//*[@id='reports']//label[contains(text(), 'Phone Call Leads™ Detail Report')]";
	public final static String CALLBYHRDAYHEADING = "//*[@id='reports']//h4[contains(text(), 'Call By Hour Of Day:')]";
	public final static String CALLBYDAYOFWEEKHEADING = "//*[@id='reports']//h4[contains(text(), 'Call By Day Of The Week:')]";
	public final static String SUMMARYCALLS = "//*[@id='reports']//h4[contains(text(), 'SUMMARY FOR ALL CALLS')]";
	//Guest Card Detail Report
	public final static String GUESTCARDLABEL = "//*[@id='reports']//label[contains(text(), 'Guest Card Leads™ Detail Report')]";
	public final static String GUESTCARDBREAKDOWN = "//*[@id='reports']//h4[contains(text(), 'GUEST CARD BREAKDOWN')]";
	public final static String GUESTCARDDETAIL = "//*[@id='reports']//h4[contains(text(), 'GUEST CARD DETAIL')]";
	public final static String COUNT_GUESTCARDS = "//*[@id='reports']//p[contains(text(), 'NUMBER OF GUEST CARDS')]/span";
	//Monthly Traffic
	public final static String MONTHLYTRAFFICLABEL = "//*[@id='reports']//label[contains(text(), 'Monthly Traffic Statistics Report')]";
	public final static String LEADBREAKDOWN = "//*[@id='reports']//h4[contains(text(), 'Leads Breakdown')]";
	public final static String ADDITIONALTOUCHPOINTS = "//*[@id='reports']//h4[contains(text(), 'Additional Touch Points BreakDown')]";
	//12 Months site performace report
	public final static String TWELVEMONTHSTATICREPORTLABEL = "//*[@id='reports']//label[contains(text(), '12 Month Site Performance Report')]";
	public final static String PROFILEPAGEVIEWS= "//*[@id='reports']//h4[contains(text(), 'PROFILE PAGE VIEWS:')]";
	public final static String GUESTCARDS = "//*[@id='reports']//h4[contains(text(), 'GUEST CARDS:')]";
	public final static String PHONELEADS = "//*[@id='reports']//h4[contains(text(), 'PHONE LEADS:')]";
	public final static String VANITYURLPROFILEVIEWS = "//*[@id='reports']//h4[contains(text(), 'VANITY URL PROFILE VIEWS:')]";
	public final static String CUSTOMERWEBSITECLICKS = "//*[@id='reports']//h4[contains(text(), 'CUSTOMER WEBSITE CLICKS:')]";
	//Community Emailer Report
	public final static String COMMUNITYLABEL = "//*[@id='reports']//label[contains(text(), 'Community Emailer Report')]";
	public final static String COMMUNITYEMAILERBREAKDOWN = "//*[@id='reports']//div[2]//h4[contains(text(), 'COMMUNITY EMAILER BREAKDOWN')]";
	public final static String COMMUNITYEMAILERDETAIL = "//*[@id='reports']//div[2]//h4[contains(text(), 'COMMUNITY EMAILER DETAIL')]"; 
			
	//Floor plans section
	public final static String ADDFLOORPLANBTN = "//input[@id='bt_save_changes' and contains(@onclick, 'savedata')]";
	public final static String FLOORPLAN_SAVECHANGESBTN = "//input[@id='bt_save_changes' and contains(@onclick, 'submitfloorplan')]";
	public final static String FLOORPLAN_NAMETXTBOX = "floorplanname";
	public final static String FLOORPLAN_DISPLAYONSITECHCKBOX = "displayonsite";
	public final static String FLOORPLAN_PRICEFROMTXTBOX = "pricefrom";
	public final static String FLOORPLAN_PRICETOTXTBOX = "priceto";
	public final static String FLOORPLAN_BEDROOMSDRPDWN = "bedrooms";
	public final static String FLOORPLAN_BATHROOMSDRPDWN = "bathrooms";
	
	//Lead management section
	public final static String LEADMGMT_INTERNETTOLLTXTBOX = "internettollfree";
	public final static String LEADMGMT_INTERNETTOLLCHCKBOX = "internettollfreeche";
	public final static String LEADMGMT_INTERNETLOCALTOLLTXTBOX = "localtollfree";
	public final static String LEADMGMT_INTERNETLOCALTOLLCHCKBOX = "localtollfreeche";
	
	//Account Details section
	public final static String ACC_PROPERTY_PHONETXTBOX = "property_phone";
	
	//Reporting Section
	public final static String REPORTING = "//*[@id='search']//li[3]//b[text()='Reporting']";
	public final static String REPORTINGSECTION = "//*[@id='reporting']/div";
	public final static String SITEPERFORMANCEREPORT = "//*[@id='reporting']//a[text()='Site Performance Reports']";
	public final static String SITEPERFORMANCEHEADING = "//*[@id='formRportByCity']/h3[text()='Site Performance Report by City']";
	public final static String CITYTEXTFIELD = "city_state";
	public final static String GETREPORTCITY = "//input[@value='Get Report']";
	public final static String RESULTLIST = "gbox_list2";
	public final static String PERFORMANCEEXCELICON = "performancecityexcel";
	public final static String BYMETROLINK = "//*[@id='site-sub-menu']//a[text()='by Metro']";
	public final static String BYMETROHEADING = "//*[@id='formRportBymetro']/h3[text()='Site Performance Report by Metro']";
	public final static String STATEDROPDOWN = "state";
	public final static String METRODROPDOWN = "metro";
	public final static String GETREPORTMETRO = "//*[@id='formRportBymetro']//input[@value='Get Report']";
	public final static String BYPMC = "//*[@id='site-sub-menu']//a[text()='by PMC']";
	public final static String BYPMCHEADING = "//*[@id='performancepmcsearch']/h3[text()='Site Performance Report by PMC']";
	public final static String PMCTEXTFIELD = "pmc_name";
	public final static String GETREPORTPMC = "//*[@id='performancepmcsearch']//input[@value='Get Report']";
	public final static String FORALLSITELINK = "//*[@id='site-sub-menu']//a[text()='for All Sites']";
	public final static String GETREPORTALLSITE = "//*[@id='performanceallsitesearch']//input[@value='Get Report']";
	public final static String METRORESULTHEADING = "//*[@id='message']/strong[text()='Site Performance Report for Hampton Roads Metro ']";
	public final static String BYPMCRESULTHEADING = "//*[@id='message']/strong[text()='Site Performance Report for FPI Management, Inc']";
	public final static String FORALLSITEHEADING = "//*[@id='performanceallsitesearch']/h3[text()='Site Performance Report for All Sites']";
	public final static String FORALLSITERESULTHEADING = "//*[@id='message']/strong[text()='Site Performance Report for All Sites ']";
	
	//Locators for Group Administration
	public final static String ADMINBTN = "//*[@id='search']//li[1]//b[text()='Admin']";
	public final static String GROUPADMIN_USERNAME = "username_c";
	public final static String GROUPADMIN_PASSWORD = "password_c";
	public final static String SITEID = "site_id";
	public final static String ACTIVEDROPDOWN = "active_c";
	public final static String ADDBTN = "submit_c";
	public final static String GRPADMINLINK = "//*[@id='navigation-tools']//li[3]/a[text()='Group Administration']";
	public final static String GRPADMINHEADING = "//div[@class='well']/h1[text()='Group Administration']";
	public final static String CONSOLIDATEDLEADBTN = "//*[@id='search']//a[text()='Consolidated LEADS Report']";
	
	//Locator for LEAD MANAGEMENT TAB
	public final static String COMPANYWEBSITEURL = "companywebsiteurl";
	public final static String SAVECHANGESBTN = "bt_save_changes";
	public final static String SAVECHANGEMSG = "errormessage";
	
	//Locator for Visit Our Website link on property Profile page
	public final static String VISTOURWEBSITE = "//*[@id='profile-container']//a[text()='Visit Our Website']";
	
	//Locator for CHC logo
	public final static String CHCLOGO = "logo";
	
	//Locators for Account Details tab
	
	public final static String ACCDETAIL_VANITYURL = "propertyvanityurl";
	public final static String ACCDETAIL_FIRSTNAME = "admin_firstname";
	
	public final static String APARTMENTS = "listingtype1";
	public final static String HOMESFORRENT  = "listingtype2";
	public final static String HOMESFORSALE = "listingtype3";
	public final static String MANUFACTUREDHOMESFORRENT = "listingtype4";
	public final static String MANUFACTUREDHOMESFORSALE = "listingtype5";
	public final static String ALZHEIMERCARE = "listingtype6";
	public final static String ASSISTEDLIVING = "listingtype7";
	public final static String CCRC = "listingtype8";
	public final static String INDEPENDENTLIVING = "listingtype9";
	public final static String NURSINGHOMES = "listingtype10";
	public final static String RESIDENTIALCAREHOMES = "listingtype11";
	public final static String RVPARKS = "listingtype12";

	//Locators for profile Tab
	public final static String PROFILE_TAGLINE = "propertytagline";
	public final static String PROFILE_SHORTDESCRIPTION = "propertyshortdes";
	public final static String PROFILE_LONGDESCRIPTION = "propertylongdes";
	public final static String PROFILE_PETPOLICY = "propertypolicy";
	public final static String PROFILE_BP1 = "bp1";
	public final static String PROFILE_BP1CHECKBOX = "profile_page_1";
	public final static String PROFILE_BP2 = "bp2";
	public final static String PROFILE_BP2CHECKBOX = "profile_page_2";
	public final static String PROFILE_BP3 = "bp3";
	public final static String PROFILE_BP3CHECKBOX = "profile_page_3";
	public final static String PROFILE_BP4 = "bp4";
	public final static String PROFILE_BP4CHECKBOX = "profile_page_4";
	public final static String PROFILE_BP5 = "bp5";
	public final static String PROFILE_BP5CHECKBOX = "profile_page_5";
	public final static String PROFILE_BP6 = "bp6";
	public final static String PROFILE_BP6CHECKBOX = "profile_page_6";
	public final static String PROFILE_BP7 = "bp7";
	public final static String PROFILE_BP7CHECKBOX = "profile_page_7";
	public final static String PROFILE_BP8 = "bp8";
	public final static String PROFILE_BP8CHECKBOX = "profile_page_8";
	public final static String PROFILE_BP9 = "bp9";
	public final static String PROFILE_BP9CHECKBOX = "profile_page_9";
	public final static String PROFILE_BP10 = "bp10";
	public final static String PROFILE_BP10CHECKBOX = "profile_page_10";
	public final static String PROFILE_BP11 = "bp11";
	public final static String PROFILE_BP11CHECKBOX = "profile_page_11";
	//Office Hrs
	public final static String MONDAYSTART = "monday_startTime";
	public final static String MONDAYEND = "monday_endTime";
	public final static String TUESDAYSTART = "tuesday_startTime";
	public final static String TUESDAYEND = "tuesday_endTime";
	public final static String WEDNESDAYSTART = "wednesday_startTime";
	public final static String WEDNESDAYEND = "wednesday_endTime";
	public final static String THURSDAYSTART = "thursday_startTime";
	public final static String THURSDAYEND = "thursday_endTime";
	public final static String FRIDAYSTART = "friday_startTime";
	public final static String FRIDAYEND = "friday_endTime";
	public final static String SATURDAYSTART = "saturday_startTime";
	public final static String SATURDAYEND = "saturday_endTime";
	public final static String SUNDAYSTART = "sunday_startTime";
	public final static String SUNDAYEND = "sunday_endTime";
	
	public final static String PROFILE_PROMOTION = "prodescription";
	public final static String PROFILE_PROMOSTARTDATE = "prostartdate";
	public final static String PROFILE_NXTICON = "//*[@id='search']/div[6]/div[1]/table/thead/tr[1]/th[3]";
	public final static String SELECTPROMOSTARTDATE = "//div[@class='datepicker-days']//td[@class='day active']";
	public final static String SELECTPROMOENDDATE = "//*[@id='search']/div[6]/div[1]/table/tbody/tr[4]/td[3]";
	public final static String PROFILE_PROMOENDDATE = "proenddate";
	public final static String MONDAYOFFHRS = "//*[@id='profile-container']//div[1][contains(text(),'Monday: 09:00 AM - 06:00 PM')]";
	public final static String TUESOFFHRS = "//*[@id='profile-container']//div[2][contains(text(),'Tuesday: 09:00 AM - 06:00 PM')]";
	public final static String WEDOFFHRS = "//*[@id='profile-container']//div[3][contains(text(),'Wednesday: 09:00 AM - 06:00 PM')]";
	public final static String THUOFFHRS = "//*[@id='profile-container']//div[4][contains(text(),'Thursday: 09:00 AM - 06:00 PM')]";
	public final static String FRIOFFHRS = "//*[@id='profile-container']//div[5][contains(text(),'Friday: 09:00 AM - 06:00 PM')]";
	public final static String SATOFFHRS = "//*[@id='profile-container']//div[6][contains(text(),'Saturday: 12 Noon - 05 Noon')]";
	public final static String SUNDAYOFFHRS = "//*[@id='profile-container']//div[7][contains(text(),'Sunday: CLOSED')]";
	
	
	//Locators for Community Emailer Section
	
	public final static String SENDERNAME = "sendername";
	public final static String SENDERMAIL = "senderemail";
	public final static String CUSTOMGREETING = "com_customgreeting";
	public final static String SENDBTN = "//*[@id='bt_save_changes' and @value='SEND']";
	public final static String FIRSTEMAIL = "emailcomm1";
	public final static String FIRSTNAME = "namecomm1";
	public final static String SECONDEMAIL = "emailcomm2";
	public final static String SECONDNAME = "namecomm2";
	public final static String THIRDEMAIL = "emailcomm3";
	public final static String THIRDNAME = "namecomm3";
	public final static String FOURTHEMAIL = "emailcomm4";
	public final static String FOURTHNAME = "namecomm4";
	public final static String FIFTHEMAIL = "emailcomm5";
	public final static String FIFTHNAME = "namecomm5";
	
	//Amenities
	public final static String AMENITYTAB = "//*[@id='nav2']//li[4]/a/b[contains(text(),'AMENITIES')]";
	//INTERIOR FEATURES
	public final static String TWENTYFOURHOUREMERGENCYCALL = "//*[@id='optionsCheckbox' and @value=1]";
	public final static String AIRCONDITIONING = "//*[@id='optionsCheckbox' and @value=5]";
	public final static String ALARMSYSTEM = "//*[@id='optionsCheckbox' and @value=6]";
	public final static String APPLIANCEPACKAGE = "//*[@id='optionsCheckbox' and @value=9]";
	public final static String ATTACHEDONECARGARAGE = "//*[@id='optionsCheckbox' and @value=15]";
	public final static String ATTACHEDTWOCARGARAGE = "//*[@id='optionsCheckbox' and @value=16]";
	public final static String BALCONY = "//*[@id='optionsCheckbox' and @value=17]";
	public final static String BREAKFASTBAR = "//*[@id='optionsCheckbox' and @value=25]";
	public final static String CABLESATELLITE = "//*[@id='optionsCheckbox' and @value=27]";
	public final static String CEILINGFAN = "//*[@id='optionsCheckbox' and @value=30]";
	public final static String CLOSINGCOSTALLOWANCE = "//*[@id='optionsCheckbox' and @value=34]";
	public final static String DISHWASHER = "//*[@id='optionsCheckbox' and @value=44]";
	public final static String FIREPLACE = "//*[@id='optionsCheckbox' and @value=51]";
	public final static String FREEWIFI = "//*[@id='optionsCheckbox' and @value=136]";
	public final static String FRONTPORCH = "//*[@id='optionsCheckbox' and @value=53]";
	public final static String FULLYEQUIPPEDKITCHEN = "//*[@id='optionsCheckbox' and @value=55]";
	public final static String FURNISHEDUNITSAVAIL = "//*[@id='optionsCheckbox' and @value=56]";
	public final static String GARBAGEDISPOSAL = "//*[@id='optionsCheckbox' and @value=59]";
	public final static String HARDWOODFLOOR = "//*[@id='optionsCheckbox' and @value=66]";
	public final static String HOUSEKEEPING = "//*[@id='optionsCheckbox' and @value=69]";
	public final static String INDIVIDUALCLIMATE = "//*[@id='optionsCheckbox' and @value=70]";
	public final static String INTERNETREADY = "//*[@id='optionsCheckbox' and @value=137]";
	public final static String KITCHENETTE = "//*[@id='optionsCheckbox' and @value=131]";
	public final static String LIGHTEDCLOSETS = "//*[@id='optionsCheckbox' and @value=78]";
	public final static String LINENSSUPPLIED = "//*[@id='optionsCheckbox' and @value=80]";
	public final static String MASTERBEDROOM = "//*[@id='optionsCheckbox' and @value=83]";
	public final static String MICROWAVE = "//*[@id='optionsCheckbox' and @value=86]";
	public final static String PATIO = "//*[@id='optionsCheckbox' and @value=93]";
	public final static String PRIVATEBATH = "//*[@id='optionsCheckbox' and @value=99]";
	public final static String PRIVATECOURTYARD = "//*[@id='optionsCheckbox' and @value=100]";
	
	//COMMUNITY FEATURES
	public final static String TWNETYFOURHRSTAFF = "//*[@id='optionsCheckbox' and @value=2]";
	public final static String ACTIVITYDIRECTOR = "//*[@id='optionsCheckbox' and @value=3]";
	public final static String ADDITIONALSTORAGE = "//*[@id='optionsCheckbox' and @value=4]";
	public final static String ALARMEDINTEXTDOOR = "//*[@id='optionsCheckbox' and @value=7]";
	public final static String ARTCRAFTROOM = "//*[@id='optionsCheckbox' and @value=10]";
	public final static String BALLROOM = "//*[@id='optionsCheckbox' and @value=18]";
	public final static String BANKINGONSITE = "//*[@id='optionsCheckbox' and @value=19]";
	public final static String BASEBALLFIELD = "//*[@id='optionsCheckbox' and @value=20]";
	public final static String BEACHCOMMUNITY = "//*[@id='optionsCheckbox' and @value=143]";
	public final static String BILINGUAL = "//*[@id='optionsCheckbox' and @value=23]";
	public final static String BILLIARDROOM = "//*[@id='optionsCheckbox' and @value=24]";
	public final static String CAFE = "//*[@id='optionsCheckbox' and @value=28]";
	public final static String CASEMANAGEMENT = "//*[@id='optionsCheckbox' and @value=29]";
	public final static String CHAPEL = "//*[@id='optionsCheckbox' and @value=31]";
	public final static String CHAPLAIN = "//*[@id='optionsCheckbox' and @value=32]";
	public final static String CLOSETOMEDICAL = "//*[@id='optionsCheckbox' and @value=33]";
	public final static String CLOSETOWELLNESS = "//*[@id='optionsCheckbox' and @value=133]";
	public final static String CLUBHOUSE = "//*[@id='optionsCheckbox' and @value=35]";
	public final static String COMPUTERROOM = "//*[@id='optionsCheckbox' and @value=36]";
	public final static String CONCIERGE = "//*[@id='optionsCheckbox' and @value=37]";
	public final static String CONTROLLEDACCESSENTRY = "//*[@id='optionsCheckbox' and @value=37]";
	public final static String COURTYARD = "//*[@id='optionsCheckbox' and @value=39]";
	public final static String COVEREDPARKING = "//*[@id='optionsCheckbox' and @value=40]";
	public final static String DISABILITYACCESS = "//*[@id='optionsCheckbox' and @value=65]";
	public final static String EDUCATIONALSERVICE = "//*[@id='optionsCheckbox' and @value=45]";
	public final static String ELEVATOR = "//*[@id='optionsCheckbox' and @value=46]";
	public final static String ENCLOSEDWALKAWAY = "//*[@id='optionsCheckbox' and @value=47]";
	public final static String ESCORT = "//*[@id='optionsCheckbox' and @value=48]";
	public final static String EXTENDEDHOMEWARRANTY = "//*[@id='optionsCheckbox' and @value=49]";
	public final static String FAMILYSUPPORTPROGRAM = "//*[@id='optionsCheckbox' and @value=50]";
	public final static String FITNESS = "//*[@id='optionsCheckbox' and @value=52]";
	public final static String FULLSERVDINING = "//*[@id='optionsCheckbox' and @value=54]";
	public final static String GAMEROOM = "//*[@id='optionsCheckbox' and @value=57]";
	public final static String GARAGE = "//*[@id='optionsCheckbox' and @value=58]";
	public final static String GATEDCOMMUNITY = "//*[@id='optionsCheckbox' and @value=60]";
	public final static String GENERALSTORE = "//*[@id='optionsCheckbox' and @value=61]";
	public final static String GIFTSHOP = "//*[@id='optionsCheckbox' and @value=62]";
	public final static String GOLFCOMMUNITY = "//*[@id='optionsCheckbox' and @value=63]";
	public final static String GOVTHOUSINGPROGRAM = "//*[@id='optionsCheckbox' and @value=134]";
	public final static String GUESTACCOMODATION = "//*[@id='optionsCheckbox' and @value=64]";
	public final static String HOMEOWNERASSOCIATION = "//*[@id='optionsCheckbox' and @value=68]";
	public final static String INCOMERESTRICTED = "//*[@id='optionsCheckbox' and @value=135]";
	public final static String LAKECOMMUNITY = "//*[@id='optionsCheckbox' and @value=72]";
	public final static String LAUNDARYROOM = "//*[@id='optionsCheckbox' and @value=73]";
	public final static String LAWNMAINTENANCE = "//*[@id='optionsCheckbox' and @value=74]";
	public final static String LIBRARY = "//*[@id='optionsCheckbox' and @value=75]";
	public final static String LSOCIALWORKER = "//*[@id='optionsCheckbox' and @value=76]";
	public final static String LIGHTEDSIDEWALK = "//*[@id='optionsCheckbox' and @value=79]";
	public final static String MAINTENANCEFREE = "//*[@id='optionsCheckbox' and @value=81]";
	public final static String MEALSPROVIDED = "//*[@id='optionsCheckbox' and @value=84]";
	public final static String MOVIETHEATER = "//*[@id='optionsCheckbox' and @value=87]";
	public final static String NEARBUSLINE = "//*[@id='optionsCheckbox' and @value=88]";
	public final static String NONSMOKING = "//*[@id='optionsCheckbox' and @value=89]";
	public final static String ONSITEMANAGER = "//*[@id='optionsCheckbox' and @value=92]";
	public final static String PLANNEDACTIVITY = "//*[@id='optionsCheckbox' and @value=97]";
	public final static String HOMESECURITYSYSTEM = "//*[@id='optionsCheckbox' and @value=98]";
	public final static String PRIVATEDININGROOM = "//*[@id='optionsCheckbox' and @value=101]";
	public final static String PUTTINGREEN = "//*[@id='optionsCheckbox' and @value=103]";
	public final static String RESIDENTCOUNCIL = "//*[@id='optionsCheckbox' and @value=105]";
	public final static String RVHOOKUP = "//*[@id='optionsCheckbox' and @value=108]";
	public final static String RVSTORAGE = "//*[@id='optionsCheckbox' and @value=109]";
	public final static String SALOON = "//*[@id='optionsCheckbox' and @value=21]";
	public final static String SHUFFLEBOARD = "//*[@id='optionsCheckbox' and @value=111]";
	public final static String SIDEWALKCOMMUNITY = "//*[@id='optionsCheckbox' and @value=112]";
	public final static String SOCIALAREAS	 = "//*[@id='optionsCheckbox' and @value=114]";
	public final static String SPA = "//*[@id='optionsCheckbox' and @value=115]";
	public final static String SWIMMINGPOOL = "//*[@id='optionsCheckbox' and @value=121]";
	public final static String TENNISCOURT = "//*[@id='optionsCheckbox' and @value=122]";
	public final static String TRANSPORTATION = "//*[@id='optionsCheckbox' and @value=124]";
	public final static String WALKINGPATH = "//*[@id='optionsCheckbox' and @value=126]";
	public final static String WOODSHOP = "//*[@id='optionsCheckbox' and @value=130]";
	
	//Wellness Feature
	public final static String ALZEIHMERCARE = "//*[@id='optionsCheckbox' and @value=8]";
	public final static String ASSISTANCEWITHACTIVITY = "//*[@id='optionsCheckbox' and @value=14]";
	public final static String ASSISTANCEWITHCHRONIC = "//*[@id='optionsCheckbox' and @value=11]";
	public final static String ASSISTANCEINCONTINENCE = "//*[@id='optionsCheckbox' and @value=12]";
	public final static String ASSISTANCEWITHRESTORATIVE = "//*[@id='optionsCheckbox' and @value=13]";
	public final static String BEHAVIOURMANAGEMENT = "//*[@id='optionsCheckbox' and @value=22]";
	public final static String DAILYSTATUSCHECK = "//*[@id='optionsCheckbox' and @value=41]";
	public final static String DEMETIACARE = "//*[@id='optionsCheckbox' and @value=42]";
	public final static String DIABETICCARE = "//*[@id='optionsCheckbox' and @value=43]";
	public final static String HEALTHASSESSMENT = "//*[@id='optionsCheckbox' and @value=67]";
	public final static String LTHERAPIST = "//*[@id='optionsCheckbox' and @value=77]";
	public final static String MASSAGETHERAPIST = "//*[@id='optionsCheckbox' and @value=82]";
	public final static String MEDICATIONASSISTANCE = "//*[@id='optionsCheckbox' and @value=85]";
	public final static String NUTRITIONALCONSULTANT = "//*[@id='optionsCheckbox' and @value=90]";
	public final static String OCCUPATIONALTHERAPY = "//*[@id='optionsCheckbox' and @value=138]";
	public final static String ONSITEHEALTHCLINIC = "//*[@id='optionsCheckbox' and @value=91]";
	public final static String PHARMACY = "//*[@id='optionsCheckbox' and @value=95]";
	public final static String PHYSICALTHERAPY = "//*[@id='optionsCheckbox' and @value=96]";
	public final static String REHABILITATION = "//*[@id='optionsCheckbox' and @value=104]";
	public final static String RESIDENTNURSE = "//*[@id='optionsCheckbox' and @value=106]";
	public final static String RESPITECARE = "//*[@id='optionsCheckbox' and @value=107]";
	public final static String SKILLEDNURSING = "//*[@id='optionsCheckbox' and @value=113]";
	public final static String SPECIALDIET = "//*[@id='optionsCheckbox' and @value=116]";
	public final static String SPEECHTHERAPY = "//*[@id='optionsCheckbox' and @value=117]";
	public final static String SUBACUTE = "//*[@id='optionsCheckbox' and @value=119]";
	public final static String THERAPEUTIC = "//*[@id='optionsCheckbox' and @value=123]";
	public final static String THERAPYPOOL = "//*[@id='optionsCheckbox' and @value=132]";
	public final static String WELNESS = "//*[@id='optionsCheckbox' and @value=129]";
	
	
}
