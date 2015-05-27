package utils;

import java.util.Random;

public class createacc_util extends custom_util {
	
	//This method covers create account flow for packages: 'Housing Premier Plus', 'Care Classic', 'Housing Premier', 'Products & Services Classic Plus', 'Housing Standard', 'Products & Services Classic', 'Care Classic Plus' 
	public static void createacc(String type) throws InterruptedException
	{
		getWebDriver().navigate().to(CREATEACCURL);
		WaitForElementPresent(locators.Createacc_loc.SELECTPKG_CONTINUEBTN, timeout);
		String temp = JavaScriptExecute1();
		int random1 = new Random().nextInt(12);
		switch(type)
		{
		case "Premier Plus":
			clickOn(locators.Createacc_loc.HOUSINGPREMPLUSRADIO);
			break;
		case "Premier":
			clickOn(locators.Createacc_loc.HOUSINGPREMRADIO);
			break;
		case "e Solution":
			clickOn(locators.Createacc_loc.HOUSINGSTNDRDRADIO);
			break;
		case "Care Classic Plus":
			clickOn(locators.Createacc_loc.CARECLASSICPLUSRADIO);
			break;
		case "Care Classic":
			clickOn(locators.Createacc_loc.CARECLASSICRADIO);
			break;
		case "Products Services Classic Plus":
			clickOn(locators.Createacc_loc.PRODSERVCLASSICPLUSRADIO);
			break;
		case "Products Services Classic":
			clickOn(locators.Createacc_loc.PRODSERVCLASSICRADIO);
			break;	
		}
		//Click on 'Continue' button
		clickOn(locators.Createacc_loc.SELECTPKG_CONTINUEBTN);
		WaitForElementPresent(locators.Createacc_loc.LISTINGINFO_CONTINUEBTN, timeout);
		//Enter Property name
		sendKeys(locators.Createacc_loc.PROPERTYNAMETXTBOX, "Test Property"+temp);
		//Enter address
		sendKeys(locators.Createacc_loc.ADDRESS1TXTBOX, "Test Address");
		//Enter zipcode
		sendKeys(locators.Createacc_loc.ZIPCODETXTBOX, "57562");
		Thread.sleep(5000);
		//Enter phone
		sendKeys(locators.Createacc_loc.PHONETXTBOX, "1111111111");
		//Enter Vanity URL
		String VANITY = "Ankit"+temp;
		sendKeys(locators.Createacc_loc.VANITYURL, VANITY);
		Thread.sleep(3000);
		if(type.equals("Premier Plus"))
		{
			clickOn("listingtype"+random1);
		}
		if(type.equals("Premier"))
		{
			clickOn("listingtype"+random1);
		}
		if(type.equals("e Solution"))
		{
			clickOn("listingtype"+random1);
		}
		Thread.sleep(3000);
		//Click on 'Continue' button
		clickOn(locators.Createacc_loc.LISTINGINFO_CONTINUEBTN);
		WaitForElementPresent(locators.Createacc_loc.USERINFOCONTINUEBTN, timeout);
		String username = "testuser"+temp;
		//Enter username
		sendKeys(locators.Createacc_loc.USERNAMETXTBOX, username);
		//Enter password
		sendKeys(locators.Createacc_loc.PASSWORDTXTBOX, password);
		//Enter first name
		sendKeys(locators.Createacc_loc.FNAMETXTBOX, "Test");
		//Enter last name
		sendKeys(locators.Createacc_loc.LNAMETXTBOX, "User");
		//Enter company
		sendKeys(locators.Createacc_loc.COMPANYTXTBOX, "Test Company");
		//Enter email
		sendKeys(locators.Createacc_loc.EMAILTXTBOX, "test360.001@gmail.com");
		//Enter zipcode
		sendKeys(locators.Createacc_loc.USERZIPCODETXTBOX, "57562");
		Thread.sleep(5000);
		//Enter user address
		sendKeys(locators.Createacc_loc.USERADDLINE1TXTBOX, "Test Address");
		//Enter phone
		sendKeys(locators.Createacc_loc.USERPHONETXTBOX, "1111111111");
		//Click on terms & conditions checkbox
		clickOn(locators.Createacc_loc.USERTERMSCHCKBOX);
		//Click on 'Continue' button
		clickOn(locators.Createacc_loc.USERINFOCONTINUEBTN);
		WaitForElementPresent(locators.Createacc_loc.BILLINGCONTINUEBTN, timeout);
		clickOn(locators.Createacc_loc.BILLINGCHECKBOX);
		clickOn(locators.Createacc_loc.BILLINGCONTINUEBTN);
		WaitForElementPresent(locators.Createacc_loc.ACCOUNTCREATEDCONFMSG, timeout);
		String ACCINFO = getText(locators.Createacc_loc.ACCINFO);
		System.out.println(ACCINFO);
	}

	//This method covers creating user admin profile for access level "Customer Service" and "Sales" 
	public static void createuseradmin(String type)
	{
		getWebDriver().navigate().to(USERADMINURL);
		WaitForElementPresent(locators.Createacc_loc.ADDPROFILE_ADDBTN, timeout);
		String temp = JavaScriptExecute1();
		switch(type)
		{
		case "Customer Service":
			selectDropDown(locators.Createacc_loc.ADDPROFILE_ACCESSLEVELDRPDWN, "Customer Service");
			break;
		case "Sales":
			selectDropDown(locators.Createacc_loc.ADDPROFILE_ACCESSLEVELDRPDWN, "Sales");
			break;
		}
		String user = "test"+temp;
		sendKeys(locators.Createacc_loc.ADDPROFILE_USERNAMETXTBOX, user);
		sendKeys(locators.Createacc_loc.ADDPROFILE_PASSWORDTXTBOX, password);
		clickOn(locators.Createacc_loc.ADDPROFILE_ADDBTN);
		WaitForElementPresent(locators.Createacc_loc.ADDPROFILE_CONFIRMATION, timeout);
		//Click on Last link
		sendKeys(locators.Createacc_loc.USERADMIN_SEARCHFIELD, user);
		clickOn(locators.Createacc_loc.USERADMIN_SEARCHBTN);
		WaitForElementPresent("//table[contains(@class, 'table')]//td[text()='"+user+"']", timeout);
	}	
}
