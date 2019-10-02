

Feature: Title of your feature
 
   
  @tag2
  Scenario Outline: Title of your scenario outline
    Given User want to be in home page,click Add customer
    When  Enter the details in Add customer page "<FirstName>","<LastName>","<Email>","<Enter Your address>","<MobileNumbe>"
    Then 	Navigate to customer Id Creation pageS
    

    Examples: 
      |FirstName  |LastName |Email               |Enter Your address |MobileNumber |
      |Satham     |Hussain  |satham4all@gmail.com|Nagercoil          |9791734485	 |
      |Mani       |kandan   |mani123@gmail.com   |Chennai            |912345678    |
