Feature: checking Flight
@Regression @smoke
Scenario Outline: checking flights from thirupathi to hyderabad

Given the user is in login page
Then click on flight option
Then user is home page
Then click on roundtrip
Then enter "<from>" in input and select nellore
Then enter "<to>" in anothe check box and select hyderabad
Then click on calender select date
Then click on return date
Then click proceed

Examples:
|from|to|
|thirupathi|hyderabad|



