Feature: Successful login and registration 
Description: The purpose of this feature is to test End 2 End integration.

Scenario: Successful login and registration with valid credentials
  Given user is on Home Page
  When he enters "mgr123" and "mgr!23"
  And click on login button
  Then he is able to login sucessfully.
  And click on registration link
  And enter the details
  Then he is registered Successfully.
  