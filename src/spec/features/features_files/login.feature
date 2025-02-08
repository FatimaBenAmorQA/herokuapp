Feature: Tester la fonctionnalité du login
  En tant que utilisateur je veux tester la fonctionnalité login

  @login
  Scenario: test login
    Given I am on the login page
    When I enter username
    And I enter password
    And I clic on the button 
    Then I logged in 

