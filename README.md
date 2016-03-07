# SeleniumAutomation

Invoke  <br>
1)to run default tests with firefox.
  mvn clean install -Ddefaults <br>
2)to run with chrome
	mvn install -Dwebdriver.chrome.driver=/home/karthick/softwares/seleniumdrivers/chromedriver -P chrome,google,nogrid -Dtest=SampleJUnitTest  
