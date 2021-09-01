Feature: Create a facebook account
  I want to Create a facebook account

  @facebook
  Scenario: Create a facebook account
    Given launch facebook account page
    When I put the first name
    And I will put the last name
    And I will add email address
    And I will create a password
    And I wil select a date of Birth "feb" , "13" , "1995"
    And I will choose Gender
    Then I will click Sign up
