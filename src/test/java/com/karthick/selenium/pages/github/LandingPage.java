package com.karthick.selenium.pages.github;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import com.karthick.selenium.pages.Page;

public class LandingPage extends Page {

	public LandingPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//@FindBys({@FindBy(how=How.TAG_NAME, using="a"),@FindBy(linkText="SeleniumAutomation")})
	@FindBy(how=How.XPATH,using="//a[@href='/affkar/SeleniumAutomation']")
	public WebElement seleniumAutomationLink;

		
	
}
