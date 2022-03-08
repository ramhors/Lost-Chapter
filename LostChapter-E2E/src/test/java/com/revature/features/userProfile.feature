Feature: User Profile

# TEST-26
Scenario Outline: A user is NOT logged in, attempting to access the profile page (positive test)
Given I am logged in with <username> and <password> to the main page
When I click the user profile button
Then I should be taken to the user profile page for username <username>

Examples:
| username | password |
| "JohnDoeFake" | "password" | # TEST-26
| "MikeDingeldein" | "wordpass" | # TEST-26

# TEST-27
Scenario: A user is NOT logged in, attempting to access the profile page (negative test)
Given I am at the main page and not logged in
When I click the user profile button
Then I should see an error message of "Please login"

# TEST-28
Scenario Outline: A user is logged in, viewing the profile page (actually seeing their info) (positive test)
Given I am logged in with <username> and <password> at the main page
When I click the user profile button
Then I should be taken to the user profile page with <username> <email> <firstname> <lastname> <age> <role>

Examples:
| username | password | email | firstname | lastname | age | role |
| "JohnDoeFake" | "password" | "johndoe@johndoe.com" | "John" | "Doe" | "25" | "customer" | # TEST-28 #check role names
| "MikeDingeldein" | "wordpass" | "mike@google.com" | "Mike" | "Dingeldein" | "44" | "admin" | # TEST-28 #check role names



# TEST-29 #strech goal
Scenario Outline: User changing username successfully (positive test) #strech goal
Given I am logged in with <username> and <password> at the profile update page
When I type in the new username of <updatedUsername>
And I click the update button #is this one button
Then I should see the user profile updated to <updatedUsername>

Examples:
| username | password | updatedUsername |
| "JohnDoeFake" | "password" | "UpdateUsername" | # TEST-29




# TEST-30 This test needs to run after test 29 # Stretch goal
Scenario Outline: User attempting to change username to already taken username (negative test) #strech goal
Given I am logged in with <username> and <password> at the profile update page
When I type in the new username of <updatedUsername>
And I click the update button #is this one button
Then I should see an error message of "User name is already taken"

Examples:
| username | password | updatedUsername |
| "MikeDingeldein" | "wordpass" | "UpdateUsername" | # TEST-30



# TEST-31 #This does not seem like enough #strech goal
Scenario Outline: User changing password successfully (positive test) #strech goal
Given I am logged in with <username> and <password> at the profile update page
When I type in the new password of <updatedPassword>
And I click the update button #is this one button
Then I should see the user profile updated to <updatedPassword>

Examples:
| username | password | updatedPassword |
| "JohnDoeFake" | "password" | "updatedPassword" | # TEST-31

# TEST-32 #strech goal
Scenario Outline: User changes email successfully (positive test) #strech goal
Given I am logged in with <username> and <password> at the profile update page
When I click the update email button
And I type in the new email of <updatedEmail>
And I click the update button 
Then I should see the user profile email updated to <updatedEmail>

Examples:
| username | password | updatedEmail |
| "JohnDoeFake" | "password" | "updatedEmail@email.com" | # TEST-32

# TEST-33
Scenario Outline: User attempting to change email but email is already taken (negative test) #strech goal
Given I am logged in with <username> and <password> at the profile update page
When I click the update email button
And I type in the new email of <updatedEmail>
And I click the update button #is this one button
Then I should see an error message of "Email already exist." # Check this error message

Examples:
| username | password | updatedEmail |
| "MikeDingeldein" | "wordpass" | "updatedEmail@email.com" | # TEST-33

# TEST-34
Scenario Outline: User attempting to change email but email is invalid format (negative test) #strech goal
Given I am logged in with <username> and <password> at the profile update page
When I click the update email button
And I type in the new email of <updatedEmail>
And I click the update button #is this one button
Then I should see an error message of "Invalid email format" # Check this error message

Examples:
| username | password | updatedEmail |
| "MikeDingeldein" | "wordpass" | "updatedEmail" | # TEST-34

# TEST-35
Scenario Outline: Changing firstname successfully (positive test)
Given I am logged in with <username> and <password> at the profile update page
When I click the update name button
And I type in the new first name of <updatedFirstName>
And I click the update button #is this one button
Then I should see the user profile first name updated to <updatedFirstName>

