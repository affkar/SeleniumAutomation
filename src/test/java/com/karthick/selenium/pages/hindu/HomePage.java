package com.karthick.selenium.pages.hindu;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import com.karthick.selenium.pages.Page;

public class HomePage extends Page{

	public HomePage(WebDriver driver) {
		super(driver);
	}
	@FindBy(how=How.ID,using="searchString")
	public WebElement searchInputBox;
	@FindBy(how=How.CLASS_NAME,using="submit")
	public WebElement searchButton;
	
}
