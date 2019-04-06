package com.zoopla.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.qa.TestBase.TestBase;

public class HomePage extends TestBase{
	
	@FindBy(xpath="//input[@id='search-input-location']")
	WebElement searchbar;
	
	@FindBy(xpath="//button[@id='search-submit']")
	WebElement submit;
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyHomePageTitle() {
		return driver.getTitle();
	}
	
	public ForSalePropPage forSaleSearch() {
		searchbar.sendKeys("London");
		submit.click();
		
		return new ForSalePropPage();
	}

}
