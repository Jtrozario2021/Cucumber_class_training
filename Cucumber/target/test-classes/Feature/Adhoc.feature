Feature: Signinfunction
    I want to use this for testing the sign in functionality

  Background: 
    Given Already opened the amazon home page

  @Adhoc
  Scenario Outline: Check the sign in function for alphabatic characters
    When I click on the signin button
    Then I seen the Email field
    When I entered email id as "<ids>"
    And Clicked on the continue button
    Then I seen password field
    When I entered correct password "<psswd>"
    And clicked on signin button
    Then I signed in successfully

    Examples: 
      | ids         | psswd |
      | Arslan@piit |  0000 |
      | Hana@piit   |  1111 |
      | JTR@piit    |  4444 |
      | Juli@piit   |  8888 |

  @Function
  Scenario Outline: Check the sign in function for alphabatic characters
    When I click on the signin button
    Then I seen the Email field
    When I entered email id as "<ids>"
    And Clicked on the continue button
    Then I seen password field
    When I entered correct password "<psswd>"
    And clicked on signin button
    Then I signed in successfully

    Examples: 
      | ids                  | psswd |
      | Arslan_function@piit |  0000 |
      | Hana_function@piit   |  1111 |
      | JTR_function@piit    |  4444 |
      | Juli_function@piit   |  8888 |
