Feature: Add User address

@login

Scenario: User can add new address through user account menu.

Given user is on account page
When user click on ADD MY firST ADDRESS button
And provide valid Address details in address form
And click on Save
Then user can add a valid new address


 
