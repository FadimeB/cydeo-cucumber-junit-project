Feature: Librarian User Adding Feature
  @wip
  Scenario:
    Given the "librarian" on the home page
    And the librarian navigates to "Users" page
    When the librarian clicks to Add User
    And the librarian enters fullname "<Test-Fad>"
    When the librarian enters password "<Test1234!>"
    And the librarian enters email "<test-fad.test.com>"
    And the librarian clicks to save changes
    Then verify "The user has been created." message is displayed
    And verify created user with "<test-fadime.test.com>" and "<Test1234!>" able to login
    And verify created user should be able to see "<Test-Fadime>"