Feature: user want to visit fblogin page 

 
  
 Scenario Outline: 
   Given  user visit fblogin page
  When  user use "<email>" email address
  When user use "<password>" password
  Then  user should able to click on login
Examples:

| email | password |
| farjana0416@gmail.com | Maab56@ |