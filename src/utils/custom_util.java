package utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriverService;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public abstract class custom_util {
	// Define objects
	private static WebDriver driver;
	//private static Selenium selenium;
	protected propertiesreader_util propertiesreader_util = new propertiesreader_util();
	protected static DesiredCapabilities capabilities;

	@BeforeMethod (alwaysRun=true)
	public void setUp(){
		String driverType = utils.propertiesreader_util.readProperty("env.properties", "BROWSER");	
		System.out.println(driverType);
		//Check if desired browser is Firefox
		if (driverType.equalsIgnoreCase("firefox")) 
		{ 
			FirefoxProfile profile = new FirefoxProfile();
			profile.setPreference("general.useragent.override", "Mozilla/5.0 (Windows NT 6.1; rv:20.0) Gecko/20100101 Firefox/20.0");
			profile.setPreference("useragentswitcher.reset.onclose", true);
			driver = new FirefoxDriver(); 
		} 	
		
					
		//Check if desired browser is Internet Explorer
		else if (driverType.equalsIgnoreCase("ie")) 
		{ 
			DesiredCapabilities capabilities = new DesiredCapabilities();
			capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			System.setProperty("webdriver.ie.driver", "C:\\iedriver\\IEDriverServer.exe");
			driver = new InternetExplorerDriver(); 
		}

		//Check if desired browser is Chrome
		else if (driverType.equalsIgnoreCase("chrome")) 
		{ 
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		} 
		//Check if desire to run headless
		else if (driverType.equalsIgnoreCase("phantomjs"))
		{
			capabilities = new DesiredCapabilities();
			capabilities.setJavascriptEnabled(true);
			capabilities.setCapability("takesScreenshot", true);
			capabilities.setCapability("handlesAlerts", true);
			capabilities.setCapability("acceptSslCerts", true);
			capabilities.setCapability(PhantomJSDriverService.PHANTOMJS_EXECUTABLE_PATH_PROPERTY, "C:\\ThirdPartyLibs_DontDelete\\phantomjs.exe");
			driver = new PhantomJSDriver(capabilities);
		}


		//Maximize window
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();		
	}	

	@AfterMethod (alwaysRun=true)
	public void afterMainMethod(ITestResult result){
		String testname = result.getName();
		if( !result.isSuccess()){
			File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			try {
				FileUtils.copyFile(srcFile, new File("screenshot\\"+ testname + getTimeStamp() +".png"));
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		driver.quit();
	}

	// Return web driver object
	public static WebDriver getWebDriver() {
		return driver;
	}

	
	//Define variables for user credentials
	protected static String csuser = utils.propertiesreader_util.readProperty("application.properties", "csuser");
	protected static String csuserpass = utils.propertiesreader_util.readProperty("application.properties", "csuserpass");
	protected static String salesun = utils.propertiesreader_util.readProperty("application.properties", "salesun");
	protected static String salespw = utils.propertiesreader_util.readProperty("application.properties", "salespw");
	protected static String password = utils.propertiesreader_util.readProperty("application.properties", "password");
	protected static String userid1 = utils.propertiesreader_util.readProperty("application.properties", "userid1");
	protected static String userid2 = utils.propertiesreader_util.readProperty("application.properties", "userid2");
	protected static String userid3 = utils.propertiesreader_util.readProperty("application.properties", "userid3");
	protected static String userid4 = utils.propertiesreader_util.readProperty("application.properties", "userid4");
	protected static String userid5 = utils.propertiesreader_util.readProperty("application.properties", "userid5");
	protected static String userid6 = utils.propertiesreader_util.readProperty("application.properties", "userid6");
	protected static String userid7 = utils.propertiesreader_util.readProperty("application.properties", "userid7");
	protected static String userid8 = utils.propertiesreader_util.readProperty("application.properties", "userid8");
	protected static String timeoutStr = utils.propertiesreader_util.readProperty("application.properties", "TimeOut");
	protected static String userprofileid1 = utils.propertiesreader_util.readProperty("application.properties", "userprofileid1");
	protected static String userprofileid2 = utils.propertiesreader_util.readProperty("application.properties", "userprofileid2");
	protected static String userprofileid7 = utils.propertiesreader_util.readProperty("application.properties", "userprofileid7");
	protected static int timeout = Integer.parseInt(timeoutStr); 
	protected static String zipcode = utils.propertiesreader_util.readProperty("application.properties", "zipcode");
	protected static String desc = utils.propertiesreader_util.readProperty("application.properties", "desc");
	
	//Site ID
	protected static String siteid = utils.propertiesreader_util.readProperty("application.properties", "siteid");
	//Vanity URL
	protected static String vanityurl = utils.propertiesreader_util.readProperty("application.properties", "vanityurl");
	//URLS
	protected static String NURL = utils.propertiesreader_util.readProperty("env.properties", "NURL");
	protected static String URL = utils.propertiesreader_util.readProperty("env.properties", "URL");
	protected static String LOGINURL = utils.propertiesreader_util.readProperty("env.properties", "LOGINURL");
	protected static String CREATEACCURL = utils.propertiesreader_util.readProperty("env.properties", "CREATEACCURL");
	protected static String PROFILEPAGEURL = utils.propertiesreader_util.readProperty("env.properties", "PRODSERVURL");
	protected static String USERADMINURL = utils.propertiesreader_util.readProperty("env.properties", "USERADMINURL");
	//URL for Company Website Visit
	protected static String websitevisiturl = utils.propertiesreader_util.readProperty("application.properties", "websitevisiturl");
	//Profile tab
	protected static String tagline = utils.propertiesreader_util.readProperty("application.properties", "tagline");
	protected static String shortdesc = utils.propertiesreader_util.readProperty("application.properties", "shortdesc");
	protected static String longdesc = utils.propertiesreader_util.readProperty("application.properties", "longdesc");
	protected static String petpolicy = utils.propertiesreader_util.readProperty("application.properties", "petpolicy");
	protected static String bp1 = utils.propertiesreader_util.readProperty("application.properties", "bp1");
	protected static String bp2 = utils.propertiesreader_util.readProperty("application.properties", "bp2");
	protected static String bp3 = utils.propertiesreader_util.readProperty("application.properties", "bp3");
	protected static String bp4 = utils.propertiesreader_util.readProperty("application.properties", "bp4");
	protected static String bp5 = utils.propertiesreader_util.readProperty("application.properties", "bp5");
	protected static String bp6 = utils.propertiesreader_util.readProperty("application.properties", "bp6");
	protected static String bp7 = utils.propertiesreader_util.readProperty("application.properties", "bp7");
	protected static String bp8 = utils.propertiesreader_util.readProperty("application.properties", "bp8");
	protected static String bp9 = utils.propertiesreader_util.readProperty("application.properties", "bp9");
	protected static String bp10 = utils.propertiesreader_util.readProperty("application.properties", "bp10");
	protected static String bp11 = utils.propertiesreader_util.readProperty("application.properties", "bp11");
	protected static String starttime = utils.propertiesreader_util.readProperty("application.properties", "starttime");
	protected static String endtime = utils.propertiesreader_util.readProperty("application.properties", "endtime");
	
	//LEAD MANAGEMENT
	protected static String sendername=utils.propertiesreader_util.readProperty("application.properties", "sendername");
	protected static String senderemail=utils.propertiesreader_util.readProperty("application.properties", "senderemail");
	protected static String customgreeting=utils.propertiesreader_util.readProperty("application.properties", "customgreeting");
	protected static String email1=utils.propertiesreader_util.readProperty("application.properties", "email1");
	protected static String name1=utils.propertiesreader_util.readProperty("application.properties", "name1");
	protected static String email2=utils.propertiesreader_util.readProperty("application.properties", "email2");
	protected static String name2=utils.propertiesreader_util.readProperty("application.properties", "name2");
	protected static String email3=utils.propertiesreader_util.readProperty("application.properties", "email3");
	protected static String name3=utils.propertiesreader_util.readProperty("application.properties", "name3");
	protected static String email4=utils.propertiesreader_util.readProperty("application.properties", "email4");
	protected static String name4=utils.propertiesreader_util.readProperty("application.properties", "name4");
	protected static String email5=utils.propertiesreader_util.readProperty("application.properties", "email5");
	protected static String name5=utils.propertiesreader_util.readProperty("application.properties", "name5");
	
	//Setter method for webdriver
	public static void setWebDriver (WebDriver pdriver) {
		driver = pdriver;
	}

	// Handle locator type
	public static By ByLocator(String locator) {
		By result = null;

		if (locator.startsWith("//")) {
			result = By.xpath(locator);
		} else if (locator.startsWith("css=")) {
			result = By.cssSelector(locator.replace("css=", ""));
		} else if (locator.startsWith("name=")) {
			result = By.name(locator.replace("name=", ""));
		} else if (locator.startsWith("link=")) {
			result = By.linkText(locator.replace("link=", ""));
		} else if (locator.startsWith("id="))  {
			result = By.id(locator.replace("id=", ""));
		}
		else {
			result = By.id(locator);
		}
		return result;
	}

	// Assert element present
	public static Boolean isElementPresent(String locator) {
		Boolean result = false;
		try {
			getWebDriver().findElement(ByLocator(locator));
			result = true;
		} catch (Exception ex) {
		}
		return result;
	}

	// check if element visible
	public static Boolean isElementVisible(String locator) {
		if(isElementPresent(locator)){
			return getWebDriver().findElement(ByLocator(locator)).isDisplayed();
		}
		else return false;
	}

	/***
	 * Wait for the locator presents and return the element object
	 * if locator does not present within the wait, it will print out stacktrace
	 * @param locator
	 * @param timeout
	 * @return element
	 */
	public static WebElement WaitForElementPresent(String locator, int timeout) {

		WebDriverWait wait = new WebDriverWait(utils.custom_util.getWebDriver(), timeout);
		WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(ByLocator(locator)));
		return element;
	}

	// Wait for element not present
	public static void WaitForElementNotPresent(String locator, int timeout) {
		int i = 0;
		for (; i < timeout; i++) {
			if (!isElementPresent(locator))
				break;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (i == timeout)
			Assert.fail(locator + " is still present after given wait time.");
	}

	// Wait for element enabled
	public static void WaitForElementEnabled(String locator, int timeout) {
		int i = 0;
		for (; i < timeout; i++) {
			if (isElementPresent(locator)) {
				if (getWebDriver().findElement(ByLocator(locator)).isEnabled())
					break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (i == timeout)
			Assert.fail(locator + " is not enabled in given wait time.");
	}

	// Wait for element not enabled
	public static void WaitForElementNotEnabled(String locator, int timeout) {
		int i = 0;
		for (; i < timeout; i++) {
			if (isElementPresent(locator)) {
				if (!getWebDriver().findElement(ByLocator(locator)).isEnabled())
					break;
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (i == timeout)
			Assert.fail(locator + " is still enabled after given wait time.");
	}

	/***
	 * Wait for the locator visible and return the element object
	 * if locator is not visible within the wait, it will print out stacktrace
	 * @param locator
	 * @param timeout
	 * @return element
	 */
	public static WebElement WaitForElementVisible(String locator, int timeout) {

		WebDriverWait wait = new WebDriverWait(utils.custom_util.getWebDriver(), timeout);
		WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(ByLocator(locator)));
		return element;
	}

	// Wait for element not visible
	public static void WaitForElementNotVisible(String locator, int timeout) {
		int i = 0;
		for (; i < timeout; i++) {
			if (!getWebDriver().findElement(ByLocator(locator)).isDisplayed())
				break;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		if (i == timeout)
		{ Assert.fail(locator + " is still visible after given wait time."); }
	}

	// Wait for text present
	public static void WaitForTextPresent(String locator, String text, int timeout) {
		WaitForElementPresent(locator, timeout);
		for (int i = 0; i < timeout; i++) {
			if (isTextPresent(locator, text))
				break;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
	}

	public static void WaitForTextPresent(String text, int timeout) {
		for (int i = 0; i < timeout; i++) {
			if (driver.getPageSource().contains(text))
				break;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} 
	}		
	
	// Handle mouse over action
	public static void mouseOver(String locator) {
		custom_util.WaitForElementVisible(locator, timeout);
		WebElement el = getWebDriver().findElement(ByLocator(locator));

		// build and perform the mouseOver with Advanced User Interactions API
		Actions builder = new Actions(getWebDriver());
		builder.moveToElement(el).build().perform();
	}

	// Handle mouse double click action
	public void mouseDoubleClick(String locator) {
		custom_util.WaitForElementPresent(locator, timeout);
		WebElement el = getWebDriver().findElement(ByLocator(locator));

		// build and perform the mouse click with Advanced User Interactions API
		Actions builder = new Actions(getWebDriver());
		builder.doubleClick(el).perform();
	}

	// Handle drag and drop action
	public void dragAndDrop(String draggable, String to) {
		custom_util.WaitForElementPresent(draggable, timeout);
		custom_util.WaitForElementPresent(to, timeout);
		WebElement elDraggable = getWebDriver().findElement(
				ByLocator(draggable));
		WebElement todrag = getWebDriver().findElement(ByLocator(to));

		// build and perform drag and drop with Advanced User Interactions API
		Actions builder = new Actions(getWebDriver());
		builder.dragAndDrop(elDraggable, todrag).perform();
	}

	// Handle click action
	public static void clickOn(String locator) {
		//WaitForElementPresent(locator, timeout);
		utils.custom_util.WaitForElementPresent(locator, timeout);
		WebElement el = getWebDriver().findElement(ByLocator(locator));
		el.click();
	}

	// Handle clear action with send keys
	public static void sendKeys(String locator, String text) {
		WaitForElementPresent(locator, timeout);
		WebElement el = getWebDriver().findElement(ByLocator(locator));
		el.clear();
		el.sendKeys(text);
	}

	// Select value from drop down
	/***
	 * Select dropdown by text
	 * @param locator
	 * @param targetValue
	 */
	public static void selectDropDown(String locator, String targetValue) {
		Assert.assertTrue(isElementPresent(locator), "Element Locator :"
				+ locator + " Not found");
		custom_util.WaitForElementPresent(locator, timeout);
		new Select(getWebDriver().findElement(ByLocator(locator)))
		.selectByVisibleText(targetValue);

	}

	// Assert text present
	public static boolean isTextPresent(String locator, String str) {
		Assert.assertTrue(isElementPresent(locator), "Element Locator :"
				+ locator + " Not found");
		String message = getWebDriver().findElement(ByLocator(locator))
				.getText();
		if (message.contains(str)) {
			return true;
		} else {
			return false;
		}
	}

	public static boolean isTextPresent(String str) {
		return driver.getPageSource().contains(str);
	}

	// Store text from a locator
	public static String getText(String locator) {
		WaitForElementPresent(locator, 20);
		Assert.assertTrue(isElementPresent(locator), "Element Locator :"
				+ locator + " Not found");
		String text = getWebDriver().findElement(ByLocator(locator)).getText();
		return text;
	}

	// Store value from a locator
	public static String getValue(String locator) {
		WaitForElementPresent(locator, 20);
		Assert.assertTrue(isElementPresent(locator), "Element Locator :"
				+ locator + " Not found");
		String text = getWebDriver().findElement(ByLocator(locator)).getAttribute("value");
		return text;
	}

	// Assert check box selected
	public static boolean isChecked(String locator) {
		boolean checkStatus = false;
		WaitForElementPresent(locator, 20);
		Assert.assertTrue(isElementPresent(locator), "Element Locator :"
				+ locator + " Not found");
		WebElement el = getWebDriver().findElement(ByLocator(locator));
		checkStatus = el.isSelected();
		return checkStatus;
	}

	// Get attribute value
	public String getAttribute(String locator, String attribute) {
		WaitForElementPresent(locator, 20);
		Assert.assertTrue(isElementPresent(locator), "Element Locator :"
				+ locator + " Not found");
		String text = getWebDriver().findElement(ByLocator(locator))
				.getAttribute(attribute);
		return text;
	}

	// Get integer value
	public Integer getInt(String strString) {
		Pattern intsOnly = Pattern.compile("\\d+");
		String input = strString;
		Matcher makeMatch = intsOnly.matcher(input);
		makeMatch.find();
		String digitStr = makeMatch.group();
		Integer digit = Integer.parseInt(digitStr);
		return digit;
	}

	// Execute java script
	public void javaScriptExecute(String javascrpt) {
		JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
		js.executeScript(javascrpt);
		driver.manage().timeouts().pageLoadTimeout(timeout, TimeUnit.SECONDS);

	}

	public static String JavaScriptExecute1() 
	{
		JavascriptExecutor js = (JavascriptExecutor) getWebDriver();
		String value = js.executeScript("return new Date().getTime()").toString();
		return value;
	}

	
	public int getTotalRow(String locator) {
		WaitForElementVisible(locator, 30);
		Assert.assertTrue(isElementPresent(locator));
		int number = getWebDriver().findElements(ByLocator(locator)).size();
		return number;
	}

	// Check if frames are present
	public boolean isFramePresent() {
		boolean result = false;
		try {
			driver.findElement(By.tagName("iframe"));
			result = true;
		} catch (Exception e) {
		}
		return result;
	}

	// Wait for frame to appear
	public void waitForFramePresent(int timeout) {
		int i = 0;
		for (; i < timeout; i++) {
			if (isFramePresent())
				break;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (i == timeout)
			Assert.fail("No frame is present");
	}

	// Wait for frame to appear
	public void waitForFrameNotPresent(int timeout) {
		int i = 0;
		for (; i < timeout; i++) {
			if (!isFramePresent())
				break;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		if (i == timeout)
			Assert.fail("Frame is present");
	}

	// Get frames
	public String[] getFrames() {
		String[] frames = (String[]) driver.getWindowHandles().toArray();
		return frames;
	}

	// Switch frame
	public void switchFrame(String frameId) {
		getWebDriver().switchTo().frame(frameId);
	}

	// Select value from drop down
	/***
	 * Select dropdown by index
	 * @param locator
	 * @param index
	 */
	public static void selectDropDownByIndex(String locator, int index) {
		Assert.assertTrue(isElementPresent(locator), "Element Locator :"
				+ locator + " Not found");
		custom_util.WaitForElementPresent(locator, 20);
		new Select(getWebDriver().findElement(ByLocator(locator)))
		.selectByIndex(index);

	}

	
	// Handle focus action
	public static void focusOnElement(String locator) {
		Actions action = new Actions(getWebDriver());
		WebElement el = getWebDriver().findElement(ByLocator(locator));
		WaitForElementPresent(locator, timeout);
		action.moveToElement(el).perform();
	}

	// Sleep function
	public static void sleep(int timeout) {
		try {
			Thread.sleep(timeout);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/***
	 * get a random long number
	 * @return long
	 */
	public static long getRandomLongNumber(){
		long result = 0;	
		result = new java.util.Date().getTime();
		return result;
	}

	public static void assertArrayEquals(String[] array) {
	}

	//Get absolute path
	public String getPath()
	{
		String path ="";		
		File file = new File("");
		String absolutePathOfFirstFile = file.getAbsolutePath();
		path = absolutePathOfFirstFile.replaceAll("\\\\+", "/");		
		return path;
	}

	//capturing screenshot 
	public void captureScreenshot(String fileName) {
		try {
			String screenshotName = this.getFileName(fileName);
			FileOutputStream out = new FileOutputStream("screenshots//" + screenshotName + ".jpg");
			out.write(((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES));
			out.close();
			String path = getPath();
			String  screen = "file://"+path+"/screenshots/"+screenshotName + ".jpg";
			Reporter.log("<a href= '"+screen+  "'target='_blank' >" + screenshotName + "</a>");
		} catch (Exception e) {

		}
	}

	//Creating file name
	public  String getFileName(String file){
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal = Calendar.getInstance();		 
		String fileName = file+dateFormat.format(cal.getTime());
		return fileName;
	}

	//Print message on screen
	public void Log(String logMsg)
	{ System.out.println(logMsg); }

	private static boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	public static void acceptAlert(int sec) throws Exception {
		for (int i = 0; i < sec; i++) {
			if (isAlertPresent()) {
				Alert alert = getWebDriver().switchTo().alert();
				alert.accept();
				break;
			}
			Thread.sleep(1000);
		}
	}

	//Handle mouse over and the click on selected locator
	public static void MouseOverAndClick(String locator1, String locator2) throws Exception {
		WaitForElementVisible(locator1, timeout);			
		mouseOver(locator1);
		WaitForElementVisible(locator2, timeout);			
		clickOn(locator2);
	}

	//This function is used to round off a value 'Rval' to 'Rpal' places of decimal 
	public static float Round(float Rval, int Rpl) {
		float p = (float)Math.pow(10,Rpl);
		Rval = Rval * p;
		float tmp = Math.round(Rval);
		return (float)tmp/p;
	}

	//get current time stamp in format of _hhmmss_MMMdd_yyyy
	public static String getTimeStamp(){
		String timeStamp = null;
		java.util.Date date = new java.util.Date();
		SimpleDateFormat sdf = new SimpleDateFormat("_hhmmss_MMMdd_yyyy");
		timeStamp = sdf.format(date);
		return timeStamp;
	}

public static void windowhandle(String waitelement, String url) throws InterruptedException
{
 //Focus on the new window opened
	  Set<String> windows = getWebDriver().getWindowHandles();
	  String parent = null;
	  String child = null;
	  Iterator<String> it = windows.iterator();
	   while(it.hasNext())
	   {
	       parent = (String) it.next();
	       child = (String) it.next();
	   }
	  getWebDriver().switchTo().window(child);
	  WaitForElementPresent(waitelement, timeout);
	  Thread.sleep(5000);
	  if(!getWebDriver().getCurrentUrl().contains(url)){
 Assert.fail("User is redirected to incorrect url");}
	  getWebDriver().close();
	  
	  //Switch back to main window
	  getWebDriver().switchTo().window(parent);
	
}
}
