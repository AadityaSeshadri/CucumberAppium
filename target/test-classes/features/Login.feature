Feature: Login Scenarios

      @DemoPositive1
      Scenario: Login to Prutopia App Navigate to Home Screen and Validate Home Page Elements
        When User Opens Prutopia Application
        Then User should be able to see Splash Screen
        Then User is navigated to Azure Directory for Login
        When User Enters Username
        Then User Clicks on Next Button
        When User Enters Password
        Then User Clicks on Sign in Button
        Then User is Navigated to Home Page of the Application
        Then Elements in Home Page are Validated


  @DemoPositive2
  Scenario: Navigating to PruBuddy and Perform Chat
    When User Clicks on the Chat Icon at Bottom of Home Page
    Then User is navigated to the Chat Page of the Application

  @DemoPositive2
  Scenario Outline: User Chats and Validates Response from  Virtual Assistant
    When User sends Request Text "<RequestText>"
    Then PruBuddy sends Response Text "<ResponseText>"

    Examples:
      |     RequestText                                    |   ResponseText                                               |
      |    Hi                                              |  Hello, I am PRUBuddy,  your virtual assistant               |
      |My Leave                                            |  May I know what is your job level?                          |
      |Senior Manager                                      |Yes or No                                                     |
      |Yes                                                 |You are entitled to 22 days of leave per annum                |
      |Long Leave Service                                  |How many years are you with PACS?                             |
      |2) 10 years or longer                               |Yes                                                           |
      |Working hours                                       |Are you working in head office or customer centre?            |
      |1) Head office                                      |Normal Working Hours:8.30 am                                  |














