package test;

import org.testng.annotations.Test;

import utils.custom_util;

public class createacc_test extends custom_util{

	//Description: In this script we have covered account creation for packages  Housing Premier Plus,Care Classic Plus 
	@Test (alwaysRun=true)
	public void testcreateaccountbycsuser() throws Exception
	{
		try {
			//Login
			utils.login_util.login(csuser, csuserpass);
			utils.createacc_util.createacc("Premier Plus");
			utils.createacc_util.createacc("Premier");
			utils.createacc_util.createacc("e Solution");
			//utils.createacc_util.createacc("Care Classic Plus");
			//utils.createacc_util.createacc("Care Classic");
			//utils.createacc_util.createacc("Products Services Classic Plus");
			//utils.createacc_util.createacc("Products Services Classic");
			
		}
		catch (Error e) {					
			captureScreenshot("testcreateaccount");	
			throw e;
		}
	}
	//Description: In this script we have covered account creation for packages  Housing Premier Plus,Care Classic Plus 
		@Test (alwaysRun=true)
		public void testcreateaccountbysales() throws Exception
		{
			try {
				//Login
				utils.login_util.login(salesun, salespw);
				utils.createacc_util.createacc("Premier Plus");
				utils.createacc_util.createacc("Premier");
				utils.createacc_util.createacc("e Solution");
				//utils.createacc_util.createacc("Care Classic Plus");
				//utils.createacc_util.createacc("Care Classic");
				//utils.createacc_util.createacc("Products Services Classic Plus");
				//utils.createacc_util.createacc("Products Services Classic");
				
			}
			catch (Error e) {					
				captureScreenshot("testcreateaccount");	
				throw e;
			}
		}
	
	//Description: In this script we are creating user admin profile for access level "Customer Service" and "Sales" 
	@Test (alwaysRun=true)
	public void testuseradmin() throws Exception
	{
		try {
			//Login
			utils.login_util.login(csuser, csuserpass);
			utils.createacc_util.createuseradmin("Customer Service");
			//utils.createacc_util.createuseradmin("Sales");
			
		}
		catch (Error e) {					
			captureScreenshot("testuseradmin");	
			throw e;
		}
	}
	
	
}
