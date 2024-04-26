Feature: User wants to visit amazon web page and add product in cart

Scenario Outline: 

Given User visit Amazon Homepage
And User type Productname "<Productname>" 
And User click on search button
When User click on a product
And Click add to cart
Then User will find the product in shopping cart

Examples: 
| Productname  |
| Shesher kobita |
