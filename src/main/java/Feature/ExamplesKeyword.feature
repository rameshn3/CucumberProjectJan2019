Feature: linkedin DDT
Scenario Outline: datadriven testing with examples keyword
	Given User is on linkedin login Page
	When User enters "<username>" and "<password>" credentials
	And user clicks on login button
    Then Login Home page is displayed
    When enter the search "<keyword>" in search editbox
    And click on search button
   Then search results should be displayed
   Then do logout
   
   Examples:
   		|username|password|keyword|
   		|rameshn3@gmail.com|welcome123$|himabindu| 
   		|rameshqaonline@gmail.com|welcome123$|lakshmi|