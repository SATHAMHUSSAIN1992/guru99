
@tag
Feature: Title is Mac cosmetics

  @tag1
  Scenario: User select the product
    Given User login the account
    When User should search the product
   
    Then User should able to select the prouct


@tag2
Scenario: User need to add the product
Given User should add the product
Then User navigates into the payment page  
