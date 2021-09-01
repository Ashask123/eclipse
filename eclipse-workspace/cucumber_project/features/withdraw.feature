Feature: Title of your feature
  I want to use this template for my feature file

  @withdraw
  Scenario Outline: to verify the withdraw funtionality
    Given I have "<initial>" amount in a account
    When I withdraw "<some>" amount in my exists account
    Then I expect "<update>" amount will have in the account

    Examples: 
      | initial | some | update |
      |    2000 |  200 |   1800 |
      |     800 |  100 |    700 |