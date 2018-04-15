package com.expedia.flightsbooking;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import page.classes.SearchPageFactory;

public class FrameworkTestCase {
	WebDriver driver;
	String baseUrl;
	SearchPageFactory searchPage;

	@BeforeClass
	void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Owner\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		searchPage=new SearchPageFactory(driver);
		baseUrl = "https://www.expedia.com/";
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Test
	void test() {
		driver.get(baseUrl);
		searchPage.clickFlightTab();
		searchPage.setFlightOrginCity("New York");
		searchPage.setFlightDestinationCity("Chicago");
		searchPage.setFlightDepartingDate("04/10/2018");
		searchPage.setFlightReturningDate("04/20/2018");
		searchPage.clickSearchButton();
	}

	@AfterClass
	void tearDown() throws Exception {
	}

	
}
