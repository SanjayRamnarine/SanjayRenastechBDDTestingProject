Feature: Insurance quote
  @Lab01_1
  Scenario: Verify that Get Quote button is navigating application
    Given The user wants to go to get a quote
    When The user wants to click on insurance
    And The user wants to click on Get Quote option
    Then The user wants to verify Get Quote is successfully valid when clicked

    @Lab01_2
    Scenario: Verify that in finance detail you should be able to select only one option.
      Given The user wants to go to get a quote
      When The user wants to click on insurance
      And The user wants to click on Get Quote option
      Then The user wants to click on Finance Details
      Then The user wants to verify that only one option can be selected

      @Lab01_3
      Scenario: Verify that when you complete application you should be able to see "Let us call you" button
        Given The user wants to go to get a quote
        When The user wants to click on insurance
        And The user wants to click on Get Quote option
        Then the user wants to fill and submit application
        Then the user wants to verify "Let us call you" button after filling out application
