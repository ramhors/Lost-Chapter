Feature: Login

# TEST-1
Scenario Outline: Login with valid password, valid username (positive test)
Given I am at the login page
When I type in a username of <username>
And I type in the password  <password>
And I click the Login button
Then I should be taken to the main page and see username <username> and profile picture

Examples:
| username | password |
| "username" | "password" | # TEST-1


#TESTS 2 through 5
Scenario Outline: Login with invalid/null password or invalid/null username (negative test)
Given I am at the login page
When I type in a username of <username>
And I type in the password  <password>
And I click the Login button
Then I should be given an error message of <error>

Examples:
| username | password | error |
| "vhvhjkb" | "password" | "Username and/or password is incorrect" | # TEST-2 #check error message
| "JohnDoeFake" | "vhjvh" | "Username and/or password is incorrect" |  # TEST-3 #check error message
| "" | "password" | "Username and/or password is incorrect" | # TEST-4 #check error message
| "JohnDoeFake" | "" | "Username and/or password is incorrect" | # TEST-5 #check error message

#TEST-6
Scenario: Login as admin with valid password, valid username (positive test) #TEST-6
Given I am at the login page
When I type in a username of "Admin"
And I type in the password  "AdminPassword"
And I click the Login button
Then I should be sent to the admin page

#TEST-7
Scenario: Not logged in (positive test) #TEST-7
Given I am not logged in
Then I should not see a username and profile picture #might be guest