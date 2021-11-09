$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/LoginToSwagLabsSteps.feature");
formatter.feature({
  "name": "feature to Verify //www.saucedemo.com/ login functionality login with username and password",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "2 Failed Login with LockedOutUser",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I am on the Sauce Demo Login Page",
  "keyword": "Given "
});
formatter.step({
  "name": "I fill the account information for account LockedOutUser into the \"\u003cUsername2\u003e\" field and the \"\u003cPassword2\u003e\" field",
  "keyword": "When "
});
formatter.step({
  "name": "I click the Login Button",
  "keyword": "And "
});
formatter.step({
  "name": "I verify the Error Message contains the text \"\u003cerrormessage\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Username2",
        "Password2",
        "errormessage"
      ]
    },
    {
      "cells": [
        "locked_out_user",
        "secret_sauce",
        "Sorry, this user has been banned."
      ]
    }
  ]
});
formatter.scenario({
  "name": "2 Failed Login with LockedOutUser",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "I am on the Sauce Demo Login Page",
  "keyword": "Given "
});
formatter.match({
  "location": "SwagLabsAutomation.LoginSwagLabSteps.i_am_on_the_Sauce_Demo_Login_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fill the account information for account LockedOutUser into the \"locked_out_user\" field and the \"secret_sauce\" field",
  "keyword": "When "
});
formatter.match({
  "location": "SwagLabsAutomation.LoginSwagLabSteps.i_fill_the_account_information_for_account_LockedOutUser_into_the_field_and_the_field(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click the Login Button",
  "keyword": "And "
});
formatter.match({
  "location": "SwagLabsAutomation.LoginSwagLabSteps.i_click_the_Login_Button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I verify the Error Message contains the text \"Sorry, this user has been banned.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "SwagLabsAutomation.LoginSwagLabSteps.i_verify_the_Error_Message_contains_the_text(java.lang.String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Epic sadface: Sorry, this user has been locked out].\u003e but was:\u003c[Sorry, this user has been banned].\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat SwagLabsAutomation.LoginSwagLabSteps.i_verify_the_Error_Message_contains_the_text(LoginSwagLabSteps.java:57)\r\n\tat ✽.I verify the Error Message contains the text \"Sorry, this user has been banned.\"(file:///C:/Users/ahmet/IdeaProjects/CastleHill/src/test/resources/Features/LoginToSwagLabsSteps.feature:19)\r\n",
  "status": "failed"
});
});