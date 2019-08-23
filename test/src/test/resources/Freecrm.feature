Feature: Contact Page

@first
Scenario: Testing the Contacts Page

Given user is in contact page
Then click on new option
Then enter Firstname "sai"
Then enter lastname "prasanth"
Then click on save button
Then click on contacts button

