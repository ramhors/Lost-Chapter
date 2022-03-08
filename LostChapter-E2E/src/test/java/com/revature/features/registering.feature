Feature: Registering

# TEST-8
Scenario Outline: Regisering with valid information (positive test)
Given I am at the signup page
When I type in a signup username of <username>
And I type in the signup password  <password>
And I type in an signup email of <email>
And I type in a signup first name of <firstname>
And I type in a signup last name of <lastname>
And I type in a signup age of <age>
And I type in a birthday of <birthday>
And I type in an address of <address>
And I select a signup role of <role>
And I click the signup button
Then I should be see a success message saying you have successfully signed up

Examples:
| username         | password   | email                 | firstname | lastname     | age  | role       |  birthday    | address              |
| "unique"    | "password" | "unique" | "John"    | "Doe"        | "25" | "Customer" | "10/03/1996" | "1024 Downtown Road" |  # TEST-8 
| "unique" | "wordpass" | "unique"     | "Mike"    | "Dingeldein" | "44" | "Admin"    | "01/05/1985" | "9610 Uptown Road"   | # TEST-8 



# TEST-9 through 25
Scenario Outline: Regisering with invalid or missing information (negative test)
Given I am at the signup page
When I type in a signup username of <username>
And I type in the signup password  <password>
And I type in an signup email of <email>
And I type in a signup first name of <firstname>
And I type in a signup last name of <lastname>
And I type in a signup age of <age>
And I type in a birthday of <birthday>
And I type in an address of <address>
And I select a signup role of <role>
And I click the signup button
Then I should see a signup error message of <error>

