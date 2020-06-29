Feature: Point of Sale Module

  Background:
    Given user login with right "usernamePM1" and "password"
    And the user navigates to module "Point of Sale"


  Scenario:Order tab search options
    And the user selects "Orders" tab
    When the user searches
      | Order Ref | Giant store/0004 |

    Then the result shows details of
      | Order Ref | Giant store/0004 |


  Scenario: Table headers for Order Tab
    And the user selects "Orders" tab
    Then the table display has the following headers
      | Order Ref   |
      | Receipt Ref |
      | Customer    |
      | Order Date  |
      | Salesman    |
      | Total       |
      | Status      |
      | Session     |


    Scenario:Table header for Session tab
      And the user selects "Sessions" tab
      Then the table display has the following headers
      |Point of Sale|
      |Session ID   |
      |Responsible  |
      |Opening Date |
      |Closing Date |
      |Status       |

  @lub
  Scenario Outline:Data selection from table
    And the user selects "Sessions" tab
    Then the user should be able to click the "<info>"
    And should also be able to edit and save
    Examples:
    |info|
    |Tysons corner mall (POSManager10)|
    |Galleria boutique (POSManager9)  |

