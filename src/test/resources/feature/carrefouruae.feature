@Feature1
Feature: Validating Carrerfour credit card payment
  

  @tag1
  Scenario: Title of your scenario
    Given User in login,Navigate to home page
    When User is able to purchase a product
    c 
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
