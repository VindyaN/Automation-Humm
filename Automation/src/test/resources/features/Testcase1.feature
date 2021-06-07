Feature: Testcase1
@Testcase1
Scenario: Verify the user can able to sign in
Given I am in Login page
When I should able to click on ‘Sign in’ button
When I click on ‘View Account Summary’ 
And I should able to Select ‘800001 Checking from the drop down
When I click on ‘Go’ button.
When I click on ‘Sign off’ button
Then I should see the home page.

