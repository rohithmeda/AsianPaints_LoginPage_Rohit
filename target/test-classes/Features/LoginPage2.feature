Feature: Login
Scenario Outline: Validate Asianpaints login functionality with valid data
    Given Chrome is opened and Asianpaints app is opened
     When User clicks on login button
    When User enters correct mobile number "<Mobile Number>" 
    And User clicks on submit button
    Then It shows home page
  
 
    Examples: 
      |Mobile Number| otp |
      |8498059398|        |
      
Scenario Outline: Validate Asianpaints login functionality with invalid data
    Given Chrome is opened and Asianpaints app is opened
    When User clicks on login button
    When User enters wrong number "<Mobile Number>"  and presses sumbit button
    Then It shows invalid number

 
    Examples: 
    |Mobile Number| otp |
    |8@49&0593|        |