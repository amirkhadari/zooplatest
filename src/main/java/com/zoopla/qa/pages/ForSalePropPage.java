package com.zoopla.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.qa.TestBase.TestBase;

public class ForSalePropPage extends TestBase{
	
//	@FindBy(xpath="//a[@class='listing-results-price text-price']")
//	WebElement pricetext;
	
	@FindBy(xpath="//ul[@class='listing-results clearfix js-gtm-list']//child::li[@class='srp clearfix   '][5]"
			+ "//child::a[@class=\"listing-results-price text-price\"]")
	WebElement Property5;
	
	public ForSalePropPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getForSalePageTitle() {
		String title = driver.getTitle();
		return title;
	}
	
	public void getPriceText(){
		List<WebElement> price = driver.findElements(By.xpath("//a[@class='listing-results-price text-price']"));
		int size = price.size();
		for(int i=0;i<size; i++) {
			String text[] = price.get(i).getText().split(" ");
			String text2[] = text[0].split("£");
//			String text3[] = text2[1].split(",");
//			System.out.println(text[0]);
			System.out.println(text2[1]);
//			System.out.println(text3[0]);
			
//			int pricetag = Integer.parseInt(text2[1]);
//			System.out.println(pricetag);
			
		}
	}
	public PropertyPage clickOn5thElement() {
		Property5.click();
		return new PropertyPage();
	}
	

}
