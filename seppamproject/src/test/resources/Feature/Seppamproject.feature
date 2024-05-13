Feature: feature to test signin page

  Scenario: Login should be successfully entered
    Given User enter the Emailid as "jeevimoni@toolfe.com"
    And User enter the password as "Otomate@123"
    When User click on the login button
    Then click on check-in button
    And click on project icon
    Then click on order icon
    And click on create task icon
    Given Click on search box display required text
	  And click certain task
    Then chat with certain task chat box
    And click on kebab Menu and select create subtask 
    Then click on view subtask
    Given click on add subtask
    And drag the subtask to inprocess task and done
    When task in done and give rating
    And click on home page
    Then click on my task tab and click create task icon
    
    
    