
 Feature:As as User all details should be clickable,enable and verify
  @mail
  Scenario:User should be clickable,enable and verify all details
    Given User should enter the Mail Tavel web page
    Then User should click the accept cookies
    And User verify title ‘Home Page | Mail Travel’
    And User should search <India> in searchbar
    And User should click on <BOOK ONLINE> button
    Then User should be scroll to the bottom of the page and select the next available date.
    And User should select 2 adults
    And User should be make the note Departure Airport
    And User should be Validation the Price for 2 Adults
    And User should click on Book online
    Then User should not see the ‘Please select your departure date’ text after the date selection
    And User should verify the Data,Departure and Passengers
    Then User should select number required as 1 under accomodition
    And User should be click on the ‘SELECT YOUR ROOMS AND CONTINUE’
    Then User should be filled the details for first adult
    And User should be filled the details for second adult
    And User should be filled the lead on the contact
    And User should check to display the Confirm Details + Book
    And User should check to enable the Book Now button
