Feature: Title of your feature
  I want to use this template for my feature file

  @Tdeposit
  Scenario Outline: to verify the deposite funtionality
    Given I have "<initial>" amount in my account
    When I deposite "<some>" amont in my exists account
    Then I expect "<update>" amount will have in my account

    Examples: 
      | initial | some | update |
      |    2000 |  200 |   2200 |
      |     100 |  800 |    900 |