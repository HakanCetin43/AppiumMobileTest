Feature: Testing over ApiDemos application
  Scenario: User able to pass another screen
    Given user is the "Accessibility" screen
    When user clicks "App"
    Then user able to go "Action Bar" screen