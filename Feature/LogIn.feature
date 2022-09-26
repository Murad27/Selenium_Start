Feature: User able to logIn the program 
@Smoke
Scenario: User able to logIn the program with valid userName and password
Given User able to go chrome browser
And User enter the URL "https://www.zoopla.co.uk/"
When User able to click SignIn button
And User able to enter the valid Username "hasanmurad4201@gmail.com"
And User able to enter the valid password "Murad123"
When User able to LogIn button
Then User varify the hole info