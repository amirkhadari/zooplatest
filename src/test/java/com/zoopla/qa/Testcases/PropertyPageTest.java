package com.zoopla.qa.Testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.zoopla.qa.TestBase.TestBase;
import com.zoopla.qa.pages.AgentPage;
import com.zoopla.qa.pages.ForSalePropPage;
import com.zoopla.qa.pages.HomePage;
import com.zoopla.qa.pages.PropertyPage;

public class PropertyPageTest extends TestBase {
	
	HomePage homepage;
	ForSalePropPage forsale;
	PropertyPage property;
	AgentPage agent;
	
	public PropertyPageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		Initilization();
		property = new PropertyPage();
		homepage = new HomePage();
		forsale = new ForSalePropPage();
		homepage.forSaleSearch();
		forsale.clickOn5thElement();
	}
	@Test(priority=1)
	public void printAgentNameTest() {
		property.viewAgentName();
	}
	@Test(priority=2)
	public void printAgentaddressTest() {
		property.viewAgentAddress();
	}
	@Test(priority=3)
	public void clickOnAgentTest() {
		agent = property.clickOnAgent();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
	}

}
