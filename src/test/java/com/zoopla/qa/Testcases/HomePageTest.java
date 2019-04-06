package com.zoopla.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.qa.TestBase.TestBase;
import com.zoopla.qa.pages.ForSalePropPage;
import com.zoopla.qa.pages.HomePage;

public class HomePageTest extends TestBase {
	
	ForSalePropPage forsale;
	HomePage homepage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUP() {
		Initilization();
		homepage = new HomePage();
	}
	
	@Test(priority=1)
	public void validateHomePageTitleTest() {
		String Actual = homepage.verifyHomePageTitle();
		String Expected = "Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents";
		Assert.assertEquals(Actual, Expected);
	}
	
	@Test(priority=2)
	public void forSaleSercchTest() {
		forsale = homepage.forSaleSearch();
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
}
