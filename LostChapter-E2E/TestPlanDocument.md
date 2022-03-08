## Features

	- Login
	- Session Management
	- Register
	- Display Products
	- User Profile
	- Cart
	- Search for Products
	- Checkout
	- Sales/Deals
	
	- Featured Products
	- Dark Mode 
	- Quantity Select
	- Reset Password
	- Bidding/Auctions
	- Notifications
	- Admin Sales Metrics Dashboard
	- Tech Support Chat
	- Flash Deals
	
	
## E2E Automated Testing

	Feature: Login
		Scenario: Logging in successfully	
		Scenario: Invalid username
		Scenario: Invalid password
		Scenario: Blank username
		Scenario: Blank password
		Scenario: Not logged in, welcome page displays guest
		Scenario: Logging in as admin
		
	Feature: Register
		Scenario: Signing up successfully
		Scenario: Blank username
		Scenario: Blank password
		Scenario: Blank email
		Scenario: Blank Firstname
		Scenario: Blank Lastname
		Scenario: Blank age			//
		Scenario: Blank birthday 	//Do we need both age and birthday? Arent they the same?
		Scenario: Blank address
		Scenario: Address is invalid? 
		Scenario: Username already taken
		Scenario: email already taken
		Scenario: Birthday would put age over 125yrs
		Scenario: Birthday would put age under 0
		Scenario: Email is invalid format
	
	Feature: User Profile
		Scenario: Given Im logged in, accessing profile page, viewing information
		Scenario: Changing username successfully? 
		Scenario: Attempting to change username, but username is already taken?
		Scenario: Changing password
		Scenario: Changing email successfully
		Scenario: Attempting to change email but email is already taken
		Scenario: Attempting to change email but new email is invalid format
		Scenario: Changing firstname
		Scenario: Changing lastname
		Scenario: change age
		Scenario: Change birthday
		Scenario: Attempting to change birthday but age would be over 125 yrs
		Scenario: Attmepting to change birthday but age would be under 0
		Scenario: Change address
		Scenario: Attempting to change address but address is invalid
		
	Feature: Cart
		Scenario: When logged in, add a product to cart
		Scenario: Remove an item from my cart
		Scenario: Remove all items from cart at once
		Scenario: Attempting to add an item to your cart when you are not logged in
		Scenario: Attempting to add a product that is out of stock 
		Scenario: Adding an item already in your cart
		Scenario: Adding multiple quantity of single item to cart
		
	Feature: Search for products (might be better for manual testing for the most part)
		Scenario: Searching for keyword
		
	Feature: Display Products
		Scenario: Default Page Shows products
		Scenario: Second Page Shows products
		Scenario: Product is Out of Stock
		
	Feature: Checkout
		Scenario: Going to checkout page, displays items in cart
		Scenario: Successfully checking out (including changing item stock, giving order confirmation)
		Scenario: Canceling checkout (back to shopping)
		Scenario: Payment info is correct
		Scenario: CC# is invalid
		Scenario: Expiration date is invalid
		Scenario: Security number is invalid
		
	Feature: Sales/Deals
		Scenario: Seeing a product on sale
		Scenario: Adding a product on sale to cart
		Scenario: Admin can apply sales to products successfully
		Scenario: Admin remvoing items from sale
		Scenario: Admin attempting to put an item on sale for 100%+ (free)
		Scenario: Admin is attempting to put an item on "sale" for more than original price
		
	Feature: Featured Products
		Scenario: Seeing a list of featured products on the main page
		Scenario: Admin adding featured items to the featured items list
		Scenario: Admin removing items from featured items list
		
	Feature: Dark Mode
		Scenario: Clicking on dark mode button 
		
	Feature: Quantity Select
		Scenario: Selecting a quantity of a product
		Scenario: Adding an item of multiple quantity to cart
		Scenario: Checking out with an item of multiple quantity
		Scenario: Removing an item of multiple quantity from cart
		Scenario: Changing quantity of item in cart
		Scenario: Selecting 0 or less as quantity
		
	Feature: Resetting password
		Scenario: Resetting password successfully (I assume we would just ask them username and email or something, maybe some kind of security question)
		Scenario: Trying to reset password, but dont get security check correct
		
	Feature: Bidding/Auctions
		Scenario: Listing an item for auction
		Scenario: Attempting to list an item while not logged in
		Scenario: Bidding on an auction
		Scenario: Time runs out on an auction, item should be "sold" to winner

	Feature: Notifcations
		Scenario: User has checked out/bought products, should receive some kind of message (either in app or through email) containing order details
		Scenario: User has won an auction that theyve bid on
		Scenario: User has lost an auction that theyve bid on
		Scenario: Auction for item user has listed has concluded
	
	Feature: Flash Deals
		Scenario: Items on sale that meet a certain criteria are labeled as "flash sale" items
	
	Feature: Tech Support Chat (leave for now) 
	
	Feature: Admin Sales Metrics Dashboard (leave for now) 
	
	
		
		
		
		
		
		
		
		