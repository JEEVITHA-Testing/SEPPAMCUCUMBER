Feature: feature to test drag and drop
Scenario: subtask created successfully
    Given click on add subtask
    And drag the subtask to inprocess task and done
    When task in done and give rating
    And click on home page
    Then click on my task tab and click create task icon
