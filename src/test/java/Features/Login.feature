

  Feature: Login test

    Scenario: check login in succesful with valid credentials

      Given Browser is open
      And user is on login page
      When user enters username and password
      And user click on Loginbutton
      Then  user navigated to the homePage
      And driver shots down



