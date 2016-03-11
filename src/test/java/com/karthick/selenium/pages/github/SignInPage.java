package com.karthick.selenium.pages.github;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.How;

import com.karthick.selenium.pages.Page;

public class SignInPage extends Page {

	public SignInPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(how=How.ID, using="login_field")
	public WebElement loginField;
	@FindBy(how=How.ID, using="password")
	public WebElement passwordField;
	//@FindBys({@FindBy(how=How.TAG_NAME, using="input"),@FindBy(how=How.NAME, using="commit")})
	@FindBy(how=How.XPATH,using="//input[@name='commit']")
	public WebElement signInLink;

}
