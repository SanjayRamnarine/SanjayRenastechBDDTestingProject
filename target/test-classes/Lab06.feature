Feature: Buying elephant toy
  @TC500
  Scenario: Verify elephant header
    Given The user wants to go the elephant website
    Then The user wants to verify "Mother Elephant With Babies Soft Toy"
  @TC500
  Scenario: Verify toy's price
    Then The user wants to verify the toys price is "$20"
  @TC500
  Scenario: Verify that url contains
    Then The user wants to verify that URL contains "payment-gateway"
  @TC500
  Scenario: The user wants to buy 5 Elephant toys
    Then The user wants to buy elephant toys as "5"
    And The user wants to enter card information
    Then The user wants to enter Credit Card Number as "1234567891234567"
    And The user wants to enter Expiration Month as "3"
    And The user wants to enter Expiraton Year as "2025"
    And The user wants to enter CVVCode as "122"
    Then The user wants to click on pay now
    Then The user wants to verify purchased message as "Payment successfull!"
  @TC600
  Scenario Outline: Buying different amounts of toys
    Given The user wants to go the elephant website
    And The user wants to buy "<Quantity>"
    And The user wants to enter card information
    Then The user wants to enter Credit Card Number as "1234567891234567"
    And The user wants to enter Expiration Month as "3"
    And The user wants to enter Expiraton Year as "2025"
    And The user wants to enter CVVCode as "122"
    Then The user wants to click on pay now
#    Then The user wants to enter card information in a list way
#      |cardNumber|1234567891234567|
#      |expMonth  | 3               |
#      |expYear   | 2025            |
#      |ccvCode   | 122             |
    Then The user wants to verify purchased message as "Payment successfull!"
    Examples:
      |Quantity|
      |5       |
      |8       |
      |9       |
      |2       |
      |4       |