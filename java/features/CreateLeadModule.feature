Feature: Lead creation in the CRM Application

#Background:
#Given the user establishes the environment
#And the user loads url
@positive
Scenario:Verifying the successful Lead creation
	
	When the user enters the username as DemoSalesManager
	When the user enters the password as crmsfa
	When the user clicks the login button
	Then the user should be navigated to the Welecome page
	When the user clicks the crmsfa link
	When the user clicks the lead Module
	When the user clicks to create Lead from the shortcuts menu
	When the user enter the company name as TestLeaf
	When the user enter the first name as Robelin
	When the user enter the last name as Rob
	When the user enter the phone number 
	When the user clicks the createLead button
	Then the user should be navigated to the view lead Page
@negative	
Scenario:Verifying the Lead creation without filling the mandatory fields
	
	When the user enters the username as DemoSalesManager
	When the user enters the password as crmsfa
	When the user clicks the login button
	Then the user should be navigated to the Welecome page
	When the user clicks the crmsfa link
	When the user clicks the lead Module
	When the user clicks to create Lead from the shortcuts menu
	When the user enter the phone number 
	When the user clicks the createLead button
	But the user will get the error message	