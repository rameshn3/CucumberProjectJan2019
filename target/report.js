$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("D:/eclipseworkspaceAug2018/January3CucumberFrmwork2019/src/main/java/Feature/datatables.feature");
formatter.feature({
  "line": 1,
  "name": "LinkedinTest Using DataTables",
  "description": "",
  "id": "linkedintest-using-datatables",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Login with datatables data",
  "description": "",
  "id": "linkedintest-using-datatables;login-with-datatables-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "navigate to Home Page",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "enter Credentials to LogIn",
  "rows": [
    {
      "cells": [
        "rameshn3@gmail.com",
        "welcome123$"
      ],
      "line": 5
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "click login btn",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "inbox page is shown",
  "keyword": "Then "
});
formatter.match({
  "location": "DataTablesTest.User_is_on_Home_Page()"
});
formatter.result({
  "duration": 11771856598,
  "status": "passed"
});
formatter.match({
  "location": "DataTablesTest.User_enters_and(DataTable)"
});
formatter.result({
  "duration": 414894018,
  "status": "passed"
});
formatter.match({
  "location": "DataTablesTest.click_on_signin_button()"
});
formatter.result({
  "duration": 2346567100,
  "status": "passed"
});
formatter.match({
  "location": "DataTablesTest.linkedin_homepage_should_be_displayed()"
});
formatter.result({
  "duration": 6471811716,
  "status": "passed"
});
});