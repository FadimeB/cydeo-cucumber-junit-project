Feature: Google search functionality
  Agile story: As a user, when I am on the Google search page
  I should be able to search anything and see relevant results

  Scenario: Search page default title verification
    When user is on the Google search page
    Then user should see title is Google


  #windows --> crtl + shift + L
  #@wip #--> work in progress
  Scenario: search result title verification
    Given users is on the google search page
    When user searches for apple
    Then user should see apple in the title