Examples:
| username | password | updatedFirstName |
| "MikeDingeldein" | "wordpass" | "updatedFirstName" | # TEST-35

# TEST-36
Scenario Outline: Changing lastname successfully (positive test)
Given I am logged in with <username> and <password> at the profile update page
When I click the update name button
And I type in the new last name of <updatedLastName>
And I click the update button #is this one button
Then I should see the user profile first name updated to <updatedLastName>

Examples:
| username | password | updatedLastName |
| "MikeDingeldein" | "wordpass" | "updatedLastName" | # TEST-36

# TEST-37
Scenario Outline: Changing age successfully (positive test)
Given I am logged in with <username> and <password> at the profile update page
When I click the update age button
And I type in the new age of <updatedAge>
And I click the update button #is this one button
Then I should see the user profile first name updated to <updatedAge>

Examples:
| username | password | updatedAge |
| "MikeDingeldein" | "wordpass" | "updatedAge" | # TEST-37

# TEST-38, 39, and 40
Scenario Outline: Attempting to change ago but not allowed (negative test)
Given I am logged in with <username> and <password> at the profile update page
When I click the update age button
And I type in the new age of <updatedAge>
And I click the update button #is this one button
Then I should see an update error message of "Age cannot be less than 5 or greater than 125"

Examples:
| username | password | updatedAge |
| "MikeDingeldein" | "wordpass" | "126" | # TEST-38
| "MikeDingeldein" | "wordpass" | "-1" | # TEST-39
| "MikeDingeldein" | "wordpass" | "abc" | # TEST-40 #feature not done 12/30

# TEST-41
Scenario Outline: User attempts to change firstname to over 255 characters (negative test)
Given I am logged in with <username> and <password> at the profile update page
When I click the update name button
And I type in the new first name of <updatedFirstName>
And I click the update button #is this one button
Then I should see an update error message of "Age cannot be less than 5 or greater than 125" #not in feature 12/30

Examples:
| username | password | updatedFirstName |
| "MikeDingeldein" | "wordpass" | "W*ELd?tz7-c-KAPP}$FGVAy$@TjxP4]zT*w?&BkR/.NJb6Nz{*+$4%M?dTaCxPtvy{j;HgG;;SWmJheH:N*Z69HMXD&}HY{tdui!pF73U:H@nU9VNpL-HWRRNe[ZKc4A4mAFNnPjEHv{:65T}{V9Xw-7gDkM=6P-?}!z@LpxAi=dp4XLrZKa=X@MCeJ*3&P)S}F+G9dBzy$+Y((n+7VyT9z{Uh[xe$uFr=4ywrUA#K}_YnCB.6:!HhVF/P+CVZ5Q" | # TEST-41

# TEST-42
Scenario Outline: User attempts to change lastname to over 255 characters (negative test)
Given I am logged in with <username> and <password> at the profile update page
When I click the update name button
And I type in the new last name of <updatedLastName>
And I click the update button #is this one button
Then I should see an update error message of "Age cannot be less than 5 or greater than 125" #not in feature 12/30

Examples:
| username | password | updatedLastName |
| "MikeDingeldein" | "wordpass" | "W*ELd?tz7-c-KAPP}$FGVAy$@TjxP4]zT*w?&BkR/.NJb6Nz{*+$4%M?dTaCxPtvy{j;HgG;;SWmJheH:N*Z69HMXD&}HY{tdui!pF73U:H@nU9VNpL-HWRRNe[ZKc4A4mAFNnPjEHv{:65T}{V9Xw-7gDkM=6P-?}!z@LpxAi=dp4XLrZKa=X@MCeJ*3&P)S}F+G9dBzy$+Y((n+7VyT9z{Uh[xe$uFr=4ywrUA#K}_YnCB.6:!HhVF/P+CVZ5Q" | # TEST-42

# TEST-43
Scenario Outline: User attempts to change username to over 255 characters (negative test)
Given I am logged in with <username> and <password> at the profile update page
When I click the update username button
And I type in the new username of <updatedUsername>
And I click the update button #is this one button
Then I should see an update error message of "Age cannot be less than 5 or greater than 125" #not in feature 12/30

