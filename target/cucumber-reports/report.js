$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/feature/OneDMap.feature");
formatter.feature({
  "name": "Title of your feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Title of your scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@tag1"
    }
  ]
});
formatter.step({
  "name": "User is in home page, click Add to customer",
  "keyword": "Given "
});
formatter.match({
  "location": "OneDMap.user_is_in_home_page_click_Add_to_customer()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should enters details in add customer field",
  "rows": [
    {
      "cells": [
        "Firstname",
        "satham"
      ]
    },
    {
      "cells": [
        "Lastname",
        "hussain"
      ]
    },
    {
      "cells": [
        "email",
        "satham4all@gmail.com"
      ]
    },
    {
      "cells": [
        "Address",
        "Nagercoil"
      ]
    },
    {
      "cells": [
        "Mobilenumber",
        "9791734485"
      ]
    }
  ],
  "keyword": "When "
});
formatter.match({
  "location": "OneDMap.user_should_enters_details_in_add_customer_field(DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Navigates to customer id page",
  "keyword": "Then "
});
formatter.match({
  "location": "OneDMap.navigates_to_customer_id_page()"
});
formatter.result({
  "status": "passed"
});
});