$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Login.feature");
formatter.feature({
  "name": "validating login fields",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "validating login With correct username and password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is FB page on chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDef.user_is_FB_page_on_chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters username and password",
  "rows": [
    {
      "cells": [
        "user",
        "pass"
      ]
    },
    {
      "cells": [
        "username",
        "welcome"
      ]
    },
    {
      "cells": [
        "password",
        "hijava"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDef.userEntersUsernameAndPassword(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "StepDef.user_should_click_on_login_button()"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat org.stepdef.StepDef.user_should_click_on_login_button(StepDef.java:43)\r\n\tat ✽.user should click on login button(src/test/resources/Login.feature:10)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user need to verify home page is vissible or not",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDef.user_need_to_verify_home_page_is_vissible_or_not()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "status": "passed"
});
});