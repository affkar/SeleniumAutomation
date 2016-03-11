package com.karthick.selenium;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

import com.karthick.selenium.pages.HomePage;

public class SampleJUnitTest extends JUnitTestBase {

	private HomePage homepage;

	@Before
	public void initPageObjects() {
		baseUrl="file:///home/karthick/eclipseworkspaces/firstone/SeleniumAutomation/NewFile.html";
		homepage = PageFactory.initElements(driver, HomePage.class);
	}

	@Test
	public void testHomePageHasAHeader() throws InterruptedException {
		driver.get(baseUrl);
		assert homepage.header != null;
		assert homepage.header.getText() != null;
		for (int i = 0; i < 10; i++) {
			Thread.sleep(1000);
		    Assert.assertTrue("Home Page Header in "+baseUrl+" is not as expected.","Say hello".equals(homepage.header.getText()));
		    Assert.assertTrue("a".equals(homepage.item2.getTagName()));
		    Assert.assertTrue("input".equals(homepage.elementByIdOrName.getTagName()));
		    System.out.println("Clicking on Item2 - link");
		    homepage.item2.click();
		    Assert.assertTrue("This is new file 2".equals(homepage.header.getText()));
		    Assert.assertTrue("input".equals(homepage.item2.getTagName()));
		    Assert.assertTrue("button".equals(homepage.elementByIdOrName.getTagName()));
		    System.out.println("Clicking on elementByIdOrName on second page - button");
		    Thread.sleep(1000);
		    homepage.elementByIdOrName.click();
		}
	}
}
