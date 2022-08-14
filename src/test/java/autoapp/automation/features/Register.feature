Feature: Registering to automation practice

  Scenario: Validate user is able to register
    Given Automation practice application is opened
    When I click sign in
    And I create account with emailid "testRandom@testauto.com"
    Then I should be able to register with my below details
      | Gender | FirstName | LastName  | Password  | Address            | City      | State  | Zip  | Mobile     |
      | Mr     | TestFName | TestLName | Password1 | 100 Spencer Street | Anchorage | Alaska | 30000 | 0406345454 |

  Scenario: Verify valid error message is shown for entering invalid email address
    Given Automation practice application is opened
    When I click sign in
    And I create account with emailid "testRandom.com"
    Then I should see error message "Invalid email address."
