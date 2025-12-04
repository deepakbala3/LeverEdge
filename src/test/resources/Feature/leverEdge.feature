Feature: Validate the leverEDGE application

  Scenario: Validate the RS return location dashbord with multiple inputs
    Given User should login the leverEDGE login page
    When User should navigate to the Transaction page
    And User should navigate to the RS return location page
    Then User should verify with multiple inputs
