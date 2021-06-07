Feature: Testcase2
@Testcase2
Scenario: Verify the user can able to transfer funds
Given I am in Login page
When I should able to click on ‘Sign in’ button
When I click on Transfer Funds button
When I select 800000 Corporate’ account as From Account
When I select 800001 Checking’ account as To Account
When I Enter ‘1000’ into ‘Amount to Transfer’ text box
When I click on ‘Transfer Money’ button
Then I should ‘Verify the Success Message’.
When I click on ‘Sign Off’ button
Then I should see the home page.