Examples:
| username        | password   | email                 | firstname | lastname | age  | role       | birthday | address |error                                |	
| ""              | "password" | "unique" | "John"    | "Doe"    | "25" | "Customer" | "10/03/1996" | "1095 downtown road" | "username cannot be blank." |# TEST-9 username is left blank EXAMPLE 1
| "unique"   | ""         | "unique" | "John"    | "Doe"    | "25" | "Customer" | "10/03/1996" | "1095 downtown road" |"password cannot be blank." |# TEST-10 password is left blank EXAMPLE 2
| "unique"   | "password" | ""                    | "John"    | "Doe"    | "25" | "Customer" | "10/03/1996" | "1095 downtown road" |"email cannot be blank." |# TEST-11 email is left blank EXAMPLE 3
| "unique"   | "password" | "unique" | ""        | "Doe"    | "25" | "Customer" | "10/03/1996" | "1095 downtown road" |"firstName cannot be blank." |# TEST-12 firstname is left blank EXAMPLE 4
| "unique"   | "password" | "unique" | "John"    | ""       | "25" | "Customer" | "10/03/1996" | "1095 downtown road" |"lastName cannot be blank." |# TEST-13 lastname is left blank EXAMPLE 5
| "unique"   | "password" | "unique" | "John"    | "Doe"    | ""   | "Customer" | "10/03/1996" | "1095 downtown road" |"Age cannot be less than 5 or greater than 125" |# TEST-14 age is left blank EXAMPLE 6
| "unique"   | "password" | "unique" | "John"   | "Doe"    | "25" | ""         | "10/03/1996" | "1095 downtown road" |"role cannot be blank." |# TEST-15 role is left blank EXAMPLE 7
| "username"   | "password" | "unique"  | "John"    | "Doe"    | "25" | "Customer" | "10/03/1996" | "1095 downtown road" |"Username already exist." |# TEST-16 username is already in use EXAMPLE 8
| "unique" | "password" | "test@gmail.com" | "John"    | "Doe"    | "25" | "Customer" | "10/03/1996" | "1095 downtown road" |"Email already exist." |# TEST-17 email is already taken EXAMPLE 9
| "unique"   | "password" | "unique" | "John"    | "Doe"    | "-1" | "Customer" | "10/03/1996" | "1095 downtown road" |"Age cannot be less than 5 or greater than 125" |# TEST-18 age is 0 or less EXAMPLE 10
| "unique"   | "password" | "unique" | "John"    | "Doe"    | "126" | "Customer" | "10/03/1996" | "1095 downtown road" |"Age cannot be less than 5 or greater than 125" |# TEST-19 age is greater than 125 EXAMPLE 11
| "unique"   | "password" | "invalid email"  | "John"    | "Doe"    | "25" | "Customer" | "10/03/1996" | "1095 downtown road" |"Invalid Email." |# TEST-20 email is invalid format EXAMPLE 12
| "unique"   | "password" | "unique" | "gwpwgfuktxgakkfxxxujuqyjheujbwvjrarpmburgvxjcfvxizabrwbgazdmzwikifbhatutfgpzmbhmjegvrhxzphvwmqxuduknwznvugikuzbxrkkqwwwpiajmvukjanhbgyibpuztmxzbzdzezdvbwykpfgvdbcwqminjqmipbnjjkahngymuuzgenkbharxwrajkzjiverczpftdvmgcdcipkzxtnypwrqczjxdugbggrerhxvtyrhhmcubnimevrdqyjqmffiwezxrezvunrfhwucrqaanxitqgnhem" | "Doe" | "25" | "Customer" | "10/03/1996" | "1095 downtown road" |"Character lengths shouldn't extend over 255 characters" |# TEST-21 #not implemented 12/30 firstname is longer than 255 characters EXAMPLE 13
| "unique"   | "password" | "unique" | "John"    | "gwpwgfuktxgakkfxxxujuqyjheujbwvjrarpmburgvxjcfvxizabrwbgazdmzwikifbhatutfgpzmbhmjegvrhxzphvwmqxuduknwznvugikuzbxrkkqwwwpiajmvukjanhbgyibpuztmxzbzdzezdvbwykpfgvdbcwqminjqmipbnjjkahngymuuzgenkbharxwrajkzjiverczpftdvmgcdcipkzxtnypwrqczjxdugbggrerhxvtyrhhmcubnimevrdqyjqmffiwezxrezvunrfhwucrqaanxitqgnhem" | "25" | "Customer" | "10/03/1996" | "1095 downtown road" |"Character lengths shouldn't extend over 255 characters" |# TEST-22 #not implemented 12/30 lastname is longer than 255 characters EXAMPLE 14
| "unique"  | "password" | "gwpwgfuktxgakkfxxxujuqyjheujbwvjrarpmburgvxjcfvxizabrwbgazdmzwikifbhatutfgpzmbhmjegvrhxzphvwmqxuduknwznvugikuzbxrkkqwwwpiajmvukjanhbgyibpuztmxzbzdzezdvbwykpfgvdbcwqminjqmipbnjjkahngymuuzgenkbharxwrajkzjiverczpftdvmgcdcipkzxtnypwrqczjxdugbggrerhxvtyrhhmcubnimevrdqyjqmffiwezxrezvunrfhwucrqaanxitqgnhem@johndoe.com" | "John" | "Doe" | "25" | "Customer" | "10/03/1996" | "1095 downtown road" |"Character lengths shouldn't extend over 255 characters" |# TEST-23 #not implemented 12/30 email is longer than 255 characters EXAMPLE 15
| "gwpwgfuktxgakkfxxxujuqyjheujbwvjrarpmburgvxjcfvxizabrwbgazdmzwikifbhatutfgpzmbhmjegvrhxzphvwmqxuduknwznvugikuzbxrkkqwwwpiajmvukjanhbgyibpuztmxzbzdzezdvbwykpfgvdbcwqminjqmipbnjjkahngymuuzgenkbharxwrajkzjiverczpftdvmgcdcipkzxtnypwrqczjxdugbggrerhxvtyrhhmcubnimevrdqyjqmffiwezxrezvunrfhwucrqaanxitqgnhem" | "password" | "unique" | "John" | "Doe" | "25" | "Customer" | "10/03/1996" | "1095 downtown road" |"Character lengths shouldn't extend over 255 characters" |# TEST-24 #not implemented 12/30 username is longer than 255 characters EXAMPLE 16
| "unique"   | "password" | "unique" | "John" | "Doe" | "abc" | "Customer" | "10/03/1996" |  "1095 downtown road" |"Age cannot be less than 5 or greater than 125" |# TEST-25 #not implemented 12/30 age field is filled with non numeric characters EXAMPLE 17
| "unique" | "password" | "unique" | "John" | "Doe" | "25" | "Customer" | "" | "1095 downtown Road" | "birthday cannot be blank." | #TEST-99 birthday is left blank EXAMPLE 18
| "unique" | "password" | "unique" | "John" | "Doe" | "25" | "Customer" | "10/03/1996" | "" | "address cannot be blank." | #TEST-101 Address is left empty EXAMPLE 19
| "unique" | "password" | "unique" | "John" | "Doe" | "25" | "Customer" | "101231/51245/126932123" | "1095 downtown road" | "birthdate is invalid format" | #TEST-100 birthdate format is invalid EXAMPLE 20

