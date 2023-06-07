Feature: Login
 
Scenario: Landing Page 
  Given Chrome is opened and Asianpaints app is opened
  When Users navigate on landing page
  
 
Scenario: UI
  Given Chrome is opened and Asianpaints app is opened
  When Users navigate on landing page
  Then Fields on navigation page are visible to the user
 
Scenario:     Validate Asianpaints login page Main functionality
 Given Chrome is opened and Asianpaints app is opened
 When User clicks on login button
 When User enters correct mobile number
 And User clicks on submit button
 Then It shows home page