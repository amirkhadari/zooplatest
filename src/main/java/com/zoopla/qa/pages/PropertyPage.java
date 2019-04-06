package com.zoopla.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.zoopla.qa.TestBase.TestBase;

public class PropertyPage extends TestBase{
	
	@FindBy(xpath="//section[@class='dp-agent-block']//child::h4[class='ui-agent__name']")
	WebElement agentname;
	
	@FindBy(xpath="//section[@class='dp-agent-block']//child::address[@class='ui-agent__address']")
	WebElement agentAddress;
	
	public PropertyPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String viewAgentName() {
		String AName = agentname.getText();
		return AName;
		
	}
	public String viewAgentAddress() {
		String AAddress = agentAddress.getText();
		return AAddress;
	}
	public AgentPage clickOnAgent() {
		agentname.click();
		return new AgentPage();
	}

}
