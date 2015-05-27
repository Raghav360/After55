package locators;

//locator class is public static final which means it can be accessed by all and cannot be changed.

public class Homepage_loc {
	public final static String LOGOUTLINK = "//div[@class='navbar navbar-fixed-top visible-desktop']//a[contains(@href, 'logout')]";
	
//Homepage locators
	public final static String LOGO = "home-logo";
	public final static String NEEDSASSESSMENTLINK = "//a[contains(@href, 'assessment')]";
	public final static String ADVERTISELINK = "//*[@id='main']//a[text()='Advertise']";
	public final static String GETINTOCUHFORM = "lp-pom-box-424";
	public final static String ABOUTUSLINKHOMEPAGE = "//*[@id='main']//a[text()='ABOUT US']";
	public final static String HOMELINK = "//*[@id='main']//a[text()='HOME']";
	public final static String RESOURCESANDTIPSLINK = "//*[@id='main']//a[text()='RESOURCES & TIPS']";
	public final static String MAGAZINELINK = "//*[@id='main']//a[text()='MAGAZINES']";
	public final static String MANAGEROWNERLINK = "//a[text()='Managers & Owners']";
	public final static String HOMESEARCHFORM = "homeSearchForm";
	public final static String HOMEPAGEIMAGES = "myCarousel";
	public final static String RESOURCESWIDGET = "resource-home";
	public final static String VIDEOPLAYERHOME = "bvVideoPreview";
	public final static String POPULARCITIESLINK = "home-cities";
	public final static String HOUSINGBYSTATELINK = "//*[@id='home-cities']//a[text()='Search Senior Housing by State']";
	public final static String FOOTERONE = "footer";
	public final static String FOOTERTWO = "//*[@id='footer']/footer/div[2]/div";
	public final static String SENIORHOUSINGBYSTATELINK = "//a[contains(text(),'Search Senior Housing by State')]";
	
	//Homepage Learn More
	public final static String LEARNMOREHOUSING = "//*[@id='community-icons']//div[1]/a[contains(text(), 'LEARN MORE')]";
	public final static String LEARNMORECARE = "//*[@id='community-icons']//div[2]/a[contains(text(), 'LEARN MORE')]";
	public final static String LEARNMORERV = "//*[@id='community-icons']//div[3]/a[contains(text(), 'LEARN MORE')]";
	public final static String SENIORHOUSINGLINKHONE = "//*[@id='top-menu-pri']//li[1]/a[contains(text(), 'SENIOR HOUSING')]";
	public final static String CARECOMMUNIIESLINKHONE = "//*[@id='top-menu-pri']//li[2]/a[contains(text(), 'CARE COMMUNITIES')]";
	public final static String RVPARKSLINKHONE = "//*[@id='top-menu-pri']//li[3]/a[contains(text(), 'RV LIVING')]";
	public final static String HOUSINGCOMMICON = "//*[@id='community-icons']//h3/a[contains(text(), 'HOUSING COMMUNITIES')]";
	public final static String CARECOMMICON = "//*[@id='community-icons']//h3/a[contains(text(), 'CARE COMMUNITIES')]";
	public final static String RVLIVINGICON = "//*[@id='community-icons']//h3/a[contains(text(), 'RV PARKS AND RESORTS')]";
	//Resources widget
	public final static String RESOURCES_NEEDASSESSMENT = "//*[@id='resource-home']//a[contains(@href, 'assessment')]";
	public final static String RESOURCES_GLOSSARY = "//*[@id='resource-home']//a[text()='Glossary']";
	public final static String RESOURCES_FREEMOVINGQUOTES = "//*[@id='resource-home']//a[contains(@href, 'movingquotes')]";
	public final static String RESOURCES_YOURLIFE = "//*[@id='resource-home']//a[contains(@href, 'your-life')]";
	public final static String RESOURCES_YOURHEALTH = "//*[@id='resource-home']//a[contains(@href, 'your-health')]";
	public final static String RESOURCES_YOURFINANCE = "//*[@id='resource-home']//a[contains(@href, 'your-finance')]";
	//Header text
	public final static String HEADER_NEEDASSESSMENT = "//li[@class='active' and text()='Needs Assessment']";
	public final static String HEADER_GLOSSARY = "//*[@id='post-main-219']//a[text()='Senior Housing Glossary']";
	public final static String HEADER_FREEMOVINGQUOTES = "//li[@class='active' and text()='Moving Quotes']";
	public final static String HEADER_YOURLIFE = "//*[@id='post-main-55']//h1[text()='Your Life.']";
	public final static String HEADER_YOURHEALTH = "//*[@id='post-main-57']//h1[text()='Your Health.']";
	public final static String HEADER_YOURFINANCE = "//*[@id='post-main-49']//h1[text()='Your Finance.']";
	//Senior Housing in popular cities
	public final static String POPCITIES_ATLANTA = "//*[@id='home-cities']//div[text()='Atlanta']";
	public final static String POPCITIES_DENVER = "//*[@id='home-cities']//div[text()='Denver']";
	public final static String POPCITIES_LASVEGAS = "//*[@id='home-cities']//div[text()='Las Vegas']";
	public final static String POPCITIES_LOSANGELES = "//*[@id='home-cities']//div[text()='Los Angeles']";
	public final static String POPCITIES_MIAMI = "//*[@id='home-cities']//div[text()='Miami']";
	public final static String POPCITIES_MINNEAPOLIS = "//*[@id='home-cities']//div[text()='Minneapolis']";
	public final static String POPCITIES_ORLANDO = "//*[@id='home-cities']//div[text()='Orlando']";
	public final static String POPCITIES_PHOENIX = "//*[@id='home-cities']//div[text()='Phoenix']";
	public final static String POPCITIES_RIVERSIDE = "//*[@id='home-cities']//div[text()='Riverside']";
	public final static String POPCITIES_SACRAMENTO = "//*[@id='home-cities']//div[text()='Sacramento']";
	public final static String POPCITIES_SANDIEGO = "//*[@id='home-cities']//div[text()='San Diego']";
	public final static String POPCITIES_TAMPA = "//*[@id='home-cities']//div[text()='Tampa']";
	
