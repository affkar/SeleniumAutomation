package com.karthick.selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.karthick.selenium.pages.github.HomePage;
import com.karthick.selenium.pages.github.LandingPage;
import com.karthick.selenium.pages.github.SignInPage;

public class GitHubJunitTest extends JUnitTestBase{
	private HomePage homepage;
	private SignInPage signinpage;
	private LandingPage landingpage;

	@Before
	public void initPageObjects() {
		baseUrl="http://github.com";
		homepage = PageFactory.initElements(driver, HomePage.class);
		signinpage = PageFactory.initElements(driver, SignInPage.class);
		landingpage = PageFactory.initElements(driver, LandingPage.class);
	}
	
	@Test
	public void testSearch() throws InterruptedException{
		driver.get(baseUrl);
		Thread.sleep(4000);
		homepage.loginLink.click();
		Thread.sleep(4000);
		signinpage.loginField.sendKeys("affkar@gmail.com");
		signinpage.passwordField.sendKeys("table92$");
		signinpage.signInLink.click();
		Thread.sleep(4000);
		landingpage.seleniumAutomationLink.click();
		
	}
	
}
