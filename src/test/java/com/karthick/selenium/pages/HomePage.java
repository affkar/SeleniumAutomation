package com.karthick.selenium.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Sample page
 */
public class HomePage extends Page {

  @FindBy(how = How.TAG_NAME, using = "h1")
  public WebElement header;
  
  @FindBy(how = How.ID, using = "item2")
  public WebElement item2;
  
  @FindBy(how = How.ID_OR_NAME, using = "id_or_name")
  //@CacheLookup
  public WebElement elementByIdOrName;
  

  public HomePage(WebDriver webDriver) {
    super(webDriver);
  }
}
