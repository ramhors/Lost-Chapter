Feature: Darkmode

Scenario: Switch to darkmode (positive)
Given I am at the main page
When I turn on darkmode
Then I should see a darker theme

Scenario: Switch off darkmode (positive)
Given I have turned on darkmode
When I turn off darkmode
Then I should see a lighter theme