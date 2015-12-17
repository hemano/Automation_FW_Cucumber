Feature: Login Action

Scenario: Successful Login with Valid Credentials
	Given User is on Home Page
	When User Navigate to LogIn Page
	And User enters "hemanto" and "123123"
	Then Home Page Displayed Successfully

	
	
Scenario: Successful LogOut
	When User LogOut from the Application
	Then User navigate to Login Page with title "Sign-on: Mercury Tours"
	
	
	