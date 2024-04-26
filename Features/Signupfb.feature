Feature: User wants to create New Facebook Account

@signupfb
Scenario Outline: 
Given user visiting facebook home page and click Create New Account
When user enter First name "<First name>" and Last name "<Last name>"
When user type valid email address "<email address>", confirm email address "<email address>" and New password "<New password>"
Then user select dropdown Month and dropdown Day and dropdown Year
Then user click Gender option and click sign up option
Then user able to Signup Facebook Account
Examples:
|First name|Last name|email address|New password|
|Shikha|Hamza|shikha.hamza85@gmail.com|nexttech@032021|