package com.karthick.selenium;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.karthick.selenium.pages.youtube.HomePage;
import com.karthick.selenium.pages.youtube.SearchResultsPage;
import com.karthick.selenium.pages.github.SignInPage;

public class YoutubeJunitTest extends JUnitTestBase{
	private HomePage homepage;
	
	private SearchResultsPage searchResultsPage;

	@Before
	public void initPageObjects() {
		baseUrl="http://youtube.com";
		homepage = PageFactory.initElements(driver, HomePage.class);
	}
	
	@Test
	public void testSearch() throws InterruptedException{
		driver.get(baseUrl);
		Thread.sleep(2000);
		homepage.searchBox.sendKeys("Trains at Speed UK (3)");
		homepage.searchButton.click();
		Thread.sleep(2000);
		searchResultsPage = PageFactory.initElements(driver, SearchResultsPage.class);
		searchResultsPage.videoLink.click();
		Thread.sleep(15000);
	}
	
}
