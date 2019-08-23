Feature: Amazon website automate
Scenario: automating the login page

Given user is in amazon page
Then move to Hello,sign up
Then click on login
Then user is on homepage
Then enter mobile number
And click continue

