Feature: Validation orangeHRM Get a Free Demo
@DemoOrange

Scenario Outline:
Given User wants to visit OrangeHRM homepage
When User click on Get a Free Demo option
When User write First name "<First name>" and Last name "<Last name>" 
When User Type Email "<Email>" and Phone Number "<Phone Number>"
When User will select Country name
When User click on I am not a robot and Get a Free Demo option
Then User will able to visits Get a Free Demo page
Examples:
|First name|Last name|Email|Phone Number|
|Taha|Tur|shikha.hamza85@gmail.com|01920809228|


      
