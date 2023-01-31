Feature: EywaLondon Home Page Test


  @UI
  Scenario: Verify the home page load
    Given the user navigates to "mainPage"
    When the user loads the home page
    Then the home page should be displayed correctly, with all the elements loaded properly

  @UI
  Scenario: Verify the links in the header
    Given the user navigates to "mainPage"
    When the user click on our brands tab in the header
    Then the user should be navigated to the correct page
      | name            | index |
      | Aer Lingus      | 0     |
      | British Airways | 1     |
      | Iberia          | 2     |
      | LEVEL           | 3     |
      | Vueling         | 4     |

  @UI
  Scenario: Verify the search functionality
    Given the user navigates to "mainPage"
    When the user enters a search term "keyword" in the search bar
    Then the user should be able to see the search results page displaying the relevant results

  @UI
  Scenario: Verify the language selection
    Given the user navigates to "mainPage"
    When the user selects a different language from the language dropdown
    Then the website should be displayed in the selected language
