package test;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import utils.custom_util;

public class login_test extends custom_util{

	//Description: This script covers login/logout functionality for super admin, property user and group manager
	@DataProvider(name="users")
	public Object[][] testdata(){
		return new Object[][]{
				{csuser,csuserpass, true},
				{userid1,password, true},
				{userid2,password, true},
				{userid3,password, true},
				{userid4,password, true},
				{userid5,password, true},
				{userid6,password, true},
				{userid7,password, true},
				{userid8,password, true},
				};
	}
	@Test (alwaysRun=true, dataProvider="users")
	public void testloginlogout(String username ,String password, boolean users) throws Exception
	{
		try {
			if(users)
			{
			   //Login
			   utils.login_util.login(username, password);
			   //Logout
			   utils.login_util.logout();
			}   
		
		}
		catch (Error e) {					
			captureScreenshot("testloginlogout");	
			throw e;
		}
	}
}
