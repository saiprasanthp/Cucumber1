$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/user/eclipse-workspace/test/src/test/resources/Practise.feature");
formatter.feature({
  "line": 1,
  "name": "Data Type",
  "description": "",
  "id": "data-type",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Automating the webpage",
  "description": "",
  "id": "data-type;automating-the-webpage",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@RegressionTesting"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "user is in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "click on button",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click on another button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "click on login button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionPractise.user_login_page()"
});
formatter.result({
  "duration": 180739973,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionPractise.click_on_button()"
});
formatter.result({
  "duration": 133654,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinitionPractise.click_on_another_button()"
});
formatter.result({
  "duration": 196884,
  "status": "passed"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 11,
  "name": "",
  "description": "",
  "id": "data-type;",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@smoke"
    },
    {
      "line": 10,
      "name": "@RegressionTesting"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "login page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionPractise.login_page()"
});
formatter.result({
  "duration": 528450,
  "status": "passed"
});
});