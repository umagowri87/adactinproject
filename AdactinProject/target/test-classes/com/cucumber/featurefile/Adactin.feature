 Feature: Adactin End To End Test Case 

Background:  Verify the user login
	Given User launch the adactin application 
 	When title of the login page is adactin 
 	Then user enters "umagowri" and "uma@123" 
 	And user click Login button in Login page 
 	Then user verify the username displayed in homepage 



@SmokeTest
Scenario Outline: 	Verify for error message when check in date is greater than checkout date
	Given the user in search page
	When customer select location as "<Location>"
	When user select number of rooms as "<NOR>"
	When customer enters check-in date "<checkin_date>"
	Then customer enters check-out date "<checkout_date>" less than check-in date
	When customer selects number of adults as "<APR>"
	And user click search button
	Then verify for the error message for check-in date field
	
Examples:
	|	checkin_date	|	checkout_date	|	Location	|	NOR				|	APR				|
	|   08/09/2019	    |	07/09/2019		|	London		|	1 - One			|	1 - One			|
	|	07/09/2019		|	08/09/2019		|	London		|	2 - Two			|	2 - Two			|
	|	11/09/2019		|	12/09/2019		|	London		|	3 - Three		|	3 - Three		|
	
@NewTest
Scenario Outline:
	Location displayed in Select Hotel should be the same as location selected in search hotel form.
	Given the user is in select hotel page after successfull login
	When the user select location as "<Location>" 
	Then user selects hotel as "<Hotel>" and room_type as "<RT>" and NOR as"<NOR>"
	When customer enters check-in date "<checkin_date>"
	Then customer enters check-out date "<checkout_date>" 
	When customer selects number of adults as "<APR>"
	And user click search button
	Then verify location displayed in select hotel is same as location selected in search hotel
	
Examples:
	|	checkin_date	|	checkout_date	|	Location	|	NOR				|	APR				|	Hotel		|	RT		|
	|	10/08/2019	    |	11/08/2019		|	London		|	1 - One			|	1 - One			|	Hotel Creek	| Standard	|

	
	
		
	
	
