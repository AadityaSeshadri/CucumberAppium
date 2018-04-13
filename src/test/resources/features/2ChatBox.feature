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

















