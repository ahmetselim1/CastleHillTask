Feature: feature to Verify //www.saucedemo.com/ login functionality login with username and password

  Scenario Outline: 1 Successful Login with StandardUser
    Given I am on the Sauce Demo Login Page
    When I fill the account information for account StandardUser into the "<Username1>" field and the "<Password1>" field
    And I click the Login Button
    Then I am redirected to the Sauce Demo Main Page
    And I verify the App Logo exists

    Examples:
      | Username1     | Password1    |
      | standard_user | secret_sauce |

  @smoke
  Scenario Outline: 2 Failed Login with LockedOutUser
    Given I am on the Sauce Demo Login Page
    When I fill the account information for account LockedOutUser into the "<Username2>" field and the "<Password2>" field
    And I click the Login Button
    Then I verify the Error Message contains the text "<errormessage>"

    Examples:
      | Username2       | Password2    | errormessage                      |
      | locked_out_user | secret_sauce | Sorry, this user has been banned. |

