Feature: ChatBox Scenarios

  @ChatboxEntry
  Scenario: Login to Prutopia Chat Box Application
    When User Login to Prutopia Application
    When User Navigates to Chatbox Window
    Then User Validates Elements in ChatBox Window
    Then User see the Chatbox Welcome Text

  @Chat
  Scenario Outline: User enters Request Text and gets Response
    When User sends Request Text <RequestText> for <ScenarioName>
    Then PruBuddy sends Response Text <ResponseText>

    Examples:
      |ScenarioName                                        | RequestText                                     | ResponseText            |
      |Leave Balance                                       |  Hi                                             |  Hello,I am PRUBuddy, your virtual assistant  |
      |Leave Balance Req1                                  | How many leaves im entitled for                 |May I know what is your job level?|
      |Leave Balance Req2                                  | Senior Manager                                  |Is your term of service above 3  |
      |Leave Balance Req3                                  |No                                               |18 days                         |
      |SharesEligibility                                   |I want to know about my shares eligibility        | PruSharePlus                  |
      |Parking Slots                                       |I want to know availabke parking slots          |Parking slots                  |
      |Wrong Text                                          | sdkljsiljdskjhdisjsdiojsdoj                     |I will continue to learn and assist you better in future|




  @ChatBoxMainPage
  Scenario: User Clicks on Main Screen Icon on Chat Page and Directed to News Feed
    When User Clicks on Main Screen Icon
    Then User is Navigated to News Feed


  @LeaveBalance
  Scenario: User Request for Leave Balance
    When User Initiates Discusion with PruBuddy
    When User Request for  Leave Balance
    Then PruBuddy asks Job Level
    When User Enters Job Level
    Then PruBuddy asks for Term of Service
    When User Enter Term of Service
    Then PruBuddy Responds with Number of eligible leaves

@SharePrice
  Scenario: User Request for Share Price
   ## When User Initiates Discusion with PruBuddy
    When User Request for  Shares Eligibility
    Then PruBuddy responds about PRUSharePlus

@ParkingSlots
  Scenario: User Request for Parking Slots
   ## When User Initiates Discusion with PruBuddy
    When User Request for  Car Parking Slots
    Then PruBuddy responds about Available Parking Slots





