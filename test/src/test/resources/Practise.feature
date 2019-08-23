Feature: Data Type
@RegressionTesting
Scenario: Automating the webpage
Given user is in login page
Then click on button
Then click on another button
Then click on login button


@smoke @RegressionTesting
Scenario: 
Given login page

Scenario:
Given user is in login page1
Then enter username "sai" password "123"



Scenario Outline:
Given user ma
Then enter username "<user>" and password "<pass>"

Examples:
|user|pass|
|sai1122|112233|
|11|33|
  