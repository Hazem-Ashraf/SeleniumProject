package com.google.selenium.tets;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import Reports.ScreenShots;

public class TestBase {

	public static WebDriver driver;

	@BeforeSuite
	public void StartDriver () {

		String chromepath = System.getProperty("user.dir")+"\\resources\\chromedriver.exe";

		System.setProperty("webdriver.chrome.driver",chromepath );
		driver = new ChromeDriver();
		
		
		String url = LoadProperty.userData.getProperty("URL"); 
		
	    System.out.println(url);
		

		driver.navigate().to(url);
	
		driver.manage().window().maximize();

	}

	@AfterSuite
	public void CloseDriver() {

		driver.quit();
	}
	
	@AfterMethod
	public void screenShot(ITestResult result) {
		
		if (result.getStatus() == ITestResult.FAILURE) {
		System.out.println("Take screenshot");
		ScreenShots.GetScreenshot(driver, result.getName());
		}
		
	}


}
