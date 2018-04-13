<<<<<<< HEAD:target/test-classes/features/2ChatBox.feature
Feature: ChatBox Scenarios

  @NavigateToPruBuddy
=======
Feature: Login Scenarios

      @DemoPositive1
      Scenario: Login to Prutopia App Navigate to Home Screen and Validate Home Page Elements
        When User Opens Prutopia Application and navigated to Azure Directory for Login
        When User Enters Username
        Then User Clicks on Next Button
        When User Enters Password
        Then User Clicks on Sign in Button
        Then User is Navigated to Home Page of the Application
        Then Elements in Home Page are Validated


  @DemoPositive2
>>>>>>> 603d37909f01258015dd667f68673c884fb3ca44:target/test-classes/features/Login.feature
  Scenario: Navigating to PruBuddy and Perform Chat
    When User Clicks on the Chat Icon at Bottom of Home Page
    Then User is navigated to the Chat Page of the Application

  @PruBuddyChat
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
      |10 years or longer                                  |Yes                                                           |
      |Working hours                                       |Are you working in head office or customer centre?            |
      |Head office                                         |Normal Working Hours:8.30 am                                  |
      |Annual wage Supplement                              |Annual wage Supplement                                        |
      |My Travel Benifits                                  |job Level                                                     |
      |Associate VP & Below                                | airline                                                      |
      |Who is my Hr Partner                                |HR-related matters                                            |

<<<<<<< HEAD:target/test-classes/features/2ChatBox.feature


=======
>>>>>>> 603d37909f01258015dd667f68673c884fb3ca44:target/test-classes/features/Login.feature














