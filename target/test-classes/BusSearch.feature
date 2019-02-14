

Feature: To check the search box functionality
  


  Scenario Outline: search buses
    Given The user is in home page
    When The user enters the boarding and destination point"<from>","<to>"
    And The user submits the search
    Then The user should see the available buses

    Examples: 
      | from    | to        | 
      | chennai | trichy    |  
      | chennai | thanjavur | 
      | chennai | madurai   |
      | chennai | karaikudi |
