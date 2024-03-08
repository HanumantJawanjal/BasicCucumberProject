Feature: Login in Flipkart


@login  
Scenario: Login with Invalid Credentials
	
		Given User is on Login Page of website
		When user enter invalid credentials in mobile_number field
		And click on Request OTP button 
		Then Error message should appear on screen and account access denied
		
@login

Scenario: login with valid credentials

		Given User on is on site
		When user enter valid details
		And click submit
		Then user can access account



		
		
	