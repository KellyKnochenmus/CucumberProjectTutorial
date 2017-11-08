Feature: Login
Description: This feature is to test the login functionality

  Scenario: Successful Login with Valid Credential
    Given User is on Home Page
    When User Enters valid UserName and Password
    And Clicks Go button
    Then He can visit the practice page
    And A message is displayed

    Scenario: Successful LogOut
      When User logs out from the Application
      Then He cannot visit the practice page