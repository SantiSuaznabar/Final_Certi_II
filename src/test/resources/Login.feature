Feature: Login Orange
  Background: User login into Orange page
    Given Im in OrangeHRM page


    Scenario: Login with invalid credentials
      Given I set the user name with "admmiiiiin"
      And I set the password field with "notadmiiin"
      When I click the Login Button
      Then An error message should be displayed

    @NeedLogout
    Scenario: Login with valid credentials
      Given I set the user name with "Admin"
      And I set the password field with "admin123"
      When I click the Login Button
      Then I should be in the PIM section in the Main Page


