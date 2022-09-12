Feature: In Orange PIM Main
  Background: Open Options in Main Page
    Given Im in OrangeHRM page

  @NeedLogout
  Scenario: Open Directory
    Given I set the user name with "Admin"
    And I set the password field with "admin123"
    When I click the Login Button
    Then I should be in the PIM section in the Main Page
    Given I Click the Directory Button
    Then I should be in the Directory page

  @NeedLogout
  Scenario: Add New Employee
    Given I set the user name with "Admin"
    And I set the password field with "admin123"
    When I click the Login Button
    Then I should be in the PIM section in the Main Page
    And I click the "Add Employee" Button
    And I fill the Employee information with
      |Pepe|Grillo|Tercero|
    And I click the Save Button
    Then The we should see the personal detail

  @NeedLogout
    Scenario: Add New Employee Without Name
      Given I set the user name with "Admin"
      And I set the password field with "admin123"
      When I click the Login Button
      Then I should be in the PIM section in the Main Page
      And I click the "Add Employee" Button
      And I fill the Employee information with
        |  [blank]   |Suaznabar|Vergara|
      And I click the Save Button
      Then We Should See a Warning Label



  @NeedLogout
  Scenario Outline: Search With ID
    Given I set the user name with "Admin"
    And I set the password field with "admin123"
    When I click the Login Button
    Then I should be in the PIM section in the Main Page
    Given I set the ID field with "<ids>"
    And I click the search button
    Then I should see a result with "<ids>"
  Examples:
    | ids  |
    | 0062 |
    | 0221 |
    | 0046 |

