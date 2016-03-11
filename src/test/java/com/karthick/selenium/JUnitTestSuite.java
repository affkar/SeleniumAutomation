package com.karthick.selenium;

import org.junit.Ignore;
import org.junit.Rule;
import org.junit.rules.ExternalResource;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import ru.stqa.selenium.factory.WebDriverFactory;
import ru.stqa.selenium.factory.WebDriverFactoryMode;

@RunWith(Suite.class)
@SuiteClasses({SampleJUnitTest.class,YoutubeJunitTest.class,HinduJunitTest.class,GitHubJunitTest.class})
public class JUnitTestSuite {

  @Rule
  public ExternalResource webDriverFactory = new ExternalResource() {
    @Override
    protected void before() throws Throwable {
      WebDriverFactory.setMode(WebDriverFactoryMode.THREADLOCAL_SINGLETON);
    };

    @Override
    protected void after() {
      WebDriverFactory.dismissAll();
    };
  };
}
