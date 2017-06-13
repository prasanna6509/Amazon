Feature: testing amazon with cucumber

  Scenario Outline: Test amazon
    Given open amazon website
    When search for "<girls shoes>"
    Then click on search

    Examples: 
           |ladies shoes  |
           |kids toys|
  
