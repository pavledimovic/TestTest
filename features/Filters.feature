
@tag
Feature: Crypto Lists

  Scenario: View All option click
    Given We are on main page
    When Click View All option
    Then 100 results should be visible

  Scenario: Data should not be the same for different filters
    Given We are on list page
    When Open Cryptocurrencies dropdown menu, select Full list option
    And save the data
    And Apply different filter
    And compare that data
    Then Data should not be the same

  Scenario: Watchlist is populated correctly
    Given We are on watchlist page
    When We select 5 random cc
    And open watchlist in different tab
    Then Watchlist should be populated with cc that we selected
