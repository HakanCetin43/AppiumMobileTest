Feature: Testing over ApiDemos application
  Scenario: User able to pass another screen
    Given user is the "Accessibility" screen
    When user clicks "App"
    Then user able to go "Action Bar" screen


  Scenario: User able to scroll down
    Given user views "Accessibility"
    When user clicks "Views"
    And  user scroll to "Search View"
    Then user clicks "Search View"
    And user views "Always Expanded"
#    And user types "Dan" in search area
#   Then filtered element in the result should be 3
    And user types "Da" in "android:id/search_src_text" area
    Then filtered elements in the "io.appium.android.apis:id/list_view" should be 3