	//Footer Locators
	public final static String FTRHOME = "//*[@id='footer']//li[1]/a[contains(text(), 'Home')]";
	public final static String FTRABTUS = "//*[@id='footer']//li[2]/a[contains(text(), 'About Us')]";
	public final static String FTRADVERTISE = "//*[@id='footer']//li[3]/a[contains(text(), 'Advertise')]";
	public final static String FTRMAGAZINES = "//*[@id='footer']//li[4]/a[contains(text(), 'Magazines')]";
	public final static String FTRMANAGEROWNER = "//*[@id='footer']//li[5]/a[contains(text(), 'Managers & Owners')]";
	public final static String FTRNEEDASSESSMENT = "//*[@id='footer']//li[6]/a[contains(text(), 'Needs Assessment')]";
	public final static String FTRRESOURCETIP = "//*[@id='footer']//li[7]/a[contains(text(), 'Resources & Tips')]";
	public final static String FTRPRIVACY = "//*[@id='footer']//li[8]/a[contains(text(), 'Privacy Policy')]";
	public final static String FTRVISITORAGREEMENT = "//*[@id='footer']//li[9]/a[contains(text(), 'Visitor Agreement')]";
	public final static String FTRADCHOICE = "//*[@id='footer']//li/a[contains(text(), 'Ad Choices')]";
	public final static String FTRFORRENTSITE = "//*[@id='footer']//li[1]/a[contains(text(), 'ForRent.com')]";
	public final static String FTRFRUSITE = "//*[@id='footer']//li[2]/a[contains(text(), 'ForRentUniversity.com')]";
	public final static String FTRCHCSITE = "//*[@id='footer']//li[3]/a[contains(text(), 'CorporateHousing.com')]";
	public final static String FTRFBICON = "//*[@id='footer']//a[1]/span";
	public final static String FTRTWITTERICON = "//*[@id='footer']//a[2]/span";
	public final static String FTRBLOGICON = "//*[@id='footer']//a[3]/span";
	public final static String FTRCOPYRIGHT = "//*[@id='footer']//a[contains(text(), '© 2015 Dominion Enterprises, All rights reserved.')]";
}
