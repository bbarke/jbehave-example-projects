Search Etsy.com by sub category

Meta:
@category advanced
@color red

Narrative: 

In order to show the advance cart functionality
As a user
I want to search for an item in a sub category

Lifecycle:
After:
Outcome: FAILURE
Given I am on google's home page
 
Scenario: Advanced Search for a hat

Given I am searching on Etsy.com
When I specify the Vintage sub category
And I search for hat
Then there are search results
And fail
