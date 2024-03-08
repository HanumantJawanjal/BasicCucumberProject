Feature: Search for product

@login

Scenario: User can search for product through search bar

Given user is on homepage
When enter text in search bar
And click on search
Then user get list of product matching that keyword