Feature: Logout

Scenario: Logout successfully (positive test) #TEST-92
	Given I am at the admin page while logged in
	When I click the logout button
	Then I should be redirected to the homepage
