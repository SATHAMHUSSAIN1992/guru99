Feature: Title of your feature

  @tag1
  Scenario: Title of your scenario
    Given User is in home page, click Add to customer 
    When User should enters details in add customer field
    |Firstname    |satham              |
    |Lastname 		|hussain             |
    |email				|satham4all@gmail.com|
    |Address			|Nagercoil           |
    |Mobilenumber |9791734485          |
    Then Navigates to customer id page
  