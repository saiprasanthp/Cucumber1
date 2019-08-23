Feature: to automate login page
@SmokeTest
Scenario Outline: login page
Given user is in login page
Then user enter username "<username>" and password "<pwd>"
And click on login button

Examples:
|username|pwd|
|sai|123|
|manu|123|


