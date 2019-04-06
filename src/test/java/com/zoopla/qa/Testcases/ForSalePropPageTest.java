package com.zoopla.qa.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.qa.TestBase.TestBase;
import com.zoopla.qa.pages.ForSalePropPage;
import com.zoopla.qa.pages.HomePage;

public class ForSalePropPageTest extends TestBase{
	
	HomePage homepage;
	ForSalePropPage forsale;
	
	public ForSalePropPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		Initilization();
		homepage = new HomePage();
		forsale = new ForSalePropPage();
		homepage.forSaleSearch();
	}
	
	@Test(priority=1)
	public void verifyForSalePageTitleTest() {
		String Actual = forsale.getForSalePageTitle();
		String Expected ="Property for Sale in London - Buy Properties in London - Zoopla";
		Assert.assertEquals(Actual, Expected, "This is not For Sale Page of zoopla");
	}
	@Test(priority=2)
	public void getPriceTextTest() {
		forsale.getPriceText();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
