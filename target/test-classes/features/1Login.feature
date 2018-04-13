Feature: 1Login

      @LoginNegative
      Scenario Outline: Login to Prutopia App Navigate to Home Screen and Validate Home Page Elements
        When User Opens Prutopia Application and navigated to Azure Directory for Login
        When User Enters Username "<Username>"
        Then User Clicks on Next Button
        When User Enters Password "<Password>"
        Then User Clicks on Sign in Button
        Then User is able to see Login Error Message
      Examples:
        |Username|Password|
        |prutopia@azurepaloit.onmicrosoft.com|WrongPassword|


      @LoginPositive
      Scenario Outline: Login to Prutopia App Navigate to Home Screen and Validate Home Page Elements
        When User Opens Prutopia Application and navigated to Azure Directory for Login
        When User Enters Username "<Username>"
        Then User Clicks on Next Button
        When User Enters Password "<Password>"
        Then User Clicks on Sign in Button
        Then User is Navigated to Home Page of the Application
        Then Elements in Home Page are Validated
        Examples:
        |Username|Password|
        |prutopia@azurepaloit.onmicrosoft.com|Hugu81801|














