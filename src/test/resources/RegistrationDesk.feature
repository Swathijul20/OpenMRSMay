Feature: To Validate Registration Desk

  Scenario: To verify registration desk functionality
    Given User has to launch any browser and url of application
    When User has to pass valid credentials in email and password field
    And User has to pick any location and click on Login and verify user redirected to dashboard
    And User has to click patient register menu and fill all details in demographics and contact info
    And User has to confirm start visit then attaching problems then verifying successfully attached message and ending visit
    And User has to visit again for body bmi calculation
		And User has to add past visit and delete the records