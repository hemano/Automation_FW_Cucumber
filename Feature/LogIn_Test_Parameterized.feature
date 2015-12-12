Feature: Login Action

Scenario Outline: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters <username> and <password>
	Then Home Page Displayed Successfully
Examples:
	|username|password|
	|hemanto|123123|
	|tinyowl|123456|	

	
	
Scenario: Successful LogOut
	When User LogOut from the Application
	Then Message displayed LogOut Successfully
	
	
	