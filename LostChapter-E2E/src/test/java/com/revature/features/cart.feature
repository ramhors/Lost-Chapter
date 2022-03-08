Feature: Cart

Scenario: User adding item to cart when logged in
	Given I am at the front page while logged in as a customer
	When I click on a product on the front page
	And I click add to cart
	And I go to my cart
	Then I should see the product displayed in my cart

Scenario: User removing item from cart
	Given I am at the front page while logged in as a customer
	When I click on a product on the front page
	And I click add to cart
	And I go to my cart
	And I click remove item from cart
	Then I should see my cart is empty


Scenario: User attempting to add item to cart when not logged in
	Given I am at the front page while not logged in
	When I click on a product on the front page
	And I click add to cart
	Then I should be prompted to login

Scenario: User attempting to add item to cart when item is out of stock
	Given I am at the front page while logged in as a customer
	When I select a product that is out of stock
	And I click add to cart
	Then I should see an error message saying the item is out of stock

Scenario: Adding an item that is already in users cart
	Given I am at the front page while logged in as a customer
	When I click on a product on the front page
	And I click add to cart
	And I click add to cart
	Then I should see the product displayed in my cart with a quantity of two
	