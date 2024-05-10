Feature: feature to test signin page

  Scenario: Login should be successfully entered
    Given User enter the Emailid as "jeevimoni@toolfe.com"
    And User enter the password as "Otomate@123"
    When User click on the login button
    Then click on check-in button
    And click on project icon
    Then click on order icon
    And click on create task icon
    Then Task created success
    
    
     Scenario: chat box testing
    Given Click on search box display required text
	  And click certain task
    Then chat with certain task chat box
    And click on kebab Menu and select create subtask 
    Then click on view subtask
    
    