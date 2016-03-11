package com.karthick.selenium.pages.github;

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
	//@FindBys({@FindBy(how=How.TAG_NAME, using="a"),
	@FindBy(linkText="Sign in")//})
	public WebElement loginLink;
	
	
	
    

	
	

	
	
}
