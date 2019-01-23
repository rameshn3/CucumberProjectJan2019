Feature: LinkedinTest Using DataTables
Scenario: Login with datatables data
	Given navigate to Home Page
	When enter Credentials to LogIn
    | rameshn3@gmail.com | welcome123$ |
    And click login btn
	Then inbox page is shown