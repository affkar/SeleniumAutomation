# SeleniumAutomation

Invoke  <br>
1)to run default tests with firefox.
  mvn clean install -Ddefaults <br>
2)to run with chrome <br>
	mvn install -Dwebdriver.chrome.driver=/home/karthick/softwares/seleniumdrivers/chromedriver -P chrome,nogrid -Dtest=SampleJUnitTest <br>  
3)to open hindu <br>
	mvn install -Dwebdriver.chrome.driver=/home/karthick/softwares/seleniumdrivers/chromedriver -P chrome,nogrid -Dtest=HinduJunitTest <br>
4) to open github
mvn install -Dwebdriver.chrome.driver=/home/karthick/softwares/seleniumdrivers/chromedriver -P chrome,nogrid -Dtest=GitHubJunitTest <br>
5) to open youtube.com
mvn install -Dwebdriver.chrome.driver=/home/karthick/softwares/seleniumdrivers/chromedriver -P chrome,nogrid -Dtest=YoutubeJunitTest <br>