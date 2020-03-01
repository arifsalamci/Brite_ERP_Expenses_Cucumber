$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/create_expenses_officer.feature");
formatter.feature({
  "name": "Expenses",
  "description": "  Agile Story: As a user I should be able to create expenses so that I can submit to Manager",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Creating expense as an Officer positive",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "User clicks on the Expenses functionality",
  "keyword": "Given "
});
formatter.match({
  "location": "Creating_exp_officer.user_clicks_on_the_Expenses_functionality()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Create button",
  "keyword": "When "
});
formatter.match({
  "location": "Creating_exp_officer.user_clicks_on_the_Create_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user fills out the expense description",
  "keyword": "When "
});
formatter.match({
  "location": "Creating_exp_officer.user_fills_out_the_expense_description()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the product dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "Creating_exp_officer.user_clicks_on_the_product_dropdown()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the unit price module",
  "keyword": "And "
});
formatter.match({
  "location": "Creating_exp_officer.user_clicks_on_the_unit_price_module()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the quantity module",
  "keyword": "And "
});
formatter.match({
  "location": "Creating_exp_officer.user_clicks_on_the_quantity_module()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User clicks on the Employee dropdown",
  "keyword": "And "
});
formatter.match({
  "location": "Creating_exp_officer.user_clicks_on_the_Employee_dropdown()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchWindowException: no such window: window was already closed\n  (Session info: chrome\u003d80.0.3987.122)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027Begimais-MacBook-Pro.local\u0027, ip: \u0027fe80:0:0:0:10cd:9cc7:14:ded%en0\u0027, os.name: \u0027Mac OS X\u0027, os.arch: \u0027x86_64\u0027, os.version: \u002710.15\u0027, java.version: \u002713.0.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 80.0.3987.122, chrome: {chromedriverVersion: 80.0.3987.106 (f68069574609..., userDataDir: /var/folders/dq/0bybqq_j3g7...}, goog:chromeOptions: {debuggerAddress: localhost:54673}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: MAC, platformName: MAC, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify}\nSession ID: 83b9df29047a40c3301ea17affa3a088\n*** Element info: {Using\u003dxpath, value\u003d//a[.\u003d\u0027David Samson\u0027][1]}\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\n\tat java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\n\tat java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\n\tat com.sun.proxy.$Proxy16.click(Unknown Source)\n\tat step_definitions.Creating_exp_officer.user_clicks_on_the_Employee_dropdown(Creating_exp_officer.java:84)\n\tat ✽.User clicks on the Employee dropdown(src/test/resources/features/create_expenses_officer.feature:13)\n",
  "status": "failed"
});
formatter.step({
  "name": "User clicks on the Notes box",
  "keyword": "And "
});
formatter.match({
  "location": "Creating_exp_officer.user_clicks_on_the_Notes_box()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on the save button",
  "keyword": "And "
});
formatter.match({
  "location": "Creating_exp_officer.user_clicks_on_the_save_button()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on the Submit to Manager button",
  "keyword": "Then "
});
formatter.match({
  "location": "Creating_exp_officer.user_clicks_on_the_Submit_to_Manager_button()"
});
formatter.result({
  "status": "skipped"
});
});