Feature: Login
  Scenario Outline: Login sucessful
    Given The login screen is displayed on brower
    When The User attempt to login with his <username> and <password> credentials
    Then The <title> projectpage will be showed
    Examples:
    |username         |password   | title |
    |doanthao3797@gmail.com|123456aA@ | All projects|

  Scenario Outline: Login fail
    Given The login screen is displayed on brower
    When The User attempt to login with <username> and invalid <password>
    Then The error <message> is showed
    Examples:
      |username          |password         |message                   |
      |doanthao3797@gmail.com|123456        |Invalid email or password.|
      |doanthao@gmail.com|123456aA@   |Invalid email or password.|


