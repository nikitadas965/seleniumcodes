 Feature: Application Login
 Scenario: Home Page default login
 Given user is on landing page
 When user login into application with username "nik" and password "1234"
 Then Home page is populated
 And Cards displayed is "true"
 
Scenario: Home Page default login
 Given user is on landing page
 When user login into application with username "gun" and password "4321"
 Then Home page is populated
 And Cards displayed is "false"