Examples:
| username | password | updatedUsername |
| "MikeDingeldein" | "wordpass" | "W*ELd?tz7-c-KAPP}$FGVAy$@TjxP4]zT*w?&BkR/.NJb6Nz{*+$4%M?dTaCxPtvy{j;HgG;;SWmJheH:N*Z69HMXD&}HY{tdui!pF73U:H@nU9VNpL-HWRRNe[ZKc4A4mAFNnPjEHv{:65T}{V9Xw-7gDkM=6P-?}!z@LpxAi=dp4XLrZKa=X@MCeJ*3&P)S}F+G9dBzy$+Y((n+7VyT9z{Uh[xe$uFr=4ywrUA#K}_YnCB.6:!HhVF/P+CVZ5Q" | # TEST-43

# TEST-44
Scenario Outline: User attempts to change email to over 255 characters (negative test)
Given I am logged in with <username> and <password> at the profile update page
When I click the update email button
And I type in the new email of <updatedemail>
And I click the update button #is this one button
Then I should see an update error message of "Age cannot be less than 5 or greater than 125" #not in feature 12/30

Examples:
| username | password | updatedemail |
| "MikeDingeldein" | "wordpass" | "W*ELd?tz7-c-KAPP}$FGVAy$@TjxP4]zT*w?&BkR/.NJb6Nz{*+$4%M?dTaCxPtvy{j;HgG;;SWmJheH:N*Z69HMXD&}HY{tdui!pF73U:H@nU9VNpL-HWRRNe[ZKc4A4mAFNnPjEHv{:65T}{V9Xw-7gDkM=6P-?}!z@LpxAi=dp4XLrZKa=X@MCeJ*3&P)S}F+G9dBzy$+Y((n+7VyT9z{Uh[xe$uFr=4ywrUA#K}_YnCB.6:!HhVF/P+CVZ5Q@email.com" | # TEST-44

# TEST-93
Scenario Outline: User attempts to change firstname to blank (negative test)
Given I am logged in with <username> and <password> at the profile update page
When I click the update name button
And I type in the new first name of <updatedFirstName>
And I click the update button #is this one button
Then I should see an update error message of "Do not leave any information blank" 

Examples:
| username | password | updatedFirstName |
| "MikeDingeldein" | "wordpass" | "" | # TEST-93

# TEST-94
Scenario Outline: User attempts to change lastname to blank  (negative test)
Given I am logged in with <username> and <password> at the profile update page
When I click the update name button
And I type in the new last name of <updatedLastName>
And I click the update button #is this one button
Then I should see an update error message of "Do not leave any information blank" 

Examples:
| username | password | updatedLastName |
| "MikeDingeldein" | "wordpass" | "" | # TEST-94

# TEST-95
Scenario Outline: User attempts to change email to blank   (negative test)
Given I am logged in with <username> and <password> at the profile update page
When I click the update email button
And I type in the new email of <updatedEmail>
And I click the update button #is this one button
Then I should see an update error message of "Do not leave any information blank" 

Examples:
| username | password | updatedEmail |
| "MikeDingeldein" | "wordpass" | "" | # TEST-95

# TEST-96
Scenario Outline: User attempts to change username to blank  (negative test)
Given I am logged in with <username> and <password> at the profile update page
When I click the update username button
And I type in the new username of <updatedUsername>
And I click the update button #is this one button
Then I should see an update error message of "Do not leave any information blank" 

Examples:
| username | password | updatedUsername |
| "MikeDingeldein" | "wordpass" | "" | # TEST-96

# TEST-97 # this does not seem correct at all
Scenario Outline: User attempts to change password to blank  (negative test)
Given I am logged in with <username> and <password> at the profile update page
When I click the update password button
And I type in the new password of <updatedPassword>
And I click the update button #is this one button
Then I should see an update error message of "Do not leave any information blank" 

Examples:
| username | password | updatedPassword |
| "MikeDingeldein" | "wordpass" | "" | # TEST-97

# TEST-97 
Scenario Outline: User attempts to change age to blank  (negative test)
Given I am logged in with <username> and <password> at the profile update page
When I click the update age button
And I type in the new age of <updatedAge>
And I click the update button #is this one button
Then I should see an update error message of "Do not leave any information blank" 

Examples:
| username | password | updatedAge |
| "MikeDingeldein" | "wordpass" | "" | # TEST-97

