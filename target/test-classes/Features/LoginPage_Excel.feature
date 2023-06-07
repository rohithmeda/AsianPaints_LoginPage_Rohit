Feature: Login

Scenario: Validate Asianpaints login functionality with valid data
    Given Chrome is opened and Asianpaints app is opened
    When User clicks on login button
    When User fills the form from given sheetname "<SheetName>" and rownumber <RowNumber>
    And User clicks on submit button 
    Then It shows home page
    
    
    Examples: 
      | SheetName | RowNumber |
      | Sheet1    |       0   |
      | Sheet1    |       1   |