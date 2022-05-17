Feature: validating login fields

  Scenario: validating login With correct username and password
    Given user is FB page on chrome browser
    When user enters username and password
      #2D with header
      | user     | pass    |#Header
      | username | welcome |
      | password | hijava  |
    And user should click on login button
    Then user need to verify home page is vissible or not
