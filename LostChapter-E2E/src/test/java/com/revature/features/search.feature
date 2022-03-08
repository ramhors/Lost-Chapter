Feature: Search

# TEST-52
Scenario Outline: User searches for product by keyword (positive test)
Given I am at the search bar
When Enter in a query in the search field in the navbar of <searchTitle>
And I click search button in navbar
Then I should be taken to the search results page and see results with <resultTitle>

Examples:
| searchTitle | resultTitle |
| "catcher" | "Catcher and the Rye" | # TEST-52 # check if result are true
| "Your Money or Your Life" | "Your Money or Your Life" | # TEST-52 # check if results are true
