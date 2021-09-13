Feature: Marriott Website Testing

Scenario: TestCase 01
Given User is on Home Page
When User click on "Our Brands"
Then "JW Marriott" is listed in the list

Scenario: TestCase 02
Given User is on Home Page
When Enter a city name in the destination field, click on "Find Hotels" and Search for "Vermont"
Then Check the address in the first hotel in the search results list and verify if "Mobile Check-In and Mobile Key" present

Scenario: TestCase 03
Given User is on Home Page
When User click on "Member Benefits"
Then "Mobile Check-In and Mobile Key" is listed in the list