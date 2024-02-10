$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin End To End Test Case",
  "description": "",
  "id": "adactin-end-to-end-test-case",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "",
  "description": "Verify the customer or user is able to login to the application",
  "id": "adactin-end-to-end-test-case;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the login page is adactin",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"\u003cusername\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click Login button in Login page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user verify the username displayed in homepage",
  "keyword": "Then "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "adactin-end-to-end-test-case;;",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 12,
      "id": "adactin-end-to-end-test-case;;;1"
    },
    {
      "cells": [
        "uma",
        "uma@123"
      ],
      "line": 13,
      "id": "adactin-end-to-end-test-case;;;2"
    },
    {
      "cells": [
        "umagowri",
        "uma@123"
      ],
      "line": 14,
      "id": "adactin-end-to-end-test-case;;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 13,
  "name": "",
  "description": "Verify the customer or user is able to login to the application",
  "id": "adactin-end-to-end-test-case;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the login page is adactin",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"uma\" and \"uma@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click Login button in Login page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user verify the username displayed in homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 2764612830,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.title_of_the_login_page_is_adactin()"
});
formatter.result({
  "duration": 19184985,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "uma",
      "offset": 13
    },
    {
      "val": "uma@123",
      "offset": 23
    }
  ],
  "location": "AdactinStepDefinition.user_enters_and(String,String)"
});
formatter.result({
  "duration": 715851722,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_click_Login_button_in_Login_page()"
});
formatter.result({
  "duration": 664902309,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_verify_the_username_displayed_in_homepage()"
});
formatter.result({
  "duration": 20062707760,
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//input[@id\u003d\u0027username_show\u0027 and @value\u003d\u0027Hello umagowri!\u0027]\"}\n  (Session info: chrome\u003d75.0.3770.142)\n  (Driver info: chromedriver\u003d74.0.3729.6 (255758eccf3d244491b8a1317aa76e1ce10d57e9-refs/branch-heads/3729@{#29}),platform\u003dWindows NT 10.0.17134 x86_64) (WARNING: The server did not provide any stacktrace information)\nCommand duration or timeout: 0 milliseconds\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027LAPTOP-RI184SQ7\u0027, ip: \u0027192.168.1.4\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_201\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, acceptSslCerts: false, applicationCacheEnabled: false, browserConnectionEnabled: false, browserName: chrome, chrome: {chromedriverVersion: 74.0.3729.6 (255758eccf3d24..., userDataDir: C:\\Users\\chezhian\\AppData\\L...}, cssSelectorsEnabled: true, databaseEnabled: false, goog:chromeOptions: {debuggerAddress: localhost:53771}, handlesAlerts: true, hasTouchScreen: false, javascriptEnabled: true, locationContextEnabled: true, mobileEmulationEnabled: false, nativeEvents: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: XP, platformName: XP, proxy: Proxy(), rotatable: false, setWindowRect: true, strictFileInteractability: false, takesHeapSnapshot: true, takesScreenshot: true, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unexpectedAlertBehaviour: ignore, unhandledPromptBehavior: ignore, version: 75.0.3770.142, webStorageEnabled: true}\nSession ID: d84a13343bbccb4d67df18a4f1306603\n*** Element info: {Using\u003dxpath, value\u003d//input[@id\u003d\u0027username_show\u0027 and @value\u003d\u0027Hello umagowri!\u0027]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.ErrorHandler.createThrowable(ErrorHandler.java:214)\r\n\tat org.openqa.selenium.remote.ErrorHandler.throwIfResponseFailed(ErrorHandler.java:166)\r\n\tat org.openqa.selenium.remote.http.JsonHttpResponseCodec.reconstructValue(JsonHttpResponseCodec.java:40)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:80)\r\n\tat org.openqa.selenium.remote.http.AbstractHttpResponseCodec.decode(AbstractHttpResponseCodec.java:44)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy16.getAttribute(Unknown Source)\r\n\tat com.cucumber.adactinstepdefenition.AdactinStepDefinition.user_verify_the_username_displayed_in_homepage(AdactinStepDefinition.java:56)\r\n\tat ✽.Then user verify the username displayed in homepage(Adactin.feature:9)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 14,
  "name": "",
  "description": "Verify the customer or user is able to login to the application",
  "id": "adactin-end-to-end-test-case;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "User launch the adactin application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of the login page is adactin",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters \"umagowri\" and \"uma@123\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "user click Login button in Login page",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user verify the username displayed in homepage",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.user_launch_the_adactin_application()"
});
formatter.result({
  "duration": 948158928,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.title_of_the_login_page_is_adactin()"
});
formatter.result({
  "duration": 11971746,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "umagowri",
      "offset": 13
    },
    {
      "val": "uma@123",
      "offset": 28
    }
  ],
  "location": "AdactinStepDefinition.user_enters_and(String,String)"
});
formatter.result({
  "duration": 592398707,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_click_Login_button_in_Login_page()"
});
formatter.result({
  "duration": 1216706389,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_verify_the_username_displayed_in_homepage()"
});
formatter.result({
  "duration": 30602492,
  "status": "passed"
});
formatter.scenarioOutline({
  "line": 19,
  "name": "",
  "description": "Verify for error message when check in date is greater than checkout date",
  "id": "adactin-end-to-end-test-case;",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "the user in search page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "customer select location as \"\u003cLocation\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user select number of rooms as \"\u003cNOR\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "customer enters check-in date \"\u003ccheckin_date\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "customer enters check-out date \"\u003ccheckout_date\u003e\" less than check-in date",
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "customer selects number of adults as \"\u003cAPR\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user click search button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "verify for the error message for check-in date field",
  "keyword": "Then "
});
formatter.examples({
  "line": 30,
  "name": "",
  "description": "",
  "id": "adactin-end-to-end-test-case;;",
  "rows": [
    {
      "cells": [
        "checkin_date",
        "checkout_date",
        "Location",
        "NOR",
        "APR"
      ],
      "line": 31,
      "id": "adactin-end-to-end-test-case;;;1"
    },
    {
      "cells": [
        "31/08/2019",
        "01/07/2019",
        "London",
        "1 - One",
        "1 - One"
      ],
      "line": 32,
      "id": "adactin-end-to-end-test-case;;;2"
    },
    {
      "cells": [
        "01/08/2019",
        "01/08/2019",
        "London",
        "2 - Two",
        "2 - Two"
      ],
      "line": 33,
      "id": "adactin-end-to-end-test-case;;;3"
    },
    {
      "cells": [
        "31/08/2019",
        "01/09/2019",
        "London",
        "3 - Three",
        "3 - Three"
      ],
      "line": 34,
      "id": "adactin-end-to-end-test-case;;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 32,
  "name": "",
  "description": "Verify for error message when check in date is greater than checkout date",
  "id": "adactin-end-to-end-test-case;;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "the user in search page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "customer select location as \"London\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user select number of rooms as \"1 - One\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "customer enters check-in date \"31/08/2019\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "customer enters check-out date \"01/07/2019\" less than check-in date",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "customer selects number of adults as \"1 - One\"",
  "matchedColumns": [
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user click search button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "verify for the error message for check-in date field",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.the_user_in_search_page()"
});
formatter.result({
  "duration": 2450204611,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 29
    }
  ],
  "location": "AdactinStepDefinition.customer_select_location_as(String)"
});
formatter.result({
  "duration": 405160244,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 - One",
      "offset": 32
    }
  ],
  "location": "AdactinStepDefinition.user_select_number_of_rooms_as(String)"
});
formatter.result({
  "duration": 319625598,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "31/08/2019",
      "offset": 31
    }
  ],
  "location": "AdactinStepDefinition.customer_enters_check_in_date(String)"
});
formatter.result({
  "duration": 438446692,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01/07/2019",
      "offset": 32
    }
  ],
  "location": "AdactinStepDefinition.customer_enters_check_out_date_less_than_check_in_date(String)"
});
formatter.result({
  "duration": 372078642,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1 - One",
      "offset": 38
    }
  ],
  "location": "AdactinStepDefinition.customer_selects_number_of_adults_as(String)"
});
formatter.result({
  "duration": 187672531,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_click_search_button()"
});
formatter.result({
  "duration": 258315838,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.verify_for_the_error_message_for_check_in_date_field()"
});
formatter.result({
  "duration": 47285702,
  "status": "passed"
});
formatter.scenario({
  "line": 33,
  "name": "",
  "description": "Verify for error message when check in date is greater than checkout date",
  "id": "adactin-end-to-end-test-case;;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "the user in search page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "customer select location as \"London\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user select number of rooms as \"2 - Two\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "customer enters check-in date \"01/08/2019\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "customer enters check-out date \"01/08/2019\" less than check-in date",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "customer selects number of adults as \"2 - Two\"",
  "matchedColumns": [
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user click search button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "verify for the error message for check-in date field",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.the_user_in_search_page()"
});
formatter.result({
  "duration": 2495354608,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 29
    }
  ],
  "location": "AdactinStepDefinition.customer_select_location_as(String)"
});
formatter.result({
  "duration": 307525127,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2 - Two",
      "offset": 32
    }
  ],
  "location": "AdactinStepDefinition.user_select_number_of_rooms_as(String)"
});
formatter.result({
  "duration": 381128228,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01/08/2019",
      "offset": 31
    }
  ],
  "location": "AdactinStepDefinition.customer_enters_check_in_date(String)"
});
formatter.result({
  "duration": 501517957,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01/08/2019",
      "offset": 32
    }
  ],
  "location": "AdactinStepDefinition.customer_enters_check_out_date_less_than_check_in_date(String)"
});
formatter.result({
  "duration": 456695543,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2 - Two",
      "offset": 38
    }
  ],
  "location": "AdactinStepDefinition.customer_selects_number_of_adults_as(String)"
});
formatter.result({
  "duration": 202168719,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_click_search_button()"
});
formatter.result({
  "duration": 1137692610,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.verify_for_the_error_message_for_check_in_date_field()"
});
formatter.result({
  "duration": 20050619264,
  "error_message": "java.lang.Exception\r\n\tat com.cucumber.baseclass.BaseClass.getTextInWebElement(BaseClass.java:143)\r\n\tat com.cucumber.adactinstepdefenition.AdactinStepDefinition.verify_for_the_error_message_for_check_in_date_field(AdactinStepDefinition.java:109)\r\n\tat ✽.Then verify for the error message for check-in date field(Adactin.feature:28)\r\n",
  "status": "failed"
});
formatter.scenario({
  "line": 34,
  "name": "",
  "description": "Verify for error message when check in date is greater than checkout date",
  "id": "adactin-end-to-end-test-case;;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 18,
      "name": "@SmokeTest"
    }
  ]
});
formatter.step({
  "line": 21,
  "name": "the user in search page",
  "keyword": "Given "
});
formatter.step({
  "line": 22,
  "name": "customer select location as \"London\"",
  "matchedColumns": [
    2
  ],
  "keyword": "When "
});
formatter.step({
  "line": 23,
  "name": "user select number of rooms as \"3 - Three\"",
  "matchedColumns": [
    3
  ],
  "keyword": "When "
});
formatter.step({
  "line": 24,
  "name": "customer enters check-in date \"31/08/2019\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 25,
  "name": "customer enters check-out date \"01/09/2019\" less than check-in date",
  "matchedColumns": [
    1
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 26,
  "name": "customer selects number of adults as \"3 - Three\"",
  "matchedColumns": [
    4
  ],
  "keyword": "When "
});
formatter.step({
  "line": 27,
  "name": "user click search button",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "verify for the error message for check-in date field",
  "keyword": "Then "
});
formatter.match({
  "location": "AdactinStepDefinition.the_user_in_search_page()"
});
formatter.result({
  "duration": 2968948899,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "London",
      "offset": 29
    }
  ],
  "location": "AdactinStepDefinition.customer_select_location_as(String)"
});
formatter.result({
  "duration": 352491234,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3 - Three",
      "offset": 32
    }
  ],
  "location": "AdactinStepDefinition.user_select_number_of_rooms_as(String)"
});
formatter.result({
  "duration": 264887170,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "31/08/2019",
      "offset": 31
    }
  ],
  "location": "AdactinStepDefinition.customer_enters_check_in_date(String)"
});
formatter.result({
  "duration": 501073197,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "01/09/2019",
      "offset": 32
    }
  ],
  "location": "AdactinStepDefinition.customer_enters_check_out_date_less_than_check_in_date(String)"
});
formatter.result({
  "duration": 423278661,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3 - Three",
      "offset": 38
    }
  ],
  "location": "AdactinStepDefinition.customer_selects_number_of_adults_as(String)"
});
formatter.result({
  "duration": 188204533,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.user_click_search_button()"
});
formatter.result({
  "duration": 923378091,
  "status": "passed"
});
formatter.match({
  "location": "AdactinStepDefinition.verify_for_the_error_message_for_check_in_date_field()"
});
formatter.result({
  "duration": 20045959974,
  "error_message": "java.lang.Exception\r\n\tat com.cucumber.baseclass.BaseClass.getTextInWebElement(BaseClass.java:143)\r\n\tat com.cucumber.adactinstepdefenition.AdactinStepDefinition.verify_for_the_error_message_for_check_in_date_field(AdactinStepDefinition.java:109)\r\n\tat ✽.Then verify for the error message for check-in date field(Adactin.feature:28)\r\n",
  "status": "failed"
});
});