Feature: Linkedin login functionality
Scenario: login with valid credentials
Given open the browser
And open the linkedin url
When type the username in username editbox
And type the password in pwd editbox
And click on sign in button
Then Linkedin home page should be displayed