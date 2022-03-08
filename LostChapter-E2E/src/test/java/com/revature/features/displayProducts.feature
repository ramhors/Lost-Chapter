Feature: Display Products

# TEST-53
Scenario: Default/welcome page shows products
Given I am at the welcome page
Then I should see products listed

# TEST-55
Scenario: Product is out of stock 
Given I am at a product that is out of stock
Then I should see "Out of stock"#Check message


