  Feature: ChatBox Scenarios

    @NavigateToPruBuddy

    Scenario: Navigating to PruBuddy and Perform Chat
      When User Clicks on the Chat Icon at Bottom of Home Page
      Then User is navigated to the Chat Page of the Application

    @PruBuddyChat
    Scenario Outline: User Chats and Validates Response from  Virtual Assistant
      When User sends Request Text "<RequestText>"
      Then PruBuddy sends Response Text "<ResponseText>"
      Examples:
        |     RequestText                                    |   ResponseText                                               |
        |    Hi                                              |Hello, I am PRUBuddy,  your virtual assistant.|
        |My Leave                                            |May I know what is your job level?                            |
        |Senior Manager                                      |Yes or No?                                                    |
        |Yes                                                 |You are entitled to 22 days of leave per annum.               |
        |Long Leave Service                                  |Less or More than 10 years?                                   |
        |10 years or longer                                  |Long Service Leave of 7 working days is applicable            |
        |Working hours                                       |head office or customer centre?                               |
        |Head office                                         |Normal Working Hours: 8.30am to 5.15pm                        |
        |Annual wage Supplement                              |Annual Wage Supplement (AWS) of 1 month of their basic        |
        |My Travel Benifits                                  |Job Level?                                                    |
        |Associate VP & Below                                |Economy class of airline                                      |
        |Who is my Hr Partner                                |For any HR-related matters,                                   |

      @LogoutPrutopia
      Scenario: Logout Prutopia
        When User Clicks Account Icon
        When User Clicks on Logout Button
        Then User is able to see Login Screen with User Logged Out



















