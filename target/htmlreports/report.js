$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Filters.feature");
formatter.feature({
  "line": 3,
  "name": "Crypto Lists",
  "description": "",
  "id": "crypto-lists",
  "keyword": "Feature",
  "tags": [
    {
      "line": 2,
      "name": "@tag"
    }
  ]
});
formatter.scenario({
  "line": 5,
  "name": "View All option click",
  "description": "",
  "id": "crypto-lists;view-all-option-click",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "We are on main page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Click View All option",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "100 results should be visible",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 10,
  "name": "Data should not be the same for different filters",
  "description": "",
  "id": "crypto-lists;data-should-not-be-the-same-for-different-filters",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "We are on list page",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Open Cryptocurrencies dropdown menu, select Full list option",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "save the data",
  "keyword": "And "
});
formatter.step({
  "line": 14,
  "name": "Apply different filter",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "compare that data",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "Data should not be the same",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 18,
  "name": "Watchlist is populated correctly",
  "description": "",
  "id": "crypto-lists;watchlist-is-populated-correctly",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 19,
  "name": "We are on watchlist page",
  "keyword": "Given "
});
formatter.step({
  "line": 20,
  "name": "We select 5 random cc",
  "keyword": "When "
});
formatter.step({
  "line": 21,
  "name": "open watchlist in different tab",
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "Watchlist should be populated with cc that we selected",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});