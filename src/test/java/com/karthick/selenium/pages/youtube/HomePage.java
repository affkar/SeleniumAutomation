package com.karthick.selenium.pages.youtube;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.karthick.selenium.pages.Page;

public class HomePage extends Page{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	//@FindBys({@FindBy(how=How.TAG_NAME, using="a"),
	@FindBy(how=How.ID,using="masthead-search-term")//})
	public WebElement searchBox;
	@FindBy(how=How.ID,using="search-btn")//})
	public WebElement searchButton;
	
	
	
    

	
	

	
	
}
