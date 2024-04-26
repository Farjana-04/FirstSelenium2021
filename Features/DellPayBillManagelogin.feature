Feature: Validate dell pay bill and manage account login 

InOrder to validate pay bill and manage account login 
we have to hover over the Finanching then
we have click on pay bill and manage account then we can edit the email and password

Scenario Outline: 
Given user press dell.com 
When  user hover on the Finanching 
Then user click on dell pay bill and manage 
Then user edit email "<email>" and password "<password>"
Then user click on Signin
Then user able to Signin successfully 
 
 Examples: 
 
 |email      |  password|
 |shikha.hamza85@gmail.com|nexttech@032021|