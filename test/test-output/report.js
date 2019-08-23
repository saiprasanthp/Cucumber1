$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/user/eclipse-workspace/test/src/test/resources/File.Feature");
formatter.feature({
  "line": 1,
  "name": "Shopclues online",
  "description": "",
  "id": "shopclues-online",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Checking the Shopclues",
  "description": "",
  "id": "shopclues-online;checking-the-shopclues",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is in user is in login page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "move to men",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "click T-shirt",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "user is in page and click on Word play",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click on sandle",
  "keyword": "And "
});
formatter.match({
  "location": "Shopclue.user_is_in_user_is_in_login_page()"
});
formatter.result({
  "duration": 17676384046,
  "status": "passed"
});
formatter.match({
  "location": "Shopclue.move_to_men()"
});
formatter.result({
  "duration": 148318624,
  "status": "passed"
});
formatter.match({
  "location": "Shopclue.click_T_shirt()"
});
formatter.result({
  "duration": 365941813,
  "status": "passed"
});
formatter.match({
  "location": "Shopclue.user_is_in_page_and_click_on_Word_play()"
});
formatter.result({
  "duration": 30121078264,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//img[@id\u003d\u0027det_img_144877827\u0027]\"}\n  (Session info: chrome\u003d74.0.3729.169)\n  (Driver info: chromedriver\u003d74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027SAI\u0027, ip: \u0027192.168.1.2\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_211\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 74.0.3729.6 (255758eccf3d24..., userDataDir: C:\\Users\\user\\AppData\\Local...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:51024}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 74.0.3729.169, webStorageEnabled: true}\nSession ID: 8eb47889237ac1a9b06887744992b163\n*** Element info: {Using\u003dxpath, value\u003d//img[@id\u003d\u0027det_img_144877827\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat com.CucumberDemo.Shopclue.user_is_in_page_and_click_on_Word_play(Shopclue.java:65)\r\n\tat ✽.Then user is in page and click on Word play(C:/Users/user/eclipse-workspace/test/src/test/resources/File.Feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "Shopclue.click_on_sandle()"
});
formatter.result({
  "status": "skipped"
});
});