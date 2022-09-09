Feature: Logout Orange
  Background: User logout from Orange page
    Given Im in OrangeHRM page


  Scenario: Logout
    Given I set the user name with "Admin"
    And I set the password field with "admin123"
    When I click the Login Button
    Then I should be in the PIM section in the Main Page
    Given I click the profile settings
    And I click the Logout Button
    Then I should be in the login page again