Feature: Cucumber Data Tables implementation practice



  Scenario: List of fruits and vegetables I like
    Then user should see below step
      | orange     |
      | apple      |
      | kiwi       |
      | strawberry |
      | tomato     |
      | pear       |
      | eggplant   |



  Scenario: List of pets I love
    Then I will share my favorites
      | Dog     |
      | Cat     |
      | Bird    |
      | Rabbit  |
      | Chicken |

  Scenario: Officer reads data about driver
    Then officer is able to see any data he wants
      | name    | Jane        |
      | surname | Doe         |
      | age     | 30          |
      | address | CA          |
      | zipcode | 00000       |
      | phone   | 12332124545 |

  @DataTable
  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |
