Feature: Login feature

@Regression @smoke
Scenario: checking the login page

Given user is in log-in page
Then enter username and password
And click on login button