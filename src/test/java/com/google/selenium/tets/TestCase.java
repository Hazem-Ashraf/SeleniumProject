package com.google.selenium.tets;

import org.testng.annotations.Test;

public class TestCase extends TestBase {
	
	UserRegistration UserR;
	
	
	@Test
	public void userSuccesregistration () {
		System.out.println("xx");
		UserR.userReg("Hazem", "Ashraf", "0123456786", "asd@sds.com", "Asd123!@#");
		
		
	
	}
	
	@Test
	public void UserLogin () {
		
		driver.navigate().to("https://www.phptravels.net/login");
		
		UserR.UserLoginn("asd@sds.com", "Asd123!@#");
		
		
	}
}
