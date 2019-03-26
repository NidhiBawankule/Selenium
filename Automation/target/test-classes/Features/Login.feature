Feature: Application login

Scenario: Home page default login
Given User is on netbanking landing page
When user login into application with Username and password
Then home is populated
And cards are displayed	