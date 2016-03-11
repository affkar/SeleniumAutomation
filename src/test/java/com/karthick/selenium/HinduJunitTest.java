package com.karthick.selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.karthick.selenium.pages.hindu.HomePage;

public class HinduJunitTest extends JUnitTestBase{
	private HomePage homepage;

	@Before
	public void initPageObjects() {
		baseUrl="http://hindu.com";
		homepage = PageFactory.initElements(driver, HomePage.class);
	}
	
	@Test
	public void testSearch() throws InterruptedException{
		driver.get(baseUrl);
		Thread.sleep(10000);
		homepage.searchInputBox.sendKeys("Sharapova");
		homepage.searchButton.click();
		Thread.sleep(10000);
	}
	
}
