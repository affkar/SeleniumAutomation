package com.karthick.selenium.pages.youtube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.karthick.selenium.pages.Page;

public class SearchResultsPage extends Page {

	public SearchResultsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//@FindBys({@FindBy(how=How.TAG_NAME, using="a"),@FindBy(linkText="SeleniumAutomation")})
	@FindBy(how=How.XPATH,using="//a[@title='Trains at Speed UK (3)']")
	public WebElement videoLink;

		
	
}
